package quiz.rsp;

//�������� HashMap�� ������ ������,
//���� ������ Ű�� ������ �� �����Ƿ� �̷����� Ŭ������ ����.
public class HandShape {
	
	final public static HandShape ROCK = new HandShape("����", 1);
	final public static HandShape SCISSORS = new HandShape("����", 0);
	final public static HandShape PAPER = new HandShape("��", 2);
	
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
