package quiz;

import java.util.Scanner;

public class B07_CheckAlpha {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int i;
		String str;
		Scanner input = new Scanner(System.in);
		boolean result;
		
		System.out.print("�Է����ּ��� : ");
		str = input.next();
		
		//����ڰ� �Է��� ���ڿ��� ���ĺ��� �ϳ��� ���ԵǾ� ������ true
		result = false;
		System.out.println("1. ");
		for(i=0; i<str.length(); i++) {
			if((str.charAt(i) >= 97 && str.charAt(i) <= 122)
					||(str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
				result = true;
				break;
			}
		}
		System.out.println(result);
		
		//����ڰ� �Է��� ���ڿ��� ���ĺ����θ� �̷���� ������ true
		result = true;
		System.out.println("2. ");
		for(i = 0; i<str.length(); i++) {
			if((str.charAt(i) >= 97 && str.charAt(i) <= 122)
					||(str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
				continue;
			}else {
				result = false;
				break;
			}
		}
		System.out.println(result);
		
		//����ڰ� �Է��� ���ڿ��� ���� ���ڸ����� �̷���� ������ true
			//(��� ���� : ���ĺ�, ����, _, $, ù ��° ���ڿ� ���� �Ұ�)
		result = true;
		System.out.println("3. ");
		for(i = 0; i<str.length(); i++) {
			if(i!=0 && (str.charAt(i) >= 0 || str.charAt(i) <= 9)) {
				continue;
			}else if((str.charAt(i) >= 97 && str.charAt(i) <= 122)
					||(str.charAt(i) >= 65 && str.charAt(i) <= 90)) {
				continue;
			}else if(str.charAt(i) == '_'){
				continue;
			}else if(str.charAt(i) == '$') {
				continue;
			}else {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}

}
