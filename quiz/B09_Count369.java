package quiz;

import java.util.Scanner;

public class B09_Count369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		Scanner input = new Scanner(System.in);
		int num, count = 0;
		
		System.out.print("원하는 수 입력 : ");
		num = input.nextInt();
		
		for(int i = 1; i<=num; i++) {
			str = Integer.toString(i);
			
			for(int j=0; j<str.length(); j++) {
				switch (str.charAt(j)) {
				case '3','6','9':
					str += "짝";
					count++;
					break;
				}
			}
			
			System.out.print(str + "\t");
			
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n총합은 : "+count);

	}

}
