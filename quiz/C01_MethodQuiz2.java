package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz2 {
	
	//01.range()
	//최대값을 매개변수로 전달
	//0부터 최대값 미만의 모든 값을 포함하는 int 배열을 생성 반환
	public static int[] range(int max) {
		
		int[] arr= new int[max];
		
		for(int i=0;i<max;i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
	//02.range()
	//최소값과 최대값을 매개변수롤 전달받으면
	//최소값부터 최대값 미만의 모든 정수값을 포함하는 int 배열을 생성 반환
	public static int[] range(int min, int max) {
		
		int[] arr= new int[Math.abs(max-min)];
		int temp;
		if(max < min) {
			temp = max;
			max = min;
			min = temp;
		}
		
		for(int i=0; i<Math.abs(max-min); i++) {
			arr[i] = max<min ? Math.abs(i-min) : i+min;
		}
		
		return arr;
	}
	
	//03.range()
	//최소값과 최대값과 증가값을 매개변수로 전달
	//최소값부터 최대값 미만까지 증가값만큼 증가하는 int 배열을 생성하여 반환
	public static int[] range(int min, int max, int up) {
		
		int[] arr;
		int count=0;
		int temp;
		if(max < min) {
			temp = max;
			max = min;
			min = temp;
		}
		
		up = up <= 0 ? Math.abs(up) : up; 
		
		for(int i = 0; i<Math.abs(max-min); i+=up, count++) {}
		arr = new int[count];
		count = 0;
		for(int i = 0; i<Math.abs(max-min); i+=up, count++) {
			arr[count] = max<min ? Math.abs(i-min) : i+min;
		}
		
		return arr;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min, max, up;
		Scanner input = new Scanner(System.in);
		
		//1번
		System.out.println("1번");
		System.out.print("원하시는 최대값을 적으세요 > ");
		max = input.nextInt();
		System.out.println(Arrays.toString(range(max)));
		
		//2번
		System.out.println("2번");
		System.out.print("원하시는 최대값을 적으세요 > ");
		max = input.nextInt();
		System.out.print("원하시는 최소값을 적으세요 > ");
		min = input.nextInt();
		System.out.println(Arrays.toString(range(min, max)));
		
		//3번
		System.out.println("3번");
		System.out.print("원하시는 최대값을 적으세요 > ");
		max = input.nextInt();
		System.out.print("원하시는 최소값을 적으세요 > ");
		min = input.nextInt();
		System.out.print("원하시는 증가값을 적으세요 > ");
		up = input.nextInt();
		System.out.println(Arrays.toString(range(min, max, up)));
	}

}
