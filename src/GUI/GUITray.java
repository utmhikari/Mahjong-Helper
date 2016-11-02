/**
 * 
 */
package GUI;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import Tenhou.TenhouKansen;

/**
 * @author HiKari
 *
 */
public class GUITray {
	//menus
	private static PopupMenu pop = new PopupMenu();
	private static MenuItem open = new MenuItem("打开主界面");
	private static MenuItem config = new MenuItem("设置");
	private static MenuItem close = new MenuItem("关闭");
	
	private static MenuItem tenhouback = new MenuItem("回到天凤");
	private static MenuItem tenhou = new MenuItem("天凤麻雀");
	
	private static MenuItem guide = new MenuItem("日麻教程");
	
	private static MenuItem px = new MenuItem("牌效");
	
	private static MenuItem baike = new MenuItem("日麻百科");
	
	//other components
	private static TrayIcon trayicon;
	
	//getters
	
	public static MenuItem getTenhouBack(){
		return tenhouback;
	}
	public static TrayIcon getTrayIcon(){
		return trayicon;
	}
	
	//initial
	public static void Initial(final GUI frame) {	
		//Listeners
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				frame.setExtendedState(JFrame.NORMAL);
			}
		});	
		config.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.getConfigFrame().setEnabled(true);
				Config.FrameReset();
				GUI.getConfigFrame().setVisible(true);
			}
		});	
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TenhouKansen.wc.close();
				System.exit(0);
			}
		});	
		baike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				frame.setExtendedState(JFrame.NORMAL);
				frame.getTabbedPane().setSelectedIndex(0);
			}
		});	
		guide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				frame.setExtendedState(JFrame.NORMAL);
				frame.getTabbedPane().setSelectedIndex(1);
			}
		});	
		px.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				frame.setExtendedState(JFrame.NORMAL);
				frame.getTabbedPane().setSelectedIndex(2);
			}
		});		
		tenhou.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(true);
				frame.setExtendedState(JFrame.NORMAL);
				frame.getTabbedPane().setSelectedIndex(3);
			}
		});	
		tenhouback.setEnabled(false);
		GUITray.getTenhouBack().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getTenhouGameFrame().setVisible(true);
				frame.getTenhouBack().setEnabled(false);
				GUITray.getTenhouBack().setEnabled(false);
				frame.setExtendedState(JFrame.ICONIFIED);
			}
		});
		
		
		
		//menus
		pop.add(tenhouback);
		pop.add(tenhou);
		pop.addSeparator();
		pop.add(px);
		pop.addSeparator();
		pop.add(guide);
		pop.addSeparator();	
		pop.add(baike);
		pop.addSeparator();
		pop.add(open);
		pop.add(config);
		pop.add(close);
		
		
		//systemtray
		if (SystemTray.isSupported()) {
			SystemTray tray = SystemTray.getSystemTray();
			Image icon = new ImageIcon("."+File.separator+"res"+File.separator+"GUI"+File.separator+"trayicon.png").getImage();
			trayicon = new TrayIcon(icon, "日麻助手@何桌雀庄", pop);
			trayicon.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					if (e.getClickCount() == 2) {
						if (frame.getExtendedState() == JFrame.ICONIFIED) {
							frame.setVisible(true);
							frame.setExtendedState(JFrame.NORMAL);
						} else {
							frame.setExtendedState(JFrame.ICONIFIED);
						}
					}
				}
				@Override
				public void mouseEntered(MouseEvent e) {
				}

				@Override
				public void mouseExited(MouseEvent e) {
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {
				}
			});
			try {
				tray.add(trayicon);
			} catch (AWTException e) {
				e.printStackTrace();
			}
		}
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
