
public class B02_If {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int num = 30;
		if(num % 10 == 0) {
			System.out.println("num 값은 10의 배수입니다.");
		}else if(num % 3 == 0){
			System.out.println("num 값은 10배수가 아닌 3의 배수입니다.");
		}else if(num % 4 == 0) {
			System.out.println("num 값은 10배수, 3배수도 아닌 4의 배수입니다.");
		}else {
			System.out.println("num 값은 뭣도 아닙니다.");
		}
		System.out.println("프로그램 종료");
	}

}
