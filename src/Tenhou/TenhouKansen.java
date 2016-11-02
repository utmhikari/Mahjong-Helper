/**
 * 
 */
package Tenhou;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;
import java.util.logging.Level;

import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.event.RowSorterEvent;
import javax.swing.event.RowSorterListener;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.plaf.synth.SynthTableUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TableView.TableRow;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.SwingWorker;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.Jdk14Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import Functions.ResFunctions;
import GUI.Config;
import GUI.GUI;
import GUI.GUITray;
import GUI.Messages;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlCheckBoxInput;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


/**
 * @author HiKari
 * 天凤观战君，结合了HTMLUnit以及Jsoup进行制作，相当于一个简单爬虫www（就tm定时爬一页）
 */
public class TenhouKansen {
	
	//观战List	 
	public static List<Map.Entry<String, Integer>> KanSenSort = null;
	//连接天凤Client
	public static final WebClient wc = new WebClient(BrowserVersion.INTERNET_EXPLORER);  
	
	/**
	 * 观战表格初始化
	 * @return
	 */
	public static List<Map.Entry<String, Integer>> Initial(){
		List<Map.Entry<String, Integer>> KSSort = null;	
		try {	
			wc.getOptions().setUseInsecureSSL(true); 
		    wc.getOptions().setJavaScriptEnabled(true);   
	        wc.getOptions().setCssEnabled(false); 
	        wc.getOptions().setThrowExceptionOnScriptError(false);
	        wc.getOptions().setThrowExceptionOnFailingStatusCode(false); 
	        wc.getOptions().setTimeout(5000);
	        Jdk14Logger logger = (Jdk14Logger) LogFactory.getLog("com.gargoylesoftware.htmlunit");
	        logger.getLogger().setLevel(Level.OFF);
	        //wc.getOptions().setPrintContentOnFailingStatusCode(false) ;
	
          
       
			final HtmlPage oripage = wc.getPage("http://tenhou.net/0/wg/");
			final HtmlForm form = oripage.getFormByName("f"); 
			final HtmlCheckBoxInput TeShang = form.getInputByName("taku2"); 
			//网页默认没有点选"特上"选框
			final HtmlPage page = TeShang.click(); 		
			
			/*//这段调试用，看网页格式
			String KS = ResFunctions.getResPath("/Kansen.xml");
			File file =new File(KS);
		    if(!file.exists()){
		       file.createNewFile();
		    }
		    else{
		       file.delete();
		       file.createNewFile();
		    }
		    FileOutputStream fos = new FileOutputStream(KS); 
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); 
	        osw.write(page.asXml()); 
	        osw.flush(); 			
			*/
						
			Document doc = Jsoup.parse(page.asXml());
			//用Hashmap存放对局者信息
			HashMap<String,Integer> KansenMap = new HashMap<String,Integer>();
			Elements Info =  doc.select("div#c");
			
			//观战页面结构（div）: c{(ebbbb),(ebbbb),~~~,(ebbbb)}
			StringBuffer tempdivE = new StringBuffer();
			StringBuffer tempdivB = new StringBuffer();
			StringBuffer temp = new StringBuffer();
			int count = 0;
			for(Element MainInfo : Info){			
				for(Element BasicInfo : MainInfo.getElementsByTag("div")){		
					if(BasicInfo.hasClass("e")){
						tempdivE.delete(0,tempdivE.length());
						tempdivE.append(divE(BasicInfo.text()));
						count = 0;
					}
					else if(BasicInfo.hasClass("b")){
						tempdivB.delete(0,tempdivB.length());						
						tempdivB.append(divB(BasicInfo.text(),count));
						temp.append(tempdivE+","+tempdivB);
						KansenMap.put(temp.toString(), Integer.parseInt(temp.toString().split(",")[4].substring(1,5)));
						//System.out.println(temp.toString());
						temp.delete(0, temp.length());
						count++;						
					}					
					//times++;						
				}
				//System.out.println(MainInfo);
			}
			/*
			List<Map.Entry<String, Integer>> KSSort = new ArrayList<Map.Entry<String, Integer>>(KansenMap.entrySet());
			Collections.sort(KSSort, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1,
						Map.Entry<String, Integer> o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
			});
			*/
			HashMap<String,Integer> KansenMapExist = new HashMap<String,Integer>();
			HashMap<String,Integer> KansenMapNotExist = new HashMap<String,Integer>();
			//Iterator<Entry<String, Integer>> iter = KansenMap.entrySet().iterator();
			for (Map.Entry<String, Integer> entry : KansenMap.entrySet()) {			
				if(KansenExist(entry.getKey().split(",")[5])) {
					KansenMapExist.put(entry.getKey(),entry.getValue());
				}
				else {
					KansenMapNotExist.put(entry.getKey(),entry.getValue());
				}
			}
			
			List<Map.Entry<String, Integer>> KSSortExist = new ArrayList<Map.Entry<String, Integer>>(KansenMapExist.entrySet());
			Collections.sort(KSSortExist, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1,
						Map.Entry<String, Integer> o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
			});
	        
			List<Map.Entry<String, Integer>> KSSortNotExist = new ArrayList<Map.Entry<String, Integer>>(KansenMapNotExist.entrySet());
			Collections.sort(KSSortNotExist, new Comparator<Map.Entry<String, Integer>>() {
				public int compare(Map.Entry<String, Integer> o1,
						Map.Entry<String, Integer> o2) {
					return o2.getValue().compareTo(o1.getValue());
				}
			});
			
			KSSort = new ArrayList<Map.Entry<String, Integer>>();
			if(KSSortExist.size() > 0) {
				for(int i = 0; i < KSSortExist.size(); i++) {
					KSSort.add(KSSortExist.get(i));
				}
			}
			if(KSSortNotExist.size() > 0) {
				for(int i = 0; i < KSSortNotExist.size(); i++) {
					KSSort.add(KSSortNotExist.get(i));					
				}
			}

			
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "读取天凤观战数据失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}	
         return KSSort;    
	}
	
	//刷新以及观战List
	public static boolean KSRefresh = false; //判定刷新
	public static List<Integer> KSExistList = new ArrayList<Integer>(); //天凤观战列表
	public static int countMyList = 0; //我的列表
	public static boolean KSRead = true; //判定读取文件
	
	/**
	 * 观战表格绘制
	 * @param KSTable
	 * @param KSSort
	 */
	public static void PaintTable(JTable KSTable,List<Map.Entry<String, Integer>> KSSort){
		StringBuffer KSInfo = new StringBuffer();
		String[] Form = new String[7];
		DefaultTableModel KSModel = (DefaultTableModel)KSTable.getModel();
		KSModel.getDataVector().clear();
		KSModel.fireTableDataChanged();
		KSTable.updateUI();
		if(KSExistList.size() > 0) {
			KSExistList.clear();
		}
		if(KSSort.size() > 0) {
		for (int i = 0; i < KSSort.size(); i++) {
				KSInfo.delete(0, KSInfo.length());
				KSInfo.append(KSSort.get(i).getKey().toString());
				//Hashmap结构：时间、桌、链接、段位、R值、ID、链接后缀；分隔符：","。
				//JTable结构：序号、时间、R值、段位、ID、桌、链接（不可见）。
				//先判定复选框
				boolean flag1 = false;
				boolean flag2 = false;
				
				while(true){
					if(GUI.getSiFH().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("四") && KSInfo.toString().split(",")[1].contains("鳳")){
							flag1 = true;
							break;
						}
					}
					if(GUI.getSanFH().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("三") && KSInfo.toString().split(",")[1].contains("鳳")){
							flag1 = true;
							break;
						}
					}
					if(GUI.getSiTS().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("四") && KSInfo.toString().split(",")[1].contains("特")){
							flag1 = true;
							break;
						}
					}
					if(GUI.getSanTS().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("三") && KSInfo.toString().split(",")[1].contains("特")){
							flag1 = true;
							break;
						}
					}
					if(GUI.getQueZhuang().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("四") && KSInfo.toString().split(",")[1].contains("祝")){
							flag1 = true;
							break;
						}
					}
					if(GUI.getQueZhuang().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("三") && KSInfo.toString().split(",")[1].contains("祝")){
							flag1 = true;
							break;
						}
					}
					break;
				}
				while(true){
					if(GUI.getDongFeng().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("東")){
							flag2 = true;
							break;
						}
					}
					if(GUI.getDongNan().isSelected()){
						if(KSInfo.toString().split(",")[1].contains("南")){
							flag2 = true;
							break;
						}
					}
					break;
				}
				
				
				if(flag1 && flag2){
					//序号
					Form[0] = String.valueOf(i+1);
					//时间
					Form[1] = KSInfo.toString().split(",")[0];
					//R值
					Form[2] = KSInfo.toString().split(",")[4];
					//段位
					Form[3] = KSInfo.toString().split(",")[3];
					//ID
					Form[4] = KSInfo.toString().split(",")[5];
					//桌
					Form[5] = KSInfo.toString().split(",")[1];
					//链接
					Form[6] = KSInfo.toString().split(",")[2]+KSInfo.toString().split(",")[6];				
					
					if(KansenExist(Form[4])){
						if(KSRead) {
							countMyList++;
							if(KSRefresh){
								if(countMyList<10){
									Messages.KSMessage.append(Form[1]+" "+Form[4]+" "+Form[3]+Form[2]+" "+Form[5]+"\n");
								}			
								else if (countMyList == 10){
									Messages.KSMessage.append("等");
								}
							}
							KSExistList.add(KSModel.getRowCount());
						}					
					}							
						KSModel.addRow(Form);	
				}
						
				if(!KSRead) {
					KSModel.getDataVector().clear();
					KSModel.fireTableDataChanged();
					KSTable.updateUI();
					break;
				}
			}
		}
		if(KSRefresh){
			if(countMyList>=10){
				Messages.KSMessage.append(countMyList+"场观战");
			}
		}
		
		KSTable.setDefaultRenderer(Object.class, new KansenTableRenderer());
		KSTable.updateUI();
	}
	
	/**
	 * div class=e
	 * @param info
	 * @return
	 */
    public static StringBuffer divE(String info){
    	StringBuffer divE = new StringBuffer();
    	//观战时间
    	StringBuffer Time = new StringBuffer(info.split(" ")[3]);
    	//桌种类
    	StringBuffer Table = new StringBuffer(info.split(" ")[5]);
    	//观战链接
    	StringBuffer Link = new StringBuffer(info.split(" ")[7]);
    	
    	divE.append(Time+","+Table+","+Link);   	
    	
    	return divE;
    }
    
    /**
     * div class=b
     * @param info
     * @return
     */
    public static StringBuffer divB(String info,int count){
    	StringBuffer divB = new StringBuffer();
    	//段位
    	StringBuffer Duan = new StringBuffer(info.split(" ")[0].substring(0,info.split(" ")[0].indexOf("R")));
    	//R值
    	StringBuffer Rate = new StringBuffer(info.split(" ")[0].substring(info.split(" ")[0].indexOf("R"),info.split(" ")[0].length()));
    	//ID
    	StringBuffer ID = new StringBuffer(info.split(" ")[2]);
    	//后附链接后缀    	
    	divB.append(Duan+","+Rate+","+ID+",&tw="+count);
    	return divB;
    }
    
    /**
     * 观战表模版getter
     * @return
     */
	public static DefaultTableModel getKSModel(){
		KansenTableModel KSModel = new KansenTableModel(
				new Object[][]{}, new String[] { "序号", "时间", "R值", "段位", "ID", "桌", "链接" });
        return KSModel;
	}
	
	/**
	 * 观战表初始设定
	 * @param KSTable
	 */
	public static TableRowSorter<TableModel> sorter;
    /**
     * @param KSTable
     */
    @SuppressWarnings("rawtypes")
	public static void Setup(final JTable KSTable) {		       
        //基本设置
		KSTable.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		KSTable.setCellSelectionEnabled(false);
		KSTable.setRowSelectionAllowed(true);
		KSTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		KSTable .getTableHeader().setReorderingAllowed(false);
		KSTable.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(255,255,255,255), 1));
		//KSTable.getTableHeader().setBorder(BorderFactory.createRaisedBevelBorder());
		KSTable.getTableHeader().setResizingAllowed(false)	;	
		KSTable.setRowHeight(25);
		KSTable.getTableHeader().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		KSTable.getTableHeader().setPreferredSize(new Dimension(KSTable.getTableHeader().getWidth(),25));
		KSTable.getTableHeader().setBackground(new Color(233,233,233,255));
		KSTable.getTableHeader().setFont(new Font("华文中宋", Font.BOLD,13));
		

		//KSTable.setUI(new SynthTableUI());
		//列宽
		TableColumn NumColumn = KSTable.getColumnModel().getColumn(0);
		TableColumn TimeColumn = KSTable.getColumnModel().getColumn(1);
		TableColumn RateColumn = KSTable.getColumnModel().getColumn(2);
		TableColumn DuanColumn = KSTable.getColumnModel().getColumn(3);
		TableColumn IDColumn = KSTable.getColumnModel().getColumn(4);
		TableColumn TBColumn = KSTable.getColumnModel().getColumn(5);
		TableColumn LinkColumn = KSTable.getColumnModel().getColumn(6);
		NumColumn.setPreferredWidth(56);
		NumColumn.setMaxWidth(56);
		NumColumn.setMinWidth(56);
		TimeColumn.setPreferredWidth(56);
		TimeColumn.setMaxWidth(56);
		TimeColumn.setMinWidth(56);
		RateColumn.setPreferredWidth(56);
		RateColumn.setMaxWidth(56);
		RateColumn.setMinWidth(56);
		DuanColumn.setPreferredWidth(56);
		DuanColumn.setMaxWidth(56);
		DuanColumn.setMinWidth(56);
		IDColumn.setPreferredWidth(116);
		IDColumn.setMaxWidth(116);
		IDColumn.setMinWidth(116);
		TBColumn.setPreferredWidth(100);
		TBColumn.setMaxWidth(100);
		TBColumn.setMinWidth(100);
		LinkColumn.setPreferredWidth(300);
		LinkColumn.setMaxWidth(300);
		LinkColumn.setMinWidth(300);
		KSTable.invalidate();
		
		//排序器
		sorter = new TableRowSorter<TableModel>(KSTable.getModel());
		sorter.setComparator(0, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				return Integer.parseInt(o1.toString()) - Integer.parseInt(o2.toString());		       
			}			
		}); //序号
		sorter.setComparator(2, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				return Integer.parseInt((o2.toString().substring(1, 5))) - Integer.parseInt((o1.toString().substring(1, 5)));
			}			
		}); //R值
		sorter.setComparator(3, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				@SuppressWarnings("serial")
				HashMap<String,Integer> Duan = new HashMap<String,Integer>(){{
					put("四段",4);
					put("五段",5);
					put("六段",6);
					put("七段",7);
					put("八段",8);
					put("九段",9);
					put("十段",10);
					put("天鳳位",11);
				}};				
				return Duan.get(o2.toString()).compareTo(Duan.get(o1.toString()));
			}	
		}); //段位
		sorter.setComparator(5, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				@SuppressWarnings("serial")
				HashMap<String,Integer> Zhuo = new HashMap<String,Integer>(){{
					//喵的凤姬你没事加雀庄选项干嘛
					put("四鳳南喰赤",24);put("四鳳南喰赤速",23);put("四鳳南喰",22);put("四鳳南",21);
					put("四鳳東喰赤速",20);put("四鳳東喰赤",19);put("四鳳東喰",18);put("四鳳東",17);				
					put("三鳳南喰赤",16);put("三鳳南喰赤速",15);
					put("三鳳東喰赤",14);put("三鳳東喰赤速",13);
					put("四特南喰赤",12);put("四特南喰赤速",11);put("四特南喰",10);put("四特南",9);
					put("四特東喰赤速",8);put("四特東喰赤",7);put("四特東喰",6);put("四特東",5);				
					put("三特南喰赤",4);put("三特南喰赤速",3);
					put("三特東喰赤",2);put("三特東喰赤速",1);
					put("四琥南祝２",0);put("四琥南祝５",-1);put("四琥南祝０",-1);
					put("四琥東祝５",-2);put("四琥東祝２",-3);put("四琥東祝０",-4);
					put("三琥南祝５",-5);put("三琥東祝５",-6);
				}};				
				return Zhuo.get(o2.toString()).compareTo(Zhuo.get(o1.toString()));
			}			
		}); //桌
		KSTable.setRowSorter(sorter);
    }
    
   /**
    * 观战列表中是否出现（不包括添加删除操作）
    * @param Player
    * @return
    */
    public static boolean KansenExist(String Player) {
    	boolean exist =false;
    	String KS = getKanSenListLink();
		try{
			File ListFile = new File(KS);
			if(!ListFile.exists()){
				ListFile.createNewFile();
				OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(KS,true),"GBK");
				BufferedWriter bfw = new BufferedWriter(osw);  
				bfw.close();
				osw.close();
			}
			InputStreamReader isr = new InputStreamReader(new FileInputStream(ListFile), "GBK");
			BufferedReader ListBRead = new BufferedReader(isr);
			String KSPlayer = "";
			while((KSPlayer=ListBRead.readLine())!=null){				
				//System.out.println(KSPlayer);
				if(Player.equals(KSPlayer)){
					exist = true;
					break;
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "读取观战列表失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
			KSRead = false;
		}		
	    return exist;	  	
    }
    
    
    /**
     * 观战表右键菜单
     * @param id
     */
    public static JPopupMenu KansenPopup(String id, final JFrame frame){
    	JPopupMenu popupMenu = new JPopupMenu();


        final JMenuItem Kansen = new JMenuItem("观战："+id);
        JMenuItem AddToList = new JMenuItem("添加到我的观战列表");
        JMenuItem DeleteFromList = new JMenuItem("从我的观战列表中删除");
             
        popupMenu.add(Kansen);
        popupMenu.add(new JSeparator());
        popupMenu.add(AddToList);     
        popupMenu.add(DeleteFromList);
        
        //观战
        Kansen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String link = GUI.getKansenTable().getValueAt(
						GUI.getKansenTable().getSelectedRow(), 6).toString();
				GUI.getTenhouFrame().setVisible(true);
				MainTenhou.TenhouGameBrowser.navigate(link);
				frame.setExtendedState(JFrame.ICONIFIED);
			}       	
        });
        
        //添加到列表
        AddToList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				boolean exist =false;
		    	String KS = getKanSenListLink();
				try{
					File ListFile = new File(KS);
					if(!ListFile.exists()){
						ListFile.createNewFile();
						OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(KS,true),"GBK");
						BufferedWriter bfw = new BufferedWriter(osw); 
						bfw.close();
						osw.close();
					}
					InputStreamReader isr = new InputStreamReader(new FileInputStream(ListFile), "GBK");
					BufferedReader ListBRead = new BufferedReader(isr);
					StringBuffer newfile = new StringBuffer();
					String KSPlayer = "";
					while((KSPlayer=ListBRead.readLine())!=null){		
						if(!Kansen.getText().split("：")[1].equals(KSPlayer)){
							newfile.append(KSPlayer+",");
						}
						if(Kansen.getText().split("：")[1].equals(KSPlayer)){
							exist = true;
							break;
						}	
					}
					if(!exist){	
						newfile.append(Kansen.getText().split("：")[1]);
						OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(KS,false),"GBK");
						BufferedWriter bfw = new BufferedWriter(osw); 
						for(String s : newfile.toString().split(",")){
							if(!(s.equals(""))) {
								bfw.write(s);
								bfw.newLine();
							}
						}
						bfw.flush();
						bfw.close();
						osw.close();
						TenhouKansen.PaintTable(GUI.getKansenTable(), KanSenSort);
						countMyList=0;
					}
					GUI.getMyKansenRefreshButton().doClick();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "读取/写入观战列表失败！", "错误",
							JOptionPane.ERROR_MESSAGE);
				}			
			}
		});	
        
      //从列表中删除
        DeleteFromList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String KS = getKanSenListLink();							
				try{
					File ListFile = new File(KS);
					if(!ListFile.exists()){
						ListFile.createNewFile();
						OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(KS,true),"GBK");
						BufferedWriter bfw = new BufferedWriter(osw);  
						bfw.close();
						osw.close();
					}
					InputStreamReader isr = new InputStreamReader(new FileInputStream(ListFile), "GBK");
					BufferedReader ListBRead = new BufferedReader(isr);
					StringBuffer newfile = new StringBuffer();
					String KSPlayer = "";
					while((KSPlayer=ListBRead.readLine())!=null){		
						if(!Kansen.getText().split("：")[1].equals(KSPlayer)){
							newfile.append(KSPlayer+",");
						}	
					}
					OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(KS,false),"GBK");
					BufferedWriter bfw = new BufferedWriter(osw); 
					newfile.deleteCharAt(newfile.length()-1);
					for(String s : newfile.toString().split(",")){
						bfw.write(s);
						bfw.newLine();						
					}
					bfw.flush();
					bfw.close();
					osw.close();
					TenhouKansen.PaintTable(GUI.getKansenTable(), KanSenSort);
					countMyList=0;
					GUI.getMyKansenRefreshButton().doClick();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "读取/写入观战列表失败！", "错误",
							JOptionPane.ERROR_MESSAGE);
				}			
			}
		});	
        
        return popupMenu;       
    }
    
    /**
     * 观战链接
     */
    public static String getKanSenListLink(){
		String KS = ResFunctions.getResPath("/KanSenList.ini");	
		return KS;
    }
    /**
     * 测试main函数
     * @param args
     */
	public static void main(String[] args) {
		//在此之前请设置JFrame,JPanel,JScrollPane什么的
		//以及TableModel：6列(序号、时间、R值、段位、ID、桌)，0行。
		JTable KansenTable = new JTable();
		Setup(KansenTable);
		//Initial(KansenTable);
	}

}
