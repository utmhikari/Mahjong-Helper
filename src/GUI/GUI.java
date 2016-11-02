/*
 * GUI.java
 */

package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.TrayIcon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import chrriis.dj.nativeswing.NSComponentOptions;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import Baike.MainBaike;
import Functions.LargerComboBoxUI;
import Functions.ResFunctions;
import Guide.MainGuide;
import PaiXiao.Functions;
import Tenhou.KansenTimer;
import Tenhou.MainTenhou;
import Tenhou.MyKansen;
import Tenhou.TenhouKansen;

/**
 *
 * @author HiKari
 */
@SuppressWarnings("serial")
public class GUI extends javax.swing.JFrame {

	/** Creates new form GUI */
	public GUI() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		TenhouGameFrame = new javax.swing.JFrame();
		TenhouGamePanel = new javax.swing.JPanel();
		ConfigFrame = new javax.swing.JFrame();
		ConfigTabbedPane = new javax.swing.JTabbedPane();
		SystemConfigPanel = new javax.swing.JPanel();
		StartupMinimizedLabel = new javax.swing.JLabel();
		StartupMinimizedCheckBox = new javax.swing.JCheckBox();
		SystemConfirmButton = new javax.swing.JButton();
		SystemCancelButton = new javax.swing.JButton();
		StartAtLogonLabel = new javax.swing.JLabel();
		StartAtLogonCheckBox = new javax.swing.JCheckBox();
		TenhouConfigPanel = new javax.swing.JPanel();
		TenhouTimerTextField = new javax.swing.JTextField();
		TenhouConfirmButton = new javax.swing.JButton();
		TenhouTimerLabel = new javax.swing.JLabel();
		TenhouCancelButton = new javax.swing.JButton();
		TenhouGameCloseDialog = new javax.swing.JDialog();
		TenhouGameClosePanel = new javax.swing.JPanel();
		TenhouHideRadioButton = new javax.swing.JRadioButton();
		TenhouCloseRadioButton = new javax.swing.JRadioButton();
		TenhouGameCloseLabel = new javax.swing.JLabel();
		TenhouCloseConfirmButton = new javax.swing.JButton();
		TenhouCloseCancelButton = new javax.swing.JButton();
		TenhouCloseButtonGroup = new javax.swing.ButtonGroup();
		MyKansenCreateDialog = new javax.swing.JDialog();
		MyKansenCreatePanel = new javax.swing.JPanel();
		MyKansenCreateLabel = new javax.swing.JLabel();
		MyKansenCreateTextField = new javax.swing.JTextField();
		MyKansenCreateConfirm = new javax.swing.JButton();
		MyKansenCreateCancel = new javax.swing.JButton();
		TabbedPane = new javax.swing.JTabbedPane();
		BaikePanel = new javax.swing.JPanel();
		GuidePanel = new javax.swing.JPanel();
		GuideShowPanel = new javax.swing.JPanel();
		GuideBrowserPanel = new javax.swing.JPanel();
		GuideNavigatePanel = new javax.swing.JPanel();
		GuideNavigateFirstZhang = new javax.swing.JButton();
		GuideNavigateLastZhang = new javax.swing.JButton();
		GuideNavigatePreviousZhang = new javax.swing.JButton();
		GuideNavigateNextZhang = new javax.swing.JButton();
		GuideNavigatePreviousJie = new javax.swing.JButton();
		GuideNavigateNextJie = new javax.swing.JButton();
		GuideNavigateFirstJie = new javax.swing.JButton();
		GuideNavigateLastJie = new javax.swing.JButton();
		GuideNavigateSeperator = new javax.swing.JSeparator();
		GuideTitleLabel = new javax.swing.JLabel();
		GuideControlPanel = new javax.swing.JPanel();
		GuideLabel = new javax.swing.JLabel();
		GuideComboBox = new javax.swing.JComboBox();
		GuideConfirmButton = new javax.swing.JButton();
		GuideSeparator = new javax.swing.JSeparator();
		GuideChapterLabel = new javax.swing.JLabel();
		GuideZhangComboBox = new javax.swing.JComboBox();
		GuideJieComboBox = new javax.swing.JComboBox();
		GuideEnterButton = new javax.swing.JButton();
		PXPanel = new javax.swing.JPanel();
		PXLabel = new javax.swing.JLabel();
		PXTextField = new javax.swing.JTextField();
		PXConfirm = new javax.swing.JButton();
		PXReset = new javax.swing.JButton();
		PXtempPanel1 = new javax.swing.JPanel();
		PXtempPanel2 = new javax.swing.JPanel();
		PXScrollPane = new javax.swing.JScrollPane();
		PXTextArea = new javax.swing.JTextArea();
		PXSelectPanel = new javax.swing.JPanel();
		PX1m = new javax.swing.JLabel();
		PX2m = new javax.swing.JLabel();
		PX3m = new javax.swing.JLabel();
		PX4m = new javax.swing.JLabel();
		PX5m = new javax.swing.JLabel();
		PX6m = new javax.swing.JLabel();
		PX7m = new javax.swing.JLabel();
		PX8m = new javax.swing.JLabel();
		PX9m = new javax.swing.JLabel();
		PX1p = new javax.swing.JLabel();
		PX2p = new javax.swing.JLabel();
		PX3p = new javax.swing.JLabel();
		PX4p = new javax.swing.JLabel();
		PX5p = new javax.swing.JLabel();
		PX6p = new javax.swing.JLabel();
		PX7p = new javax.swing.JLabel();
		PX8p = new javax.swing.JLabel();
		PX9p = new javax.swing.JLabel();
		PX1s = new javax.swing.JLabel();
		PX2s = new javax.swing.JLabel();
		PX3s = new javax.swing.JLabel();
		PX4s = new javax.swing.JLabel();
		PX5s = new javax.swing.JLabel();
		PX6s = new javax.swing.JLabel();
		PX7s = new javax.swing.JLabel();
		PX8s = new javax.swing.JLabel();
		PX9s = new javax.swing.JLabel();
		PX1z = new javax.swing.JLabel();
		PX2z = new javax.swing.JLabel();
		PX3z = new javax.swing.JLabel();
		PX4z = new javax.swing.JLabel();
		PX5z = new javax.swing.JLabel();
		PX6z = new javax.swing.JLabel();
		PX7z = new javax.swing.JLabel();
		PXtempPanel3 = new javax.swing.JPanel();
		TenhouPanel = new javax.swing.JPanel();
		TenhouKansenPanel = new javax.swing.JPanel();
		TenhouKSScrollPane = new javax.swing.JScrollPane();
		TenhouKSRefresh = new javax.swing.JButton();
		TenhouKSLabel = new javax.swing.JLabel();
		SiFHCheckBox = new javax.swing.JCheckBox();
		SanFHCheckBox = new javax.swing.JCheckBox();
		SiTSCheckBox = new javax.swing.JCheckBox();
		SanTSCheckBox = new javax.swing.JCheckBox();
		DongFeng = new javax.swing.JCheckBox();
		DongNan = new javax.swing.JCheckBox();
		TenhouSubPanel = new javax.swing.JPanel();
		MyKansenLabel = new javax.swing.JLabel();
		MyKansenScrollPane = new javax.swing.JScrollPane();
		MyKansenTable = new javax.swing.JTable();
		MyKansenRefreshButton = new javax.swing.JButton();
		MyKansenCreateButton = new javax.swing.JButton();
		QueZhuang = new javax.swing.JCheckBox();
		TenhouOptionPanel = new javax.swing.JPanel();
		TenhouGSConfirm = new javax.swing.JButton();
		TenhouGSLabel = new javax.swing.JLabel();
		TenhouGSNumber = new javax.swing.JTextField();
		TenhouHSConfirm = new javax.swing.JButton();
		TenhouHSLabel = new javax.swing.JLabel();
		TenhouHSNumber = new javax.swing.JTextField();
		TenhouMain = new javax.swing.JButton();
		TenhouBack = new javax.swing.JButton();
		Menubar = new javax.swing.JMenuBar();
		MenubarFile = new javax.swing.JMenu();
		MenubarFileSettings = new javax.swing.JMenuItem();
		MenubarFileSeparator1 = new javax.swing.JSeparator();
		MenubarFileExit = new javax.swing.JMenuItem();
		MenubarApplication = new javax.swing.JMenu();
		MenubarApplicationTensuu = new javax.swing.JMenuItem();
		MenubarApplicationKouritsu = new javax.swing.JMenuItem();
		MenubarApplicationKansenkun = new javax.swing.JMenuItem();
		MenubarNavigate = new javax.swing.JMenu();
		MenubarNavigateGuide = new javax.swing.JMenu();
		MenubarNavigateGuideBeginner = new javax.swing.JMenuItem();
		MenubarNavigateGuideDaidai = new javax.swing.JMenuItem();
		MenubarNavigateGuideSeventhTG = new javax.swing.JMenuItem();
		MenubarNavigateTenhou = new javax.swing.JMenu();
		MenubarNavigateTenhouSite = new javax.swing.JMenuItem();
		MenubarNavigateTenhouTieba = new javax.swing.JMenuItem();
		MenubarNavigateTenhouKiroku = new javax.swing.JMenuItem();
		MenubarNavigateTenhouRanking = new javax.swing.JMenuItem();
		MenubarNavigateTenhouMonth = new javax.swing.JMenuItem();
		MenubarNavigateOther = new javax.swing.JMenu();
		MenubarNavigateOtherRon2 = new javax.swing.JMenuItem();
		MenubarHelp = new javax.swing.JMenu();
		MenubarHelpBaike = new javax.swing.JMenuItem();
		MenubarHelpGuide = new javax.swing.JMenuItem();
		MenubarHelpPX = new javax.swing.JMenuItem();
		MenubarHelpTenhou = new javax.swing.JMenuItem();
		MenubarHelpSeparator1 = new javax.swing.JSeparator();
		MenubarHelpAbout = new javax.swing.JMenuItem();

		TenhouGameFrame
				.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		TenhouGameFrame.setTitle("\u5929\u51e4\u9ebb\u96c0\u7f51\u9875\u7248");
		TenhouGameFrame.setAlwaysOnTop(true);
		TenhouGameFrame.setBounds(new java.awt.Rectangle(0, 0, 1030, 800));
		TenhouGameFrame.setCursor(new java.awt.Cursor(
				java.awt.Cursor.DEFAULT_CURSOR));
		TenhouGameFrame.setFocusableWindowState(false);
		TenhouGameFrame.setIconImage(new ImageIcon("." + File.separator + "res"
				+ File.separator + "Tenhou" + File.separator + "tenhou.jpg")
				.getImage());
		TenhouGameFrame.setResizable(false);
		TenhouGameFrame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				TenhouGameFrameWindowClosing(evt);
			}
		});

		TenhouGamePanel.setPreferredSize(new java.awt.Dimension(1024, 768));
		TenhouGamePanel.setLayout(new java.awt.BorderLayout());

		javax.swing.GroupLayout TenhouGameFrameLayout = new javax.swing.GroupLayout(
				TenhouGameFrame.getContentPane());
		TenhouGameFrame.getContentPane().setLayout(TenhouGameFrameLayout);
		TenhouGameFrameLayout.setHorizontalGroup(TenhouGameFrameLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(TenhouGamePanel,
						javax.swing.GroupLayout.PREFERRED_SIZE, 1024,
						javax.swing.GroupLayout.PREFERRED_SIZE));
		TenhouGameFrameLayout.setVerticalGroup(TenhouGameFrameLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(TenhouGamePanel,
						javax.swing.GroupLayout.PREFERRED_SIZE, 768,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		ConfigFrame
				.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		ConfigFrame.setTitle("日麻软件设置");
		ConfigFrame.setAlwaysOnTop(true);
		ConfigFrame.setBounds(new java.awt.Rectangle(0, 0, 407, 328));
		ConfigFrame.setEnabled(false);
		ConfigFrame.setIconImage(new ImageIcon("." + File.separator + "res"
				+ File.separator + "GUI" + File.separator + "icon.png")
				.getImage());
		ConfigFrame.setResizable(false);
		ConfigFrame.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				ConfigFrameWindowClosing(evt);
			}
		});

		ConfigTabbedPane.setPreferredSize(new java.awt.Dimension(400, 300));

		SystemConfigPanel.setLayout(new java.awt.GridBagLayout());

		StartupMinimizedLabel
				.setText("\u542f\u52a8\u65e5\u9ebb\u52a9\u624b\u65f6\u6700\u5c0f\u5316");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
		SystemConfigPanel.add(StartupMinimizedLabel, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
		SystemConfigPanel.add(StartupMinimizedCheckBox, gridBagConstraints);

		SystemConfirmButton.setText("\u786e\u8ba4");
		SystemConfirmButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						SystemConfirmButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
		SystemConfigPanel.add(SystemConfirmButton, gridBagConstraints);

		SystemCancelButton.setText("\u53d6\u6d88");
		SystemCancelButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						SystemCancelButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		SystemConfigPanel.add(SystemCancelButton, gridBagConstraints);

		StartAtLogonLabel
				.setText("\u5f00\u673a\u542f\u52a8\u65e5\u9ebb\u52a9\u624b");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 0);
		SystemConfigPanel.add(StartAtLogonLabel, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
		SystemConfigPanel.add(StartAtLogonCheckBox, gridBagConstraints);

		ConfigTabbedPane.addTab("\u7cfb\u7edf\u8bbe\u7f6e", SystemConfigPanel);

		TenhouConfigPanel.setPreferredSize(new java.awt.Dimension(400, 300));
		TenhouConfigPanel.setLayout(new java.awt.GridBagLayout());

		TenhouTimerTextField.setToolTipText("30~600\u79d2");
		TenhouTimerTextField.setPreferredSize(new java.awt.Dimension(40, 23));
		TenhouTimerTextField
				.addCaretListener(new javax.swing.event.CaretListener() {
					public void caretUpdate(javax.swing.event.CaretEvent evt) {
						TenhouTimerTextFieldCaretUpdate(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
		TenhouConfigPanel.add(TenhouTimerTextField, gridBagConstraints);

		TenhouConfirmButton.setLabel("\u786e\u8ba4");
		TenhouConfirmButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						TenhouConfirmButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
		TenhouConfigPanel.add(TenhouConfirmButton, gridBagConstraints);

		TenhouTimerLabel
				.setText("\u89c2\u6218\u5217\u8868\u81ea\u52a8\u5237\u65b0\u65f6\u95f4\uff08\u79d2\uff09");
		TenhouTimerLabel.setMaximumSize(new java.awt.Dimension(160, 17));
		TenhouTimerLabel.setMinimumSize(new java.awt.Dimension(160, 17));
		TenhouTimerLabel.setPreferredSize(new java.awt.Dimension(160, 17));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
		TenhouConfigPanel.add(TenhouTimerLabel, gridBagConstraints);

		TenhouCancelButton.setText("\u53d6\u6d88");
		TenhouCancelButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						TenhouCancelButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		TenhouConfigPanel.add(TenhouCancelButton, gridBagConstraints);

		ConfigTabbedPane.addTab("\u5929\u51e4\u8bbe\u7f6e", TenhouConfigPanel);

		javax.swing.GroupLayout ConfigFrameLayout = new javax.swing.GroupLayout(
				ConfigFrame.getContentPane());
		ConfigFrame.getContentPane().setLayout(ConfigFrameLayout);
		ConfigFrameLayout.setHorizontalGroup(ConfigFrameLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(ConfigTabbedPane,
						javax.swing.GroupLayout.PREFERRED_SIZE, 400,
						javax.swing.GroupLayout.PREFERRED_SIZE));
		ConfigFrameLayout.setVerticalGroup(ConfigFrameLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(ConfigTabbedPane,
						javax.swing.GroupLayout.PREFERRED_SIZE, 300,
						javax.swing.GroupLayout.PREFERRED_SIZE));

		TenhouGameCloseDialog
				.setTitle("\u5929\u51e4\u9ebb\u96c0\u7f51\u9875\u7248");
		TenhouGameCloseDialog.setAlwaysOnTop(true);
		TenhouGameCloseDialog.setBounds(new java.awt.Rectangle(0, 0, 300, 210));
		TenhouGameCloseDialog.setResizable(false);

		TenhouGameClosePanel.setPreferredSize(new java.awt.Dimension(300, 210));
		TenhouGameClosePanel.setLayout(new java.awt.GridBagLayout());

		TenhouCloseButtonGroup.add(TenhouHideRadioButton);
		TenhouHideRadioButton.setSelected(true);
		TenhouHideRadioButton.setText("\u9690\u85cf\u754c\u9762");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		TenhouGameClosePanel.add(TenhouHideRadioButton, gridBagConstraints);

		TenhouCloseButtonGroup.add(TenhouCloseRadioButton);
		TenhouCloseRadioButton.setText("\u5173\u95ed\u7a0b\u5e8f");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
		TenhouGameClosePanel.add(TenhouCloseRadioButton, gridBagConstraints);

		TenhouGameCloseLabel
				.setText("\u60a8\u70b9\u51fb\u4e86\u9000\u51fa\u6309\u94ae\uff0c\u60a8\u7684\u9009\u62e9\u662f\uff1a");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
		TenhouGameClosePanel.add(TenhouGameCloseLabel, gridBagConstraints);

		TenhouCloseConfirmButton.setText("\u786e\u8ba4");
		TenhouCloseConfirmButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						TenhouCloseConfirmButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		TenhouGameClosePanel.add(TenhouCloseConfirmButton, gridBagConstraints);

		TenhouCloseCancelButton.setText("\u53d6\u6d88");
		TenhouCloseCancelButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						TenhouCloseCancelButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
		TenhouGameClosePanel.add(TenhouCloseCancelButton, gridBagConstraints);

		javax.swing.GroupLayout TenhouGameCloseDialogLayout = new javax.swing.GroupLayout(
				TenhouGameCloseDialog.getContentPane());
		TenhouGameCloseDialog.getContentPane().setLayout(
				TenhouGameCloseDialogLayout);
		TenhouGameCloseDialogLayout
				.setHorizontalGroup(TenhouGameCloseDialogLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(TenhouGameClosePanel,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE));
		TenhouGameCloseDialogLayout
				.setVerticalGroup(TenhouGameCloseDialogLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(TenhouGameClosePanel,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE));

		MyKansenCreateDialog
				.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		MyKansenCreateDialog
				.setTitle("\u6211\u7684\u89c2\u6218\u5217\u8868\uff1a\u65b0\u5efa\u73a9\u5bb6");
		MyKansenCreateDialog.setBounds(new java.awt.Rectangle(0, 0, 300, 200));
		MyKansenCreateDialog.setResizable(false);
		MyKansenCreateDialog
				.addWindowListener(new java.awt.event.WindowAdapter() {
					public void windowClosing(java.awt.event.WindowEvent evt) {
						MyKansenCreateDialogWindowClosing(evt);
					}
				});

		MyKansenCreatePanel.setPreferredSize(new java.awt.Dimension(300, 200));
		MyKansenCreatePanel.setLayout(new java.awt.GridBagLayout());

		MyKansenCreateLabel.setText("\u8bf7\u8f93\u5165ID\uff1a");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
		MyKansenCreatePanel.add(MyKansenCreateLabel, gridBagConstraints);

		MyKansenCreateTextField
				.setPreferredSize(new java.awt.Dimension(120, 30));
		MyKansenCreateTextField
				.addCaretListener(new javax.swing.event.CaretListener() {
					public void caretUpdate(javax.swing.event.CaretEvent evt) {
						MyKansenCreateTextFieldCaretUpdate(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
		MyKansenCreatePanel.add(MyKansenCreateTextField, gridBagConstraints);

		MyKansenCreateConfirm.setText("\u786e\u5b9a");
		MyKansenCreateConfirm
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MyKansenCreateConfirmActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
		MyKansenCreatePanel.add(MyKansenCreateConfirm, gridBagConstraints);

		MyKansenCreateCancel.setText("\u53d6\u6d88");
		MyKansenCreateCancel
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MyKansenCreateCancelActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.insets = new java.awt.Insets(30, 20, 0, 0);
		MyKansenCreatePanel.add(MyKansenCreateCancel, gridBagConstraints);

		javax.swing.GroupLayout MyKansenCreateDialogLayout = new javax.swing.GroupLayout(
				MyKansenCreateDialog.getContentPane());
		MyKansenCreateDialog.getContentPane().setLayout(
				MyKansenCreateDialogLayout);
		MyKansenCreateDialogLayout
				.setHorizontalGroup(MyKansenCreateDialogLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(MyKansenCreatePanel,
								javax.swing.GroupLayout.DEFAULT_SIZE, 300,
								Short.MAX_VALUE));
		MyKansenCreateDialogLayout.setVerticalGroup(MyKansenCreateDialogLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(MyKansenCreatePanel,
						javax.swing.GroupLayout.DEFAULT_SIZE, 200,
						Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle("\u65e5\u9ebb\u52a9\u624b@\u4f55\u684c\u96c0\u5e84");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		setFocusCycleRoot(false);
		setIconImage(new ImageIcon("." + File.separator + "res"
				+ File.separator + "GUI" + File.separator + "icon.png")
				.getImage());
		setResizable(false);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent evt) {
				formWindowClosing(evt);
			}

			public void windowIconified(java.awt.event.WindowEvent evt) {
				formWindowIconified(evt);
			}
		});

		TabbedPane.setPreferredSize(new java.awt.Dimension(1024, 768));

		BaikePanel.setPreferredSize(new java.awt.Dimension(1024, 768));
		BaikePanel.setLayout(new java.awt.BorderLayout());
		TabbedPane.addTab("           \u65e5\u9ebb\u767e\u79d1           ",
				BaikePanel);

		GuidePanel.setPreferredSize(new java.awt.Dimension(1024, 768));

		GuideShowPanel
				.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		GuideShowPanel.setPreferredSize(new java.awt.Dimension(745, 737));
		GuideShowPanel.setLayout(new java.awt.GridBagLayout());

		GuideBrowserPanel.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		GuideBrowserPanel.setPreferredSize(new java.awt.Dimension(740, 650));
		GuideBrowserPanel.setLayout(new java.awt.BorderLayout());
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridy = 1;
		GuideShowPanel.add(GuideBrowserPanel, gridBagConstraints);

		GuideNavigatePanel.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		GuideNavigatePanel.setPreferredSize(new java.awt.Dimension(740, 52));
		GuideNavigatePanel.setLayout(new java.awt.GridBagLayout());

		GuideNavigateFirstZhang.setText("\u8fd4\u56de\u7b2c\u4e00\u7ae0");
		GuideNavigateFirstZhang.setEnabled(false);
		GuideNavigateFirstZhang
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigateFirstZhangActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		GuideNavigatePanel.add(GuideNavigateFirstZhang, gridBagConstraints);

		GuideNavigateLastZhang.setText("\u8df3\u81f3\u6700\u540e\u4e00\u7ae0");
		GuideNavigateLastZhang.setEnabled(false);
		GuideNavigateLastZhang
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigateLastZhangActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		GuideNavigatePanel.add(GuideNavigateLastZhang, gridBagConstraints);

		GuideNavigatePreviousZhang.setText("\u4e0a\u4e00\u7ae0");
		GuideNavigatePreviousZhang.setEnabled(false);
		GuideNavigatePreviousZhang
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigatePreviousZhangActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		GuideNavigatePanel.add(GuideNavigatePreviousZhang, gridBagConstraints);

		GuideNavigateNextZhang.setText("\u4e0b\u4e00\u7ae0");
		GuideNavigateNextZhang.setEnabled(false);
		GuideNavigateNextZhang
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigateNextZhangActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
		GuideNavigatePanel.add(GuideNavigateNextZhang, gridBagConstraints);

		GuideNavigatePreviousJie.setText("\u4e0a\u4e00\u8282");
		GuideNavigatePreviousJie.setEnabled(false);
		GuideNavigatePreviousJie
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigatePreviousJieActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 7;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
		GuideNavigatePanel.add(GuideNavigatePreviousJie, gridBagConstraints);

		GuideNavigateNextJie.setText("\u4e0b\u4e00\u8282");
		GuideNavigateNextJie.setEnabled(false);
		GuideNavigateNextJie
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigateNextJieActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 8;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
		GuideNavigatePanel.add(GuideNavigateNextJie, gridBagConstraints);

		GuideNavigateFirstJie.setText("\u8fd4\u56de\u7b2c\u4e00\u8282");
		GuideNavigateFirstJie.setEnabled(false);
		GuideNavigateFirstJie
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigateFirstJieActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
		GuideNavigatePanel.add(GuideNavigateFirstJie, gridBagConstraints);

		GuideNavigateLastJie.setText("\u8df3\u81f3\u6700\u540e\u4e00\u8282");
		GuideNavigateLastJie.setEnabled(false);
		GuideNavigateLastJie
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideNavigateLastJieActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 6;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
		GuideNavigatePanel.add(GuideNavigateLastJie, gridBagConstraints);

		GuideNavigateSeperator
				.setOrientation(javax.swing.SwingConstants.VERTICAL);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		GuideNavigatePanel.add(GuideNavigateSeperator, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		GuideShowPanel.add(GuideNavigatePanel, gridBagConstraints);

		GuideTitleLabel.setFont(new java.awt.Font("宋体", 1, 18));
		GuideShowPanel.add(GuideTitleLabel, new java.awt.GridBagConstraints());

		GuideControlPanel.setPreferredSize(new java.awt.Dimension(270, 723));
		GuideControlPanel.setLayout(new java.awt.GridBagLayout());

		GuideLabel.setText("\u8bf7\u9009\u62e9\u6559\u7a0b\uff1a");
		GuideLabel.setMaximumSize(new java.awt.Dimension(72, 25));
		GuideLabel.setMinimumSize(new java.awt.Dimension(72, 25));
		GuideLabel.setPreferredSize(new java.awt.Dimension(72, 25));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 50);
		GuideControlPanel.add(GuideLabel, gridBagConstraints);

		GuideComboBox.setMaximumSize(new java.awt.Dimension(999, 999));
		GuideComboBox.setPreferredSize(new java.awt.Dimension(200, 25));
		GuideComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GuideComboBoxActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		GuideControlPanel.add(GuideComboBox, gridBagConstraints);

		GuideConfirmButton.setText("\u786e\u5b9a");
		GuideConfirmButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideConfirmButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		GuideControlPanel.add(GuideConfirmButton, gridBagConstraints);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
		GuideControlPanel.add(GuideSeparator, gridBagConstraints);

		GuideChapterLabel.setText("\u8bf7\u9009\u62e9\u7ae0\u8282\uff1a");
		GuideChapterLabel.setMaximumSize(new java.awt.Dimension(72, 28));
		GuideChapterLabel.setMinimumSize(new java.awt.Dimension(72, 28));
		GuideChapterLabel.setPreferredSize(new java.awt.Dimension(72, 28));
		GuideChapterLabel.setRequestFocusEnabled(false);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 50);
		GuideControlPanel.add(GuideChapterLabel, gridBagConstraints);

		GuideZhangComboBox.setMinimumSize(new java.awt.Dimension(27, 28));
		GuideZhangComboBox.setPreferredSize(new java.awt.Dimension(200, 28));
		GuideZhangComboBox
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						GuideZhangComboBoxActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		GuideControlPanel.add(GuideZhangComboBox, gridBagConstraints);

		GuideJieComboBox.setPreferredSize(new java.awt.Dimension(200, 25));
		GuideJieComboBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GuideJieComboBoxActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 5);
		GuideControlPanel.add(GuideJieComboBox, gridBagConstraints);

		GuideEnterButton.setText("\u8fdb\u5165");
		GuideEnterButton.setEnabled(false);
		GuideEnterButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				GuideEnterButtonActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
		GuideControlPanel.add(GuideEnterButton, gridBagConstraints);

		javax.swing.GroupLayout GuidePanelLayout = new javax.swing.GroupLayout(
				GuidePanel);
		GuidePanel.setLayout(GuidePanelLayout);
		GuidePanelLayout
				.setHorizontalGroup(GuidePanelLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								GuidePanelLayout
										.createSequentialGroup()
										.addComponent(
												GuideShowPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												GuideControlPanel,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												270,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		GuidePanelLayout.setVerticalGroup(GuidePanelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(GuideShowPanel,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						GuidePanelLayout
								.createSequentialGroup()
								.addGap(14, 14, 14)
								.addComponent(GuideControlPanel,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)));

		TabbedPane.addTab("           \u65e5\u9ebb\u6559\u7a0b           ",
				GuidePanel);

		PXPanel.setMinimumSize(new java.awt.Dimension(0, 0));
		PXPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
		PXPanel.setLayout(new java.awt.GridBagLayout());

		PXLabel.setText("\u8bf7\u8f93\u5165\u9ebb\u5c06\uff0814\u5f20\uff09");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		PXPanel.add(PXLabel, gridBagConstraints);

		PXTextField
				.setToolTipText("<html>输入方式：1~9m，1~9p，1~9s，1~7z（小写字母）<br>共输入14张麻将牌<br>其中m对应万，p对应饼、筒，s对应索、条<br>1~7z分别对应东南西北白发中<br>");
		PXTextField.setPreferredSize(new java.awt.Dimension(6, 30));
		PXTextField.addCaretListener(new javax.swing.event.CaretListener() {
			public void caretUpdate(javax.swing.event.CaretEvent evt) {
				PXTextFieldCaretUpdate(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 24;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		PXPanel.add(PXTextField, gridBagConstraints);

		PXConfirm.setText("\u786e\u8ba4");
		PXConfirm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PXConfirmActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		PXPanel.add(PXConfirm, gridBagConstraints);

		PXReset.setText("\u91cd\u7f6e");
		PXReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PXResetActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 13;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
		PXPanel.add(PXReset, gridBagConstraints);

		PXtempPanel1.setPreferredSize(new java.awt.Dimension(200, 50));

		javax.swing.GroupLayout PXtempPanel1Layout = new javax.swing.GroupLayout(
				PXtempPanel1);
		PXtempPanel1.setLayout(PXtempPanel1Layout);
		PXtempPanel1Layout.setHorizontalGroup(PXtempPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 200, Short.MAX_VALUE));
		PXtempPanel1Layout.setVerticalGroup(PXtempPanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE));

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		PXPanel.add(PXtempPanel1, gridBagConstraints);

		PXtempPanel2.setPreferredSize(new java.awt.Dimension(100, 50));

		javax.swing.GroupLayout PXtempPanel2Layout = new javax.swing.GroupLayout(
				PXtempPanel2);
		PXtempPanel2.setLayout(PXtempPanel2Layout);
		PXtempPanel2Layout.setHorizontalGroup(PXtempPanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		PXtempPanel2Layout.setVerticalGroup(PXtempPanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE));

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 6;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 7;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		PXPanel.add(PXtempPanel2, gridBagConstraints);

		PXScrollPane.setFocusable(false);
		PXScrollPane.setPreferredSize(new java.awt.Dimension(600, 104));

		PXTextArea.setColumns(20);
		PXTextArea.setEditable(false);
		PXTextArea.setFont(new java.awt.Font("Monospaced", 0, 14));
		PXTextArea.setRows(5);
		PXTextArea.setFocusable(false);
		PXScrollPane.setViewportView(PXTextArea);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 25;
		gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		PXPanel.add(PXScrollPane, gridBagConstraints);

		PXSelectPanel.setPreferredSize(new java.awt.Dimension(300, 600));
		PXSelectPanel.setLayout(new java.awt.GridBagLayout());

		PX1m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "1m.gif"));
		PX1m.setText("1m");
		PX1m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX1mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX1m, gridBagConstraints);

		PX2m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "2m.gif"));
		PX2m.setText("2m");
		PX2m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX2mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX2m, gridBagConstraints);

		PX3m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "3m.gif"));
		PX3m.setText("3m");
		PX3m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX3mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX3m, gridBagConstraints);

		PX4m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "4m.gif"));
		PX4m.setText("4m");
		PX4m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX4mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX4m, gridBagConstraints);

		PX5m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "5m.gif"));
		PX5m.setText("5m");
		PX5m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX5mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX5m, gridBagConstraints);

		PX6m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "6m.gif"));
		PX6m.setText("6m");
		PX6m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX6mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX6m, gridBagConstraints);

		PX7m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "7m.gif"));
		PX7m.setText("7m");
		PX7m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX7mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX7m, gridBagConstraints);

		PX8m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "8m.gif"));
		PX8m.setText("8m");
		PX8m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX8mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 14;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX8m, gridBagConstraints);

		PX9m.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "9m.gif"));
		PX9m.setText("9m");
		PX9m.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX9mMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 16;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 40, 20, 0);
		PXSelectPanel.add(PX9m, gridBagConstraints);

		PX1p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "1p.gif"));
		PX1p.setText("1p");
		PX1p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX1pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX1p, gridBagConstraints);

		PX2p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "2p.gif"));
		PX2p.setText("2p");
		PX2p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX2pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX2p, gridBagConstraints);

		PX3p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "3p.gif"));
		PX3p.setText("3p");
		PX3p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX3pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX3p, gridBagConstraints);

		PX4p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "4p.gif"));
		PX4p.setText("4p");
		PX4p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX4pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX4p, gridBagConstraints);

		PX5p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "5p.gif"));
		PX5p.setText("5p");
		PX5p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX5pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX5p, gridBagConstraints);

		PX6p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "6p.gif"));
		PX6p.setText("6p");
		PX6p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX6pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX6p, gridBagConstraints);

		PX7p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "7p.gif"));
		PX7p.setText("7p");
		PX7p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX7pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX7p, gridBagConstraints);

		PX8p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "8p.gif"));
		PX8p.setText("8p");
		PX8p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX8pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 14;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX8p, gridBagConstraints);

		PX9p.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "9p.gif"));
		PX9p.setText("9p");
		PX9p.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX9pMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 16;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX9p, gridBagConstraints);

		PX1s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "1s.gif"));
		PX1s.setText("1s");
		PX1s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX1sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX1s, gridBagConstraints);

		PX2s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "2s.gif"));
		PX2s.setText("2s");
		PX2s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX2sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX2s, gridBagConstraints);

		PX3s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "3s.gif"));
		PX3s.setText("3s");
		PX3s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX3sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX3s, gridBagConstraints);

		PX4s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "4s.gif"));
		PX4s.setText("4s");
		PX4s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX4sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX4s, gridBagConstraints);

		PX5s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "5s.gif"));
		PX5s.setText("5s");
		PX5s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX5sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX5s, gridBagConstraints);

		PX6s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "6s.gif"));
		PX6s.setText("6s");
		PX6s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX6sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX6s, gridBagConstraints);

		PX7s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "7s.gif"));
		PX7s.setText("7s");
		PX7s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX7sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX7s, gridBagConstraints);

		PX8s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "8s.gif"));
		PX8s.setText("8s");
		PX8s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX8sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 14;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX8s, gridBagConstraints);

		PX9s.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "9s.gif"));
		PX9s.setText("9s");
		PX9s.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX9sMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 16;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX9s, gridBagConstraints);

		PX1z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "1z.gif"));
		PX1z.setText("1z");
		PX1z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX1zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX1z, gridBagConstraints);

		PX2z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "2z.gif"));
		PX2z.setText("2z");
		PX2z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX2zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX2z, gridBagConstraints);

		PX3z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "3z.gif"));
		PX3z.setText("3z");
		PX3z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX3zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX3z, gridBagConstraints);

		PX4z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "4z.gif"));
		PX4z.setText("4z");
		PX4z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX4zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 6;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX4z, gridBagConstraints);

		PX5z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "5z.gif"));
		PX5z.setText("5z");
		PX5z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX5zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 8;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX5z, gridBagConstraints);

		PX6z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "6z.gif"));
		PX6z.setText("6z");
		PX6z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX6zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 10;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX6z, gridBagConstraints);

		PX7z.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "PaiXiao" + File.separator + "7z.gif"));
		PX7z.setText("7z");
		PX7z.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				PX7zMouseClicked(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 12;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.insets = new java.awt.Insets(0, 20, 20, 0);
		PXSelectPanel.add(PX7z, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 25;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		PXPanel.add(PXSelectPanel, gridBagConstraints);

		PXtempPanel3.setPreferredSize(new java.awt.Dimension(100, 50));

		javax.swing.GroupLayout PXtempPanel3Layout = new javax.swing.GroupLayout(
				PXtempPanel3);
		PXtempPanel3.setLayout(PXtempPanel3Layout);
		PXtempPanel3Layout.setHorizontalGroup(PXtempPanel3Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 186, Short.MAX_VALUE));
		PXtempPanel3Layout.setVerticalGroup(PXtempPanel3Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 50, Short.MAX_VALUE));

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 14;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 11;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		PXPanel.add(PXtempPanel3, gridBagConstraints);

		TabbedPane.addTab("             \u724c\u6548             ", PXPanel);

		TenhouPanel.setPreferredSize(new java.awt.Dimension(1024, 768));
		TenhouPanel.setLayout(new java.awt.GridBagLayout());

		TenhouKansenPanel.setBorder(javax.swing.BorderFactory
				.createEtchedBorder());
		TenhouKansenPanel.setPreferredSize(new java.awt.Dimension(1019, 686));
		TenhouKansenPanel.setLayout(new java.awt.GridBagLayout());

		TenhouKSScrollPane.setPreferredSize(new java.awt.Dimension(452, 600));

		TenhouKSTable.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		TenhouKSTable.setModel(TenhouKansen.getKSModel());
		TenhouKSTable.setCellSelectionEnabled(true);
		TenhouKSTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				TenhouKSTableMouseClicked(evt);
			}
		});
		TenhouKSScrollPane.setViewportView(TenhouKSTable);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridheight = 3;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
		TenhouKansenPanel.add(TenhouKSScrollPane, gridBagConstraints);

		TenhouKSRefresh.setText("\u5237\u65b0");
		TenhouKSRefresh.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TenhouKSRefreshActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 100);
		TenhouKansenPanel.add(TenhouKSRefresh, gridBagConstraints);

		TenhouKSLabel.setFont(new java.awt.Font("微软雅黑", 0, 14));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 0;
		TenhouKansenPanel.add(TenhouKSLabel, gridBagConstraints);

		SiFHCheckBox.setSelected(true);
		SiFHCheckBox.setText("\u56db\u51e4");
		SiFHCheckBox.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				SiFHCheckBoxItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
		TenhouKansenPanel.add(SiFHCheckBox, gridBagConstraints);

		SanFHCheckBox.setSelected(true);
		SanFHCheckBox.setText("\u4e09\u51e4");
		SanFHCheckBox.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				SanFHCheckBoxItemStateChanged(evt);
			}
		});
		TenhouKansenPanel.add(SanFHCheckBox, new java.awt.GridBagConstraints());

		SiTSCheckBox.setSelected(true);
		SiTSCheckBox.setText("\u56db\u7279");
		SiTSCheckBox.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				SiTSCheckBoxItemStateChanged(evt);
			}
		});
		TenhouKansenPanel.add(SiTSCheckBox, new java.awt.GridBagConstraints());

		SanTSCheckBox.setSelected(true);
		SanTSCheckBox.setText("\u4e09\u7279");
		SanTSCheckBox.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				SanTSCheckBoxItemStateChanged(evt);
			}
		});
		TenhouKansenPanel.add(SanTSCheckBox, new java.awt.GridBagConstraints());

		DongFeng.setSelected(true);
		DongFeng.setText("\u4e1c\u98ce\u6218");
		DongFeng.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				DongFengItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
		TenhouKansenPanel.add(DongFeng, gridBagConstraints);

		DongNan.setSelected(true);
		DongNan.setText("\u534a\u5e84\u6218");
		DongNan.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				DongNanItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
		TenhouKansenPanel.add(DongNan, gridBagConstraints);

		TenhouSubPanel
				.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		TenhouSubPanel.setPreferredSize(new java.awt.Dimension(300, 500));
		TenhouSubPanel.setLayout(new java.awt.GridBagLayout());

		MyKansenLabel.setFont(new java.awt.Font("微软雅黑", 0, 14));
		MyKansenLabel.setText("\u6211\u7684\u89c2\u6218\u5217\u8868");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 3;
		TenhouSubPanel.add(MyKansenLabel, gridBagConstraints);

		MyKansenScrollPane.setPreferredSize(new java.awt.Dimension(250, 400));

		MyKansenTable.setBorder(javax.swing.BorderFactory
				.createLineBorder(new java.awt.Color(0, 0, 0)));
		MyKansenTable.setModel(MyKansen.getMyKSModel());
		MyKansenTable.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				MyKansenTableMouseClicked(evt);
			}
		});
		MyKansenScrollPane.setViewportView(MyKansenTable);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.gridwidth = 3;
		gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
		TenhouSubPanel.add(MyKansenScrollPane, gridBagConstraints);

		MyKansenRefreshButton
				.setText("\u5237\u65b0\u6211\u7684\u89c2\u6218\u5217\u8868");
		MyKansenRefreshButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MyKansenRefreshButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
		TenhouSubPanel.add(MyKansenRefreshButton, gridBagConstraints);

		MyKansenCreateButton.setText("\u65b0\u5efa");
		MyKansenCreateButton
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MyKansenCreateButtonActionPerformed(evt);
					}
				});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.insets = new java.awt.Insets(20, 15, 0, 0);
		TenhouSubPanel.add(MyKansenCreateButton, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.gridwidth = 5;
		gridBagConstraints.gridheight = 3;
		TenhouKansenPanel.add(TenhouSubPanel, gridBagConstraints);

		QueZhuang.setSelected(true);
		QueZhuang.setText("\u96c0\u5e84\u6218");
		QueZhuang.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				QueZhuangItemStateChanged(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 100);
		TenhouKansenPanel.add(QueZhuang, gridBagConstraints);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		TenhouPanel.add(TenhouKansenPanel, gridBagConstraints);

		TenhouOptionPanel.setPreferredSize(new java.awt.Dimension(1000, 50));
		TenhouOptionPanel.setLayout(new java.awt.GridBagLayout());

		TenhouGSConfirm.setText("\u8fdb\u5165\u4e2a\u5ba4");
		TenhouGSConfirm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TenhouGSConfirmActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
		TenhouOptionPanel.add(TenhouGSConfirm, gridBagConstraints);

		TenhouGSLabel.setText("\u4e2a\u5ba4\u53f7");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		TenhouOptionPanel.add(TenhouGSLabel, gridBagConstraints);

		TenhouGSNumber.setToolTipText("\u4e2a\u5ba4\uff1a1000~9999");
		TenhouGSNumber.setPreferredSize(new java.awt.Dimension(60, 30));
		TenhouGSNumber.addCaretListener(new javax.swing.event.CaretListener() {
			public void caretUpdate(javax.swing.event.CaretEvent evt) {
				TenhouGSNumberCaretUpdate(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
		TenhouOptionPanel.add(TenhouGSNumber, gridBagConstraints);

		TenhouHSConfirm.setText("\u8fdb\u5165\u5927\u4f1a\u5ba4");
		TenhouHSConfirm.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TenhouHSConfirmActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 6;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 100);
		TenhouOptionPanel.add(TenhouHSConfirm, gridBagConstraints);

		TenhouHSLabel.setText("\u5927\u4f1a\u5ba4\u53f7");
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
		TenhouOptionPanel.add(TenhouHSLabel, gridBagConstraints);

		TenhouHSNumber
				.setToolTipText("\u5927\u4f1a\u5ba4\uff1a00000001~99999999");
		TenhouHSNumber.setPreferredSize(new java.awt.Dimension(100, 30));
		TenhouHSNumber.addCaretListener(new javax.swing.event.CaretListener() {
			public void caretUpdate(javax.swing.event.CaretEvent evt) {
				TenhouHSNumberCaretUpdate(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 5;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
		TenhouOptionPanel.add(TenhouHSNumber, gridBagConstraints);

		TenhouMain.setText("\u8fdb\u5165\u5927\u5385");
		TenhouMain.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TenhouMainActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
		TenhouOptionPanel.add(TenhouMain, gridBagConstraints);

		TenhouBack.setText("\u56de\u5230\u5929\u51e4");
		TenhouBack.setEnabled(false);
		TenhouBack.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				TenhouBackActionPerformed(evt);
			}
		});
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 7;
		gridBagConstraints.gridy = 0;
		TenhouOptionPanel.add(TenhouBack, gridBagConstraints);

		TenhouPanel.add(TenhouOptionPanel, new java.awt.GridBagConstraints());

		TabbedPane.addTab("           \u5929\u51e4\u9ebb\u96c0           ",
				TenhouPanel);

		MenubarFile.setText("  \u6587\u4ef6  ");
		MenubarFile.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

		MenubarFileSettings.setText("\u8bbe\u7f6e");
		MenubarFileSettings
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarFileSettingsActionPerformed(evt);
					}
				});
		MenubarFile.add(MenubarFileSettings);
		MenubarFile.add(MenubarFileSeparator1);

		MenubarFileExit.setText("\u9000\u51fa");
		MenubarFileExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MenubarFileExitActionPerformed(evt);
			}
		});
		MenubarFile.add(MenubarFileExit);

		Menubar.add(MenubarFile);

		MenubarApplication.setText("\u65e5\u9ebb\u5e94\u7528");

		MenubarApplicationTensuu.setIcon(new ImageIcon(
				"./res/Application/Tensuu/Tensuu.jpg"));
		MenubarApplicationTensuu.setText("\u70b9\u6570\u8ba1\u7b97");
		MenubarApplicationTensuu
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarApplicationTensuuActionPerformed(evt);
					}
				});
		MenubarApplication.add(MenubarApplicationTensuu);

		MenubarApplicationKouritsu.setIcon(new ImageIcon(
				"./res/Application/Kouritsu/Kouritsu.jpg"));
		MenubarApplicationKouritsu.setText("\u724c\u6548\u7ec3\u4e60");
		MenubarApplicationKouritsu
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarApplicationKouritsuActionPerformed(evt);
					}
				});
		MenubarApplication.add(MenubarApplicationKouritsu);

		MenubarApplicationKansenkun.setIcon(new ImageIcon(
				"./res/Application/Kansenkun/Kansenkun.jpg"));
		MenubarApplicationKansenkun.setText("\u89c2\u6218\u541b");
		MenubarApplicationKansenkun
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarApplicationKansenkunActionPerformed(evt);
					}
				});
		MenubarApplication.add(MenubarApplicationKansenkun);

		Menubar.add(MenubarApplication);

		MenubarNavigate.setText("\u5b9e\u7528\u94fe\u63a5");

		MenubarNavigateGuide.setText("\u65e5\u9ebb\u6559\u5b66");

		MenubarNavigateGuideBeginner.setText("Beginner's Luck");
		MenubarNavigateGuideBeginner
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateGuideBeginnerActionPerformed(evt);
					}
				});
		MenubarNavigateGuide.add(MenubarNavigateGuideBeginner);

		MenubarNavigateGuideDaidai.setIcon(new ImageIcon(
				"./res/GUI/Links/Guide/daidai.jpg"));
		MenubarNavigateGuideDaidai.setText("\u5446\u5446\u535a\u5ba2");
		MenubarNavigateGuideDaidai
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateGuideDaidaiActionPerformed(evt);
					}
				});
		MenubarNavigateGuide.add(MenubarNavigateGuideDaidai);

		MenubarNavigateGuideSeventhTG.setIcon(new ImageIcon(
				"./res/GUI/Links/Guide/seventhtg.jpg"));
		MenubarNavigateGuideSeventhTG.setText("SeventhTG\u535a\u5ba2");
		MenubarNavigateGuideSeventhTG
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateGuideSeventhTGActionPerformed(evt);
					}
				});
		MenubarNavigateGuide.add(MenubarNavigateGuideSeventhTG);

		MenubarNavigate.add(MenubarNavigateGuide);

		MenubarNavigateTenhou.setText("\u5929\u51e4\u9ebb\u96c0");

		MenubarNavigateTenhouSite.setIcon(new ImageIcon(
				"./res/GUI/Links/Tenhou/tenhou.jpg"));
		MenubarNavigateTenhouSite.setText("\u5929\u51e4\u4e3b\u9875");
		MenubarNavigateTenhouSite
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateTenhouSiteActionPerformed(evt);
					}
				});
		MenubarNavigateTenhou.add(MenubarNavigateTenhouSite);

		MenubarNavigateTenhouTieba.setIcon(new ImageIcon(
				"./res/GUI/Links/Tenhou/tieba.jpg"));
		MenubarNavigateTenhouTieba.setText("\u5929\u51e4\u9ebb\u96c0\u5427");
		MenubarNavigateTenhouTieba
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateTenhouTiebaActionPerformed(evt);
					}
				});
		MenubarNavigateTenhou.add(MenubarNavigateTenhouTieba);

		MenubarNavigateTenhouKiroku.setText("\u5929\u9cf3\u8a18\u9332");
		MenubarNavigateTenhouKiroku
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateTenhouKirokuActionPerformed(evt);
					}
				});
		MenubarNavigateTenhou.add(MenubarNavigateTenhouKiroku);

		MenubarNavigateTenhouRanking.setText("\u7537\u51a5\u5229");
		MenubarNavigateTenhouRanking
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateTenhouRankingActionPerformed(evt);
					}
				});
		MenubarNavigateTenhou.add(MenubarNavigateTenhouRanking);

		MenubarNavigateTenhouMonth.setText("\u6708\u9593Rank");
		MenubarNavigateTenhouMonth
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateTenhouMonthActionPerformed(evt);
					}
				});
		MenubarNavigateTenhou.add(MenubarNavigateTenhouMonth);

		MenubarNavigate.add(MenubarNavigateTenhou);

		MenubarNavigateOther.setText("\u5176\u5b83");

		MenubarNavigateOtherRon2.setIcon(new ImageIcon(
				"./res/GUI/Links/Other/ron2.jpg"));
		MenubarNavigateOtherRon2.setText("\u30ed\u30f3\uff12");
		MenubarNavigateOtherRon2
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarNavigateOtherRon2ActionPerformed(evt);
					}
				});
		MenubarNavigateOther.add(MenubarNavigateOtherRon2);

		MenubarNavigate.add(MenubarNavigateOther);

		Menubar.add(MenubarNavigate);

		MenubarHelp.setText("  \u5e2e\u52a9  ");

		MenubarHelpBaike.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "GUI" + File.separator + "baikeicon.jpg"));
		MenubarHelpBaike.setText("\u65e5\u9ebb\u767e\u79d1");
		MenubarHelpBaike.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MenubarHelpBaikeActionPerformed(evt);
			}
		});
		MenubarHelp.add(MenubarHelpBaike);

		MenubarHelpGuide.setText("\u65e5\u9ebb\u6559\u7a0b");
		MenubarHelpGuide.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MenubarHelpGuideActionPerformed(evt);
			}
		});
		MenubarHelp.add(MenubarHelpGuide);

		MenubarHelpPX.setText("\u724c\u6548");
		MenubarHelpPX.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MenubarHelpPXActionPerformed(evt);
			}
		});
		MenubarHelp.add(MenubarHelpPX);

		MenubarHelpTenhou.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "GUI" + File.separator + "tenhouicon.jpg"));
		MenubarHelpTenhou.setText("\u5929\u51e4\u9ebb\u96c0");
		MenubarHelpTenhou
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						MenubarHelpTenhouActionPerformed(evt);
					}
				});
		MenubarHelp.add(MenubarHelpTenhou);
		MenubarHelp.add(MenubarHelpSeparator1);

		MenubarHelpAbout.setIcon(new ImageIcon("." + File.separator + "res"
				+ File.separator + "GUI" + File.separator + "abouticon.png"));
		MenubarHelpAbout.setText("\u65e5\u9ebb\u8f6f\u4ef6\u8bf4\u660e");
		MenubarHelpAbout.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				MenubarHelpAboutActionPerformed(evt);
			}
		});
		MenubarHelp.add(MenubarHelpAbout);

		Menubar.add(MenubarHelp);

		setJMenuBar(Menubar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1024,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 768,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		TabbedPane.getAccessibleContext().setAccessibleName("\u724c\u6548");
		start();
		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * 初始化代码
	 */

	//各种全局变量
	public final static JWebBrowser GuideBrowser = new JWebBrowser();

	//I say! Hey! Hey! Hey Start Dash!
	public void start() {
		//同线程――――托盘图标
		GUITray.Initial(this);

		//新线程————读取系统设置
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//StartupMinimized（这个要先）
					if (Config.StartupMinimized) {
						setExtendedState(JFrame.ICONIFIED);
					} else {
						setExtendedState(JFrame.NORMAL);
					}
					//StartAtLogon
					Runtime.getRuntime()
							.exec("reg "
									+ (Config.StartAtLogon ? "add " : "delete ")
									+ "HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run"
									+ " /v "
									+ "日麻助手@何桌雀庄"
									+ (Config.StartAtLogon ? " /t reg_sz /d "
											+ ResFunctions
													.getResPath("/mj.jar")
											: " /f"));
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "应用系统设置失败！", "错误",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		//同线程————设置窗体显示
		TenhouGameFrame.setLocationRelativeTo(null);
		ConfigFrame.setLocationRelativeTo(this);
		TenhouGameCloseDialog.setLocationRelativeTo(TenhouGameFrame);

		//新线程――――日麻百科		
		new SwingWorker<Integer, Void>() {
			protected Integer doInBackground() {
				MainBaike.Initial();
				return 1;
			}

			protected void done() {
				try {
					final JWebBrowser BaikeBrowser = new JWebBrowser();
					BaikeBrowser.setBarsVisible(false);
					BaikeBrowser.setJavascriptEnabled(true);
					BaikeBrowser.setFocusable(false);
					BaikePanel.add(BaikeBrowser, BorderLayout.CENTER);
					String BaikeRes = ResFunctions
							.getResPath("/res/Baike/MJ.html");
					BaikeBrowser.navigate(BaikeRes);
				} catch (Exception e) {
					if (MainBaike.baikeflag) {
						JOptionPane.showMessageDialog(null, "读取日麻百科文件失败！",
								"错误", JOptionPane.ERROR_MESSAGE);
					}
				}
				MainBaike.baikeflag = true;
			}
		}.execute();

		//新线程————日麻教程
		new SwingWorker<Integer, Void>() {
			protected Integer doInBackground() {
				GuideBrowser.setBarsVisible(false);
				GuideBrowser.setJavascriptEnabled(true);
				GuideBrowser.setFocusable(false);
				return 1;
			}

			@SuppressWarnings("unchecked")
			protected void done() {
				//初始化选择界面				
				GuideBrowserPanel.add(GuideBrowser, BorderLayout.CENTER);
				GuideComboBox.setUI(new LargerComboBoxUI());
				GuideZhangComboBox.setUI(new LargerComboBoxUI());
				GuideJieComboBox.setUI(new LargerComboBoxUI());
				for (String s : MainGuide.getGuideList()) {
					GuideComboBox.addItem(makeObj(s));
				}
				GuideIndex = GuideComboBox.getSelectedIndex();
				//初始化显示界面
			}
		}.execute();

		//新线程――――天凤麻雀
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				//刷新我的观战列表
				MyKansen.Initial(MyKansenTable);
				MyKansenRefreshButton.doClick();
				//初始化其它组件
				MainTenhou.Initial(TenhouGamePanel);
				KansenTimer.KT.start();
				TenhouKansen.Setup(TenhouKSTable);
				getKSRefresh().doClick();
			}
		});

		//新线程————其它操作（如变光标等）
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				Cursor hc = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
				PX1m.setCursor(hc);
				PX2m.setCursor(hc);
				PX3m.setCursor(hc);
				PX4m.setCursor(hc);
				PX5m.setCursor(hc);
				PX6m.setCursor(hc);
				PX7m.setCursor(hc);
				PX8m.setCursor(hc);
				PX9m.setCursor(hc);
				PX1p.setCursor(hc);
				PX2p.setCursor(hc);
				PX3p.setCursor(hc);
				PX4p.setCursor(hc);
				PX5p.setCursor(hc);
				PX6p.setCursor(hc);
				PX7p.setCursor(hc);
				PX8p.setCursor(hc);
				PX9p.setCursor(hc);
				PX1s.setCursor(hc);
				PX2s.setCursor(hc);
				PX3s.setCursor(hc);
				PX4s.setCursor(hc);
				PX5s.setCursor(hc);
				PX6s.setCursor(hc);
				PX7s.setCursor(hc);
				PX8s.setCursor(hc);
				PX9s.setCursor(hc);
				PX1z.setCursor(hc);
				PX2z.setCursor(hc);
				PX3z.setCursor(hc);
				PX4z.setCursor(hc);
				PX5z.setCursor(hc);
				PX6z.setCursor(hc);
				PX7z.setCursor(hc);
			}
		});

		//叫java清理内存
		System.gc();
	}

	/**
	 * 菜单栏、主窗口
	 */

	private void formWindowClosing(java.awt.event.WindowEvent evt) {
		TenhouKansen.wc.close();
		System.exit(0);
	}

	private void MenubarFileSettingsActionPerformed(
			java.awt.event.ActionEvent evt) {
		ConfigFrame.setEnabled(true);
		ConfigFrame.setLocationRelativeTo(this);
		Config.FrameReset();
		ConfigFrame.setVisible(true);
	}

	private void formWindowIconified(java.awt.event.WindowEvent evt) {
		setVisible(false);
		GUITray.getTrayIcon().displayMessage("日麻软件@何桌雀庄",
				Messages.TrayMinimize, TrayIcon.MessageType.INFO);
	}

	//帮助
	private void MenubarHelpGuideActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, Messages.HelpGuide, "日麻教程",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void MenubarHelpTenhouActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, Messages.HelpTenhou, "天凤麻雀",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void MenubarHelpBaikeActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, Messages.HelpBaike, "日麻百科",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void MenubarHelpPXActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, Messages.HelpPX, "牌效",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void MenubarHelpAboutActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, Messages.HelpAbout, "软件说明",
				JOptionPane.INFORMATION_MESSAGE);
	}

	private void MenubarFileExitActionPerformed(java.awt.event.ActionEvent evt) {
		TenhouKansen.wc.close();
		System.exit(0);
	}

	public JTabbedPane getTabbedPane() {
		return TabbedPane;
	}

	//日麻应用
	private void MenubarApplicationTensuuActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop()
					.open(new File(
							ResFunctions
									.getResPath("/res/Application/Tensuu/MaruJanCalcDrill_Free.exe")));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开应用失败！", "日麻应用",
					JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}

	private void MenubarApplicationKouritsuActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop()
					.open(new File(
							ResFunctions
									.getResPath("/res/Application/Kouritsu/MaruJanJyuku3_Free.exe")));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开应用失败！", "日麻应用",
					JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}

	private void MenubarApplicationKansenkunActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Desktop.getDesktop()
					.open(new File(
							ResFunctions
									.getResPath("/res/Application/Kansenkun/Kansenkun.exe")));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开应用失败！", "日麻应用",
					JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	}

	//实用链接
	private void MenubarNavigateGuideBeginnerActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://beginners.biz/");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateGuideDaidaiActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://blog.sina.com.cn/u/1913868500");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateGuideSeventhTGActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://blog.sina.com.cn/seventh9");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateTenhouSiteActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime().exec(
					"rundll32 url.dll,FileProtocolHandler http://tenhou.net");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateTenhouTiebaActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://tieba.baidu.com/天凤麻雀");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateTenhouKirokuActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://arcturus.su/tenhou/ranking/");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateTenhouRankingActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://otokomyouri.com/TopPage.aspx");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateTenhouMonthActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://www30.atpages.jp/mojan/shukei_all.html");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void MenubarNavigateOtherRon2ActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			Runtime.getRuntime()
					.exec("rundll32 url.dll,FileProtocolHandler http://www.ron2.jp/index.html");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "打开网页失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * 设置界面
	 * 马丹应该放到另一个class里面的
	 */
	public static JTextField getTenhouTimerTextField() {
		return TenhouTimerTextField;
	}

	public static JFrame getConfigFrame() {
		return ConfigFrame;
	}

	private void ConfigFrameWindowClosing(java.awt.event.WindowEvent evt) {
		ConfigFrame.setVisible(false);
		ConfigFrame.setEnabled(false);
	}

	//System
	public static JCheckBox getStartAtLogonCheckBox() {
		return StartAtLogonCheckBox;
	}

	public static JCheckBox getStartupMinimizedCheckBox() {
		return StartupMinimizedCheckBox;
	}

	private void SystemConfirmButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		try {
			String CF = ResFunctions.getResPath("/Config.ini");
			InputStreamReader isr = new InputStreamReader(new FileInputStream(
					CF), "GBK");
			BufferedReader ListBRead = new BufferedReader(isr);
			String config = "";
			StringBuffer newfile = new StringBuffer();
			while ((config = ListBRead.readLine()) != null) {
				//StartAtLogon
				if (config.startsWith("StartAtLogon")) {
					newfile.append("StartAtLogon="
							+ String.valueOf(StartAtLogonCheckBox.isSelected())
							+ ";");
				}
				//StartupMinimized
				else if (config.startsWith("StartupMinimized")) {
					newfile.append("StartupMinimized="
							+ String.valueOf(StartupMinimizedCheckBox
									.isSelected()) + ";");
				}
				//Not in System Config 
				else {
					newfile.append(config + ";");
				}
			}
			OutputStreamWriter osw = new OutputStreamWriter(
					new FileOutputStream(CF, false), "GBK");
			BufferedWriter bfw = new BufferedWriter(osw);
			for (String s : newfile.toString().split(";")) {
				bfw.write(s);
				bfw.newLine();
			}
			bfw.flush();
			bfw.close();
			osw.close();
			Config.FrameReset();

			//立即生效的系统设置

			JOptionPane.showMessageDialog(ConfigFrame, "修改成功！重启软件后生效！", "系统设置",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "修改参数失败！", "系统设置",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	private void SystemCancelButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		StartAtLogonCheckBox.setSelected(Config.StartAtLogon);
		StartupMinimizedCheckBox.setSelected(Config.StartupMinimized);
	}

	//Tenhou
	public static StringBuffer TenhouTimer = new StringBuffer();

	private void TenhouTimerTextFieldCaretUpdate(
			javax.swing.event.CaretEvent evt) {
		TenhouTimer.delete(0, TenhouTimer.length());
		TenhouTimer.append(TenhouTimerTextField.getText());
	}

	private void TenhouConfirmButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		boolean timeisint = true;
		try {
			int timer = Integer.parseInt(TenhouTimerTextField.getText());
			if (timer < 30 || timer > 600) {
				JOptionPane.showMessageDialog(ConfigFrame, "请输入30以上600以下的整数值！",
						"天凤设置——观战列表刷新时间", JOptionPane.INFORMATION_MESSAGE);
				TenhouTimerTextField.setText(String
						.valueOf(Config.KansenRefreshTimer));
				timeisint = false;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(ConfigFrame, "数字输入错误！",
					"天凤设置——观战列表刷新时间", JOptionPane.INFORMATION_MESSAGE);
			TenhouTimerTextField.setText(String
					.valueOf(Config.KansenRefreshTimer));
			timeisint = false;
		}
		if (timeisint) {
			try {
				String CF = ResFunctions.getResPath("/Config.ini");
				InputStreamReader isr = new InputStreamReader(
						new FileInputStream(CF), "GBK");
				BufferedReader ListBRead = new BufferedReader(isr);
				String config = "";
				StringBuffer newfile = new StringBuffer();
				while ((config = ListBRead.readLine()) != null) {
					//KansenRefreshTimer
					if (config.startsWith("KansenRefreshTimer")) {
						newfile.append("KansenRefreshTimer="
								+ TenhouTimerTextField.getText() + ";");
					}
					//Not in Tenhou Config
					else {
						newfile.append(config + ";");
					}
				}
				OutputStreamWriter osw = new OutputStreamWriter(
						new FileOutputStream(CF, false), "GBK");
				BufferedWriter bfw = new BufferedWriter(osw);
				for (String s : newfile.toString().split(";")) {
					bfw.write(s);
					bfw.newLine();
				}
				bfw.flush();
				bfw.close();
				osw.close();
				Config.FrameReset();

				//立即生效的天凤设置
				KansenTimer.KT.restart();
				if (getKSRefresh().isEnabled()) {
					getKSRefresh().doClick();
				}

				JOptionPane.showMessageDialog(ConfigFrame, "修改成功！", "天凤设置",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "修改参数失败！", "天凤设置",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void TenhouCancelButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		TenhouTimerTextField.setText(String.valueOf(Config.KansenRefreshTimer));
	}

	/**
	 * 牌效
	 */
	private StringBuffer MJ = new StringBuffer();

	private void PXTextFieldCaretUpdate(javax.swing.event.CaretEvent evt) {
		MJ.delete(0, MJ.length());
		MJ.append(PXTextField.getText());
	}

	private void PXConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		new Thread(new Runnable() {
			public void run() {
				PXConfirm.setEnabled(false);
				PXReset.setEnabled(false);
				String mj = MJ.toString();
				List<Integer> MJlist = new ArrayList<Integer>();
				int tempINT = 0;
				for (Map.Entry<List<Integer>, Integer> tp : Functions.MJCheck(
						mj).entrySet()) {
					MJlist = new ArrayList<Integer>(tp.getKey());
					tempINT = tp.getValue();
				}
				if (tempINT > 0) {
					try {
						GUISolveMJ(MJlist, PXTextArea);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "牌效计算失败！", "错误",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(null, "麻将输入错误！", "错误",
							JOptionPane.ERROR_MESSAGE);
				}
				PXConfirm.setEnabled(true);
				PXReset.setEnabled(true);
			}
		}).start();
	}

	private void PXResetActionPerformed(java.awt.event.ActionEvent evt) {
		PXTextField.setText("");
		MJ.delete(0, MJ.length());

	}

	
	//在GUI中的麻将牌效计算程序
	public static void GUISolveMJ(final List<Integer> mj, JTextArea PXTextArea)
			throws Exception {
		long  StartTime = System.currentTimeMillis();	
		PXTextArea.setText("");
		final int OriSyanten = Functions.Syanten(mj);//原向听数
		int[] MJIndex = new int[14];
		for(int i = 0; i < 14; i++) {
			MJIndex[i] = i;
		}
		final CountDownLatch latch = new CountDownLatch(14);
		final Map<String, Integer> result = Collections.synchronizedMap(new HashMap<String, Integer>());
		if (OriSyanten == -1) {
			PXTextArea.append("和牌！");
		} else {
			if(OriSyanten == 0) {
				PXTextArea.append("听牌！"+"\n");
			}
			else {
				PXTextArea.append("向听数：" + OriSyanten + "\n");
			}
			for (final int i : MJIndex) {
				new Thread(new Runnable() {
					public void run() {
						try {
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
								while(tempset.size() != 14 && ari<4) {
									ari++;
									tempmj.clear();
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
						} catch(Exception e) {
							e.printStackTrace();
						}
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
				PXTextArea.append(tempresult.get(i).getKey().toString()
						+ tempresult.get(i).getValue().toString() + "\n");
			}
		}
		long  EndTime = System.currentTimeMillis();
		PXTextArea.append("用时："+((double)EndTime-(double)StartTime)/1000+"秒！");
	}

	public static JTextArea getPXTextArea() {
		return PXTextArea;
	}

	/**
	 * 日麻教程
	 */
	public JComboBox<?> getGuideComboBox() {
		return GuideComboBox;
	}

	private Object makeObj(final String item) {
		return new Object() {
			public String toString() {
				return item;
			}
		};
	}

	StringBuffer guide = new StringBuffer(); //教程
	StringBuffer zhang = new StringBuffer(); //章
	StringBuffer jie = new StringBuffer(); //节
	static StringBuffer TempZhang = new StringBuffer(); //章（临时存储）
	static StringBuffer TempJie = new StringBuffer(); //节 (临时存储)

	@SuppressWarnings("unchecked")
	private void GuideConfirmButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		GuideZhangComboBox.removeAllItems();
		if (guide.length() > 0) {
			guide.delete(0, guide.length());
		}
		guide.append(GuideComboBox.getSelectedItem().toString());
		for (String s : MainGuide.getZhangList(guide.toString())) {
			GuideZhangComboBox.addItem(makeObj(s));
		}

	}

	@SuppressWarnings("unchecked")
	private void GuideZhangComboBoxActionPerformed(
			java.awt.event.ActionEvent evt) {
		if (GuideZhangComboBox.getSelectedIndex() != -1) {
			GuideJieComboBox.removeAllItems();
			for (String s : MainGuide.getJieList(guide.toString(),
					GuideZhangComboBox.getSelectedItem().toString())) {
				GuideJieComboBox.addItem(makeObj(s));
			}
		}
	}

	private void GuideJieComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
		if (GuideZhangComboBox.getSelectedIndex() != -1
				&& GuideJieComboBox.getSelectedIndex() != -1) {
			GuideEnterButton.setEnabled(true);
		} else {
			GuideEnterButton.setEnabled(false);
		}
	}

	StringBuffer guidefile = new StringBuffer();

	private void GuideEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(GuideZhangComboBox.getSelectedItem().toString());
		jie.append(GuideJieComboBox.getSelectedItem().toString());
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//返回第一章
	private void GuideNavigateFirstZhangActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(MainGuide.getZhangList(guide.toString())[0]);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(0));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//跳至最后一章
	private void GuideNavigateLastZhangActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(MainGuide.getZhangList(guide.toString())[MainGuide
				.getZhangList(guide.toString()).length - 1]);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(0));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//上一章
	private void GuideNavigatePreviousZhangActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(MainGuide.getZhangList(guide.toString())[MainGuide
				.getZhangIndex(guide.toString(), TempZhang.toString()) - 1]);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(0));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//下一章
	private void GuideNavigateNextZhangActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(MainGuide.getZhangList(guide.toString())[MainGuide
				.getZhangIndex(guide.toString(), TempZhang.toString()) + 1]);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(0));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//返回第一节
	private void GuideNavigateFirstJieActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(TempZhang);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(0));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//跳至最后一节
	private void GuideNavigateLastJieActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(TempZhang);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(MainGuide.getJieList(guide.toString(), zhang.toString())
						.size() - 1));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//上一节
	private void GuideNavigatePreviousJieActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(TempZhang);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(MainGuide.getJieIndex(guide.toString(), zhang.toString(),
						TempJie.toString()) - 1));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//下一节
	private void GuideNavigateNextJieActionPerformed(
			java.awt.event.ActionEvent evt) {
		zhang.delete(0, zhang.length());
		jie.delete(0, jie.length());
		zhang.append(TempZhang);
		jie.append(MainGuide.getJieList(guide.toString(), zhang.toString())
				.get(MainGuide.getJieIndex(guide.toString(), zhang.toString(),
						TempJie.toString()) + 1));
		TempZhang.delete(0, TempZhang.length());
		TempJie.delete(0, TempJie.length());
		TempZhang.append(zhang);
		TempJie.append(jie);
		guidefile.append(ResFunctions.getResPath("/res/Guide/" + guide + "/"
				+ zhang + "/" + jie + ".htm"));
		try {
			GuideBrowser.navigate(guidefile.toString());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "链接日麻教程文件失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		guidefile.delete(0, guidefile.length());
		ZhangJieCheck(guide, zhang, jie);
	}

	//章节判定函数（决定按钮enabled、设定标题）
	private void ZhangJieCheck(StringBuffer guide, StringBuffer zhang,
			StringBuffer jie) {
		try {
			int zhangNum = Integer.parseInt(zhang.substring(0,
					zhang.indexOf("、")));
			int jieNum = Integer.parseInt(jie.substring(0, 2));
			int zhangCount = MainGuide.getZhangList(guide.toString()).length;
			int jieCount = MainGuide.getJieList(guide.toString(),
					zhang.toString()).size();
			//章判定
			if (zhangNum == 1) {
				GuideNavigateFirstZhang.setEnabled(false);
				GuideNavigateLastZhang.setEnabled(true);
				GuideNavigatePreviousZhang.setEnabled(false);
				GuideNavigateNextZhang.setEnabled(true);
			} else if (zhangNum == zhangCount) {
				GuideNavigateFirstZhang.setEnabled(true);
				GuideNavigateLastZhang.setEnabled(false);
				GuideNavigatePreviousZhang.setEnabled(true);
				GuideNavigateNextZhang.setEnabled(false);
			} else {
				GuideNavigateFirstZhang.setEnabled(true);
				GuideNavigateLastZhang.setEnabled(true);
				GuideNavigatePreviousZhang.setEnabled(true);
				GuideNavigateNextZhang.setEnabled(true);
			}
			//节判定
			if (jieNum == 1) {
				GuideNavigateFirstJie.setEnabled(false);
				GuideNavigateLastJie.setEnabled(true);
				GuideNavigatePreviousJie.setEnabled(false);
				GuideNavigateNextJie.setEnabled(true);
			} else if (jieNum == jieCount) {
				GuideNavigateFirstJie.setEnabled(true);
				GuideNavigateLastJie.setEnabled(false);
				GuideNavigatePreviousJie.setEnabled(true);
				GuideNavigateNextJie.setEnabled(false);
			} else {
				GuideNavigateFirstJie.setEnabled(true);
				GuideNavigateLastJie.setEnabled(true);
				GuideNavigatePreviousJie.setEnabled(true);
				GuideNavigateNextJie.setEnabled(true);
			}
			GuideTitleLabel.setText(guide.toString() + "——" + zhang.toString()
					+ "——" + jie.toString());
		} catch (Exception e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "日麻教程文件编目错误！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	int GuideIndex;

	private void GuideComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
		if (GuideIndex != GuideComboBox.getSelectedIndex()) {
			GuideZhangComboBox.removeAllItems();
			GuideJieComboBox.removeAllItems();
			GuideNavigateFirstZhang.setEnabled(false);
			GuideNavigateLastZhang.setEnabled(false);
			GuideNavigatePreviousZhang.setEnabled(false);
			GuideNavigateNextZhang.setEnabled(false);
			GuideNavigateFirstJie.setEnabled(false);
			GuideNavigateLastJie.setEnabled(false);
			GuideNavigatePreviousJie.setEnabled(false);
			GuideNavigateNextJie.setEnabled(false);
			GuideIndex = GuideComboBox.getSelectedIndex();
		}
	}

	/**
	 * 天凤麻雀
	 */
	private StringBuffer GS = new StringBuffer("");
	private StringBuffer HS = new StringBuffer("");

	private void TenhouMainActionPerformed(java.awt.event.ActionEvent evt) {
		TenhouGameFrame.setVisible(true);
		MainTenhou.MainAction(MainTenhou.TenhouGameBrowser);
		setExtendedState(JFrame.ICONIFIED);
	}

	private void TenhouGSNumberCaretUpdate(javax.swing.event.CaretEvent evt) {
		GS = new StringBuffer(TenhouGSNumber.getText());
	}

	private void TenhouHSNumberCaretUpdate(javax.swing.event.CaretEvent evt) {
		HS = new StringBuffer(TenhouHSNumber.getText());
	}

	private void TenhouGSConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		TenhouGameFrame.setVisible(true);
		MainTenhou.GSAction(MainTenhou.TenhouGameBrowser, GS);
		setExtendedState(JFrame.ICONIFIED);
	}

	private void TenhouHSConfirmActionPerformed(java.awt.event.ActionEvent evt) {
		TenhouGameFrame.setVisible(true);
		MainTenhou.HSAction(MainTenhou.TenhouGameBrowser, HS);
		setExtendedState(JFrame.ICONIFIED);
	}

	private void TenhouBackActionPerformed(java.awt.event.ActionEvent evt) {
		TenhouGameFrame.setVisible(true);
		TenhouBack.setEnabled(false);
		GUITray.getTenhouBack().setEnabled(false);
		setExtendedState(JFrame.ICONIFIED);
	}

	private void TenhouGameFrameWindowClosing(java.awt.event.WindowEvent evt) {
		TenhouGameCloseDialog.setLocationRelativeTo(TenhouGameFrame);
		TenhouGameCloseDialog.setVisible(true);
	}

	//游戏窗口关闭界面
	private void TenhouCloseConfirmButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		TenhouGameCloseDialog.dispose();
		if (TenhouHideRadioButton.isSelected()) {
			TenhouGameFrame.setVisible(false);
			TenhouBack.setEnabled(true);
			GUITray.getTenhouBack().setEnabled(true);
			GUITray.getTrayIcon().displayMessage("日麻软件@何桌雀庄",
					Messages.TrayTenhouMinimize, TrayIcon.MessageType.WARNING);
		} else if (TenhouCloseRadioButton.isSelected()) {
			TenhouGameFrame.dispose();
			TenhouBack.setEnabled(false);
			GUITray.getTenhouBack().setEnabled(false);
			GUITray.getTrayIcon().displayMessage("日麻软件@何桌雀庄",
					Messages.TrayTenhouClosed, TrayIcon.MessageType.WARNING);
			this.setVisible(true);
			this.setExtendedState(JFrame.NORMAL);
		}
	}

	private void TenhouCloseCancelButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		TenhouGameCloseDialog.dispose();
	}

	/**
	 * 观战君
	 */
	private void TenhouKSRefreshActionPerformed(java.awt.event.ActionEvent evt) {
		new SwingWorker<List<Map.Entry<String, Integer>>, Void>() {
			protected List<Map.Entry<String, Integer>> doInBackground() {
				TenhouKansen.KSRefresh = true;
				TenhouKSRefresh.setEnabled(false);
				TenhouKansen.KanSenSort = TenhouKansen.Initial();
				return TenhouKansen.KanSenSort;
			}

			protected void done() {
				try {
					TenhouKansen.PaintTable(TenhouKSTable, get());
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (TenhouKansen.countMyList > 0) {
						GUITray.getTrayIcon().displayMessage("天凤观战列表",
								Messages.KSMessage.toString(),
								TrayIcon.MessageType.INFO);
						TenhouKansen.countMyList = 0;
						KansenTimer.setCountDown(Config.KansenRefreshTimer);
					}
					Messages.KSMessage.delete(0, Messages.KSMessage.length());
					TenhouKansen.KSRefresh = false;
					TenhouKansen.KSRead = true;
					TenhouKSRefresh.setEnabled(true);
				}
			}
		}.execute();

	}

	private void TenhouKSTableMouseClicked(java.awt.event.MouseEvent evt) {
		if (evt.getButton() == evt.BUTTON1) {
			if (evt.getClickCount() == 2) {
				String link = TenhouKSTable.getValueAt(
						TenhouKSTable.getSelectedRow(), 6).toString();
				TenhouGameFrame.setVisible(true);
				MainTenhou.TenhouGameBrowser.navigate(link);
				setExtendedState(JFrame.ICONIFIED);
			}
		} else if (evt.getButton() == evt.BUTTON3) {
			int row = TenhouKSTable.rowAtPoint(evt.getPoint());
			if (row >= 0) {
				TenhouKSTable.setRowSelectionInterval(row, row);
			}
			JPopupMenu KSPop = TenhouKansen.KansenPopup(TenhouKSTable
					.getValueAt(row, 4).toString(), this);
			KSPop.show(evt.getComponent(), evt.getX(), evt.getY());
		}
	}

	public static JLabel getKSLabel() {
		return TenhouKSLabel;
	}

	public static JButton getKSRefresh() {
		return TenhouKSRefresh;
	}

	//复选框
	private void SiFHCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	private void SanTSCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	private void SiTSCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	private void SanFHCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	private void DongFengItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	private void DongNanItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	private void QueZhuangItemStateChanged(java.awt.event.ItemEvent evt) {
		TenhouKansen.countMyList = 0;
		TenhouKansen.PaintTable(getKansenTable(), TenhouKansen.KanSenSort);
		TenhouKansen.countMyList = 0;
	}

	// 我的观战列表
	public static JTable getMyKansenTable() {
		return MyKansenTable;
	}

	private void MyKansenRefreshButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		MyKansen.RefreshKansenList(MyKansenTable);
	}

	public static JScrollPane getMyKansenScrollPane() {
		return MyKansenScrollPane;
	}

	public static JButton getMyKansenRefreshButton() {
		return MyKansenRefreshButton;
	}

	private void MyKansenTableMouseClicked(java.awt.event.MouseEvent evt) {
		if (evt.getButton() == evt.BUTTON3) {
			int row = MyKansenTable.rowAtPoint(evt.getPoint());
			if (row >= 0) {
				MyKansenTable.setRowSelectionInterval(row, row);
			}
			JPopupMenu KSPop = MyKansen.MyKansenPopup(
					MyKansenTable.getValueAt(row, 1).toString(), this);
			KSPop.show(evt.getComponent(), evt.getX(), evt.getY());
		}
	}

	private void MyKansenCreateButtonActionPerformed(
			java.awt.event.ActionEvent evt) {
		MyKansenCreateDialog.setLocationRelativeTo(this);
		MyKansenCreateDialog.setVisible(true);
	}

	private void MyKansenCreateDialogWindowClosing(
			java.awt.event.WindowEvent evt) {
		MyKansenCreateDialog.setVisible(false);
	}

	private void MyKansenCreateCancelActionPerformed(
			java.awt.event.ActionEvent evt) {
		MyKansenCreateDialog.setVisible(false);
	}

	StringBuffer MyKansenCreatePlayer = new StringBuffer();

	private void MyKansenCreateTextFieldCaretUpdate(
			javax.swing.event.CaretEvent evt) {
		MyKansenCreatePlayer.delete(0, MyKansenCreatePlayer.length());
		MyKansenCreatePlayer.append(MyKansenCreateTextField.getText());
	}

	private void MyKansenCreateConfirmActionPerformed(
			java.awt.event.ActionEvent evt) {
		boolean exist = false;
		String KS = TenhouKansen.getKanSenListLink();
		try {
			File ListFile = new File(KS);
			if (!ListFile.exists()) {
				ListFile.createNewFile();
				OutputStreamWriter osw = new OutputStreamWriter(
						new FileOutputStream(KS, true), "GBK");
				BufferedWriter bfw = new BufferedWriter(osw);
				bfw.close();
				osw.close();
			}
			InputStreamReader isr = new InputStreamReader(new FileInputStream(
					ListFile), "GBK");
			BufferedReader ListBRead = new BufferedReader(isr);
			StringBuffer newfile = new StringBuffer();
			String KSPlayer = "";
			while ((KSPlayer = ListBRead.readLine()) != null) {
				if (!MyKansenCreatePlayer.toString().equals(KSPlayer)) {
					newfile.append(KSPlayer + ",");
				}
				if (MyKansenCreatePlayer.toString().equals(KSPlayer)) {
					exist = true;
					break;
				}
			}
			if (!exist) {
				newfile.append(MyKansenCreatePlayer.toString());
				OutputStreamWriter osw = new OutputStreamWriter(
						new FileOutputStream(KS, false), "GBK");
				BufferedWriter bfw = new BufferedWriter(osw);
				for (String s : newfile.toString().split(",")) {
					if (!(s.equals(""))) {
						bfw.write(s);
						bfw.newLine();
					}
				}
				bfw.flush();
				bfw.close();
				osw.close();
				TenhouKansen.PaintTable(GUI.getKansenTable(),
						TenhouKansen.KanSenSort);
				TenhouKansen.countMyList = 0;
			}
			MyKansenRefreshButton.doClick();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "读取/写入观战列表失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		MyKansenCreateDialog.setVisible(false);
	}

	//天凤麻雀Getters
	public JFrame getTenhouGameFrame() {
		return TenhouGameFrame;
	}

	public JButton getTenhouBack() {
		return TenhouBack;
	}

	public static JTable getKansenTable() {
		return TenhouKSTable;
	}

	public static JCheckBox getSiFH() {
		return SiFHCheckBox;
	}

	public static JCheckBox getSanFH() {
		return SanFHCheckBox;
	}

	public static JCheckBox getSiTS() {
		return SiTSCheckBox;
	}

	public static JCheckBox getSanTS() {
		return SanTSCheckBox;
	}

	public static JCheckBox getQueZhuang() {
		return QueZhuang;
	}

	public static JCheckBox getDongFeng() {
		return DongFeng;
	}

	public static JCheckBox getDongNan() {
		return DongNan;
	}

	public static JFrame getTenhouFrame() {
		return TenhouGameFrame;
	}

	/**
	 * 
	 * 点击图片
	 */
	private void PX1mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "1m");
	}

	private void PX2mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "2m");
	}

	private void PX3mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "3m");
	}

	private void PX4mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "4m");
	}

	private void PX5mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "5m");
	}

	private void PX6mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "6m");
	}

	private void PX7mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "7m");
	}

	private void PX8mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "8m");
	}

	private void PX9mMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "9m");
	}

	private void PX1pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "1p");
	}

	private void PX2pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "2p");
	}

	private void PX3pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "3p");
	}

	private void PX4pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "4p");
	}

	private void PX5pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "5p");
	}

	private void PX6pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "6p");
	}

	private void PX7pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "7p");
	}

	private void PX8pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "8p");
	}

	private void PX9pMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "9p");
	}

	private void PX1sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "1s");
	}

	private void PX2sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "2s");
	}

	private void PX3sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "3s");
	}

	private void PX4sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "4s");
	}

	private void PX5sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "5s");
	}

	private void PX6sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "6s");
	}

	private void PX7sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "7s");
	}

	private void PX8sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "8s");
	}

	private void PX9sMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "9s");
	}

	private void PX1zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "1z");
	}

	private void PX2zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "2z");
	}

	private void PX3zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "3z");
	}

	private void PX4zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "4z");
	}

	private void PX5zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "5z");
	}

	private void PX6zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "6z");
	}

	private void PX7zMouseClicked(java.awt.event.MouseEvent evt) {
		PXTextField.setText(PXTextField.getText() + "7z");
	}

	/**
	 * Main函数
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws UnsupportedLookAndFeelException
	 */
	public static void main(String args[]) {
		Config.LoadConfig();
		NativeInterface.open();
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel() {
				@Override
				public UIDefaults getDefaults() {
					UIDefaults defaults = super.getDefaults();
					defaults.put("TableUI",
							"javax.swing.plaf.basic.BasicTableUI");
					defaults.put("TableHeaderUI",
							"javax.swing.plaf.synth.SynthTableHeaderUI");
					//defaults.put("background", new Color(220,220,220,255));
					return defaults;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "图形界面初始化失败！", "错误",
					JOptionPane.ERROR_MESSAGE);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				GUI g = new GUI();
				g.setLocationRelativeTo(null);
				/*
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				*/
				g.setVisible(true);				
			}
		});
		NativeInterface.runEventPump();
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JPanel BaikePanel;
	private static javax.swing.JFrame ConfigFrame;
	private javax.swing.JTabbedPane ConfigTabbedPane;
	private static javax.swing.JCheckBox DongFeng;
	private static javax.swing.JCheckBox DongNan;
	private javax.swing.JPanel GuideBrowserPanel;
	private javax.swing.JLabel GuideChapterLabel;
	private static javax.swing.JComboBox GuideComboBox;
	private static javax.swing.JButton GuideConfirmButton;
	private javax.swing.JPanel GuideControlPanel;
	private static javax.swing.JButton GuideEnterButton;
	private static javax.swing.JComboBox GuideJieComboBox;
	private javax.swing.JLabel GuideLabel;
	private javax.swing.JButton GuideNavigateFirstJie;
	private javax.swing.JButton GuideNavigateFirstZhang;
	private javax.swing.JButton GuideNavigateLastJie;
	private javax.swing.JButton GuideNavigateLastZhang;
	private javax.swing.JButton GuideNavigateNextJie;
	private javax.swing.JButton GuideNavigateNextZhang;
	private javax.swing.JPanel GuideNavigatePanel;
	private javax.swing.JButton GuideNavigatePreviousJie;
	private javax.swing.JButton GuideNavigatePreviousZhang;
	private javax.swing.JSeparator GuideNavigateSeperator;
	private javax.swing.JPanel GuidePanel;
	private javax.swing.JSeparator GuideSeparator;
	private javax.swing.JPanel GuideShowPanel;
	private javax.swing.JLabel GuideTitleLabel;
	private static javax.swing.JComboBox GuideZhangComboBox;
	private javax.swing.JMenuBar Menubar;
	private javax.swing.JMenu MenubarApplication;
	private javax.swing.JMenuItem MenubarApplicationKansenkun;
	private javax.swing.JMenuItem MenubarApplicationKouritsu;
	private javax.swing.JMenuItem MenubarApplicationTensuu;
	private javax.swing.JMenu MenubarFile;
	private javax.swing.JMenuItem MenubarFileExit;
	private javax.swing.JSeparator MenubarFileSeparator1;
	private javax.swing.JMenuItem MenubarFileSettings;
	private javax.swing.JMenu MenubarHelp;
	private javax.swing.JMenuItem MenubarHelpAbout;
	private javax.swing.JMenuItem MenubarHelpBaike;
	private javax.swing.JMenuItem MenubarHelpGuide;
	private javax.swing.JMenuItem MenubarHelpPX;
	private javax.swing.JSeparator MenubarHelpSeparator1;
	private javax.swing.JMenuItem MenubarHelpTenhou;
	private javax.swing.JMenu MenubarNavigate;
	private javax.swing.JMenu MenubarNavigateGuide;
	private javax.swing.JMenuItem MenubarNavigateGuideBeginner;
	private javax.swing.JMenuItem MenubarNavigateGuideDaidai;
	private javax.swing.JMenuItem MenubarNavigateGuideSeventhTG;
	private javax.swing.JMenu MenubarNavigateOther;
	private javax.swing.JMenuItem MenubarNavigateOtherRon2;
	private javax.swing.JMenu MenubarNavigateTenhou;
	private javax.swing.JMenuItem MenubarNavigateTenhouKiroku;
	private javax.swing.JMenuItem MenubarNavigateTenhouMonth;
	private javax.swing.JMenuItem MenubarNavigateTenhouRanking;
	private javax.swing.JMenuItem MenubarNavigateTenhouSite;
	private javax.swing.JMenuItem MenubarNavigateTenhouTieba;
	private static javax.swing.JButton MyKansenCreateButton;
	private javax.swing.JButton MyKansenCreateCancel;
	private javax.swing.JButton MyKansenCreateConfirm;
	private javax.swing.JDialog MyKansenCreateDialog;
	private javax.swing.JLabel MyKansenCreateLabel;
	private javax.swing.JPanel MyKansenCreatePanel;
	private javax.swing.JTextField MyKansenCreateTextField;
	private javax.swing.JLabel MyKansenLabel;
	private static javax.swing.JButton MyKansenRefreshButton;
	private static javax.swing.JScrollPane MyKansenScrollPane;
	private static javax.swing.JTable MyKansenTable;
	private javax.swing.JLabel PX1m;
	private javax.swing.JLabel PX1p;
	private javax.swing.JLabel PX1s;
	private javax.swing.JLabel PX1z;
	private javax.swing.JLabel PX2m;
	private javax.swing.JLabel PX2p;
	private javax.swing.JLabel PX2s;
	private javax.swing.JLabel PX2z;
	private javax.swing.JLabel PX3m;
	private javax.swing.JLabel PX3p;
	private javax.swing.JLabel PX3s;
	private javax.swing.JLabel PX3z;
	private javax.swing.JLabel PX4m;
	private javax.swing.JLabel PX4p;
	private javax.swing.JLabel PX4s;
	private javax.swing.JLabel PX4z;
	private javax.swing.JLabel PX5m;
	private javax.swing.JLabel PX5p;
	private javax.swing.JLabel PX5s;
	private javax.swing.JLabel PX5z;
	private javax.swing.JLabel PX6m;
	private javax.swing.JLabel PX6p;
	private javax.swing.JLabel PX6s;
	private javax.swing.JLabel PX6z;
	private javax.swing.JLabel PX7m;
	private javax.swing.JLabel PX7p;
	private javax.swing.JLabel PX7s;
	private javax.swing.JLabel PX7z;
	private javax.swing.JLabel PX8m;
	private javax.swing.JLabel PX8p;
	private javax.swing.JLabel PX8s;
	private javax.swing.JLabel PX9m;
	private javax.swing.JLabel PX9p;
	private javax.swing.JLabel PX9s;
	private javax.swing.JButton PXConfirm;
	private javax.swing.JLabel PXLabel;
	private javax.swing.JPanel PXPanel;
	private javax.swing.JButton PXReset;
	private javax.swing.JScrollPane PXScrollPane;
	private javax.swing.JPanel PXSelectPanel;
	private static javax.swing.JTextArea PXTextArea;
	private javax.swing.JTextField PXTextField;
	private javax.swing.JPanel PXtempPanel1;
	private javax.swing.JPanel PXtempPanel2;
	private javax.swing.JPanel PXtempPanel3;
	private static javax.swing.JCheckBox QueZhuang;
	private static javax.swing.JCheckBox SanFHCheckBox;
	private static javax.swing.JCheckBox SanTSCheckBox;
	private static javax.swing.JCheckBox SiFHCheckBox;
	private static javax.swing.JCheckBox SiTSCheckBox;
	private static javax.swing.JCheckBox StartAtLogonCheckBox;
	private javax.swing.JLabel StartAtLogonLabel;
	private static javax.swing.JCheckBox StartupMinimizedCheckBox;
	private javax.swing.JLabel StartupMinimizedLabel;
	private javax.swing.JButton SystemCancelButton;
	private javax.swing.JPanel SystemConfigPanel;
	private javax.swing.JButton SystemConfirmButton;
	private javax.swing.JTabbedPane TabbedPane;
	private javax.swing.JButton TenhouBack;
	private javax.swing.JButton TenhouCancelButton;
	private javax.swing.ButtonGroup TenhouCloseButtonGroup;
	private javax.swing.JButton TenhouCloseCancelButton;
	private javax.swing.JButton TenhouCloseConfirmButton;
	private javax.swing.JRadioButton TenhouCloseRadioButton;
	private javax.swing.JPanel TenhouConfigPanel;
	private javax.swing.JButton TenhouConfirmButton;
	private javax.swing.JButton TenhouGSConfirm;
	private javax.swing.JLabel TenhouGSLabel;
	private javax.swing.JTextField TenhouGSNumber;
	private javax.swing.JDialog TenhouGameCloseDialog;
	private javax.swing.JLabel TenhouGameCloseLabel;
	private javax.swing.JPanel TenhouGameClosePanel;
	private static javax.swing.JFrame TenhouGameFrame;
	private javax.swing.JPanel TenhouGamePanel;
	private javax.swing.JButton TenhouHSConfirm;
	private javax.swing.JLabel TenhouHSLabel;
	private javax.swing.JTextField TenhouHSNumber;
	private javax.swing.JRadioButton TenhouHideRadioButton;
	private static javax.swing.JLabel TenhouKSLabel;
	private static javax.swing.JButton TenhouKSRefresh;
	private javax.swing.JScrollPane TenhouKSScrollPane;
	private static final javax.swing.JTable TenhouKSTable = new javax.swing.JTable();
	private javax.swing.JPanel TenhouKansenPanel;
	private javax.swing.JButton TenhouMain;
	private javax.swing.JPanel TenhouOptionPanel;
	private javax.swing.JPanel TenhouPanel;
	private javax.swing.JPanel TenhouSubPanel;
	private javax.swing.JLabel TenhouTimerLabel;
	private static javax.swing.JTextField TenhouTimerTextField;
	// End of variables declaration//GEN-END:variables

}