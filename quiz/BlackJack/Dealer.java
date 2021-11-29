package quiz.BlackJack;

import java.util.Scanner;

//���� npc
public class Dealer{
	//���� ������ ������� ������ �޾� �����ϴ� ����
	int progress;
	Scanner input = new Scanner(System.in);
	
	//��ü�迭 �����߰� ����� �������� ���� �ȿ� 10���� �����ص׽��ϴ�.
	//������ ī�带 ��ӹ޾Ƽ� �Ϸ��� �ߴµ� ��ü�迭 ������ ���� �� �ʿ䰡 ���� �����ؼ� ��� �����߽��ϴ�.
	Card[] card = new Card[10];
	
	public Dealer() {
		// TODO �ڵ� ������ ������ ����
		System.out.println("����");
		
		//�÷��ֽ� ������ ���������� ������ hit�� �ϴ°� ���� �����غý��ϴ�.
		for(int i=0;i<card.length;i++) {
			card[i] = new Card();
			
			//0~1 ���� �ϳ��� ������ 1�� ��� hit �ƴҰ�� stand
			progress = (int)(Math.random()*2);
			if(i!=0 && progress == 1) {
				
				//�ߺ����� �����ߴµ� ���� �ѹ��� �����ƽ��ϴ�...
				//������ �Ҷ�ϱ� ����������.. ����;;
				deDuplication(i);
				break;
			}
		}
		
		//������ ó�� ī�� ������ �����ϹǷ�..
		card[0].cardPrint();
		cardPrint();
	}
	
	//�������� �ʴ� ī�� ǥ��
	public void cardPrint(){
		System.out.println("��������������������������");
		System.out.println("��           ��");
		System.out.println("��           ��");
		System.out.println("��     X     ��");
		System.out.println("��           ��");
		System.out.println("��           ��");
		System.out.println("��           ��");
		System.out.println("��������������������������");
	}
	
	
	//������ �Ѱ��� ���ϴ� �޼ҵ�
	public int getNumberTotal() {
		int sum=0;
		int temp=0;
		for(int i=0; i<card.length;i++) {
			if(card[i] == null) {
				break;
			}
			if(card[i].number == 1) {
				
				//�����̽� 1�� ��� ������ 11�� ���� 1�� ���� �����ϴ� �ڵ��Դϴ�.
				progress = (int)(Math.random()*2);
				if(progress == 0) {
					card[i].number = 1;
				}else {
					temp = 11;
					card[i].number = 11;
				}
			}
			
			sum += card[i].number;
			if(temp == 11) {
				card[i].number = 1;
			}
		}
		return sum;
	}
	
	//�ߺ����� �޼ҵ�
	void deDuplication(int count) {
		while(true) {
			if((card[count].number == card[count-1].number &&
					card[count].shape == card[count-1].shape)) {
				card[count].setDeta();
				
			}else {
				break;
			}
		}
	}
	
	//ī�� ���
	public void dealerCardPrint() {
		System.out.println("DEALER");
		for(int i=0; i<card.length;i++) {
			if(card[i] == null) {
				break;
			}
			card[i].cardPrint();
		}
	}
}
