package quiz;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	�ܾ �����ϸ� �ش� �ܾ �ڹ��� �����ν� ����ҵ� �� �ִ���
	�Ǻ����ִ� �޼��带 ����� �׽�Ʈ �غ�����.
 */

public class D04_IsJavaVariable {
	
	public static void main(String[] args) {
		String value;
		Scanner input = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("�ܾ �ۼ����ּ��� >> ");
				value = input.nextLine();
				
				if(test(value) == true) {
					System.out.println("�������");
					break;
				}
				
				System.out.println("������~ �ȵǳ׿�!");
			} catch (InputMismatchException e) {
				System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
			}
		}
	}
	
	static boolean test(String value) {
		int txt;
		boolean txtTrue = true;
		
		for(int i=0; i<value.length(); i++) {
			if(Character.getType(value.charAt(i)) == 5) {
				System.out.println("�ѱ��̳׿�~");
				return false;
			}
			if(i == 0 && Character.isDigit(value.charAt(i))) {
				System.out.println("���ڳ׿�~");
				return false;
			}else if(!Character.isJavaIdentifierPart(value.charAt(i))){
				System.out.println("���� Ÿ���� �ƴϳ׿�?");
				return false;
			}
		}
		
		return txtTrue;
	}
}
