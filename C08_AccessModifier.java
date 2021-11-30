import myobj.C08_DiffPackageClass;

/*
	# ���� ������ (Access Modifier) 
	  �ٸ� Ŭ�������� �ش� Ŭ������ �ڿ��� Ȱ���Ϸ��� �� ��, ��� ������ �����Ѵ�.
	  �ܺ� class���� public�� default�ۿ� ����Ҽ� ����.
	  
	    - private	: ���� Ŭ���� ���ο����� ������ �� �ִ� �ڿ�
	    - default	: �ƹ��͵� ��������, ���� ��Ű�� ���ο����� ������ �� �ִ� �ڿ�
	    - protected	: �ٸ� ��Ű������ ��ӹ��� Ŭ���������� ������ �� �ִ� �ڿ�
	    - public	: �ٸ� ��Ű������ �����Ӱ� ������ �� �ִ� �ڿ�
	    
	# ���� �������� Ȱ��
	 
	 public���� �������� ���� ��� �ڿ����� �ٸ� ��Ű������ ������� �ʴ´�.
	 �ش� Ŭ������ �ٸ� �����ڰ� ������ ����� �� �߸��� ������� ����ϴ� ���� ���� ����
 */

public class C08_AccessModifier extends C08_DiffPackageClass{
	
	public void test() {
		//�ٸ� ��Ű������ ��ӹ޾Ƽ� ����� �� ������ �� �ִ� �ڿ� : public, protected
		//�ٸ� ��Ű������ ��ӹ޾Ƽ� ����� �� ������ �� ���� �ڿ� : default, private
		System.out.println("��Ű�� ���");
		System.out.println(super._protected_var);
		System.out.println(super._public_var);
	}
	
	public static void main(String[] args) {
		//���� ��Ű������ ������ �� �ִ� �ڿ� : public, protected, default
		//���� ��Ű������ ������ �� ���� �ڿ� : private
		C08_SamePackageClass instance1 = new C08_SamePackageClass();
		
		System.out.println("���� ��Ű��");
		System.out.println(instance1._public_var);
		System.out.println(instance1._protected_var);
		System.out.println(instance1._default_var);
		
		//myobj.C08_DiffPackageClass instance2 = new C08_DiffPackageClass();
		//import ���� ������ import �ۼ��� ����Ǵµ� �ϳ��ϳ� �� ��ߵǹǷ� ����������.
		//�ٸ� ��Ű������ ������ �� �ִ� �ڿ� : public
		//�ٸ� ��Ű������ ������ �� ���� �ڿ� : protected, default, private
		C08_DiffPackageClass instance2 = new C08_DiffPackageClass();
		
		System.out.println("�ٸ� ��Ű��");
		System.out.println(instance2._public_var);
		
	}
}
