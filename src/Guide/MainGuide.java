/**
 * 
 */
package Guide;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import chrriis.dj.nativeswing.NSComponentOptions;
import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;

import Functions.*;

/**
 * @author HiKari
 *
 */
public class MainGuide {
	
	
		
	/**
	 * 日麻教程！！！
	 */
	public static void Initial() {
	
	}
	
	/**
	 *	教程列表 
	 */
	public static String[] getGuideList() {
		
		File guide = new File(ResFunctions.getResPath("/res/Guide"));
		String[] guidelist = guide.list();
		/*
		for(String s : guidelist) {
			System.out.println(s);
		}
		*/
		return guidelist;
	}
	
	/**
	 * 章列表
	 */
	public static String[] getZhangList(String guide) {	
		File zhang = new File(ResFunctions.getResPath("/res/Guide/"+guide));
		String[] guidezhanglist = zhang.list();
		return guidezhanglist;
	}
	
	/**
	 * 节列表
	 */
	public static List<String> getJieList(String guide, String zhang) {
		File jie = new File(ResFunctions.getResPath("/res/Guide/"+guide+"/"+zhang));
		String[] guidejielist = jie.list();
		List<String> realjielist = new ArrayList<String>();
		for(int i = 0; i <guidejielist.length; i++) {
			if(/*guidejielist[i].contains(".doc") || */guidejielist[i].contains(".htm")) {
				guidejielist[i] = guidejielist[i].substring(0, guidejielist[i].lastIndexOf("."));
				realjielist.add(guidejielist[i]);
			}
		}
		return realjielist;
	}
	
	/**
	 * 章索引
	 */
	public static int getZhangIndex(String guide, String tempzhang) {
		int index = 0;
		for(String s : getZhangList(guide)) {
			if (s.equals(tempzhang)) {
				break;
			}
			index++;
		}
		return index;
	}
	
	/**
	 * 节索引
	 */
	public static int getJieIndex(String guide, String zhang, String tempjie) {
		int index = 0;
		for(String s : getJieList(guide, zhang)) {
			if (s.equals(tempjie)) {
				break;
			}
			index++;
		}
		return index;
	}
	
	/**
	 * main函数
	 * @param args
	 */
	public static void main(String[] args) {

	}
}
