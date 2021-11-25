/*
	# 클래스 상속 (확장)
	  - 예전에 만들어 두었던 클래스를 그대로 물려받아서 사용하는 것
	  - 물려받은 후에는 부모클래스에 있던 기능을 그대로 사용하거나,
	  	마음대로 고쳐 사용 가능 (오버라이드)
	  - 자식 클래스에는 부모 클래스에 없는 새로운 기능을 추가할 수도 있다.
	
	# 상속의 문법
	  - class 클래스명 extends 부모클래스명
	  - 생성자에서 반드시 가장 먼저 부모 클래스의 생성자(super())를 호출해야 한다.
	    (생략한다면 부모의 기본 생성자를 사용한다)
	  - 부모클래스와 자식클래스의 똑같은 이름의 자원(자원,메소드)이 있다면
	    super랑 this로 명확하게 구분할 수 있다.
*/
public class C05_Extend {
	public static void main(String[] args) {
		Person p1 = new Person("mag", 10);
		Person p2 = new Person("gg", 17);
		FireFighter f1 = new FireFighter("wa", 30);
		Police popo1 = new Police();
		Police popo2 = new Police("박경찰", 40);
		
		//부모타입을 요구하는 자리에 자식 타입 인스턴스가 들어갈 수 있다.
		popo1.arrest(p1);
		popo1.arrest(p2);
		popo1.arrest(f1);
		popo1.arrest(popo1);
		
		//자식타입을 요구하는 자리에 부모 타입 인스턴스는 들어갈 수 없다.
		popo2.duo(popo1);
	
		//up / down 캐스팅
		/*		
			# 업 캐스팅 : 자식 클래스가 부모 클래스로 타입 캐스팅되는 것
			# 다운 캐스팅 : 부모 클래스가 자식 클래스로 타입 캐스팅 되는 것	
				
		*/
		
		//Police popo3 = new Person("이순경",21); //일반적인 경우 다운캐스팅은 불가능한다.
		
		//자식 클래스는 부모 클래스로 업캐스팅 될 수 있지만 업캐스팅 된 상태에서는 원래 기능을 잊어버린다.
		Person p3 = new FireFighter("김소방", 31); // 업 캐스팅 (보임해직) 
		
		//업캐스팅 되었던 자식 클래스는 다시 원래 자신의 클래스로 다운캐스팅 가능
		FireFighter f3 = (FireFighter) p3; // 다운 캐스팅 (재직)
		f3.dispatch("자갈치시장");
		
		
		p1.sayHi();
		p2.sayHi();
		
		f1.sayHi();
		f1.dispatch("이젠컴퓨터학원");
		
		popo1.sayHi();
	}
}

//부모클래스
class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.age = age;
	}
	
	void sayHi() {
		System.out.println("안녕 나는 "+name+"이고, 나이는 " + age + "살 이얌 ");
	}
}

//자식클래스
class FireFighter extends Person{
	
	public FireFighter(String name, int age) { super(name,age); } //super는 부모한테 보내주는 방법
	
	//부모에 없는 새로운 기능 추가
	void dispatch(String buildding) {
		System.out.println("소방관 " + name + " 씨는 " + buildding + "으로 출동했습니다.");
	}
}

class Police extends Person{
	public Police() { super("김경찰", 25); }
	public Police(String name, int age) { super(name, age); }
	
	@Override
	void sayHi() { System.out.println("영장 나왔습니다."); }
	
	public void arrest(Person supect) {
		//this는 같은 클래스 안에 this가 가르키는 변수가 없을 경우 부모의 변수를 가르키게됨.
		System.out.printf("%s 경찰관은 용의자 %s 씨를 체포했습니다.\n",this.name, supect.name);
	}
	public void duo(Police police) {
		System.out.printf("%s 경찰관과 %s 경찰관은 함께 수사를 진행했습니다.\n",name, police.name);
	}
}