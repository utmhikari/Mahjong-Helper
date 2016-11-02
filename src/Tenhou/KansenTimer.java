/**
 * 
 */
package Tenhou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import GUI.Config;

/**
 * @author HiKari
 *
 */
public class KansenTimer implements ActionListener{
	
	public static KansenTimer KT = new KansenTimer();
    private Timer timer;  
    private static int countdown;
    
    public static int getCountDown(){
    	return countdown;
    }
    
    public static void setCountDown(int cd){
    	countdown = cd;
    }
    
    public KansenTimer() {            
        setCountDown(Config.KansenRefreshTimer);
    	timer = new Timer(1000, this);  
    }  
    
    public void start(){
    	timer.start();
    }
    
    public void restart(){
    	setCountDown(Config.KansenRefreshTimer);
    	timer.restart();
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		setCountDown(countdown-1);
		if(countdown>=0){
			GUI.GUI.getKSLabel().setText("天凤观战列表————自动刷新时间:"+countdown+"秒");	
		}
		else{
			setCountDown(Config.KansenRefreshTimer);
			if(GUI.GUI.getKSRefresh().isEnabled()){
				GUI.GUI.getKSRefresh().doClick();
			}
			GUI.GUI.getKSLabel().setText("天凤观战列表————自动刷新时间:"+countdown+"秒");	
		}
	}
	
}
