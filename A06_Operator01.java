
public class A06_Operator01 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		/*
			# ������ (Operator)
			  - ����� �� ����ϴ� ��
			  - +, -, *, / ...
			  
			# ��� ������
			  - +, -, *, /, %
			  
		*/
		
		int a=10, b=7;
		double c=7.0;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
//		�������� ������ �� ���Ѵ�.
		System.out.println(a/b);
//		���꿡 �Ǽ��� ���ԵǾ� ������ ��Ȯ�� ����� �Ѵ�.
		System.out.println(a/c);
		
		System.out.println(a%b);
		
//		���� �ƴ� ��Ʈ������ Math.pow(a,b) �̰� ������
		System.out.println(a^b);
		double result = Math.pow(2, 4);
		System.out.println(result);
		System.out.println(Math.pow(2, 5));
		
//		Math.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�.
		System.out.println(Math.sqrt(49));
		System.out.println(Math.sqrt(50));
		
//		Math.abs(a) : a�� ���밪�� ���ؼ� ��ȯ�Ѵ�.
		System.out.println(Math.abs(-55));
		
//		Math.round(a) : a���Ҽ� ù° �ڸ����� �ݿø��� ����� ��ȯ
		System.out.println(Math.round(123.6));
		System.out.println(Math.round(523.1));
		
//		Math.round()�� ���ϴ� �ڸ��� �ݿø��ϱ�..
		double value =333.3456789;
		value*=10000;
		System.out.println(Math.round(value)/10000.0);
	}

}
