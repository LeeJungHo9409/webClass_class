package quiz;
import java.io.PrintStream;
import java.util.Scanner;

public class A03_VarTypesQuiz {

	public static void main(String[] args) {
		String name, tel;
		int age;
		double key, wi;
		String h;
		int mebNum=0;
		String[] temp = {""};
		
		Scanner inputTxt = new Scanner(System.in);
		
		while(true) {
			System.out.print("이름 : ");
			name = inputTxt.next();
			temp[0] = name;
			System.out.print("나이 : ");
			age = inputTxt.nextInt();
			name = Integer.toString(age);
			System.out.println(name);
			temp[1] = name;//Integer.toString(age);
			System.out.print("전화번호 : "); 
			tel = inputTxt.next();
			System.out.print("키 : ");
			key = inputTxt.nextDouble();
			System.out.print("몸무게 : ");
			wi = inputTxt.nextDouble();
			System.out.print("혈액형 : ");
			h = inputTxt.next();
			
			mebNum++;
			
			for(int i=0; i<mebNum; i++) {
				System.out.println("======== 출력 화면 =======");
				System.out.println("이름\t: " + temp[0]);
				System.out.println("나이\t: " + temp[1]);
				System.out.println("전화번호\t: " + temp[2]);
				System.out.println("몸무게\t: " + temp[3]);
				System.out.println("혈액형\t: " + temp[4]);
			}
			
			break;
		}
		
	}

}
