package quiz;

import java.util.Scanner;

public class B07_CheckAlpha {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int i;
		String str;
		Scanner input = new Scanner(System.in);
		boolean result;
		
		System.out.print("입력해주세요 : ");
		str = input.next();
		
		//사용자가 입력한 문자열에 알파벳이 하나라도 포함되어 있으면 true
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
		
		//사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true
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
		
		//사용자가 입력한 문자열이 허용된 문자만으로 이루어져 있으면 true
			//(허용 문자 : 알파벳, 숫자, _, $, 첫 번째 문자에 숫자 불가)
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
