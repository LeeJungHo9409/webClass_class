package quiz;
import java.util.Scanner;

public class A08_Elevator {
	
	public static void main(String[] args) {
		
		double elevaWeight=600,							//���������� �ѹ��� 
				add, total, 							//�� ������ ���� ��, ���������� �� ��
				firWeight, secWeight;					//���� 1�� ����, ���� 2�� ����
		Scanner input = new Scanner(System.in);
		
		System.out.print("ù��° ���� ���Ը� �ۼ����ּ��� : ");
		firWeight = input.nextDouble();
		System.out.print("�ι�° ���� ���Ը� �ۼ����ּ��� : ");
		secWeight = input.nextDouble();		

		add = firWeight + secWeight;
		total = elevaWeight - add;

		System.out.printf("�� ������ �ѹ��Դ� : %.2fkg �̰�, ���������� ���Դ� %.2fkg �Դϴ�.\n", add, elevaWeight);
		System.out.printf("���������� ���Կ� �� ������ ���Ͽ� �� ���簡���� ���Դ� %.2fkg�Դϴ�.\n", total);
		
		//if(total > 0) {
		//	System.out.printf("���������� ���Կ� �� ������ ���Ͽ� �� ���簡���� ���Դ� %.2fkg�Դϴ�.\n", total);
		//}else{
		//	System.out.printf("���������� ���Ը� %.2fkg ��ŭ �ʰ��Ͽ� ���̻� ������ �� �����ϴ�.\n", Math.abs(total));
		//}
	}

}
