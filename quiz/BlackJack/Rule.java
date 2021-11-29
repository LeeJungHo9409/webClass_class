package quiz.BlackJack;

import java.util.Scanner;

public class Rule extends Player{
	
	
	Scanner input = new Scanner(System.in);
	int count=1;
	
	//���ӷ길 ���� ����� �׽��ϴ�. 
	//Player Ŭ������ ��ӹ��� ������ ��κ� �÷��̾� ���ַ� ¥�� ���� Ȱ��Ǳ⿡ ��ӹ޾ҽ��ϴ�.
	public Rule() {
		
		String answer;
		
		//�ޱ� �Ȱų� 21�� �ѱ������� ��� ������ ���� �ݺ����Դϴ�.
		while(true) {
			System.out.println("���� �� �����ðڽ��ϱ�?");
			System.out.print("�����ǲ��� 'hit'�� ���Ⲩ�� 'stand'�� �Է����ּ��� >> ");
			
			answer = input.next();

			//��信 ���� ���� �����ϴ�.
			if(goStop(answer) == false) {
				System.out.println("Game Over");
				break;
			}
			
			//������ �÷��̾ hit�� �������� ������ �Ѿ����� ���� �� �ʿ䰡 ���⿡ �ݺ����� �����մϴ�.
			if(getNumberTotal() > 21) {
				break;
			}
		}
		
	}
	
	//hit / stand �޼ҵ带 �ۼ��߽��ϴ�.
	boolean goStop(String answer) {
		
		System.out.println(answer);
		
		if(answer.equals("stand") || answer.equals("STAND")) {
			return false;
		}else {
			//hit ���� ��� ���ο� ī�带 �޽��ϴ�.
			count++;
			System.out.println("���� ī��� >> "+ (count+1));
			card[count] = new Card();
			card[count].cardPrint();;
			System.out.println(getNumberTotal());
			return true;
		}
	}
	
	//��� ��� �޼ҵ� �Դϴ�.
	//������ ���հ� �÷��̾��� ������ �޾ƿ� �����մϴ�.
	public void result(int pTotal, int dTotal) {
		
		System.out.printf("PLAYER >> %d\n", pTotal);
		System.out.printf("DEALER >> %d\n", dTotal);
		
		if(pTotal > 21) {
			System.out.println("DEALER WIN!");
		}else if(dTotal > 21){
			System.out.println("PLAYER WIN!");
		}else if(pTotal < dTotal) {
			System.out.println("DEALER WIN!");
		}else if(pTotal == dTotal){
			System.out.println("DRAW!");
		}else if(pTotal > dTotal){
			System.out.println("PLAYER WIN!");
		}
	}
	
	//�÷��̾��� ī�带 Player Ŭ�������� �ҷ��ɴϴ�.
	public void playerCardPrint() {
		System.out.println("PLAYER");
		for(int i=0; i<card.length;i++) {
			if(card[i] == null) {
				break;
			}
			card[i].cardPrint();
		}
	}
}
