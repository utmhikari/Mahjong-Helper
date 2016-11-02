package Tenhou;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import sun.swing.table.DefaultTableCellHeaderRenderer;

import Functions.ResFunctions;
import GUI.GUI;

/**
 * 我的观战列表表格
 * @author HiKari
 * 挺多代码一样的，一开始没模块化好功能，有优化的余地，比如aop
 */
public class MyKansen {
	static TableRowSorter<TableModel> mysorter = null;
	/**
	 * 初始化我的观战列表表格
	 * @param MyKansenTable
	 */
	@SuppressWarnings("rawtypes")
	public static void Initial(JTable MyKansenTable) {
		//设置居中
		DefaultTableCellHeaderRenderer thr = new DefaultTableCellHeaderRenderer();
	    thr.setHorizontalAlignment(JLabel.CENTER);
	    MyKansenTable.getTableHeader().setDefaultRenderer(thr);
	   
	   //同步天凤观战列表的初始化方法   
	   TableColumn NumColumn = MyKansenTable.getColumnModel().getColumn(0);
	   TableColumn IDColumn = MyKansenTable.getColumnModel().getColumn(1);
	   NumColumn.setPreferredWidth(100);
		NumColumn.setMaxWidth(100);
		NumColumn.setMinWidth(100);
		IDColumn.setPreferredWidth(135);
		IDColumn.setMaxWidth(135);
		IDColumn.setMinWidth(135);
	   MyKansenTable.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
	   MyKansenTable.setCellSelectionEnabled(false);
	   MyKansenTable.setRowSelectionAllowed(true);
	   MyKansenTable.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	   MyKansenTable .getTableHeader().setReorderingAllowed(false);
	   MyKansenTable.getTableHeader().setBorder(BorderFactory.createLineBorder(new Color(255,255,255,255), 1));
	   MyKansenTable.getTableHeader().setResizingAllowed(false)	;	
	   MyKansenTable.setRowHeight(25);
	   MyKansenTable.getTableHeader().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	   MyKansenTable.getTableHeader().setPreferredSize(new Dimension(MyKansenTable.getTableHeader().getWidth(),25));
	   MyKansenTable.getTableHeader().setBackground(new Color(233,233,233,255));
	   MyKansenTable.getTableHeader().setFont(new Font("华文中宋", Font.BOLD,13));
	   //排序器
	     mysorter = new TableRowSorter<TableModel>(MyKansenTable.getModel());
		mysorter.setComparator(0, new Comparator(){
			@Override
			public int compare(Object o1, Object o2) {
				return Integer.parseInt(o1.toString()) - Integer.parseInt(o2.toString());		       
			}			
		}); //序号
		MyKansenTable.setRowSorter(mysorter);
		
	   MyKansenTable.invalidate();	   
	}
	
	/**
	 * 刷新我的观战列表数据
	 * @param MyKansenTable
	 */
	public static void RefreshKansenList(JTable MyKansenTable) {	
		try {
			DefaultTableModel MyKSModel = (DefaultTableModel)MyKansenTable.getModel();
			MyKSModel.getDataVector().clear();
			MyKSModel.fireTableDataChanged();
			MyKansenTable.updateUI();
			File mykansenlist = new File(ResFunctions.getResPath("/KanSenList.ini"));	
			InputStreamReader isr = new InputStreamReader(new FileInputStream(mykansenlist), "GBK");		 
			BufferedReader ListBRead = new BufferedReader(isr);
			String[] KSPlayers = new String[2];	
			String KSPlayer = "";
			int index = 0;
			List<String> MyKansenPlayers = new ArrayList<String>();
			while((KSPlayer=ListBRead.readLine())!=null){	
				MyKansenPlayers.add(KSPlayer);
			}	
			Collections.sort(MyKansenPlayers, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return o1.compareToIgnoreCase(o2);
				}
			});
			if(MyKansenPlayers.size() > 0) {
				for(String MyKansenPlayer : MyKansenPlayers) {
					index++;
					KSPlayers[0] = String.valueOf(index);
					KSPlayers[1] = MyKansenPlayer;
					MyKSModel.addRow(KSPlayers);
				}
			}
			MyKansenPlayers.clear();
			MyKansenTable.setDefaultRenderer(Object.class, new MyKansenTableRenderer());
			MyKSModel.fireTableDataChanged();
			MyKansenTable.updateUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
     * 观战表右键菜单
     * @param id
     */
    public static JPopupMenu MyKansenPopup(String id, final JFrame frame){
    	JPopupMenu popupMenu = new JPopupMenu();


        final JMenuItem Kansen = new JMenuItem("我的观战列表："+id);
        JMenuItem DeleteFromList = new JMenuItem("从我的观战列表中删除");
             
        popupMenu.add(Kansen);
        popupMenu.add(new JSeparator());
        popupMenu.add(DeleteFromList);
        
        //观战
        Kansen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				StringBuffer message = new StringBuffer();
				JOptionPane.showMessageDialog(null, message,"个人信息："+GUI.getMyKansenTable().getValueAt(
						GUI.getMyKansenTable().getSelectedRow(),1),JOptionPane.INFORMATION_MESSAGE);
					*/
			}       	
        });
     
      //从列表中删除
        DeleteFromList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String KS = TenhouKansen.getKanSenListLink();							
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
					TenhouKansen.PaintTable(GUI.getKansenTable(), TenhouKansen.KanSenSort);
					TenhouKansen.countMyList=0;
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
	 * 读取JTableModel
	 */
	public static DefaultTableModel getMyKSModel() {
		KansenTableModel KSModel = new KansenTableModel(
				new Object[][]{}, new String[] { "序号", "ID" });
        return KSModel;
	}
}
