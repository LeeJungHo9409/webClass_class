package quiz;
import java.util.Scanner;

public class B03_PrintLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt;
		Scanner input = new Scanner(System.in);
		
		System.out.print("10���� �����Է����ּ��� : ");
		txt = input.next();
		
		if(txt.length() == 10) {
			System.out.print(txt.charAt(9));
			System.out.print(txt.charAt(8));
			System.out.print(txt.charAt(7));
			System.out.print(txt.charAt(6));
			System.out.print(txt.charAt(5));
			System.out.print(txt.charAt(4));
			System.out.print(txt.charAt(3));
			System.out.print(txt.charAt(2));
			System.out.print(txt.charAt(1));
			System.out.print(txt.charAt(0));
		}else {
			System.out.println("10���ڰ� �ƴմϴ�...");
		}
	}

}
