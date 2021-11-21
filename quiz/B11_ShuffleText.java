package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B11_ShuffleText {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		char[] shuffle, temp;
		Scanner input = new Scanner(System.in);
		double random;
		int i=0,j=0,count=0;
		
		System.out.println("문장을 입력해주세요 > ");
		shuffle = input.nextLine().toCharArray();
		temp = new char[shuffle.length+1];
		
		while(i<shuffle.length) {
			if(j == shuffle.length-count) {
				break;
			}
			i++;
			
			random = (Math.random()*shuffle.length)+1;
			temp[i] = shuffle[(int)random-1];
			System.out.println(Arrays.toString(temp));
			
			for(j=0; j<i; j++) {
				if(temp[j]==temp[i]) {
					count++;
					i--;
					break;
				}
			}
		}
		
		System.out.println();
		for(i=0; i<shuffle.length; i++) {
			System.out.printf("%c",temp[i]);
		}
//		System.out.println();
//		for(i=0; i<shuffle.length; i++) {
//			System.out.printf("[%c]",shuffle[i]);
//		}
		
		System.out.println();
	}
}
