package quiz;

public class B01_ConditionQuiz {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int a = 15, b = 21, c=63, d = 60, e = 30;
		int year=542, m_mo=10, c_mo=5, hour = 15;
		boolean powerOn = true;
		String str = "no";
		
		System.out.println("1�� " + (a>10 && a<20));
		System.out.println("2�� " + (b%2 == 0));
		System.out.println("3�� " + (c%7 == 0));
		System.out.println("4�� " + (!(hour < 0 && hour >= 24) && hour >= 12));
		System.out.println("5�� " + (Math.abs(d - e) == 30));
		System.out.println("6�� " + ((year%400==0) || ((year%4==0) && (year%100!=0))));
		System.out.println("7�� " + (m_mo-c_mo>=3));
		System.out.println("8�� " + (powerOn == false));
		
		// String ���� ������ ������ ���� �ٸ� ��ü�̱⿡ ���� ���� ������� Ȯ���� ��� equals() �޼ҵ带 ����Ѵ�.
		System.out.println("9�� " + (str == "yes"));
	}

}
