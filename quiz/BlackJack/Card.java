package quiz.BlackJack;

import java.util.Arrays;


//Card�� ���������� ī�带 ����ϴ� Ŭ����
public class Card {
	int shape;						//Ʈ����ī�� ���
	int number;						//Ʈ����ī�� ����
	
	public Card() {
		shape = (int)(Math.random()*4+1);		//Ʈ���� ����� 4�����̹Ƿ�
		number = (int)(Math.random()*13+1);		//K=13, Q=12, J=11, A=1 ���� 13��
	}
	
	//ī�����
	public void cardPrint() {
		System.out.println("��������������������������");
		switch(shape) {
		case 1:
			System.out.println( "��         �� ��");
			break;
		case 2:
			System.out.println( "��         �� ��");
			break;
		case 3:
			System.out.println( "��         �� ��");
			break;
		case 4:
			System.out.println( "��         �� ��");
			break;
		}
		System.out.println("��           ��");
		System.out.println("��           ��");
		
		switch(number) {
		case 1:
			System.out.println( "��     A     ��");
			break;
		case 11:
			System.out.println( "��     J     ��");
			break;
		case 12:
			System.out.println( "��     Q     ��");
			break;
		case 13:
			System.out.println( "��     K     ��");
			break;
		default:
			System.out.printf( "��    %2d     ��\n", number);
			break;
		}
		
		
		System.out.println("��           ��");
		System.out.println("��           ��");
		System.out.println("��������������������������");
	}
	
	//�� ������ �޾ƿ���
	public void setDeta() {
		shape = (int)(Math.random()*4+1);
		number = (int)(Math.random()*13+1);
	}
}
