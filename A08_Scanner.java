import java.util.Scanner;
public class A08_Scanner {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int num;
		double weight;
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		num = input.nextInt();
		System.out.printf("�Է��� ���� : %d\n", num);
		
		System.out.printf("Apple ������ ���? : ");
		num = input.nextInt();
		System.out.println("���Ű����� " + num + "�� �Դϴ�.");
		
		System.out.print("ȭ���� ���� �Է� : ");
		weight = input.nextDouble();
		System.out.printf("ȭ���� ���� : %.2fkg\n", weight);
	}

}
