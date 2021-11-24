package C03_YachtDice;

import java.util.Arrays;

/*
	# Yacht Dice�� ��������
		
		Class DiceSeting - playerDice[5]
		1. �÷��̾�� �ڱ� ���ʿ� �ټ� ���� �ֻ����� ������.(�ֻ��� ���� 1~6)
		
		Class DiceRule
		2. �ټ� ���� �ֻ����� ����� ���� ������ �����ؾ��Ѵ�.
			
			- game win rule -
			(1) Ǯ�Ͽ콺 (���� ���� 2�� or 3��)
			(2) ���� ��Ʈ����Ʈ (4���� ������� ex. 1234 / 2345)
			(3) ���� ��Ʈ����Ʈ (5���� ������� ex. 12345 / 23456)
			(4) 4 ���̽� (���� ���� 4��)
			(5) Yacht (���� ���� 5��)
			
			- info -
			(6) �ƹ��͵� �������� ���� ��� �ֻ��� �� ������ ������ ����.
		
		3. �÷��̾�� �ٽ� ������ ���� �ֻ����� ��� �ٽ� ���� �� �ִ�.
 */

public class C03_YachtDice {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int i = 0;
		while(i<10) {
			C03_DiceSeting diceSet1 = new C03_DiceSeting();
			C03_DiceSeting diceSet2 = new C03_DiceSeting();
			C03_DiceRule rule1 = new C03_DiceRule(diceSet1.diceRuleSetting());
			C03_DiceRule rule2 = new C03_DiceRule(diceSet2.diceRuleSetting());
			
			if(rule1.vs() > rule2.vs()){
				System.out.println("1�� Player Win");
			}else if(rule1.vs() == rule2.vs()){
				System.out.println("���׿�!");
			}else{
				System.out.println("2�� Player Win");
			}
			i++;
			System.out.println();
		}

	}

}
