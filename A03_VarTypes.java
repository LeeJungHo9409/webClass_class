import java.io.PrintStream;
import java.util.Scanner;

public class A03_VarTypes {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		/*
			# ���� Ÿ��
			  - byte		1	byte	8	bit		-128 ~ 127
			  - short		2			16			-32768 ~ 32767
			  - char		2			16			�����ڵ�� ���� ���� 0 ~ 65535
			  - int			4			32			-21�� ~ 21��
			  - long		8			64			������ ����....
		*/
		
		byte min_byte = -128;
		byte max_byte = 127;
		short min_short = -32768;
		short max_short = 32767;
		int min_int = Integer.MIN_VALUE;
		int max_int = Integer.MAX_VALUE;
		long min_long = Long.MIN_VALUE;
		long max_long = Long.MAX_VALUE;
		
		// ���� ���ͷ��� �⺻ Ÿ���� int Ÿ���̴�.
		// int�� ������ ����� ���� ���ͷ��� ����ϰ� �ʹٸ� �ڿ� L�� �ٿ����Ѵ�.
		long _long = 1000000000000000000L;
		
		System.out.println("min_int\t\t: " + min_int);
		System.out.println("max_int\t\t: " + max_int);
		System.out.println("min_long\t: " + min_long);
		System.out.println("max_long\t: " + max_long);
		
		//�ش� Ÿ�� ���� ���ϴ� ���� ���ڿ��� �ٲٱ�
		System.out.println(Integer.toString(min_int,8));
		System.out.println(Long.toString(_long,2));
		
		/*
			# �Ǽ� Ÿ��
			  - float		4	byte
			  - double		8	byte
			  
			�Ǽ��� �ַ� �׷��� ��ѿ� ���Ǹ� �� �о߿����� ���� ������� ����.
			�Ǽ� ���ͳ��� �⺻ Ÿ���� double Ÿ���̴�.
		*/
		
		double _double = 123.1234;
		float _float = 12333.1234f;
		
		System.out.println(_double);
		System.out.println(_float);
		
		/*
			# �� / ���� (boolean) Ÿ��
			  - boolean Ÿ�Կ� �� �� �ִ� ���� true / false �ۿ� ����.
		*/
		
		boolean male = true;
		boolean powerOn = true;
		boolean overEighteen = false;
		
		/*
			# ������ Ÿ��
			  - �빮�ڷ� �����ϴ� ��� Ÿ��
			  - ������ ��� �ҹ��ڷ� �����ϴ� ��� Ÿ�Ե��� �⺻�� Ÿ���̶�� �θ���.
			  - String �׿� ��� Ŭ���� Ÿ�Ե��� ������ Ÿ���̶� �Ѵ�.
		*/
		
		String hello1 = "�ȳ��ϼ���.";
		String hello2 = "�ݰ����ϴ�.";
		
		PrintStream stream = System.out;
		stream.println("wow!");
		stream.println("oh!!");
		
		/*
		 * int[] arr = new int[99]; int[][] arrT= new int[10][10];
		 * 
		 * String a = "�ȳ��ϼ���";
		 * 
		 * for(int i=0; i<arr.length; i++) { arr[i] = i; System.out.println(arr[i]); }
		 * 
		 * System.out.println(a);
		 * 
		 * for(int i=0; i<arrT.length; i++) { int[] inArr = arrT[i]; for(int j=0;
		 * j<inArr.length; j++) { arrT[i][j] = j; if(j) { System.out.print("*"); }else {
		 * System.out.print(arrT[i][j]); }
		 * 
		 * } System.out.println(); }
		 */
	}

}
