/*
	# 추상 클래스(abstract class)
	
	  - 메서드의 형태만 만들어 놓고 완성은 자식 클래스에게 미루는 클래스
	  - 선언만 되어있는 추상 메서드가 포함된 클래스
	  
	# 추상 메서드(abstract method)
	
	  - 선언만 되어 있고 몸통이 없는 메서드
	  - abstract가 붙어 있는 메서드는 body를 직접 추가할 수 없다.
	  - 반드시 상속받은 후 자식 클래스에서 오버라이드하여 구현해야 한다.
	  - abstract 메소드를 구현하지 않은 클래스는 인스턴스화 할 수 없다.
 */
public class C07_Abstract {
	
	public static void main(String[] args) {
		test(new Teemo());
		System.out.println();
		test(new Jinx());
		test(new SurfingSinged());
	}
	
	public static void test(Champion champion) {
		champion.q_skill();
		champion.w_skill();
		champion.e_skill();
		champion.r_skill();
	}

}

//추상 클래스
abstract class Champion{
	int ad;
	int ap;
	int def;
	int hp;
	int mp;
	
	abstract void q_skill();
	abstract void w_skill();
	abstract void e_skill();
	abstract void r_skill();
//	abstract void ctrl1();
//	abstract void ctrl2();
//	abstract void ctrl3();
//	abstract void ctrl4();
}


//다 구현해야 인스턴스화가 가능하다.
abstract class Singed extends Champion{

	@Override
	void q_skill() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("방귀대장 뿡뿡뿡!");
	}	
}

class SurfingSinged extends Singed{

	@Override
	void w_skill() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("초강력 접착제");
	}

	@Override
	void e_skill() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("던져넘기기");
	}

	@Override
	void r_skill() {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("광기의 물약");
	}
	
}

class Jinx extends Champion{
	boolean weapon;
	void q_skill() {
		if(weapon) {
			System.out.println("휘릭휘릭! 빵야빵야!");
		}else {
			System.out.println("휘릭휘릭! 생선 대가리!");
		}
	}
	void w_skill() {
		System.out.println("빠직!");
	}
	void e_skill() {
		System.out.println("와작와작 뻥!");
	}
	void r_skill() {
		System.out.println("초강력 초토화 로켓!");
	}
}

class Teemo extends Champion{
	void q_skill() {
		System.out.println("이제 누가 장님이지?");
	}
	void w_skill() {
		System.out.println("하하핫! 하하하핫! 잡아봐!");
	}
	void e_skill() {
		System.out.println("독데엠!");
	}
	void r_skill() {
		System.out.println("띄모는 그저 버섯 농사꾼이에요..");
	}
}
