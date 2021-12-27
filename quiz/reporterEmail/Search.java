package quiz.reporterEmail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {
	
	File allData;
	
	public Search() {
		allData = new File("practice/reporters");
		String str = "_";
		Scanner input = new Scanner(System.in);
		
		while(!("종료".contains(str))) {
			search(target());
			System.out.println("종료를 원하시면 '종료'를 쳐주세요.");
			System.out.print(">> ");
			str = input.next();
		}
		System.out.println("종료합니다.");
	}
	
	String[] target(){
		String str;
		String[] strArr = new String[2];
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("언론사를 찾으시면 [언론사]를");
				System.out.println("이름으로 찾으시면 [이름]을");
				System.out.print("입력해주세요 >> ");
				str = input.next();		
				if("언론사".contains(str)) {
					System.out.print("언론사를 입력 해주세요 >> ");
					strArr[0] = input.next();
				}else if("이름".contains(str)) {
					System.out.print("이름을 입력 해주세요 >> ");
					strArr[1] = input.next();
				}else {
					System.out.println("언론사 또는 이름을 입력바랍니다.");
					continue;
				}
				return strArr;
			} catch (InputMismatchException e) {	
				System.out.println("언론사or이름 으로 검색해주세요");
			}
		}
	}
	
	void search(String[] targets) {
		
		int out_cnt=0;
		
		int targetNum = 0; 
		for(String target : targets) {
			if(target != null) {
				for(String fileName : allData.list()) {
					String[] in_fileNames = fileName.split("_");
					if(in_fileNames[targetNum].contains(target)) {
						out_cnt++;
						System.out.println(out_cnt + "번");
						infoPrint(fileName);
					}
				}
			}
			targetNum++;
		}
	}
	
	void infoPrint(String fileName) {
		
		final String[] MEUN = {"언론사 :\t", "분야 :\t", "이름 :\t", "이메일 :\t"};
		
		try (BufferedReader out = new BufferedReader(
				new FileReader(allData +"\\"+fileName))){
			String line;
			int in_cnt = 0;
			while((line = out.readLine()) != null) {
				System.out.println(MEUN[in_cnt] + line + " ");
				in_cnt++;
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("파일 불러오기 오류");
		}
	}
}
