
public class A05_Print {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int year = 1, m = 11 ,day = 10, hour = 9, minute = 28, second = 35, millisecond = 358;
		String name = "홍길동";
		double weight = 75;
		float height = 187;
		char gender = 'M';
		
		System.out.print("hellow, world!\n");
		System.out.print("hellow, world!\n");
		System.out.print("hellow, world!\n");
		
		System.out.println(year + "년 " + m + "월 " + day + "일 " + hour + " : " + minute + " : "+ second + "." + millisecond);
		
		System.out.printf("%d년 %d월 %d일 %d:%d:%d.%03d", year, m, day, hour, minute, second, millisecond);
		
		
		//서식문자종류
		//%d		10진수	decimal
		//%x,%X		16진수	hexa decimal
		//%o		8진수		octal
		//%s 		문자열
		//%f 		실수
		//%c 		문자
		
		System.out.printf("\n이름 : %s\n", name);
		System.out.printf("몸무게 : %f\n", weight);
		System.out.printf("키 : %f\n", height);
		System.out.printf("성별 : %c\n", gender);
		
		// # 서식 문자 옵션들
		//	 1. %숫자d
		//		- 자릿수를 숫자만큼 확보하면서 출력한다.
		//	 2. %-숫자d
		//		- 자릿수를 숫자만큼 확보하면서 왼쪽 정렬하여 출력한다.
		//	 3. %0숫자d
		//		-자릿수를 숫자만큼 확보하고 빈자리에 0을 채워 출력한다.
		//	 4. %.숫자f		반올림
		//		- 실수의 소수점 아래 자릿수를 설정한다.
	}

}
