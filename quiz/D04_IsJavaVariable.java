package quiz;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	단어를 전달하면 해당 단어가 자바의 변수로써 사용할될 수 있는지
	판별해주는 메서드를 만들고 테스트 해보세요.
 */

public class D04_IsJavaVariable {
	
	public static void main(String[] args) {
		String value;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("단어를 작성해주세요 >> ");
				value = input.nextLine();
				
				if(test(value) == true) {
					System.out.println("정상출력");
					break;
				}
				
				System.out.println("음음음~ 안되네요!");
			} catch (InputMismatchException e) {
				System.out.println("다시 입력 바랍니다.");
			}
		}
	}
	
	static boolean test(String value) {
		int txt;
		boolean txtTrue = true;
		
		for(int i=0; i<value.length(); i++) {
			if(Character.getType(value.charAt(i)) == 5) {
				System.out.println("한글이네요~");
				return false;
			}
			if(i == 0 && Character.isDigit(value.charAt(i))) {
				System.out.println("숫자네요~");
				return false;
			}else if(!Character.isJavaIdentifierPart(value.charAt(i))){
				System.out.println("변수 타입이 아니네요?");
				return false;
			}
		}
		
		return txtTrue;
	}
}
