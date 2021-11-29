
/*
	# Ŭ���� ���ο� Ŭ���� ����ϱ�
	
	  - Ŭ���� ���ο��� Ŭ������ �����ϰ� ����Ҽ� �ִ�.
	  - Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ�.
	  
 */
public class C03_InnerClass {
	public static void main(String[] args) {
		//����ƽ inner Ŭ����
		new OuterClass.StaticInnerClass();
		
		//�ν��Ͻ� inner Ŭ����
		new OuterClass().new InnerClass();
	}
}


class OuterClass{
	int a;
	int b;
	
	//��� �ν��Ͻ����� �����ϰ� ��� �����ϴ�.
	//���� ���ÿ� ��� ����
	//Ŭ�����ȿ� Ŭ�������� �Ϲ� �޼ҵ�ó�� private.. �� ���� �ֵ� ��밡�� 
	
	static class StaticInnerClass{
		
	}
	
	//OuterClass�� ������ �Ǿ�� InnerCalss�� ��� ����
	class InnerClass{
		
	}
}
