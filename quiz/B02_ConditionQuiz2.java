package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		//���ڳ��� ũ�� ���غ���
//			- char Ÿ�� �����ʹ� ��ü�� �������� ���ϰ� �ֱ� ������ ���ڳ����� ũ�� �񱳰� ����
		
		char a,b,c,d,e,f, h;
		String g;
		Scanner input = new Scanner(System.in);
		
		a = 'q';
		System.out.println("1. " + (a == 'q' || a == 'Q'));
		b = 'a';
		System.out.println("2. " + (b != (char)32 || b != (char)9));
		c = 'F';
		System.out.println("3. " + (c >= 48 && c <= 57));
		d = 'i';
		System.out.println("4. " + ((d >= 65 && d <= 90)||(d >= 97 && d <= 122)));
		e = '��';
		System.out.println("5. " + (e >= 0xAC00 && e <= 0xD7AF));
		h = '��';
		System.out.println("5-1. " + ((h>=0x3131 && h<=0x318E) || (h>=0xAC00 && h<=0xD7AF)));
		f = '��';
		System.out.println("6. " + (f >= 0x3040 && f <= 0x31FF));
		
		
		System.out.print("�����÷��� 'exit' �� �Է��ϼ���. ");
		g = input.next();
		System.out.println("7. " + g.equals("exit"));
		
		
		
		
		
		
//		while(true) {
//			System.out.print("�����÷��� 'exit' �� �Է��ϼ���. ");
//			g = input.next();
//			if(g.equals("exit")) {
//				System.out.println("7. " + g.equals("exit"));
//				break;
//			}else {
//				System.out.println("false");
//			}
//		}
		
		
		
		
		
//		System.out.println('A' < 'T');
//		System.out.println('��' < '��');
//		
////		�����ڵ��� 16������ Ȱ���ϱ�
//		System.out.printf("%s\n", Integer.toString(0xAC00,2));
//		System.out.printf("%o\n", 0xAC00);
//		System.out.printf("%d\n", 0xAC00);
//		System.out.printf("%x\n", 0xAC00);
//		System.out.printf("%c\n", 0xAC00);
	}

}
