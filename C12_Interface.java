
/*
	# 인터페이스 (Interface)
	
	  - 자바는 클래스 상속을 여러개 받을 수 없다
	  - 인터페이스는 해당 클래스에 여러가지 형태(업캐스팅)을 부여하기 위해서는 인터페이스를 사용해야 한다.
	  - 인터페이스 내부의 메서드는 기본적으로 abstract public 메서드가 된다.
	  - 고로 실제 구현이 불가하다.
	  - 인터페이스 내부의 변수는 기본죽어로 final static이 된다.
	  - 메서드 앞에 default를 붙이면 오버라이드 하지 않았을 때의 기본 동작을 정의할 수 있다.
 */

public class C12_Interface {
	public static void main(String[] args) {
		Runner run = new DanceExpert();
		Swimmer swim = new DanceExpert();
		Dancer dance = new DanceExpert();
		Human human = new DanceExpert();
	}
	
}

//설계도
interface Clickable{
	void click();
}

interface Kickable{
	void kick();
}

class AppleTree implements Clickable, Kickable{
	@Override  //(몸둥아리 생성)
	public void click() { System.out.println("사과나무를 클릭해서 사과를 수확");}
	@Override
	public void kick() { System.out.println("사과나무 바롤 차서 더 많은 사과를 수확");}
}

//interface는 abstract public 숨어있음.
interface Runner{
	//interface 안의 변수는 final static 숨어있다.
	int num = 10; 
	//인터페이스는 인스턴스화가 불가하다. 즉 불러올 수 없다.
	default void run() { System.out.println("기본 달리기 능력 쩔음"); }
	void walk();
}
interface Dancer{
	abstract void dance();
}


abstract class Swimmer{
	abstract void swim();
}

class Salmon extends Swimmer{
	public Salmon() { swim(); }
	@Override
	void swim() { System.out.println("지느러미"); }
}

abstract class Human extends Swimmer implements Runner, Dancer{
	
	public Human() {
		swim();
		run();
		walk();
	}
	
	@Override
	void swim() { System.out.println("손발"); }
	
	@Override
	public void run() { System.out.println("사람은 달리다"); }
	
	@Override
	public void walk() { System.out.println("사람은 걷는다"); }
	
	@Override
	public void dance() {System.out.println("춤을 추다");}
}

class DanceExpert extends Human{
	@Override
	public void dance() {System.out.println("춤 좀 추는듯?");}
}

class DanceBeginner extends Human{
	@Override
	public void dance() {System.out.println("춤에 대해 열정은 넘치는 듯?");}
}