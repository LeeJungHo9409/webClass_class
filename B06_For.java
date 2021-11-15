
public class B06_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0, j=0;
		int MAX_POINT = 10;
		String str = "Common sense is not so common";
		
		for(i=0; i<MAX_POINT; i++) {
			for(j=MAX_POINT; j>i; j--) {
				System.out.print(" ");
			}
			for(j=0; (j*2)+1<i||j==0;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
//		for문과 index를 같이 활용 가능 ↓ 문자 하나하나 읽기
		for(i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		
//		for문과 index를 같이 활용 가능 ↓ 문자열 거꾸로 읽기
		for(i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}
		System.out.println();

	}

}
