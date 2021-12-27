package quiz.reporterEmail;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InOutput {
	
	File fold = new File("practice/reporters");
	File allFile;
	Reporter reporter;
	
	public InOutput() 
	{
		String allInfo;
		allFile = new File("email.txt"); 
		
		input();
		
	}
	
	void input() {
		
		File path = new File("practice/reporters");
		if(!path.exists()) {
			path.mkdir();
		}
		//초반
		/*
		try (FileReader in = new FileReader(allFile, Charset.forName("UTF-8"))){
			
			int len;
			char[] buffer = new char[20];
			String[] reports;
			
			while ((len = in.read(buffer))!=-1) {
				strs += new String(buffer, 0, len);
			}
			
			reports = strs.split("\n");
			
			for(String report : reports) {
				String[] arrs = report.split("\t");
				output(arrs);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		//버퍼사용
		
		try(BufferedReader in = new BufferedReader(new FileReader(allFile,Charset.forName("UTF-8")))){
			
			String line;
			String[] reports;
			while((line = in.readLine())!= null) {
				reports = line.split("\n");
				for(String report : reports) {
					String[] arrs = report.split("\t");
					output(arrs);
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try(BufferedReader in = new BufferedReader(new FileReader(allFile,Charset.forName("UTF-8")))){
//			String allData = "";
//			
//			Pattern line_patten = Pattern.compile("(.*)\t(.*)\t(.*)\t(\\w+@\\w+\\.\\w+(\\.\\w+)*)");
//			
//			char[] cbuf = new char[8192];
//			int len;
//			while((len = in.read(cbuf)) != -1) {
//				allData += new String(cbuf, 0, len);
//			}
//			
//			Matcher matcher = line_patten.matcher(allData);
//			while(matcher.find()) {
//				String company = matcher.group(1);
//				String field = matcher.group(2);
//				String name = matcher.group(3);
//				String email = matcher.group(4);
//				try(DataOutputStream out =
//						new DataOutputStream(new FileOutputStream(
//								new File(path, String.format("%s_%s", company, name))));){
//					out.writeUTF(company);
//					out.writeUTF(field);
//					out.writeUTF(name);
//					out.writeUTF(email);
//					
//				}
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println("생성완료");
		
		
	}
	
	void output(String[] arrs) {
		if(!fold.exists()) {
			fold.mkdir();
		}
		File f = new File(fold.getPath() + "\\" + arrs[0]+"_"+arrs[2]);
		try (FileWriter fw = new FileWriter(f);){
			for(String arr : arrs) {
				fw.write(arr+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
