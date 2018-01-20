package myUtil.util.myfile;

import java.io.File;
import java.net.URL;

public class MyPathUtil {

	public static void main(String[] args){
		String filePath = "D:/spider/log";
		listFile(filePath);
	}
	/**
	 * list the name of all file in the path. The path should a directory. like: String filePath = "D:/spider/log";
	 * @param filePath
	 */
	public static void listFile(String filePath){
		//String filePath = "D:" + File.separator +"spider" + File.separator +"log";
		//String filePath = "D:/spider/log";
		File f = new File(filePath);
		if(!f.exists()){
			System.out.println("file not exist,end!");
			return;
		}
		File[] fileList = f.listFiles();
		for(int i = 0; i < fileList.length; i++){
			File file = fileList[i];
			if(!file.isDirectory()){
				System.out.println(file.getName());
			}
		}
	}
	public static String getCurrentProjectPath(){
		return System.getProperty("user.dir");
	}
	public static String getFilePath(){
		return MyPathUtil.class.getClassLoader().getResource("config/my.properties").toString();
	}
}
