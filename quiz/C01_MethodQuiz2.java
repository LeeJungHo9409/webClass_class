package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class C01_MethodQuiz2 {
	
	//01.range()
	//�ִ밪�� �Ű������� ����
	//0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� ���� ��ȯ
	public static int[] range(int max) {
		
		int[] arr= new int[max];
		
		for(int i=0;i<max;i++) {
			arr[i] = i;
		}
		
		return arr;
	}
	
	//02.range()
	//�ּҰ��� �ִ밪�� �Ű������� ���޹�����
	//�ּҰ����� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� ���� ��ȯ
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
	//�ּҰ��� �ִ밪�� �������� �Ű������� ����
	//�ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ
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
		
		//1��
		System.out.println("1��");
		System.out.print("���Ͻô� �ִ밪�� �������� > ");
		max = input.nextInt();
		System.out.println(Arrays.toString(range(max)));
		
		//2��
		System.out.println("2��");
		System.out.print("���Ͻô� �ִ밪�� �������� > ");
		max = input.nextInt();
		System.out.print("���Ͻô� �ּҰ��� �������� > ");
		min = input.nextInt();
		System.out.println(Arrays.toString(range(min, max)));
		
		//3��
		System.out.println("3��");
		System.out.print("���Ͻô� �ִ밪�� �������� > ");
		max = input.nextInt();
		System.out.print("���Ͻô� �ּҰ��� �������� > ");
		min = input.nextInt();
		System.out.print("���Ͻô� �������� �������� > ");
		up = input.nextInt();
		System.out.println(Arrays.toString(range(min, max, up)));
	}

}
