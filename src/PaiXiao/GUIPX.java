package PaiXiao;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

import javax.swing.JTextArea;

/**
 * GUI中的牌效程序
 * @author HiKari
 *
 */
public class GUIPX {
	/**
	 * 牌效计算（多线程）
	 * @param mj
	 * @throws Exception
	 */
	public static void GUISolveMJ(final List<Integer> mj)
			throws Exception {
		long  StartTime = System.currentTimeMillis();	
		final int OriSyanten = Functions.Syanten(mj);//原向听数
		int[] MJIndex = new int[14];
		for(int i = 0; i < 14; i++) {
			MJIndex[i] = i;
		}
		final CountDownLatch latch = new CountDownLatch(14);
		final Map<String, Integer> result = Collections.synchronizedMap(new HashMap<String, Integer>());
		if (OriSyanten == -1) {
			System.out.println("和牌！");
		} else {
			System.out.println("向听数：" + OriSyanten + "\n");
			for (final int i : MJIndex) {
				new Thread(new Runnable() {
					public void run() {
						String utsu = Functions.MJtoString(mj.get(i));
						int count = 0;	
						Map<String, Integer> mjSolve = Collections.synchronizedMap(new HashMap<String, Integer>());//存储麻将牌与数	
						List<Integer> tempmj = null;
						for (int j = 0; j < 34; j++) {
							int MJNum = j*4;
							tempmj = new CopyOnWriteArrayList<Integer>(mj);
							tempmj.remove(i);
							tempmj.add(MJNum);
							Set<Integer> tempset = Collections.synchronizedSet(new HashSet<Integer>(tempmj));	
							int ari = 0;
							while(tempset.size() != 14) {
								ari++;
								tempmj = new CopyOnWriteArrayList<Integer>(mj);
								tempmj.remove(i);
								MJNum++;
								tempmj.add(MJNum);															
								tempset.add(MJNum);
							}
							if(ari == 4) {
								continue;
							}
							else {
								try {
									int CurrentSyanten = Functions.Syanten(tempmj);
									if (CurrentSyanten < OriSyanten) {
										String tempPai = Functions.MJtoString(MJNum);
										mjSolve.put(tempPai, 4-ari);
										count+=4-ari;
									}
								} catch (Exception e) {
									e.printStackTrace();
								} 				
							}
						}
						if (count != 0) {
							StringBuilder sb = new StringBuilder();
							if (OriSyanten == 0) {
								sb.append("打" + utsu + "，听：");
								int j = 0;
								for (Map.Entry<String, Integer> tp : mjSolve.entrySet()) {
									sb.append(tp.getKey() + "(" + tp.getValue() + ")，");
									j++;
									if (j > 8) {
										sb.delete(sb.length() - 1, sb.length());
										sb.append("\n         ");
										j = 0;
									}
								}
								if (j != 0) {
									sb.delete(sb.length() - 1, sb.length());
									sb.append("\n         ");
								}
								sb.append("听牌数：");
							} else {
								sb.append("打" + utsu + "，进：");
								int j = 0;
								for (Map.Entry<String, Integer> tp : mjSolve.entrySet()) {
									sb.append(tp.getKey() + "(" + tp.getValue() + ")，");
									j++;
									if (j > 8) {
										sb.delete(sb.length() - 1, sb.length());
										sb.append("\n         ");
										j = 0;
									}
								}
								if (j != 0) {
									sb.delete(sb.length() - 1, sb.length());
									sb.append("\n         ");
								}
								sb.append("进张数：");
							}
							result.put(sb.toString(), count);
						}
						if (!mjSolve.isEmpty())
							mjSolve.clear();
						tempmj.clear();	
						count = 0;
						latch.countDown();
					}				
				}).start();				
			}
			try {
				latch.await();
			} catch(Exception e) {
				e.printStackTrace();
			}
			List<Map.Entry<String, Integer>> tempresult = new ArrayList<Map.Entry<String, Integer>>(
					result.entrySet());
			Collections.sort(tempresult,
					new Comparator<Map.Entry<String, Integer>>() {
						public int compare(Map.Entry<String, Integer> o1,
								Map.Entry<String, Integer> o2) {
							return o2.getValue().compareTo(o1.getValue());
						}
					});
			for (int i = 0; i < tempresult.size(); i++) {
				System.out.println(tempresult.get(i).getKey().toString()
						+ tempresult.get(i).getValue().toString() + "\n");
			}
		}
		long  EndTime = System.currentTimeMillis();
		System.out.println("用时："+((double)EndTime-(double)StartTime)/1000+"秒！");
	}
	
	public static void main(String args[]) throws Exception {
		String mj = "3356m267p18s34575z";
		for (Map.Entry<List<Integer>, Integer> tp : Functions.MJCheck(
				mj).entrySet()) {
			GUISolveMJ(tp.getKey());
		}
	}
}
