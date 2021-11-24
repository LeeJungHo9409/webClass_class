package C03_YachtDice;

import java.util.Arrays;

public class C03_DiceSeting {
	
	int[] playerDice = new int[5];
	
	//player의 다이스를 랜덤으로 받음
	public C03_DiceSeting(){
		for(int i = 0; i<5; i++) {
			playerDice[i] = (int)(Math.random()*5+1);
		}
	}
	
	public int[] diceRuleSetting() {
		
		int[] diceNumber = new int[6];
		int count = 0;
		
		System.out.println("플레이어의 다이스 : " + Arrays.toString(playerDice));
		
		//다이스에서 1~6까지 반복된 숫자를 배열로 순서대로 저장
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
		
		
		//반복된 숫자의 개수가 저장된 배열을 리턴해줌
		return diceNumber;
	}

}
