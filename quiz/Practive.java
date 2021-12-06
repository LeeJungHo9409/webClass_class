package quiz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practive {
	
	ArrayList<Integer> arrNumber = new ArrayList<>();
	final static int MAX_NUMBER = 100;
	Scanner input = new Scanner(System.in);
	
	public Practive() {
		
		int number;
		
		for(int i = 0; i<MAX_NUMBER; i++) {
			if(i!=0 && i%10 == 0) {
				System.out.println();
			}
			arrNumber.add((int)(Math.random()*9000+1000));
			System.out.printf("[%4d]",arrNumber.get(i));
		}
		System.out.println();
		
		while(true) {
			try {
				System.out.print("����� �ѹ��� ã���ó���? >> ");
				number = input.nextInt();
				arrPrint(number-1);
				break;
			}catch (InputMismatchException e) {
				System.out.println("���ڰ� �ƴմϴ�. �ٽ����ּ���!");
				input.nextLine();
			}catch (IndexOutOfBoundsException e) {
				System.out.println("100 �Ʒ��� �Է����ּ���!");
				input.nextLine();
			}
		}
		
	}
	
	double avg() {
		int sum= 0;
		for(int i = 0; i<MAX_NUMBER; i++) {
			sum += arrNumber.get(i);
		}
		return (double)sum/(double)MAX_NUMBER;
	}
	
	//Math.max(max, arrNumber.get(i))
	int maxNumber(){
		int max = 0;
		
		//for(int number : arrNuber)
		for(int i = 0; i<MAX_NUMBER; i++) {
			if(max < arrNumber.get(i)) {
				max = arrNumber.get(i);
			}
		}
		
		return max;
	}

	//Math.min(min, arrNumber.get(i))
	int minNumber(){
		int min = 9999;
		
		//for(int number : arrNuber)
		for(int i = 0; i<MAX_NUMBER; i++) {
			if(min > arrNumber.get(i)) {
				min = arrNumber.get(i);
			}
		}
		
		return min;
	}
	
	int search(int target){
		return arrNumber.get(target);
	}
	
	void arrPrint(int number) {
		System.out.printf("1�� >> %d��°��	[%d]\n",number+1,search(number));
		System.out.printf("2�� >> ���	[%.2f]\n", avg());
		System.out.printf("3�� >> MAX	[%d]\n", maxNumber());
		System.out.printf("4�� >> MIN	[%d]\n", minNumber());
	}
	
}
