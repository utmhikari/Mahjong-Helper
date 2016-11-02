/**
 * 
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

import Functions.ResFunctions;

/**
 * @author HiKari
 *
 */
public class Config {
	/**
	 * 各种参数
	 */
	//System
	public static boolean StartAtLogon;
	public static boolean StartupMinimized;
	//Tenhou
	public static int KansenRefreshTimer;
	
	/**
	 * 读取设置数据ConfigParser
	 */
	public static void LoadConfig(){
		try{
			//Config File Link
			String CF = ResFunctions.getResPath("/Config.ini");	
			//Load Data(Scanning in WHILE loop)
			InputStreamReader isr = new InputStreamReader(new FileInputStream(CF), "GBK");
			BufferedReader ListBRead = new BufferedReader(isr);
			String config = "";
			while((config=ListBRead.readLine())!=null){	
				//System
				
				//StartAtLogon
				if(config.startsWith("StartAtLogon")){
					if(config.substring(config.indexOf('=')+1).equals("true")) {
						StartAtLogon = true;
					}
					else StartAtLogon = false;
				}		
				//StartupMinimized
				if(config.startsWith("StartupMinimized")){
					if(config.substring(config.indexOf('=')+1).equals("true")) {
						StartupMinimized = true;
					}
					else StartupMinimized = false;
				}		
				
				//Tenhou
				
				//KansenRefreshTimer
				if(config.startsWith("KansenRefreshTimer")){
					KansenRefreshTimer = Integer.parseInt(config.substring(config.indexOf('=')+1));
					if(KansenRefreshTimer>600 || KansenRefreshTimer<30){
						KansenRefreshTimer = 300; //Default:300
					}
				}		
				
			}
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "读取设置失败！"+ResFunctions.getResPath("/Config.ini"), "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * 设置界面刷新
	 */
	public static void FrameReset(){
		LoadConfig();
		
		//System
		
		//StartAtLogon
		GUI.getStartAtLogonCheckBox().setSelected(StartAtLogon);
		//StartupMinimized
		GUI.getStartupMinimizedCheckBox().setSelected(StartupMinimized);
		
		//Tenhou
		
		//KansenRefreshTimer
		GUI.getTenhouTimerTextField().setText(String.valueOf(KansenRefreshTimer));
	}
	
	
	public static void main(String args[]){
		LoadConfig();
	}
}
