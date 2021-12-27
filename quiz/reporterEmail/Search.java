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
		
		while(!("����".contains(str))) {
			search(target());
			System.out.println("���Ḧ ���Ͻø� '����'�� ���ּ���.");
			System.out.print(">> ");
			str = input.next();
		}
		System.out.println("�����մϴ�.");
	}
	
	String[] target(){
		String str;
		String[] strArr = new String[2];
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("��л縦 ã���ø� [��л�]��");
				System.out.println("�̸����� ã���ø� [�̸�]��");
				System.out.print("�Է����ּ��� >> ");
				str = input.next();		
				if("��л�".contains(str)) {
					System.out.print("��л縦 �Է� ���ּ��� >> ");
					strArr[0] = input.next();
				}else if("�̸�".contains(str)) {
					System.out.print("�̸��� �Է� ���ּ��� >> ");
					strArr[1] = input.next();
				}else {
					System.out.println("��л� �Ǵ� �̸��� �Է¹ٶ��ϴ�.");
					continue;
				}
				return strArr;
			} catch (InputMismatchException e) {	
				System.out.println("��л�or�̸� ���� �˻����ּ���");
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
						System.out.println(out_cnt + "��");
						infoPrint(fileName);
					}
				}
			}
			targetNum++;
		}
	}
	
	void infoPrint(String fileName) {
		
		final String[] MEUN = {"��л� :\t", "�о� :\t", "�̸� :\t", "�̸��� :\t"};
		
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
			System.out.println("���� �ҷ����� ����");
		}
	}
}
