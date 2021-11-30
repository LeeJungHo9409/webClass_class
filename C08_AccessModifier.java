import myobj.C08_DiffPackageClass;

/*
	# 접근 제어자 (Access Modifier) 
	  다른 클래스에서 해당 클래스의 자원을 활용하려고 할 때, 허용 범위를 설정한다.
	  외부 class에는 public과 default밖에 사용할수 없다.
	  
	    - private	: 같은 클래스 내부에서만 접근할 수 있는 자원
	    - default	: 아무것도 안적은것, 같은 패키지 내부에서만 접근할 수 있는 자원
	    - protected	: 다른 패키지에서 상속받은 클래스에서만 접근할 수 있는 자원
	    - public	: 다른 패키지에서 자유롭게 접근할 수 있는 자원
	    
	# 접근 제어자의 활용
	 
	 public으로 설정하지 않은 모든 자원들은 다른 패키지에서 노출되지 않는다.
	 해당 클래스를 다른 개발자가 가져다 사용할 때 잘못된 방식으로 사용하는 것을 방지 가능
 */

public class C08_AccessModifier extends C08_DiffPackageClass{
	
	public void test() {
		//다른 패키지에서 상속받아서 사용할 때 접근할 수 있는 자원 : public, protected
		//다른 패키지에서 상속받아서 사용할 때 접근할 수 없는 자원 : default, private
		System.out.println("패키지 상속");
		System.out.println(super._protected_var);
		System.out.println(super._public_var);
	}
	
	public static void main(String[] args) {
		//같은 패키지에서 접근할 수 있는 자원 : public, protected, default
		//같은 패키지에서 접근할 수 없는 자원 : private
		C08_SamePackageClass instance1 = new C08_SamePackageClass();
		
		System.out.println("같은 패키지");
		System.out.println(instance1._public_var);
		System.out.println(instance1._protected_var);
		System.out.println(instance1._default_var);
		
		//myobj.C08_DiffPackageClass instance2 = new C08_DiffPackageClass();
		//import 쓰기 싫을때 import 작성을 쓰면되는데 하나하나 다 써야되므로 귀찮아진다.
		//다른 패키지에서 접근할 수 있는 자원 : public
		//다른 패키지에서 접근할 수 없는 자원 : protected, default, private
		C08_DiffPackageClass instance2 = new C08_DiffPackageClass();
		
		System.out.println("다른 패키지");
		System.out.println(instance2._public_var);
		
	}
}
