package Password;

import java.util.Scanner;

public class Password {

	final int  MIN_PASSWORD=8, MAX_PASSWORD = 24;
	Scanner input = new Scanner(System.in);
	String passwordValue;
	boolean check = false;
	char[] password = new char[MAX_PASSWORD];
	
	public Password() {
		
		while(true) {
			try {
				System.out.print("입력 : ");
				passwordValue = input.next();
				
				passwordRange(passwordValue.length());
				check = passwordNumber(passwordValue);
				check = passwordString(passwordValue);
				System.out.println("테스트문자 통과");
				check = passwordSpecial(passwordValue);
				System.out.println("특수문자 통과");
				
				break;
			}catch (NotPasswordRange e) {
				input.nextLine();
				e.printStackTrace();
			}catch (NotPasswordNumber e) {
				input.nextLine();
				e.printStackTrace();
			}
			catch (NotPasswordString e) {
				input.nextLine();
				e.printStackTrace();
			}catch (NotPasswordSpecial e) {
				input.nextLine();
				e.printStackTrace();
			}
		}
		
		System.out.println("정상적으로 완료했습니다.");
	}
	
	boolean passwordString(String value) throws NotPasswordString{
		for(int i=0; i<value.length(); i++) {
			if(value.charAt(i) >= 'a' && value.charAt(i) <= 'z' 
					|| value.charAt(i) >= 'A' && value.charAt(i) <= 'Z' ) {
				return true;
			}
		}
		
		if (check == true){
			throw new NotPasswordString();
		}
		return false;
	}
	
	boolean passwordSpecial(String value) throws NotPasswordSpecial{

		for(int i=0;i<value.length();i++) {
			switch (value.charAt(i)) {
			case '!', '@', '#', '$', '%', '^', '&': {
				return true;
				}
			}
		}
		
		if(check == true) {
			throw new NotPasswordSpecial();	
		}
		System.out.println("특수문자테스트 통과");
		return false;
	}
	
	
	boolean passwordNumber(String value) throws NotPasswordNumber{
		int count = 0;
		for(int i=0; i<value.length(); i++){
			if(value.charAt(i) >= '0' && value.charAt(i) <= '9') {
				count++;
			}
		}
		if(count == value.length() || count == 0) {
			throw new NotPasswordNumber();
		}
		System.out.println("올 숫자 테스트 통과");
		return false;
	}
	
	void passwordRange(int count) throws NotPasswordRange{
		if(count < MIN_PASSWORD || count > MAX_PASSWORD) {
			throw new NotPasswordRange();
		}
		System.out.println("길이 테스트 통과");
	}
	
}
