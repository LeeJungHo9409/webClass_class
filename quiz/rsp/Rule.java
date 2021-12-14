package quiz.rsp;

import java.util.HashMap;

public class Rule extends User{
	
	int aiAnswer;
	boolean progres = true;
	String[] game = {"가위", "바위", "보"};
	
	public Rule() {}
	
	class SamPlay {
		
		/*
		//String.trim() --> 공백 제거
			
			private final static Map -> HANDSHAPES
			static{
				HANDSHAPES.put("가위", HandShape.SCISSORS)
				~ 가위 바위 보
			}
			Map 이용해서 구현
			 무한반복 이용해서 제대로 입력받으면 break;
			 안되면 다시 출력..
		*/
	}
	public void game() {
		setAi();
		userMeun();
		UserSet();
		
		if(this.answer == -1) {
			System.out.println("숫자범위가 맞지 않습니다. 다시 입력바랍니다.");
			return;
		}
		
		//애도 메소드를 만들어 사용하기
		
		/*		샘 코딩
			가위바위보 결정 가위 -> 바위 -> 보 -> 가위
			이런 순환 구조에는 나머지계산법(%)가 많이 사용된다.
			 
			 if((player + 1) % 3) == ai){
			 	//컴퓨터 이김
			 }else if((ai + 1) % 3 == player){
			 	//플레이어 이김
			 }else{
			 	//비김
			 }
		 */
		
		// 인터넷 코딩
		if(this.answer == aiAnswer) {
			System.out.println("무승부");
			this.draw++;
		}else if((this.answer==0 && aiAnswer==2) ||
				(this.answer==1 && aiAnswer==0) ||
				(this.answer==2 && aiAnswer==1)) {
			System.out.println("ai패배");
			this.win++;
		}else {
			System.out.println("user패배");
			this.lose++;
			progres = false;
		}
		
		// 내 코딩
//		if((aiAnswer == 0 && this.answer == 2) || (aiAnswer == 2 && this.answer == 0)) {
//			int temp = aiAnswer;
//			aiAnswer = this.answer;
//			this.answer = temp;
//		}
//		
//		if(aiAnswer < this.answer) {
//			System.out.println("ai 패배");
//			this.win++;
//		}else if(aiAnswer == this.answer) {
//			System.out.println("무승부");
//			this.draw++;
//		}else {
//			System.out.println("user 패배");
//			this.lose++;
//			progres = false;
//		}
//		
		resultPrint();
	}
	
	public int setGame() {
		this.win = 0;
		this.lose = 0;
		this.draw = 0;
		return 0;
	}
	
	void setAi() {
		aiAnswer = (int)(Math.random()*3);
	}
	
	int getAiAnswer() { return aiAnswer; }
	
	public void SetProgres() {
		progres = true;
	}
	
	public boolean getProgres() {
		return progres;
	}
	
	void resultPrint() {
			System.out.printf("[ai] %s : [user]%s\n", 
					game[getAiAnswer()], game[getAnswer()]);	
	}
	
	void userMeun(){
		
		System.out.print("[");
		for(int i = 0 ; i<game.length; i++) {
			System.out.printf("%d. %s ", i+1, game[i]);
		}
		System.out.print("]\n");
	}
}
