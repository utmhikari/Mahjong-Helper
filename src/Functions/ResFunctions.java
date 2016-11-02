/**
 * 
 */
package Functions;

import GUI.GUI;

/**
 * @author HiKari
 *	资源方面功能
 */
public class ResFunctions {
	/**
	 * 提取资源路径(suffix前为程序路径，不带"/"符号)
	 * @param suffix
	 * @return
	 */
	public static String getResPath(String suffix) {
		StringBuffer getRes = new StringBuffer(GUI.class.getResource("").toString());
		getRes.delete(getRes.lastIndexOf("/"),getRes.length());
		getRes.delete(getRes.lastIndexOf("/"),getRes.length());
		getRes.delete(getRes.lastIndexOf("/"),getRes.length());
		getRes.append(suffix);
		if (getRes.toString().startsWith("jar")) {
			getRes.delete(0,4);
		}
		getRes.delete(0,6);
		return getRes.toString();
	}
}
