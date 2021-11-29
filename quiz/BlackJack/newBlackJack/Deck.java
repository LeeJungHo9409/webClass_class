package quiz.BlackJack.newBlackJack;

public class Deck {

	//��ü������ ������ ����� ������ �ڵ�
	
	//�׻� �����ؾߵ� ���� �Ƿ��ڰ� ���������̴�. ��, ī���뿡�� ���� ��û�ϰŷ� �� �� �����ϱ�
	//ī���� �� �ٸ� �Ϲ��ε��� �����ϰ� �Ǹ� �Ҹ������ϱ�
	
	//1���� �迭 �� ������ �ܼ��ϰ� ���� ���� �� ���� ���⿡
	private Card[] cards = new Card[Card.SUIT_SIZE * Card.RANK_SIZE * 3];
	// 156�� ī�尡 ����
	int top=0, bottom=0;
	
	public Deck() {
		
		for(int i=0, index=0; i < 3; i++) {
			for(int suit=0;suit<Card.SUIT_SIZE;suit++) {
				for(int rank =0; rank<Card.RANK_SIZE; rank++) {
					cards[index++] = new Card(suit, rank);
				}
			}
		}
		
		shuffle();
	}
	
	public void printAll() {
		for(int i=0; i<cards.length; i++) {
			System.out.printf("%d��°\n",i);
			cards[i].print();
		}
	}
	
	
	//ī�� ���� �Ǵ� (���� �Ʒ���)
	private boolean drawable() {
		return top < cards.length - bottom;
	}
	
	//���� ����.
	public Card draw() {
		if(drawable()) {
			return cards[top++];
		}else {
			System.out.println("[INFO] �� ���� ī�尡 ��� ���� �ٽ� �����ϴ�.");
			shuffle();
			top = 0;
			bottom = 0;
			return cards[top++];
		}
	}
	
	//�Ʒ����� ���� �ִ� ���� ���� �Ⱦ�.
	public Card underDraw() {
		if(drawable()) {
			return cards[(cards.length-1) - bottom++];
		}else {
			System.out.println("[INFO] �� ���� ī�尡 ��� ���� �ٽ� �����ϴ�.");
			shuffle();
			top = 0;
			bottom = 0;
			return cards[bottom++];
		}
	}
	
	//156���� 1000�� ���´�. 
	public void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int ran =(int)(Math.random() * (cards.length - 1) + 1);
			
			//��ü ī���� ��ġ�� �ٲ��ش�. ī�� ���� �׸��� �Ӹ��� �׷�����.
			Card temp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = temp;
		}
	}

}
