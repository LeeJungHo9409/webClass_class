package quiz.BlackJack;

import java.util.Scanner;

public class Player{
	
	Card[] card = new Card[10];
	Scanner input = new Scanner(System.in);
	
	//�÷��̾�
	public Player() {
		System.out.println("�÷��̾�");
		
		//�����Ǹ� ī�� �ΰ� �޽��ϴ�.
		card[0] = new Card();
		card[1] = new Card();
		
		//�ߺ��� ����
		deDuplication(1);
		
		//ī�� ���
		card[0].cardPrint();
		card[1].cardPrint();
		
		System.out.println(getNumberTotal());
	}
	
	//�÷��̾��� ����
	public int getNumberTotal() {
		int sum = 0;
		int number=0;
		for(int i=0; i<card.length; i++) {
			//ī�尪�� null���̸� ���� �� �ʿ� ������ �ݺ����� ����ϴ�.
			if(card[i] == null) {
				break;
			}
			
			//����ڰ� A�� ��������� 1 or 11�� �������ִ� �ڵ��Դϴ�.
			//��Ȥ���� ī����º��� �� ������ ���� �ߴ� ��찡 �ִµ�, ������ ���� ã�� ���߽��ϴ�.
			if(card[i].number == 1) {
				System.out.println("1 or 11 �������ּ���");
				number = input.nextInt();
				if(number == 1 || number == 11) {
					card[i].number = number;
				}else {
					//���� ���ڰ��� ������� �ڷ� ���� �ٽ��ϱ��Դϴ�.
					i--;
					System.out.println("���ڰ��� ������ϴ�. �ٽ� ����ּ���!");
					continue;
				}
			}
			sum += card[i].number;
			if(number == 11) {
				card[i].number = 1;
			}
		}
		
		return sum;
	}
	
	//�ߺ��� ���ſ� �÷��ֽ� ������ ����������, ���۽ÿ��� �÷��̾�� 21�� ���� ���� ��� �����߽��ϴ�.  
	void deDuplication(int count) {
		while(true) {
			if((card[count].number == card[count-1].number &&
					card[count].shape == card[count-1].shape)|| getNumberTotal() > 21) {
				card[count].setDeta();
			}else {
				break;
			}
		}
	}
}
