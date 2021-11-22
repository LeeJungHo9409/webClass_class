package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz {

	//1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ
	public static boolean alp(char alp) {
		return (alp >= 'a' && alp <= 'z') || (alp >= 'A' && alp <= 'Z');
	}
	
	//2. ������ ���ڰ� 3�� ����̸� true / false
	public static boolean multiple3(int num) {
		return num%3 == 0;
	}
	
	//3. ���� �ϳ� �����ϸ� ���ڿ� "¦��" or "Ȧ��"
	public static String even_old(int num) {
		String str;		
		return str = num % 2 == 0 ? "¦��" : "Ȧ��";
	}
	
	//4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ
	public static int[] arrDivisor(int num) {
//		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
//		int i;
//		
//		for(i=2; i<num; i++) {
//			if(num%i == 0) {
//				arrList.add(i);
//			}
//		}
//		
//		int listSize = arrList.size();
//		String[] arr = arrList.toArray(new String[listSize]);

		
//		System.out.println(arrList);
		
		int[] arr;
		int count = 0, i;
		for(i=1;i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		arr = new int[count];
		
		for(i=1, count = 0;i<=num; i++) {
			if(num%i == 0) {
				arr[count++] = i;
			}
		}
		return arr; 
	}
	
	//5. ������ ������ �Ҽ���� true / false
	public static boolean isPrime(int num) {
		for(int i =2, sqrt =(int)Math.sqrt(num); i<=sqrt;++i) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ
	public static int factorial(int num) {
		//if���� ������� static over flow �߻�!
		if(num == 2) {
			return 2;
		}
		return num * factorial(num-1); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���� �Լ��� �����ϰ� �ùٸ� ���� �׽�Ʈ
		int multipleNum, divisorNum, primeNum, factorialNum, even_oldNum;
		String txt;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ");
		System.out.print("���� �ϳ� �Է� > ");
		txt = input.next();
		
		System.out.println(alp(txt.charAt(0)));
		
		System.out.println("2. ������ ���ڰ� 3�� ����̸� true / false");
		System.out.print("���� �Է� > ");
		multipleNum = input.nextInt();
		
		System.out.println(multiple3(multipleNum));
		
		System.out.println("3. ���� �ϳ� �����ϸ� ���ڿ� \"¦��\" or \"Ȧ��\"");
		System.out.print("���� �Է� > ");
		even_oldNum = input.nextInt();
		
		System.out.println(even_old(even_oldNum));
		
		System.out.println("4. ���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ���·� ��ȯ");
		System.out.print("���� �Է� > ");
		divisorNum = input.nextInt();
		
		System.out.println(Arrays.toString(arrDivisor(divisorNum)));
		
		System.out.println("5. ������ ������ �Ҽ���� true / false");
		
		for(int i = 80; i<=120; i++) {
			if(isPrime(i)) {
				System.out.printf("[%d] ",i);
				if(i%10==0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ");
		System.out.print("���� �Է� > ");
		factorialNum = input.nextInt();
		
		//static over flow! (�ѵ����� ���� ���Ǳ⿡ �����.)
		System.out.println(factorial(factorialNum));

	}

}
