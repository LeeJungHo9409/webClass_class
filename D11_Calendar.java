import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/*
	[�������]  [Ȱ���ϴ� ����]
	# Date, Calendar, Time
	
	  - �ڹٷ� ��¥�� �ٷ�� ��ɵ��� ��Ƴ��� Ŭ������
 */

public class D11_Calendar {
	public static void main(String[] args) {
		
		/*
			# ���н� Ÿ�� - 1970�� 1�� 1�� ���ķ� �ð��� �󸶳� �귶������ �� �� 1/1000�ʷ� ����
		 */
		
		//�и������� 1/1000
		System.out.println("����ð� : "+System.currentTimeMillis() + "ms");
		System.out.println("����ð� : "+System.currentTimeMillis()/1000 + "s");
		System.out.println("����ð� : "+(System.currentTimeMillis()/1000)/60 + "min");
		System.out.println("����ð� : "+((System.currentTimeMillis()/1000)/60)/60 + "h");
		System.out.println("����ð� : "+(((System.currentTimeMillis()/1000)/60)/60)/24 + "day");
		System.out.println("����ð� : "+((((System.currentTimeMillis()/1000)/60)/60)/24)/365 + "years");
		
		// �ڵ� ����ð� ����
		long start = System.currentTimeMillis();
		for(int i = 0; i<100000; ++i) {
			System.out.println(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("����ð� : " + (end - start)/1000 + "s");
		
		/*
			# java.util.Date
			
			 - �ַ� �ð� �����͸� ��Ƶα� ���� �뵵�� ���Ǵ� Ŭ����
			 - Date Ŭ�������� �ð��� ����ϴ� �޼����� ����������, ������Ʈ�� �ߴܵǾ� �����Ƿ� ������� �ʴ� ���� ����.
		 */
		
		Date now = new Date();
		System.out.println(now);
		
		/*
			# java.util.Calendar
			
			  - �޷��� ������ Ŭ����
			  - ��¥ �� �ð��� ���� ����� �� �ִ� �پ��� ��ɵ��� ���ִ�.
			  - �����ڸ� ����� �� ���� Calendar.getInstance()�� �ν��Ͻ��� �޾ƿ;� �Ѵ�.
			  - Calendar.getInstance(TimeZone)�� ���� �ٸ� ������ �ð��� �� �� �ִ�.
		 */
		
		// ��밡���� TimeZome ID�� ����
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
		
		// Calendar �ν��Ͻ����� ���ϴ� �ʵ尪�� get() �޼��带 ���� ���� �� �ִ�.
		System.out.println("�Ͽ��� ��¥ : " + now2.get(Calendar.DATE) +"��");
		System.out.println("�Ͽ��� �ð� : " + now2.get(Calendar.HOUR) +"��");
		System.out.println("�Ͽ��� �ð� : " + now2.get(Calendar.HOUR_OF_DAY) +"��"); //����� ǥ��
		System.out.println("�Ͽ��� apm : " + now2.get(Calendar.AM_PM)); //am = 0 / pm = 1
		System.out.println("�Ͽ��� �� : " + now2.get(Calendar.MINUTE) + "��");
		
		// Calendar�� �ʵ� �� MONTH�� 0���� �����Ѵ�.
		System.out.println("�� ��? " + now2.get(Calendar.MONDAY));
		
		//add(field, value) : �ʵ尪 �߰� (���� �Է½� ����)
		now2.add(Calendar.SECOND, -2500);
		//��¥ ���� set(field, value) : ��¥ ����
		now2.set(Calendar.DATE, 7);
		
		// Ư���ϰ� ���� �ʵ��
		System.out.println("DAY OF YEAR (���ذ� ���۵� ���� ��¥) : " + now2.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY OF MONTH (�̹����� ���۵� ���� ��¥) : " + now2.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY OF WEEK (����, �Ͽ����� '1'�̴�) : " + now2.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY OF WEEK (�̹����� �� ���� �ش� �����ΰ�)" + now2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		//�������� : ���� �ѱ� �ð��� �ν��Ͻ��� �ϳ� ������ �� 10�ð� ���� �ð��� ���� ���� ����غ�����.
		// xxxx�� xx�� xx�� xx:xx:xx.xxxx AM
		Calendar today = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
				
		today.add(Calendar.HOUR, 10);
//		
		System.out.println(today);
		System.out.printf("%s�� %s�� %s�� %2s:%2s:%2s.%3s %s",
				today.get(Calendar.YEAR), 
				today.get(Calendar.MONDAY)+1,
				today.get(Calendar.DATE),
				today.get(Calendar.HOUR_OF_DAY),
				today.get(Calendar.MINUTE),
				today.get(Calendar.SECOND),
				today.get(Calendar.MILLISECOND),
				today.get((Calendar.AM_PM)) == 0 ? "AM" : "PM"
				);
		
		SimpleDateFormat my_format = new SimpleDateFormat("yyyy�� MM�� dd�� HH:mm:ss.SSS a EEEE");
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR, 10);
		//getTime() : Calendar �ν��Ͻ��� DateŸ�� �ν��Ͻ��� �����Ͽ� ��ȯ�Ѵ�.
		System.out.println();
		System.out.println(my_format.format(cal.getTime()));
		
		/*
			y: ��	M: ��	d: ��	D: ��(1~365)		E: ����	a: ����/����
			H: 24��	h: 12��	m: ��	s: ��			S: �и���	
		 */
		
	}
}
















