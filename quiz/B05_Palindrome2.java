package quiz;

import java.util.Scanner;

public class B05_Palindrome2 {

	public static void main(String[] args) {
		// TODO ÀÚµ¿ »ı¼ºµÈ ¸Ş¼Òµå ½ºÅÓ
		
		Scanner input = new Scanner(System.in);
		System.out.print("ÁÂ¿ì´ëÄª : ");
		String str = input.next();
		String revers_str = "";
		
		for(int i = 0, j=str.length(); i<j; ++i) {
			revers_str += str.charAt(j - 1 - i);
		}
		
		System.out.println(str);
		System.out.println(revers_str);
		
		String result = str.equals(revers_str) ? "´ëÄª" : "ºñ´ëÄª";
		System.out.println("°á°ú : " + result);
	}

}
