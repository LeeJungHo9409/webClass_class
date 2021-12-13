package quiz;

public class Rule extends User{
	
	int aiAnswer;
	boolean progres = true;
	String[] game = {"가위", "바위", "보"};
	
	public Rule() {}
	
	void game() {
		setAi();
		userMeun();
		UserSet();
		
		if(this.answer == -1) {
			System.out.println("숫자범위가 맞지 않습니다. 다시 입력바랍니다.");
			return;
		}
		
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
	
	int setGame() {
		this.win = 0;
		this.lose = 0;
		this.draw = 0;
		return 0;
	}
	
	void setAi() {
		aiAnswer = (int)(Math.random()*3);
	}
	
	int getAiAnswer() { return aiAnswer; }
	
	void SetProgres() {
		progres = true;
	}
	
	boolean getProgres() {
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
