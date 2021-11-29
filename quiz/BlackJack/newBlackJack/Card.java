package quiz.BlackJack.newBlackJack;

public class Card {
	final public static int SUIT_SIZE = 4;
	final public static int RANK_SIZE = 13;
	
	private static char[] SUITS = {'��','��','��','��'};
	private static String[] RANKS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private static int[] VAULE_RANK = {11,2,3,4,5,6,7,8,9,10,10,10,10};
	
	private int suit;		//0~3
	private int rank;		//0~12
	
	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	public void print() {
		System.out.println("��������������������������");
		System.out.printf("��         %c ��\n", SUITS[suit]);
		System.out.println("��           ��");
		System.out.println("��           ��");
		System.out.printf("��    %2s     ��\n", RANKS[rank]);
		System.out.println("��           ��");
		System.out.println("��           ��");
		System.out.println("��������������������������");
	}
	
	public char getSuit() {
		return SUITS[suit];
	}
	
	public String getRank() {
		return RANKS[rank];
	}
	
	public int rankVaule() {
		return VAULE_RANK[rank];
	}
}
