/*
	# ���� ������
	  = : ������ ������ �������� ���� �����Ѵ�.
	  
	# ���� ���� ������
	  - ������ ����� ������Ű�� ������ �ٿ��� ǥ���Ѵ�.
	  - +=, -=, *=, ....
	  
	# ���� ������
	  - 1�� ������Ű�� ������ �� �ٿ��� ǥ���� ����
	  - ++, --�� ��ġ�� ���� ����� �޶�����.
	
*/

public class B05_Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		���Կ���
		int x=10;

//		���� ���� ����
		x*=2;
		x*=2;
		x*=2;
		x*=2;
		System.out.println(x);
		
		x=30;
		x+=3;
		System.out.println(x);
//		System.out.println(x+=3);
		System.out.println(x);
		
		System.out.println(x-=15);
		System.out.println(x*=3);
		System.out.println(x/=5);
		System.out.println(x%=3);
		
//		���� ������
		x=30;
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		x--;
		System.out.println(x);
		--x;
		System.out.println(x);
		
	}

}
