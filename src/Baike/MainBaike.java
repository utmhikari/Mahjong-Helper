/**
 * 
 */
package Baike;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import Functions.ResFunctions;
import GUI.*;

/**
 * @author HiKari
 * 日麻百科
 *
 */
public class MainBaike {
	
	public static boolean baikeflag = true; //判定出错
	
	public static void Initial(){
		try {				
							//System.out.println(GUIgetRes);
							//File Baike = new File("."+File.separator+"res"+File.separator+"Baike"+File.separator+"MJ.html");
							//Document doc = Jsoup.parse(Baike,"UTF-8",GUI.class.getResource("").toString().
									//substring(0,GUI.class.getResource("").toString().length()-8));
				String BK = ResFunctions.getResPath("/res/Baike/MJ.html");
				File Baike = new File(BK);
				Document doc = Jsoup.parse(Baike,"UTF-8","");
				Elements PathPart =  doc.getElementsByTag("a");
				for(Element BaikePath : PathPart){
				if(BaikePath.attr("href").contains("MJ.html")){
					BaikePath.attr("href",BK+
					BaikePath.attr("href").substring(BaikePath.attr("href").lastIndexOf('#'),BaikePath.attr("href").length()));
							//System.out.println(BaikePath.attr("href"));
				}
			}
			FileOutputStream fos = new FileOutputStream(Baike, false);  
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");  
	        osw.write(doc.html());  
	        osw.close();
							
		} catch (Exception e) {			
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "链接日麻百科文件失败！",
					"错误", JOptionPane.ERROR_MESSAGE);
			baikeflag = false;
		}
	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}