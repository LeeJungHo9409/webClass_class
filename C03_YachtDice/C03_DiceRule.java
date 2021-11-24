package C03_YachtDice;

import java.util.Arrays;

public class C03_DiceRule {

	int point;
	
	public C03_DiceRule(int[] diceNumber) {
		// TODO �ڵ� ������ ������ ����

		int sum=0;
		
		//DiceSeting Ŭ������ diceRuleSetting���� ��ȯ�� �ݺ��� ���ڵ��� ������ �迭(diceNumber)
		//diceNumber �ȿ� 0�� ��� �ľ��ϱ� ���� ���� zeroCount / �ȿ� 1�� ����� �ľ��ϱ� ���� ���� oneCount
		
		int zeroCount = 0;		
		int oneCount = 0;
		
		//Ÿ Ŭ�������� �迭�� �������� ������ ������ �ȳ׿�.. ���� ������ ã�� ���߽��ϴ�.. �Ф�
		//�׷��� �ӽù������� �� �迭�� ����� ������ diceNumber�� �־�׽��ϴ�.
		//�ֳĸ� �ؿ��� �����ϰٽ��ϴ�.
		//�迭�� ũ�⸦ �ϳ� �� �÷��� �迭�� �������� '0' ���� ������ �ʱ�ȭ.
		int[] diceNumberReform = new int[6];
		diceNumberReform = diceNumber;
		
		System.out.print("1~6���� �ݺ��� ������ �� : ");
		System.out.println(Arrays.toString(diceNumberReform));
		
		for(int i=0; i<6; i++) {
			if(diceNumberReform[i] == 0) {
				zeroCount++;
			}
			//�迭�� ũ�⸦ �ø������� ���� ���� �迭�� ���� �Ǿ������ �迭ũ�Ⱑ 5������ ���� �ʱ� ������ �߸��س����Դϴ�..
			//��ĥ����ϴٰ� �׳� �ϳ��� �߰��߽��ϴ�.
			else if(diceNumberReform[i] == 1 && diceNumberReform[i+1] == 1) {
				oneCount++;
			}
			if(diceNumberReform[i]==5) {
				System.out.println("Yacht!");
				point = 50;
				sum = 0;
				break;
			}else if(diceNumberReform[i]==4) {
				System.out.println("Four Dice!");
				point = 17;
				sum = 0;
				break;
			}
			//diceNumber���� '0' 4���� 2���� �迭 �ε��� �ȿ��� �ݺ��Ǵ� ��(2,3 / 3,2)�� ����
			//��� Ǯ�Ͽ콺 ���ǿ� ����
			else if(zeroCount == 4){
				System.out.println("Full House");
				point = 25;
				sum = 0;
				break;
			}
			//diceNumber���� '1'�� �����ؼ� 5���� ���� ��Ʈ����Ʈ ���ǿ� ����
			else if(oneCount == 4 && diceNumberReform[i+1] == 0){
				System.out.println("Large Straight");
				point = 40;
				sum = 0;
				break;
			}
			//diceNumber���� '1'�� �����ؼ� 4���� ���� ��Ʈ����Ʈ ���ǿ� ����
			else if(oneCount == 3 && diceNumberReform[i+1] == 0){
				System.out.println("Small Straight");
				point = 30;
				sum = 0;
				break;
			}else {
				sum+=((i+1)*diceNumberReform[i]);
				point = sum;
			}
		}
		
		//sum ���� 0 �� �ƴҰ��� �ٸ� ���ǿ� �����ϴ� ���̹Ƿ� 
		if(sum != 0) {
			System.out.println("���̽��� �� : " + sum);
		}
	}
	
	public int vs() {
		return point;
	}
}
