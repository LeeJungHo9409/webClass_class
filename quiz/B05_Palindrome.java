package quiz;

import java.util.Scanner;

public class B05_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt;
		int i, f_num, l_num, txtMax;
		boolean swit = true;
		Scanner input = new Scanner(System.in);
		
		System.out.print("단어 입력 : ");
		txt = input.next();
		
		txtMax = txt.length() / 2;
		
		for(i=0; i<txtMax && swit==true; i++) {
			f_num = txt.charAt(i);
			l_num = txt.charAt((txt.length()-1)-i);
			
			if(f_num >= 97 && f_num <= 122) {
				f_num -= 32;
			}
			if(l_num >= 97 && l_num <= 122) {
				l_num -= 32;
			}
			
			if(f_num != l_num) {
				swit = false;
			}
		}
		
		
		System.out.println();
		if(swit == true) {
			System.out.print("PALINDROME");
		}else {
			System.out.println("NOT PALINDROME");
		}

	}

}
