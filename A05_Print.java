
public class A05_Print {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int year = 1, m = 11 ,day = 10, hour = 9, minute = 28, second = 35, millisecond = 358;
		String name = "ȫ�浿";
		double weight = 75;
		float height = 187;
		char gender = 'M';
		
		System.out.print("hellow, world!\n");
		System.out.print("hellow, world!\n");
		System.out.print("hellow, world!\n");
		
		System.out.println(year + "�� " + m + "�� " + day + "�� " + hour + " : " + minute + " : "+ second + "." + millisecond);
		
		System.out.printf("%d�� %d�� %d�� %d:%d:%d.%03d", year, m, day, hour, minute, second, millisecond);
		
		
		//���Ĺ�������
		//%d		10����	decimal
		//%x,%X		16����	hexa decimal
		//%o		8����		octal
		//%s 		���ڿ�
		//%f 		�Ǽ�
		//%c 		����
		
		System.out.printf("\n�̸� : %s\n", name);
		System.out.printf("������ : %f\n", weight);
		System.out.printf("Ű : %f\n", height);
		System.out.printf("���� : %c\n", gender);
		
		// # ���� ���� �ɼǵ�
		//	 1. %����d
		//		- �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�.
		//	 2. %-����d
		//		- �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�.
		//	 3. %0����d
		//		-�ڸ����� ���ڸ�ŭ Ȯ���ϰ� ���ڸ��� 0�� ä�� ����Ѵ�.
		//	 4. %.����f		�ݿø�
		//		- �Ǽ��� �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�.
	}

}
