package C03_YachtDice;

import java.util.Arrays;

public class C03_DiceRule {

	int point;
	
	public C03_DiceRule(int[] diceNumber) {
		// TODO 자동 생성된 생성자 스텁

		int sum=0;
		
		//DiceSeting 클래스의 diceRuleSetting에서 반환된 반복된 숫자들의 개수의 배열(diceNumber)
		//diceNumber 안에 0의 계수 파악하기 위한 변수 zeroCount / 안에 1의 계수를 파악하기 위한 변수 oneCount
		
		int zeroCount = 0;		
		int oneCount = 0;
		
		//타 클래스에서 배열을 가져오게 됐을때 수정이 안네요.. 아직 이유를 찾지 못했습니다.. ㅠㅠ
		//그래서 임시방편으로 새 배열을 만들어 기존에 diceNumber를 넣어뒀습니다.
		//왜냐면 밑에서 설명하겟습니다.
		//배열의 크기를 하나 더 늘려서 배열의 마지막에 '0' 값이 들어가도록 초기화.
		int[] diceNumberReform = new int[6];
		diceNumberReform = diceNumber;
		
		System.out.print("1~6개의 반복된 숫자의 수 : ");
		System.out.println(Arrays.toString(diceNumberReform));
		
		for(int i=0; i<6; i++) {
			if(diceNumberReform[i] == 0) {
				zeroCount++;
			}
			//배열의 크기를 늘린이유는 여기 기존 배열을 쓰게 되었을경우 배열크기가 5까지로 제가 초기 설정을 잘못해놔서입니다..
			//고칠까말까하다가 그냥 하나더 추가했습니다.
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
			//diceNumber값에 '0' 4개면 2개의 배열 인덱스 안에는 반복되는 수(2,3 / 3,2)가 존재
			//고로 풀하우스 조건에 만족
			else if(zeroCount == 4){
				System.out.println("Full House");
				point = 25;
				sum = 0;
				break;
			}
			//diceNumber값에 '1'가 연속해서 5개면 라지 스트레이트 조건에 만족
			else if(oneCount == 4 && diceNumberReform[i+1] == 0){
				System.out.println("Large Straight");
				point = 40;
				sum = 0;
				break;
			}
			//diceNumber값에 '1'가 연속해서 4개면 라지 스트레이트 조건에 만족
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
		
		//sum 값이 0 이 아닐경우는 다른 조건에 만족하는 값이므로 
		if(sum != 0) {
			System.out.println("다이스의 합 : " + sum);
		}
	}
	
	public int vs() {
		return point;
	}
}
