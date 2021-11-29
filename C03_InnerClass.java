
/*
	# 클래스 내부에 클래스 사용하기
	
	  - 클래스 내부에도 클래스를 정의하고 사용할수 있다.
	  - 클래스 내부에 존재하는 클래스는 바깥쪽 클래스의 인스턴스가 존재해야 사용할 수 있다.
	  
 */
public class C03_InnerClass {
	public static void main(String[] args) {
		//스택틱 inner 클래스
		new OuterClass.StaticInnerClass();
		
		//인스턴스 inner 클래스
		new OuterClass().new InnerClass();
	}
}


class OuterClass{
	int a;
	int b;
	
	//모든 인스턴스에서 동일하게 사용 가능하다.
	//생성 동시에 사용 가능
	//클래스안에 클래스들은 일반 메소드처럼 private.. 와 같은 애들 사용가능 
	
	static class StaticInnerClass{
		
	}
	
	//OuterClass가 생성이 되어야 InnerCalss를 사용 가능
	class InnerClass{
		
	}
}
