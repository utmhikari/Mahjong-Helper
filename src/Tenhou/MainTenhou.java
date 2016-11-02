/**
 * 
 */
package Tenhou;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.KeyboardFocusManager;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowStateListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;


import GUI.GUI;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.NSComponentOptions;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserCommandEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserListener;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowOpeningEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserWindowWillOpenEvent;


/**
 * @author HiKari
 *
 */
public class MainTenhou{
	
	public static final JWebBrowser TenhouGameBrowser = new JWebBrowser(NSComponentOptions.destroyOnFinalization());
	
	public static void Initial(JPanel TenhouGamePanel){
		TenhouGameBrowser.setBarsVisible(false);	
		TenhouGameBrowser.setJavascriptEnabled(true);
		TenhouGamePanel.add(TenhouGameBrowser, BorderLayout.CENTER);	
	}
	
	public static void MainAction(JWebBrowser TenhouGameBrowser){
		TenhouGameBrowser.navigate("http://tenhou.net/0/");
	}
	
	
	public static void GSAction(JWebBrowser TenhouGameBrowser,StringBuffer GS){
		try{
			long x = Integer.parseInt(GS.toString());
			if(x>=1000 && x<=9999){
				TenhouGameBrowser.navigate("http://tenhou.net/0/?L"+GS);
			}
			else{
				JOptionPane.showMessageDialog(null, "个室号输入错误！", "错误",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "个室号输入错误！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public static void HSAction(JWebBrowser TenhouGameBrowser,StringBuffer HS){
		try{
			long x = Integer.parseInt(HS.toString());
			if(HS.length()==8 && x>=1 && x<=99999999){
				TenhouGameBrowser.navigate("http://tenhou.net/0/?C"+HS);
			}
			else{
				JOptionPane.showMessageDialog(null, "大会室号输入错误！", "错误",
						JOptionPane.ERROR_MESSAGE);
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "大会室号输入错误！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void main(String args[]){
		UIUtils.setPreferredLookAndFeel();
		NativeInterface.open();
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame mainframe = new JFrame();
				JPanel mainpanel = new JPanel();						
				mainpanel.setSize(1024, 768);
				mainframe.setSize(1024, 768);				
				mainframe.add(mainpanel);
				mainpanel.setLayout(new BorderLayout());
				mainframe.setFocusableWindowState(false);
				mainframe.setAlwaysOnTop(true);
				TenhouGameBrowser.setBarsVisible(true);
				TenhouGameBrowser.navigate("http://tenhou.net/0/");
				TenhouGameBrowser.setJavascriptEnabled(true);
				mainpanel.add(TenhouGameBrowser, BorderLayout.CENTER);	
				mainframe.setVisible(true);
				mainpanel.setVisible(true);								
			}
		});
		NativeInterface.runEventPump();
	}
}
