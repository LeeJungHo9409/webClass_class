package quiz;

public class B01_ConditionQuiz {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int a = 15, b = 21, c=63, d = 60, e = 30;
		int year=542, m_mo=10, c_mo=5, hour = 15;
		boolean powerOn = true;
		String str = "no";
		
		System.out.println("1번 " + (a>10 && a<20));
		System.out.println("2번 " + (b%2 == 0));
		System.out.println("3번 " + (c%7 == 0));
		System.out.println("4번 " + (!(hour < 0 && hour >= 24) && hour >= 12));
		System.out.println("5번 " + (Math.abs(d - e) == 30));
		System.out.println("6번 " + ((year%400==0) || ((year%4==0) && (year%100!=0))));
		System.out.println("7번 " + (m_mo-c_mo>=3));
		System.out.println("8번 " + (powerOn == false));
		
		// String 같은 참조형 변수는 서로 다른 객체이기에 같은 값을 지녔는지 확인할 경우 equals() 메소드를 사용한다.
		System.out.println("9번 " + (str == "yes"));
	}

}
