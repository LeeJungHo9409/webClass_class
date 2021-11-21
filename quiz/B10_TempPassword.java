package quiz;

public class B10_TempPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6자리의 랜덤 임시비밀번호를 발급하는 프로그램을 만들어보세요
		// (단, 비밀번호를 구성하는 문자는 영어 대문자와 숫자입니다.)
		
//		int i, password, password1, password2;
//		double randomValue;
		
		
//		강사님 코딩 
		int type;
		int i;
		String password = "";
		
		// 010010 >> 1 -> 001001 -> 000100 -> 000010 -> 000001
//		for(type = (int)(Math.random()*64); type>0; type>>=1) {
//			System.out.println(type&1);
//		}
		
		type = (int)(Math.random()*64);
		
		for(i=0; i<6; i++) {
			
//			System.out.println(type&1);
			
			// 001010		 000101
			//&000001  ->	&000001
			//-------		-------
			// 000000		 000001
			
			switch(type & 1) {
			case 0:
				password += (char)(Math.random()*26+'A');
				break;
			case 1:
				password += (char)(Math.random()*10+'0');
				break;
			}
			
			type>>=1;
		
		}
		
		System.out.println(password);
		//여기까지

		
//		System.out.print("비밀번호 : ");
//		for(i=0; i<6; i++) {
//			randomValue = Math.random();
//			password = (int)(randomValue*100)+1;
//						if((password >= 'A' && password <= 'Z')) {
//				System.out.printf("%c", (char)password);
//			}else {
//				System.out.printf("%d", password%10);
//			}
//			
//			
//		}
	}

}
