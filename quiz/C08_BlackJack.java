package quiz;

import quiz.BlackJack.Dealer;
import quiz.BlackJack.Rule;

/*
	# ������ ��������
	  1. ��ǻ��(����)�� ���(�÷�����)�� ī�带 �̴´�.
	  2. ó������ �� ��� 2�徿 �޴´�. �̶� ������ ī��� ���� �������´�.
	  3. �÷��̾�� ��Ȳ�� ���� �� ������(hit) ���⼭ ��������(stand) �����Ѵ�.
	  4. �÷��̾ ���߸� ������ ������ �ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 �̴´�.
	    (������ �ݵ�� ī�� ���� 16 �����϶� ������ �̰�, 17�̻��̸� ������ ����� �Ѵ�.)
	  5. �÷��̾��� ī�� ���ڵ��� ���� �������� ���ų� ��Ȯ�ϰ� 21�̶�� �¸��Ѵ�.
	     �÷��̾��� ī�� ���ڵ��� ���� 21���� ũ�� �й��Ѵ�. (A~K)
	  6. A�� 1�� �� ���� �ְ� 11�� �� ���� �ִ�.
	  
	  www.247blackjack.com
 */

public class C08_BlackJack {
	
	public static void main(String[] args) {
		
		Dealer d1 = new Dealer();
		Rule rule = new Rule();
		
		//������� ����ϱ� ���� �ۼ��� �ڵ��Դϴ�.
		System.out.println("=======================");
		d1.dealerCardPrint(); 					//���� ī�� �� ���
		rule.playerCardPrint();					//�÷��̾� ī�� �� ���
		rule.result(rule.getNumberTotal(), d1.getNumberTotal()); //����� ���
	}
}
