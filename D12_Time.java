
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;


public class D12_Time {
	/*
		# java.time.Time
		
		 - Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스
		 - Calendar는 set()을 통해 원본 인스턴스를 걔속 변경해서 불편하지만
		 - java.time 패키지의 클래스들은 새로운 인스턴스를 반환하여 편리하다.
		 - LocalDate(날짜), LocalTime(시간), LocalDateTime(시간 날짜)
		 
	 */
	
	public static void main(String[] args) {
		/*
 			now() : 지금 시간의 인스턴스를 반환하는 메서드
		 */
		
		System.out.println("날짜 : " + LocalDate.now());
		System.out.println("시간 : " + LocalTime.now());
		System.out.println("둘다 : " + LocalDateTime.now());
		//Mango.now();
		
		// of() : 원하는 시간의 인스턴스를 반환하는 메서드
		//Mango.of(1000, 50);
		System.out.println(LocalDate.of(1994, 9, 9));
		System.out.println(LocalTime.of(2,2,2,222));
		
		// 변경된 시간 인스턴스 생성하기
		LocalDate today = LocalDate.now();
		
		//TemporalUnit 은 인터페이스다.
		System.out.println(today.plus(15, ChronoUnit.DAYS));
		System.out.println(today.plus(15, ChronoUnit.MONTHS));
		System.out.println(today.plus(15, ChronoUnit.WEEKS));
		
		//새로운 인스턴스를 반환 / 그래서 today는 계속 유지됨... / 결과값이 늘어나지 않음.
		System.out.println(today.plusYears(10));
		System.out.println(today.plusYears(10));
		
		// 시간을 문자열을 변경하기
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); ↓
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE"); //4개 이상이면 요일 출력
		String str = dtf.format(today);
		
		System.out.println(str);
		
		// 두 시간 인스턴스의 크기를 비교하기
		LocalDate 어린이날 = LocalDate.of(2024, 5, 5);
		LocalDate 한글날 = LocalDate.of(2021, 10, 9);
		
		System.out.println(어린이날.isAfter(한글날)); // 아예 똑같으면 false 나온다.
		System.out.println(어린이날.isBefore(한글날));
		System.out.println(어린이날.isEqual(어린이날));
		System.out.println(어린이날.isLeapYear());
		
		//특정 값 꺼내기 단, string 아니라 int 값이 나옴
		System.out.println(어린이날.getDayOfWeek());
		System.out.println(어린이날.getMonth());
		System.out.println(어린이날.getMonthValue());
		
		//또 다른 특정 값 꺼내기
		LocalDate 오월마지막막이룡일 =  어린이날.with(TemporalAdjusters.lastInMonth(어린이날.getDayOfWeek()));
		
		System.out.println(오월마지막막이룡일);
	}
}

class Mango {
	int price;
	int sweet;
	private Mango(int price, int sweet) {
		this.price = price;
		this.sweet = sweet;
	}
	
	public static Mango now() { return new Mango(0, 0); }
	
	public static Mango of(int price, int sweet) { return new Mango(price, sweet); }
}
