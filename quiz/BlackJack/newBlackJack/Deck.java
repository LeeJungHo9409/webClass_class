package quiz.BlackJack.newBlackJack;

public class Deck {

	//객체지향의 장점을 살려서 구현한 코드
	
	//항상 생각해야될 것은 의뢰자가 누구인지이다. 즉, 카지노에서 구현 요청하거로 볼 수 있으니까
	//카지노 외 다른 일반인들이 접근하게 되면 불리해지니까
	
	//1차원 배열 쓴 이유는 단순하게 따로 빼서 쓸 일이 없기에
	private Card[] cards = new Card[Card.SUIT_SIZE * Card.RANK_SIZE * 3];
	// 156개 카드가 생성
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
			System.out.printf("%d번째\n",i);
			cards[i].print();
		}
	}
	
	
	//카드 여부 판단 (위든 아래든)
	private boolean drawable() {
		return top < cards.length - bottom;
	}
	
	//위로 뺀다.
	public Card draw() {
		if(drawable()) {
			return cards[top++];
		}else {
			System.out.println("[INFO] 더 뽑을 카드가 없어서 덱을 다시 섞습니다.");
			shuffle();
			top = 0;
			bottom = 0;
			return cards[top++];
		}
	}
	
	//아래에서 빼고 애는 따로 굳이 안씀.
	public Card underDraw() {
		if(drawable()) {
			return cards[(cards.length-1) - bottom++];
		}else {
			System.out.println("[INFO] 더 뽑을 카드가 없어서 덱을 다시 섞습니다.");
			shuffle();
			top = 0;
			bottom = 0;
			return cards[bottom++];
		}
	}
	
	//156장이 1000번 섞는다. 
	public void shuffle() {
		for(int i = 0; i < 1000; i++) {
			int ran =(int)(Math.random() * (cards.length - 1) + 1);
			
			//객체 카드의 위치를 바꿔준다. 카드 섞는 그림을 머리에 그려보자.
			Card temp = cards[0];
			cards[0] = cards[ran];
			cards[ran] = temp;
		}
	}

}
