
public class B03_CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			# "���ڿ�".charAt(index);
			  - �ش� ���ڿ����� ���ϴ� �ε����� ���ڸ� charŸ������ ������ �Լ�
			  - ù ��° ���ڴ� 0�� �ε����� �ִ�.
			  
			# "���ڿ�".length();
			  - �ش� ���ڿ��� �� ���� ���ڷ� �̷�����ִ��� intŸ������ ��ȯ�Ѵ�.
			  - ���ڿ� ���� - 1�� ������ ������ �ε�����.
			  
			# Scanner.next()
			  - �Է¹��� ���ڿ��� ����, ��, �ٹٲ����� �����Ͽ� �ϳ��� ������.
			  
			# Scanner.nextLine()
			  - �Է¹��� ���ڿ��� �ٹٲ����� �����Ͽ� �ϳ��� ������
		 */
		
		int len = "Hello, Everyone!!".length();
		
		System.out.println("Hello, Everyone!!".charAt(8));
		System.out.println("Hello, Everyone!!".charAt(5));
		System.out.println("Hello, Everyone!!".charAt(2));
		System.out.println("Hello, Everyone!!".charAt(3));
		System.out.println("Hello, Everyone!!".charAt(9));
		System.out.println("Hello, Everyone!!".charAt(len-1));
		System.out.println("Hello, Everyone!!".length());
		
	}

}
