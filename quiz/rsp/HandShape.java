package quiz.rsp;

//기존에는 HashMap을 쓰려고 했으나,
//맵은 값으로 키를 적용할 수 없으므로 이런경우는 클래스가 좋다.
public class HandShape {
	
	final public static HandShape ROCK = new HandShape("바위", 1);
	final public static HandShape SCISSORS = new HandShape("가위", 0);
	final public static HandShape PAPER = new HandShape("보", 2);
	
	private int value;
	private String name;
	
	private HandShape(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public HandShape of(String name, int value) {
		return new HandShape(name, value);
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
}
