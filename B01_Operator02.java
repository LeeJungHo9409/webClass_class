
public class B01_Operator02 {
	
	public static void main(String[] args) {
		/*
			# �� ������
			  - �� ���� ���Ͽ� �� �Ǵ� ������ ����� ���� ����
			  - �� ������ ����� boolean Ÿ�� ���̴�
			  - ��� ����� �Բ� ����ϸ� ��� ������ ���� ����Ѵ�.
			  - �ε�ȣ�� ���� ���;��Ѵ�. (ex. => x)
		*/
		
		
		int a=10, b=7;
		
		System.out.printf("a�� %d�̰�, b�� %d�϶�", a, b);
		System.out.println("a==b :" + (a==b));
		System.out.println("a!=b :" + (a!=b));
		System.out.println("a>b :" + (a>b));
		System.out.println("a<b :" + (a<b));
		System.out.println("a<=b :" + (a<=b));
		System.out.println("a>=b :" + (a>=b));
		
		/*
			# �� ������
			  - boolean Ÿ�� ������ �ϴ� ����
			  - �� ����� �� ������ �Բ� ������ �� ������ ���� ����Ѵ�.
			  - &&(AND) �� ���� true �϶� // ||(OR) �� �� �� �ϳ��� true ����
			  - ! : NOT
		*/
		
		System.out.println(true && true);
		System.out.println(true && false);
		
		System.out.println(true || true);
		System.out.println(true || false);
		
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
