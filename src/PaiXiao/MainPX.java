package PaiXiao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import PaiXiao.Functions;

import PaiXiao.Format;

public class MainPX {
	
	private int wan[][],bing[][],tiao[][],zi[][];
	//万饼条字，字顺序为东南西北白发中
	private int mj[];
	//麻将
	
	/**
	 * 1、初始化麻将
	 * @param args
	 */
	public void Initial(){
		wan = new int[9][4];
		bing = new int[9][4];
		tiao = new int[9][4];
		zi = new int[7][4];
		for(int i=0;i<9;i++){
			for(int j=0;j<4;j++){
				wan[i][j]=i+1;
				bing[i][j]=i+1;
				tiao[i][j]=i+1;
				if(i<7) {zi[i][j]=i+1;}
			}
		}
		mj=new int[136];
		for(int i=0;i<9;i++){
			for(int j=0;j<4;j++){
				mj[4*i+j]=wan[i][j];
				mj[4*(9+i)+j]=bing[i][j];
				mj[4*(18+i)+j]=tiao[i][j];
				if(i<7) {mj[4*(27+i)+j]=zi[i][j];}
			}
		}
	}
	
	/**
	 * 2、随机生成麻将牌（14张）
	 * @param times 次数
	 */
	public static List<Integer> RandomMJ(int times){
		HashSet<Integer> MJSET= new HashSet<Integer>();
		Format.randomSet(0,135,14,MJSET);
		List<Integer> mjs = new ArrayList<Integer>();
		for(Integer value:MJSET){
			mjs.add(value);
		}
		Collections.sort(mjs);
		//System.out.println(mjs);
		//随机生成14张牌
		
	
		String randommj = "";//14张牌输出字符串值~
		randommj=Functions.MJtoString(mjs);//字符串生成
		System.out.println("手牌"+times+":"+randommj);
		return mjs;
	}
	
	/**
	 * 3、牌效计算
	 * @param mj 麻将手牌
	 * @throws Exception 
	 */
	public static void SolveMJ(List<Integer> mj) throws Exception{
		int count=0;
		int OriSyanten=Functions.Syanten(mj);//原向听数
		int CurrentSyanten;//现向听数
		HashSet<Integer> tempset = new HashSet<Integer>();
		LinkedHashMap<String,Integer> mjSolve = new LinkedHashMap<String,Integer>();//存储麻将牌与数
		List<Integer> tempmj = null;
		String utsu;
		System.out.println("向听数:"+OriSyanten);
		
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		
		for(int i=0;i<14;i++){
			utsu=Functions.MJtoString(mj.get(i));
			for(int j=0;j<136;j++){
				tempmj = new ArrayList<Integer>(mj);
				tempmj.remove(i);
				tempmj.add(j);
				//Collections.sort(tempmj);
				if(!tempset.isEmpty())  {tempset.clear();}
				for(Integer value:mj){
					tempset.add(value);
				}
				//System.out.println(Functions.MJtoString(tempmj));
				if(tempset.size()==14){
					CurrentSyanten=Functions.Syanten(tempmj);
					if(CurrentSyanten < OriSyanten){
						String tempPai = Functions.MJtoString(j);
						if(mjSolve.containsKey(tempPai)){
							int tempMJnum = mjSolve.get(tempPai);
							tempMJnum++;
							mjSolve.remove(tempPai);
							mjSolve.put(tempPai,tempMJnum);
						}
						else {
							mjSolve.put(tempPai, 1);
						}
						count++;
					}
				}
			}
			if(count!=0) {
				/*ISystem.out.print("打"+utsu+"，进：");
				for(Map.Entry<String, Integer> tp: mjSolve.entrySet()) 
				{
					System.out.print(tp.getKey()+"("+tp.getValue()+"),");
				}
				System.out.print("进张数："+count+"\n");*/
				
				StringBuffer sb = new StringBuffer();
				sb.append("打"+utsu+"，进：");
				for(Map.Entry<String, Integer> tp: mjSolve.entrySet()) 
				{
					sb.append(tp.getKey()+"("+tp.getValue()+"),");
				}
				sb.append("进张数：");
				String tpResult=sb.toString();
				result.put(tpResult, count);
			}
			if(!mjSolve.isEmpty()) mjSolve.clear();
			tempmj.clear();
			count = 0;
		}
		List<Map.Entry<String, Integer>> MJSort = new ArrayList<Map.Entry<String, Integer>>(result.entrySet());
		Collections.sort(MJSort, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
				/*if (o2.getValue() - o1.getValue() > 0) {
					return 1;
				}else{
					return 0;
				}*/
			}
		});
		for (int i = 0; i < MJSort.size(); i++) {
			System.out.println(MJSort.get(i).getKey().toString()+MJSort.get(i).getValue().toString());
		}
	}
	
	/**
	 * 4、手动输入手牌
	 * @throws Exception 
	 */
	public static List<Integer> ManualMJ(){
		List<Integer> MJ = new ArrayList<Integer>();
		while(true){
			System.out.println("请输入麻将手牌（14张牌，格式为~~~m~~~p~~~s~~~z）");
			Scanner sc=new Scanner(System.in);
			String mj=sc.next();
			int tempINT=0;
			for(Map.Entry<List<Integer>, Integer> tp: Functions.MJCheck(mj).entrySet()) 
			{
				MJ = new ArrayList<Integer>(tp.getKey());
				tempINT=tp.getValue();
			}
			if(tempINT > 0){
				System.out.println("麻将输入成功！");
				break;
			}
			else {
				System.out.println("麻将输入错误！");
			}
		}
		return MJ;
	}
	
	/**
	 * 主函数
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		//MainPX px = new MainPX();
		//px.Initial();
		List<Integer> MJ=ManualMJ();
		SolveMJ(MJ);
	}
}
