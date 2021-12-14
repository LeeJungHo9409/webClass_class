package quiz.rsp;

import java.util.HashMap;

public class Rule extends User{
	
	int aiAnswer;
	boolean progres = true;
	String[] game = {"����", "����", "��"};
	
	public Rule() {}
	
	class SamPlay {
		
		/*
		//String.trim() --> ���� ����
			
			private final static Map -> HANDSHAPES
			static{
				HANDSHAPES.put("����", HandShape.SCISSORS)
				~ ���� ���� ��
			}
			Map �̿��ؼ� ����
			 ���ѹݺ� �̿��ؼ� ����� �Է¹����� break;
			 �ȵǸ� �ٽ� ���..
		*/
	}
	public void game() {
		setAi();
		userMeun();
		UserSet();
		
		if(this.answer == -1) {
			System.out.println("���ڹ����� ���� �ʽ��ϴ�. �ٽ� �Է¹ٶ��ϴ�.");
			return;
		}
		
		//�ֵ� �޼ҵ带 ����� ����ϱ�
		
		/*		�� �ڵ�
			���������� ���� ���� -> ���� -> �� -> ����
			�̷� ��ȯ �������� ����������(%)�� ���� ���ȴ�.
			 
			 if((player + 1) % 3) == ai){
			 	//��ǻ�� �̱�
			 }else if((ai + 1) % 3 == player){
			 	//�÷��̾� �̱�
			 }else{
			 	//���
			 }
		 */
		
		// ���ͳ� �ڵ�
		if(this.answer == aiAnswer) {
			System.out.println("���º�");
			this.draw++;
		}else if((this.answer==0 && aiAnswer==2) ||
				(this.answer==1 && aiAnswer==0) ||
				(this.answer==2 && aiAnswer==1)) {
			System.out.println("ai�й�");
			this.win++;
		}else {
			System.out.println("user�й�");
			this.lose++;
			progres = false;
		}
		
		// �� �ڵ�
//		if((aiAnswer == 0 && this.answer == 2) || (aiAnswer == 2 && this.answer == 0)) {
//			int temp = aiAnswer;
//			aiAnswer = this.answer;
//			this.answer = temp;
//		}
//		
//		if(aiAnswer < this.answer) {
//			System.out.println("ai �й�");
//			this.win++;
//		}else if(aiAnswer == this.answer) {
//			System.out.println("���º�");
//			this.draw++;
//		}else {
//			System.out.println("user �й�");
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
