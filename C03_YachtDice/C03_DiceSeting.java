package C03_YachtDice;

import java.util.Arrays;

public class C03_DiceSeting {
	
	int[] playerDice = new int[5];
	
	//player�� ���̽��� �������� ����
	public C03_DiceSeting(){
		for(int i = 0; i<5; i++) {
			playerDice[i] = (int)(Math.random()*5+1);
		}
	}
	
	public int[] diceRuleSetting() {
		
		int[] diceNumber = new int[6];
		int count = 0;
		
		System.out.println("�÷��̾��� ���̽� : " + Arrays.toString(playerDice));
		
		//���̽����� 1~6���� �ݺ��� ���ڸ� �迭�� ������� ����
		for(int i=1; i<=6; i++) {
			for(int j = 0; j<playerDice.length; j++) {
				if(i == playerDice[j]) {
					diceNumber[i-1]++;
					count++;
				}
			}
			if(count >= 5) {
				break;
			}
		}
		
		
		//�ݺ��� ������ ������ ����� �迭�� ��������
		return diceNumber;
	}

}
