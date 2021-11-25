import java.util.Arrays;

/*
	# static (정적 영역(클래스 영역) <==> 인스턴스 영역(각자의 값 가진 영역))
	  
	  - 모든 클래스에서 공통으로 이용되는 객체값들에 붙여주면됨.
	  - static 영역은 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역이다.
	  - 모든 인스턴스가 공동으로 사용하는 자원이 된다.
	  - static 영역은 아무리 인스턴스가 많아도 클래스당 하나밖에 생성도지 않기 때문에
	  	클래스 이름에 .을 찍고 사용할 수 있다. (메모리 단축이 된다.)
	  - static 영역을 통해 메모리를 절약할 수 있다.
	  - static 메소드는 static 자원만을 활용할 수 있는 메서드다.
	  - static 붙은 자원은 인스턴스가 생기기 전에도 활용할 수 있다.
	  - static 영역에선 인스턴스 자원 사용불가.
	  - 인스턴스 영역에서는 static 자원을 사용할 수 있다. (생성되는 순서때문에)

*/
public class C04_Static {
	
	static int beer = 300;
	
	public static void main(String[] args) {
		
//		TrumphCard sk = new TrumphCard(0,13);
//		TrumphCard h10 = new TrumphCard(2,10);
//		
//		sk.height = 600;
//		
//		System.out.println(sk.height);
//		System.out.println(sk.weight);
//		System.out.println(h10.height);
//		System.out.println(h10.weight);
		
		System.out.println("게임의 기본 필드");
		
		System.out.println();
		System.out.println("지속데미지 :\t\t"+Player.commonDamage);
		System.out.println("한턴에 치유되는 힘 :\t"+Player.cure);
		System.out.println();
		
		System.out.println("player1");
		Player p1 = new Player();
		p1.info();
		
		System.out.println();
		
		System.out.println("player2");
		Player p2 = new Player();
		p2.info();
		
	}
}

// class 예제 트럼프카드
//
//class TrumphCard{
//	int number;
//	int suit;
//	static int height = 400;
//	static int weight = 200;
//	
//	public TrumphCard(int number, int suit) {
//		// TODO Auto-generated constructor stub
//		this.number = number;
//		this.suit = suit;
//	}
//	
//	public static void random() {
//		//쉽게 생각했을때 static 애들이 메모리에 들어오고 객체 생성 여부 묻고 그후 성공하면 인스턴스가 만들어진다.
//		//고로 인스턴스는 만들어지지도 않았기 때문에 사용이 불가하다.
//		//static 메소드에서는 인스턴스 변수를 사용 불가.
//		height = 100;
//	}
//}

// 연습문제 : static 자원을 포함한 클래스를 정의해보세요 (너비/높이/크기 금지)

//내구도
class Player{
	static int commonDamage = 0;	//광역 지속데미지
	static int cure = 10;			//자연 치유도 및 마나 재생
	int hp, mp;						//플레이어의 hp,mp
	int externalDamage;				//평타
	boolean live, aumour;			//생존여부, 갑옷상태
	int aumourDurability;			//갑옷 내구도
	
	public Player() {
		hp = (int)(Math.random()*500+1);
		mp = (int)(Math.random()*100+1);
		externalDamage = (int)(Math.random()*30+1); 
		aumourDurability = (int)(Math.random()*50+1);
		aumour = true;
	}
	
	//평타
	int attack() {
		return externalDamage;
	}
	
	//마법
	int magic(int number) {
		Number SINGING_ATTACK = new Number(1);
		Number COUNTINUING_ATTACK = new Number(2);
		switch(number) {
		case 1 :
			mp =- 30;
			return commonDamage++;
		case 2 :
			externalDamage = 200;
			return externalDamage;
		}
		
		return 0;
		
	}
	
	//플레이어 생존 여부
	boolean playerLive() {
		if(hp <= 0) {
			return false;
		}else {
			return true;
		}
	}
	
	void info() {
		System.out.println("HP 		: " + hp);
		System.out.println("MP 		: " + mp);
		System.out.println("DAMAGE 	: " + externalDamage);
		System.out.println("AURMOR 	: " + aumourDurability);
	}
}

class Number{
	int code = 0; 
	public Number(int code) {
		// TODO Auto-generated constructor stub
		this.code = code;
	}
	int codeReturn() {
		return code;
	}
}