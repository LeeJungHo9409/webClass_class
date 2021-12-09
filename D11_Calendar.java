import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/*
	[저장느낌]  [활용하는 느낌]
	# Date, Calendar, Time
	
	  - 자바로 날짜를 다루는 기능들을 모아놓은 클래스들
 */

public class D11_Calendar {
	public static void main(String[] args) {
		
		/*
			# 유닉스 타입 - 1970년 1월 1일 이후로 시간이 얼마나 흘렀는지를 센 것 1/1000초로 센것
		 */
		
		//밀리세컨드 1/1000
		System.out.println("현재시간 : "+System.currentTimeMillis() + "ms");
		System.out.println("현재시간 : "+System.currentTimeMillis()/1000 + "s");
		System.out.println("현재시간 : "+(System.currentTimeMillis()/1000)/60 + "min");
		System.out.println("현재시간 : "+((System.currentTimeMillis()/1000)/60)/60 + "h");
		System.out.println("현재시간 : "+(((System.currentTimeMillis()/1000)/60)/60)/24 + "day");
		System.out.println("현재시간 : "+((((System.currentTimeMillis()/1000)/60)/60)/24)/365 + "years");
		
		// 코드 실행시간 측정
		long start = System.currentTimeMillis();
		for(int i = 0; i<100000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("실행시간 : " + (end - start)/1000 + "s");
		
		/*
			# java.util.Date
			
			 - 주로 시간 데이터를 담아두기 위한 용도로 사용되는 클래스
			 - Date 클래스에도 시간을 계산하는 메서들이 존재하지만, 업데이트가 중단되어 있으므로 사용하지 않는 것이 좋다.
		 */
		
		Date now = new Date();
		System.out.println(now);
		
		/*
			# java.util.Calendar
			
			  - 달력을 구현한 클래스
			  - 날짜 및 시간을 쉽게 계산할 수 있는 다양한 기능들이 모여있다.
			  - 생성자를 사용할 수 없고 Calendar.getInstance()로 인스턴스를 받아와야 한다.
			  - Calendar.getInstance(TimeZone)을 통해 다른 국가의 시간도 알 수 있다.
		 */
		
		// 사용가능한 TimeZome ID들 보기
		int count = 0;
		for(String id : TimeZone.getAvailableIDs()) {
			if(count%3 == 0 && count != 0) {
				System.out.println();
			}
			System.out.printf("[%s]  ", id);
			count++;
		}
		
		System.out.println();
		
		Calendar now2 = Calendar.getInstance(TimeZone.getTimeZone("US/Hawaii"));
		System.out.println(now2);
		
		// Calendar 인스턴스에서 원하는 필드값을 get() 메서드를 통해 꺼낼 수 있다.
		System.out.println("하와이 날짜 : " + now2.get(Calendar.DATE) +"일");
		System.out.println("하와이 시간 : " + now2.get(Calendar.HOUR) +"시");
		System.out.println("하와이 시간 : " + now2.get(Calendar.HOUR_OF_DAY) +"시"); //군대식 표기
		System.out.println("하와이 apm : " + now2.get(Calendar.AM_PM)); //am = 0 / pm = 1
		System.out.println("하와이 분 : " + now2.get(Calendar.MINUTE) + "분");
		
		// Calendar의 필드 중 MONTH만 0부터 시작한다.
		System.out.println("몇 월? " + now2.get(Calendar.MONDAY));
		
		//add(field, value) : 필드값 추가 (음수 입력시 감소)
		now2.add(Calendar.SECOND, -2500);
		//날짜 변경 set(field, value) : 날짜 변경
		now2.set(Calendar.DATE, 7);
		
		// 특이하고 편리한 필드들
		System.out.println("DAY OF YEAR (올해가 시작된 후의 날짜) : " + now2.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY OF MONTH (이번달이 시작된 후의 날짜) : " + now2.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY OF WEEK (요일, 일요일은 '1'이다) : " + now2.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY OF WEEK (이번달의 몇 번재 해당 요일인가)" + now2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//연습문제 : 현재 한국 시간을 인스턴스를 하나 생성한 후 10시간 후의 시간을 보기 좋게 출력해보세요.
		// xxxx년 xx월 xx일 xx:xx:xx.xxxx AM
		Calendar today = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
				
		today.add(Calendar.HOUR, 10);
//		
		System.out.println(today);
		System.out.printf("%s년 %s월 %s일 %2s:%2s:%2s.%3s %s",
				today.get(Calendar.YEAR), 
				today.get(Calendar.MONDAY)+1,
				today.get(Calendar.DATE),
				today.get(Calendar.HOUR_OF_DAY),
				today.get(Calendar.MINUTE),
				today.get(Calendar.SECOND),
				today.get(Calendar.MILLISECOND),
				today.get((Calendar.AM_PM)) == 0 ? "AM" : "PM"
				);
		
		SimpleDateFormat my_format = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss.SSS a EEEE");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 10);
		//getTime() : Calendar 인스턴스로 Date타입 인스턴스를 생성하여 반환한다.
		System.out.println();
		System.out.println(my_format.format(cal.getTime()));
		
		/*
			y: 년	M: 월	d: 일	D: 일(1~365)		E: 요일	a: 오전/오후
			H: 24시	h: 12시	m: 분	s: 초			S: 밀리초	
		 */
		
	}
}
















