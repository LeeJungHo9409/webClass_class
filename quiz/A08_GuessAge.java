package quiz;

import java.time.LocalDate;
import java.util.*;

public class A08_GuessAge {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int year, age;
		Scanner input = new Scanner(System.in);
		LocalDate today_year = LocalDate.now();
		
		System.out.printf("���� �⵵�� �ۼ����ּ��� (ex. 20XX) : %d\n", today_year.getYear());
		
		//today_year = input.nextInt();
		System.out.print("�����Դϱ�? (ex.19XX) : ");
		year = input.nextInt();
		
		age = (today_year.getYear() - year)+1;
		
		System.out.printf("���� %d �⵵�̰� ����� %d �⵵�� �¾����, �� ���̴� %d �� �Դϴ�. \n", today_year.getYear(), year, age);
	}

}
