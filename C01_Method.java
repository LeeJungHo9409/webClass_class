
/*
	#���� : ���� �̸� �����صΰ� ���߿� ������ ���� ��
	
	#�Լ� function
	  - ����� �̸� �����صΰ� ���߿� ������ ���� ��
	  - �ڹٿ��� �Լ��� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�.
	  	(Ŭ���� ���ο� ����� �Լ��� ���� �޼����� �θ���.)
	  	
	#�Լ� �Ű����� (argument)
	  - �Լ��� ȣ���� �� ()�ȿ� �����ϴ� ���� ���ڶ�� �Ѵ�.
	  - �Լ��� ������ �� ()�ȿ� ���ڰ��� ���� �� �ִ� �������� �ŰԺ������ �Ѵ�.

 */

public class C01_Method {
	
	public static void printRabbit() {
		System.out.println("=======================");
		System.out.println("\t /)/)");
		System.out.println("\t( ..)");
		System.out.println("\t( >��");
		System.out.println("   Have a Good Time.");
		System.out.println("=======================");
	}
	
	public static void printSum(int sum, int x) {
		sum += x;
		System.out.println(sum);
	}
	
	public static int appleQuiz(int apple) {
		if(apple<0) {
			return -1;
		}
		int need = apple%10 == 0 ? apple/10 : apple/10+1;
		return need;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int need = appleQuiz(-123);
		System.out.println(need);
		
		for(int i=0;i<3;i++) {
			printRabbit();
		}
		
		int sum = 0;
		for(int i=0;i<3;i++) {
			printSum(sum, i);
		}
		
	}

}
