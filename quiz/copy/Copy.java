package quiz.copy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Copy {
	File fold;
	File copyFold; 
	FileWriter fw;
	
	public Copy() {
		copy("practice", "practice_copy");
	}
	
	void copy(String str, String copyStr) {
		
		File fold = new File(str);
		File copyFold = new File(copyStr);
		File[] files = fold.listFiles();
		
		if(!copyFold.exists()) {
			copyFold.mkdir();
		}
		
		for(File file : files) {
			if(file.isDirectory()) {
				copy(str + "\\" + file.getName(), copyStr + "\\" + file.getName()+"_copy");
			}else if(file.getName().contains(".jpg")) {
				// characterStream 은 문자타입으로 전송하기에 당연히 안된다.
				// 하지만 byte로 전달되면 가능하다.
			}else {
				try (FileReader fr = new FileReader(file, Charset.forName("UTF-8"));){
					int len;
					char[] buffer = new char[20];
					String txt = null;
					
					while ((len = fr.read(buffer))!=-1) {
						txt += (new String(buffer, 0, len));
					}
					
					fw = new FileWriter(copyFold +"\\"+ file.getName());
					fw.write(txt);
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		}
	}
}
