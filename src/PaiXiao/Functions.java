package PaiXiao;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import PaiXiao.Tenhou_SyanTen;

public class Functions {
	
	/** 
	 * 1、生成麻将字符串（整体）
	 * @param List<Integer> mjs 麻将手牌
	 */  
	public static String MJtoString(List<Integer> mjs){
		String mj="";
		int num;//麻将上的数
		String type;//麻将的类
		for(Integer i:mjs) {
			if(i<36) {
				num=i/4+1;
				type="m";
			}
			else if(i<72) {
				num=(i-36)/4+1;
				type="p";
			}
			else if(i<108) {
				num=(i-72)/4+1; 
				type="s";
			}
			else {
				num=(i-108)/4+1; 
				type="z";
			}
			mj+=(num+type);
		}
		String temp = "";
		if(mj.lastIndexOf('m')!=-1){
			temp=mj.substring(0,mj.lastIndexOf('m'));
			temp=temp.replace("m","");
			mj=temp+mj.substring(mj.lastIndexOf('m'),mj.length());
		}
		
		if(mj.lastIndexOf('p')!=-1){
			temp=mj.substring(0,mj.lastIndexOf('p'));
			temp=temp.replace("p","");
			mj=temp+mj.substring(mj.lastIndexOf('p'),mj.length());
		}
		if(mj.lastIndexOf('s')!=-1){
			temp=mj.substring(0,mj.lastIndexOf('s'));
			temp=temp.replace("s","");
			mj=temp+mj.substring(mj.lastIndexOf('s'),mj.length());
		}
		if(mj.lastIndexOf('z')!=-1){
			temp=mj.substring(0,mj.lastIndexOf('z'));
			temp=temp.replace("z","");
			mj=temp+mj.substring(mj.lastIndexOf('z'),mj.length());
		}
		return mj;
	}
	
	/** 
	 * 2、向听数分析器
	 * @param mjs 麻将手牌（数列）
	 */  
	public static int Syanten(List<Integer> mjs) throws Exception{
		int syanten = 8;
		int[] a=new int[136];
		for(int i:mjs){
			a[i]++;
		}
		//Tenhou_SyanTen.calcSyanten2(a, 136);
		ScriptEngineManager sem = new ScriptEngineManager(); 
		ScriptEngine engine=sem.getEngineByName("javascript"); 
		
		
		//URL url=Functions.class.getResource("syanten1007-2013.8.5.js");
		
		File directory = new File("."+File.separator + "res" + File.separator + "PaiXiao" + File.separator + "syanten1007-2013.8.5.js");
		//System.out.println(directory.getPath());
		//String jsFileName = directory.getAbsolutePath()+File.separator+"syanten1007-2013.8.5.js";
		//System.out.println(jsFileName);
		FileReader reader = new FileReader(directory);
		engine.eval(reader);   
		if(engine instanceof Invocable) {    
			Invocable invoke = (Invocable)engine;  
			Double XT = (Double)invoke.invokeFunction("calcSyanten", a, 136, 0);//a、n、是否计算七对子
			syanten=XT.intValue();
		}
		return syanten;
	}
	
	/** 
	 * 3、生成麻将字符串（单牌）
	 * @param mjnum 麻将序号（0~135）
	 */  
	public static String MJtoString(int mjnum) {
		String mj="";
		int num;//麻将上的数
		String type;//麻将的类
		if(mjnum<36) {
			num=mjnum/4+1;
			type="m";
		}
		else if(mjnum<72) {
			num=(mjnum-36)/4+1;
			type="p";
		}
		else if(mjnum<108) {
			num=(mjnum-72)/4+1; 
			type="s";
		}
		else {
			num=(mjnum-108)/4+1; 
			type="z";
		}
		mj+=(num+type);
		return mj;
	}
	
	/** 
	 * 4、检查麻将字符串（顺便输出麻将）
	 * @param mj 麻将字符串
	 */ 
	public static HashMap<List<Integer>,Integer> MJCheck(String mj){
		HashMap<List<Integer>,Integer> MJCheck=new HashMap<List<Integer>,Integer>();//存放麻将（数字）与判定弗莱格
		List<Integer> MJ=new ArrayList<Integer>();
		int flag=1;//输入合法？
		
		String[] MJSTR={"1","2","3","4","5","6","7","8","9","m","p","s","z"};//检验字符用
		
		for(int i=0;i<mj.length();i++){
			int RightChar=0;
			for(int j=0;j<MJSTR.length;j++){
				if(mj.substring(i, i+1).equals(MJSTR[j])){
					RightChar=1;
					break;
				}
				if(i==mj.length()-1){
					if(!mj.substring(i, i+1).equals("m")&&!mj.substring(i, i+1).equals("p")&&
							!mj.substring(i, i+1).equals("s")&&!mj.substring(i, i+1).equals("z")){
						flag=0;
						MJCheck.put(MJ, flag);
						return MJCheck;
					}
				}
			}
			if(RightChar==0){
				flag=0;
				MJCheck.put(MJ, flag);
				return MJCheck;
			}
		}
			
		int[] mjSave = new int[34];//存放麻将
		int lastIndex=0;//循环用
		String tempStr="";//循环用
		for(int i=0;i<mj.length();i++){
			if(mj.substring(i, i+1).equals("m")){
					tempStr=mj.substring(lastIndex,i);
					if(tempStr.length()==0){
						flag=0;
						MJCheck.put(MJ, flag);
						return MJCheck;
					}
					else {
						lastIndex=i+1;
						for(int j=0;j<tempStr.length();j++){
							int tempINT=Integer.parseInt(tempStr.substring(j, j+1));
							mjSave[tempINT-1]++;
						}
					}
					for(int k=0;k<=8;k++){
						if(mjSave[k]>4){
							flag=0;
							MJCheck.put(MJ, flag);
							return MJCheck;
						}
					}
				}
					
			else if(mj.substring(i, i+1).equals("p")) {
					tempStr=mj.substring(lastIndex,i);
					if(tempStr.length()==0){
						flag=0;
						MJCheck.put(MJ, flag);
						return MJCheck;
					}
					else {
						lastIndex=i+1;
						for(int j=0;j<tempStr.length();j++){
							int tempINT=Integer.parseInt(tempStr.substring(j, j+1));
							mjSave[tempINT+8]++;
						}
					}
					for(int k=9;k<=17;k++){
						if(mjSave[k]>4){
							flag=0;
							MJCheck.put(MJ, flag);
							return MJCheck;
						}
					}
			}
					
			else if(mj.substring(i, i+1).equals("s")) {
					tempStr=mj.substring(lastIndex,i);
					if(tempStr.length()==0){
						flag=0;
						MJCheck.put(MJ, flag);
						return MJCheck;
					}
					else {
						lastIndex=i+1;
						for(int j=0;j<tempStr.length();j++){
							int tempINT=Integer.parseInt(tempStr.substring(j, j+1));
							mjSave[tempINT+17]++;
						}
					}
					for(int k=18;k<=26;k++){
						if(mjSave[k]>4){
							flag=0;
							MJCheck.put(MJ, flag);
							return MJCheck;
						}
					}
			}
					
			else if(mj.substring(i, i+1).equals("z")) {
					tempStr=mj.substring(lastIndex,i);
					if(tempStr.length()==0){
						flag=0;
						MJCheck.put(MJ, flag);
						return MJCheck;
					}
					else {
						lastIndex=i+1;
						for(int j=0;j<tempStr.length();j++){
							int tempINT=Integer.parseInt(tempStr.substring(j, j+1));
							if(tempINT > 7){
								flag=0;
								MJCheck.put(MJ, flag);
								return MJCheck;
							}
							else {
								mjSave[tempINT+26]++;
							}
						}
					}
					for(int k=27;k<=33;k++){
						if(mjSave[k]>4){
							flag=0;
							MJCheck.put(MJ, flag);
							return MJCheck;
						}
					}
			}
		}
		
		for(int i=0;i<34;i++){
			if(mjSave[i]>0){
				for(int j=0;j<mjSave[i];j++){
					MJ.add(4*i+j);
				}
			}
		}
		
		if(MJ.size()!=14){
			flag=0;
		}
		
		MJCheck.put(MJ, flag);
		return MJCheck;
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
