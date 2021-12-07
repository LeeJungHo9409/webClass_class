import java.util.ArrayList;

/*
	# Generic
	
	 - Ŭ���� ���� �ڿ��� Ÿ���� �ܺο��� ���߿� ������ �� �ְ� ����� ����
	 - �����ڰ� �ν��Ͻ� ������ ���׸��� ������ �� �ִ�.
	 - ������ ������ ���� �ִ�.
	 - ���׸����� �⺻ Ÿ���� ����� �� ���� ������ Wrapper Ŭ������ ����ؾ� �Ѵ�.
	 
	# Static Generic
	
	 - ����ƽ �޼��忡 ���׸��� ����� ���� ����Ÿ�� �տ� ���׸��� �߰����ش�.
	 - Ŭ������.<T>�޼����() ���� ����� �� �ִ�.
 */

public class D05_Generic {

	public static void main(String[] args) {
		Box<Integer> numberBox = new Box<>();
		numberBox.items = new Integer[20];
		
		Box2<Integer, Character, String> strBox = new Box2<>();
	}
	
}

class Box<Type> {
	
	//���׸��� �迭�޼���� ���� �� ����.
	Type[] items;
	
}

class Box2<Type1, Type2, Type3>{
	ArrayList<Type1> items1 = new ArrayList<>();
	ArrayList<Type2> items2 = new ArrayList<>();
	ArrayList<Type3> items3 = new ArrayList<>();
}
