
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
		
//		for���� index�� ���� Ȱ�� ���� �� ���� �ϳ��ϳ� �б�
		for(i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println();
		
//		for���� index�� ���� Ȱ�� ���� �� ���ڿ� �Ųٷ� �б�
		for(i=str.length(); i>0; i--) {
			System.out.print(str.charAt(i-1));
		}
		System.out.println();

	}

}
