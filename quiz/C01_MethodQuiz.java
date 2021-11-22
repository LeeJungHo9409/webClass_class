package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz {

	//1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환
	public static boolean alp(char alp) {
		return (alp >= 'a' && alp <= 'z') || (alp >= 'A' && alp <= 'Z');
	}
	
	//2. 전달한 숫자가 3의 배수이면 true / false
	public static boolean multiple3(int num) {
		return num%3 == 0;
	}
	
	//3. 숫자 하나 전달하면 문자열 "짝수" or "홀수"
	public static String even_old(int num) {
		String str;		
		return str = num % 2 == 0 ? "짝수" : "홀수";
	}
	
	//4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환
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
	
	//5. 전달한 정수가 소수라면 true / false
	public static boolean isPrime(int num) {
		for(int i =2, sqrt =(int)Math.sqrt(num); i<=sqrt;++i) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	//6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환
	public static int factorial(int num) {
		//if문이 없을경우 static over flow 발생!
		if(num == 2) {
			return 2;
		}
		return num * factorial(num-1); 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다음 함수를 정의하고 올바른 동작 테스트
		int multipleNum, divisorNum, primeNum, factorialNum, even_oldNum;
		String txt;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환");
		System.out.print("문자 하나 입력 > ");
		txt = input.next();
		
		System.out.println(alp(txt.charAt(0)));
		
		System.out.println("2. 전달한 숫자가 3의 배수이면 true / false");
		System.out.print("숫자 입력 > ");
		multipleNum = input.nextInt();
		
		System.out.println(multiple3(multipleNum));
		
		System.out.println("3. 숫자 하나 전달하면 문자열 \"짝수\" or \"홀수\"");
		System.out.print("숫자 입력 > ");
		even_oldNum = input.nextInt();
		
		System.out.println(even_old(even_oldNum));
		
		System.out.println("4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환");
		System.out.print("숫자 입력 > ");
		divisorNum = input.nextInt();
		
		System.out.println(Arrays.toString(arrDivisor(divisorNum)));
		
		System.out.println("5. 전달한 정수가 소수라면 true / false");
		
		for(int i = 80; i<=120; i++) {
			if(isPrime(i)) {
				System.out.printf("[%d] ",i);
				if(i%10==0) {
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환");
		System.out.print("숫자 입력 > ");
		factorialNum = input.nextInt();
		
		//static over flow! (한도끝도 없이 계산되기에 멈춘다.)
		System.out.println(factorial(factorialNum));

	}

}
