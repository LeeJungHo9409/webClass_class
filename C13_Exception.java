import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	# ����ó�� (Exception)
	
	  - �츮�� ������� �����ߴ� ���� �۾��� ���ܶ�� �θ���.
	  - �ڹ� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ����(���� ����)��� �θ���.
	  - ���α׷��Ӱ� �߻� �� ���ܸ� �����ϰ� ����صδ� ���� ����ó����� �θ���.
	  - ����ó���� �⺻ ������ ���α׷� ���� �����̴�.
	
	  - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��.
	  - try�� ���ο��� ���ܰ� �߻����� ������ ��� ���� ����ȴ�.
	  - try�� ���ο��� ���ܰ� �߻��ϸ� ��� try�� ������ �ߴ��ϰ� �߻��� ���ܿ� �ش��ϴ�
	  	catch������ �Ѿ�� �ȴ�.
	  - ���� �߻��� catch������ �߻��� ���ܿ� ���� ������ ��� �ִ� �ν��Ͻ��� ���޵ȴ�.
	  - catch���� ��ø�� �����ϴ�.
	  - ���� �߻� ���ο� ������� ������ �����ϰ� ���� �ڵ�� finally�� �ۼ��Ѵ�

 */

public class C13_Exception {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		
		
		//���� �߿��ϴ�.
		try {
			System.out.print("�����Է� : ");
			input.nextInt();
			
			System.out.println(arr[(int)(Math.random() * 20)]);
			int a = 10 / 0;
			
		}catch (InputMismatchException e) {
			System.out.println("�����Է��Ͻö󱸿�..");
			System.out.println("## ERR ##");
			System.out.println("Error Message : " + e.getMessage());
			System.out.println("stack tracce : " + e.getStackTrace());
			
			//���� ����
			e.printStackTrace();
			
			//���� Ǯ� ���� ���
//			StackTraceElement[] st = e.getStackTrace();
//			for(int i = 0; i<st.length; i++) {
//				System.out.println(st[i]);
//			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("�� �߸�������!");
		}catch (ArithmeticException e) {
			System.out.println("0 ������ �ȵǿ�~");
		}catch (Exception e) {
			System.out.println("���� ��� ������ ��� ���ܸ� ó�� �԰���");
		}finally {
			System.out.println(" /) /)");
			System.out.println("(  ' ')");
			System.out.println("(  >$ )");
		}
		
		System.out.println("������");
	}
}