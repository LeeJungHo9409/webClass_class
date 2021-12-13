
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
		
		 - Calendar�� �������� ������ ������ �ð��� �ٷ�� Ŭ����
		 - Calendar�� set()�� ���� ���� �ν��Ͻ��� �¼� �����ؼ� ����������
		 - java.time ��Ű���� Ŭ�������� ���ο� �ν��Ͻ��� ��ȯ�Ͽ� ���ϴ�.
		 - LocalDate(��¥), LocalTime(�ð�), LocalDateTime(�ð� ��¥)
		 
	 */
	
	public static void main(String[] args) {
		/*
 			now() : ���� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		 */
		
		System.out.println("��¥ : " + LocalDate.now());
		System.out.println("�ð� : " + LocalTime.now());
		System.out.println("�Ѵ� : " + LocalDateTime.now());
		//Mango.now();
		
		// of() : ���ϴ� �ð��� �ν��Ͻ��� ��ȯ�ϴ� �޼���
		//Mango.of(1000, 50);
		System.out.println(LocalDate.of(1994, 9, 9));
		System.out.println(LocalTime.of(2,2,2,222));
		
		// ����� �ð� �ν��Ͻ� �����ϱ�
		LocalDate today = LocalDate.now();
		
		//TemporalUnit �� �������̽���.
		System.out.println(today.plus(15, ChronoUnit.DAYS));
		System.out.println(today.plus(15, ChronoUnit.MONTHS));
		System.out.println(today.plus(15, ChronoUnit.WEEKS));
		
		//���ο� �ν��Ͻ��� ��ȯ / �׷��� today�� ��� ������... / ������� �þ�� ����.
		System.out.println(today.plusYears(10));
		System.out.println(today.plusYears(10));
		
		// �ð��� ���ڿ��� �����ϱ�
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); ��
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd EEEE"); //4�� �̻��̸� ���� ���
		String str = dtf.format(today);
		
		System.out.println(str);
		
		// �� �ð� �ν��Ͻ��� ũ�⸦ ���ϱ�
		LocalDate ��̳� = LocalDate.of(2024, 5, 5);
		LocalDate �ѱ۳� = LocalDate.of(2021, 10, 9);
		
		System.out.println(��̳�.isAfter(�ѱ۳�)); // �ƿ� �Ȱ����� false ���´�.
		System.out.println(��̳�.isBefore(�ѱ۳�));
		System.out.println(��̳�.isEqual(��̳�));
		System.out.println(��̳�.isLeapYear());
		
		//Ư�� �� ������ ��, string �ƴ϶� int ���� ����
		System.out.println(��̳�.getDayOfWeek());
		System.out.println(��̳�.getMonth());
		System.out.println(��̳�.getMonthValue());
		
		//�� �ٸ� Ư�� �� ������
		LocalDate �������������̷��� =  ��̳�.with(TemporalAdjusters.lastInMonth(��̳�.getDayOfWeek()));
		
		System.out.println(�������������̷���);
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
