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
			System.out.print("�̸� : ");
			name = inputTxt.next();
			temp[0] = name;
			System.out.print("���� : ");
			age = inputTxt.nextInt();
			name = Integer.toString(age);
			System.out.println(name);
			temp[1] = name;//Integer.toString(age);
			System.out.print("��ȭ��ȣ : "); 
			tel = inputTxt.next();
			System.out.print("Ű : ");
			key = inputTxt.nextDouble();
			System.out.print("������ : ");
			wi = inputTxt.nextDouble();
			System.out.print("������ : ");
			h = inputTxt.next();
			
			mebNum++;
			
			for(int i=0; i<mebNum; i++) {
				System.out.println("======== ��� ȭ�� =======");
				System.out.println("�̸�\t: " + temp[0]);
				System.out.println("����\t: " + temp[1]);
				System.out.println("��ȭ��ȣ\t: " + temp[2]);
				System.out.println("������\t: " + temp[3]);
				System.out.println("������\t: " + temp[4]);
			}
			
			break;
		}
		
	}

}
