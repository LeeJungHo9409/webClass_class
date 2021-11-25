package C03_YachtDice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_DiceSeting {
	
	int[] playerDice = new int[5];
	Scanner input;
	
	//player�� ���̽��� �������� ����
	public C03_DiceSeting(){
		
		for(int i = 0; i<5; i++) {
			playerDice[i] = (int)(Math.random()*5+1);
		}
	}
	
	//���߿��� �ٽ� �̱� ����� �ִ�.
//	C03_DiceSeting turn() {
//		C03_DiceSeting set = new C03_DiceSeting();
//		
//		int remain = 2;
//		
//		while(remain > 0) {
//			System.out.println("1.�ٲٱ�\t2. �ȹٲٱ�");
//			int select = input.nextInt();
//			
//			if(select == 1) {
//				int rNum = -1;
//				System.out.print("�ٽ� ������ ���� �ֻ��� ��ȣ >> ");
//				//.hasNextInt ������ ���� �� �ִ� ���ڰ� �ִ��� Ȯ�� ������ �Լ�
//				while(rNum < 1 || rNum > 5) {
//					rNum = input.nextInt();
//				}
//				boolean[] rerollable = new boolean[playerDice.length];
//				Arrays.fill(rerollable, true); (���� ���� �ʿ� ���� �ȿ� �迭��)
	
//				for(int i = 0; i< rNum; ++i) {
//					int dNum = -1;
//					System.out.printf("�ֻ��� ��ȣ(%d/%d) >> ", i + 1, rNum);
//				}	
//			}else {
//				return set;
//			}
//		}
//		return set;
//	}
	
	//���̽� ����
	public void diceReroll(int num){
		playerDice[num-1] =  (int)(Math.random()*5+1);
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
