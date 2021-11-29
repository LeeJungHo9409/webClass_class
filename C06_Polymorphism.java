import Program.HaelthCare;
import Program.Pokemon;
import Program.Program;

/*

	# 객체의 다형성
	 - 객체는 다양한 형태를 지닐 수 있다.
	 - 경찰은 경찰이기도 하고 사람이기도 하다.
	 - 사람은 사람이지만 경찰은 아닐 수도 있다.
	 
 */

public class C06_Polymorphism {
	
	public static void main(String[] args) {
		
		Program p1 = new Program();
		HaelthCare care = new HaelthCare();
		Program p2 = new HaelthCare();
		
		//자식 타입은 부모 타입이 될 수 있다.(업캐스팅)
		//업캐스팅이 되었을 때는 자식 클래스만이 가지고 있는 기능은 잠시 잊어버린다.
		
		//업캐스팅 된 인스턴스로 자식 클래스에서 오버라이드한 부모 클래스의 메서드를 사용하는 경우
		//오버라이드 한 내용이 실행
		
		//해당 인스턴스가 어떤 클래스의 인스턴스인지 검사할 수 있다.
		System.out.println(p1 instanceof HaelthCare);
		System.out.println(care instanceof HaelthCare);
		System.out.println(p2 instanceof HaelthCare);
		
		Program[] programs = {
				new Program(), new HaelthCare(), new Program(), new HaelthCare(), new Program(), new HaelthCare()
		};
		
		
		//다양성
		for(int i = 0; i<programs.length; i++) {
			if(programs[i] instanceof HaelthCare) {
				// 업캐스팅 된 인스턴스가 원래 기능을 사용하기 위해서는 다운 캐스팅 해야한다.
				((HaelthCare)programs[i]).walk();
			}
		}
		
		execute(new Program());
		execute(new HaelthCare());
		execute(new Pokemon());
	}
	
	public static void execute(Program p) {
		p.create();
	}

}
