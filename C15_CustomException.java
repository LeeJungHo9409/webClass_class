

/*
	# 원하는 예외 직접 만들어서 사용하기
	  - Exception을 상속 받으면 반드시 처리해야 하는 예외
	  - RuntimeException을 상속받으면 처리하지 않아도 되는 예외
 */

public class C15_CustomException {
	public static void main(String[] args) {
		//test(11);
		try {
			test2(new DanceBeginner());
		} catch (NotSwimmerException e) {
			System.out.println("Swimmer 인터페이스 아님");
		}
	}
	
	public static boolean test(int num){
		if(num %2 == 0) {
			return true;
		}else {
			throw new NotEvenException();
		}
	}
	
	//존재하는 모든 타입의 부모를 Object 입니다. (업캐스팅)
	public static void test2(Object obj) throws NotSwimmerException{
		if(obj instanceof Swimmer) {
			//다운캐스팅
			((Swimmer)obj).swim();
			throw new NotSwimmerException();
		}
	}
}

class NotSwimmerException extends Exception{
	public NotSwimmerException() {
		super("수영 못함!");
	}
}

//말그대로 커스텀해서 사용하는 거
class NotEvenException extends RuntimeException{
	public NotEvenException() {
		super("홀수이지롱");
	}
	public NotEvenException(String msg) {
		super("msg");
	}
}