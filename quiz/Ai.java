package quiz;

public class Ai {
	int answer;
	public Ai() { answer = (int)(Math.random()*3); }
	
	int getAnswer() { return answer; }
}
