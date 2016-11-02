package GUI;

/**
 * 
 * @author HiKari
 * 显示消息的集合
 * 
 */
public class Messages {
	/**
	 * 菜单栏
	 */	
	//软件说明
	public static String HelpAbout= "本软件主要由HiKari@何桌雀庄制作\n" +
								"打麻将真TM开心啊！";
	//牌效
	public static String HelpPX= "输入方式：1~9m，1~9p，1~9s，1~7z（小写字母）\n" +
								"共输入14张麻将牌\n" +
								"其中m对应万，p对应饼、筒，s对应索、条\n" +
								"1~7z分别对应东南西北白发中\n";
	//日麻百科
	public static String HelpBaike= "日本麻雀百度百科\n" +
			"http://baike.baidu.com/item/日本麻将/5292909";
	//天凤
	public static String HelpTenhou= "天凤麻雀\n" +
			"http://tenhou.net\n"+
			"请编辑软件目录下的KanSenList.ini以自定义观战列表";
	//日麻教程
	public static String HelpGuide= "日本麻雀教程\n"+
			"一起踏上学习麻雀的旅途吧！";

	/**
	 * 系统托盘
	 */
	public static String TrayMinimize= "主界面已最小化";
	public static String TrayTenhouMinimize= "天凤界面已隐藏，点击“回到天凤”以返回天凤界面";
	public static String TrayTenhouClosed="已退出天凤界面！";
	
	/**
	 * 观战
	 */
	public static StringBuffer KSMessage = new StringBuffer();
	
			
}
