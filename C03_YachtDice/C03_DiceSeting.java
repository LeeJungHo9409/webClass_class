package C03_YachtDice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_DiceSeting {
	
	int[] playerDice = new int[5];
	Scanner input;
	
	//player의 다이스를 랜덤으로 받음
	public C03_DiceSeting(){
		
		for(int i = 0; i<5; i++) {
			playerDice[i] = (int)(Math.random()*5+1);
		}
	}
	
	//야추에는 다시 뽑기 기능이 있다.
//	C03_DiceSeting turn() {
//		C03_DiceSeting set = new C03_DiceSeting();
//		
//		int remain = 2;
//		
//		while(remain > 0) {
//			System.out.println("1.바꾸기\t2. 안바꾸기");
//			int select = input.nextInt();
//			
//			if(select == 1) {
//				int rNum = -1;
//				System.out.print("다시 던지고 싶은 주사위 번호 >> ");
//				//.hasNextInt 다음에 꺼낼 수 있는 숫자가 있는지 확인 가능한 함수
//				while(rNum < 1 || rNum > 5) {
//					rNum = input.nextInt();
//				}
//				boolean[] rerollable = new boolean[playerDice.length];
//				Arrays.fill(rerollable, true); (포문 돌릴 필요 없이 안에 배열을)
	
//				for(int i = 0; i< rNum; ++i) {
//					int dNum = -1;
//					System.out.printf("주사위 번호(%d/%d) >> ", i + 1, rNum);
//				}	
//			}else {
//				return set;
//			}
//		}
//		return set;
//	}
	
	//다이스 리롤
	public void diceReroll(int num){
		playerDice[num-1] =  (int)(Math.random()*5+1);
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
