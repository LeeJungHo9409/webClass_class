public class A02_Variable {
	/*
	 * # ���� (Variable) - �����͸� ���� �� �ִ� ���� (���� �� �ִ� ��) - ������ �ݵ�� ���� ����ϰڴٰ� ������ �ڿ� ����ؾ�
	 * �Ѵ�. - ���� {} ���ο��� ���� �̸��� ������ �ٽ� ������ �� ����. - ������ ������ {}�� ����� �״´� (������ �����ֱ�)
	 */
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		// '=' ���Կ���
		// ���� ����ÿ��� �� ������ ������ �������� Ÿ���� ��������Ѵ�.
		
		int x = 1234321;
		char sp = 65;
		double y = 123.3211232143435643653435;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(sp);
		
		/*
			# ������ ���� (declare, declaration)
			  - ������ ������ ���� �տ� Ÿ���� ���� �ڿ� �������� ���´�.
			  - ���� �Ŀ� �ش� ������ ó������ ���� �ִ� ���� �ʱ�ȭ��� �Ѵ�.
			  - ���� �Ŀ� �ʱ�ȭ ���� ���� ������ ����� �� ����
			  - ����� ���ÿ� �ʱ�ȭ �� ���� �ְ� ���߿� �ʱ�ȭ�� ���� �ִ�.
		*/	
		
		int sum;
		int apple;
		int banana;
		
		apple = 'a';
		banana = 'b';
		
		System.out.println(apple * banana);
		
		/*
			2.����� ���ÿ� �ʱ�ȭ�ϱ�
		*/
		int a=3, b=2, c=1;
		int peach = 500;
		int grape = 1200;
		
		System.out.println(peach = peach * a);
		System.out.println(peach = peach * b);
		
		System.out.println(peach);
		

	}

}
