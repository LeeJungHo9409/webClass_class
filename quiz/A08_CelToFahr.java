package quiz;
import java.util.Scanner;

public class A08_CelToFahr {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//���� celsius, ȭ�� fahrenheit
		double cel, fah;
		
		System.out.print(" '��' �� �Է����ּ��� : ");
		cel = input.nextDouble();
		System.out.printf("�Է��Ͻ� '��' : %.1f�� �Դϴ�.\n", cel);
		
		//���� ���� : (����*1.8)+32
		fah = (cel*1.8)+32;
		
		System.out.printf("��ȯȭ�� '��'�� %.1f�� �Դϴ�.\n", fah);
		
	}
}
