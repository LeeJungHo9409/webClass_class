package quiz;

public class B10_TempPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6�ڸ��� ���� �ӽú�й�ȣ�� �߱��ϴ� ���α׷��� ��������
		// (��, ��й�ȣ�� �����ϴ� ���ڴ� ���� �빮�ڿ� �����Դϴ�.)
		
//		int i, password, password1, password2;
//		double randomValue;
		
		
//		����� �ڵ� 
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
		//�������

		
//		System.out.print("��й�ȣ : ");
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
