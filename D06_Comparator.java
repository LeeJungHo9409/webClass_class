import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
	# Compare
	  - ���ϴ� 
	  
	# Comparable
	  - �񱳰����ϴ�
	  - �� �������̽��� ������ Ŭ������ ���� ũ�� �񱳰� ������ Ŭ������ �ȴ�.
	  
	# Comparator
	  - ���ϴ»��
	  - �� �������̽��� ������ Ŭ������ ���� �������� ����� �� �ִ�.
 */

public class D06_Comparator {
	
	public static void main(String[] args) {
		Grape muscat = new Grape("�ӽ���",1, 100, 20, 0);
		Grape sultana = new Grape("���³�",1, 80, 30, 1);
		Grape cabernetSauvignon = new Grape("ī������ �Һ�",0, 60, 80, 2);
		Grape pinotNoir = new Grape("�ǳ� ���Ƹ�",0, 110, 10, 3);
		Grape shiraz = new Grape("�ö���", 1, 90, 52, 3);
		Grape pinotNoir1 = new Grape("�ǳ� ���Ƹ�",0, 110, 10, 2);
		Grape shiraz2 = new Grape("�ö���", 1, 90, 52, 2);
		Grape shiraz3 = new Grape("�ö���", 1, 90, 52, 1);
		
		//System.out.println(muscat.compareTo(pinotNoir));
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(muscat);
		grapes.add(sultana);
		grapes.add(cabernetSauvignon);
		grapes.add(pinotNoir);
		grapes.add(shiraz);
		grapes.add(pinotNoir1);
		grapes.add(shiraz2);
		grapes.add(shiraz3);
		
		/*
		muscat.grapePrint();
		sultana.grapePrint();
		cabernetSauvignon.grapePrint();
		pinotNoir.grapePrint();
		shiraz.grapePrint();*/
		
//		System.out.println(grapes);
//		Collections.sort(grapes);
//		System.out.println(grapes);
//		Collections.reverse(grapes);
//		System.out.println(grapes);
		
//		Collections.sort(grapes, new GrapeMachine_size());
//		System.out.println(grapes);

		System.out.println("����");
		System.out.println(grapes);
		System.out.println();
		System.out.println("���� ��");
		Collections.sort(grapes, new GrapeMachine_qty());
		System.out.println(grapes);
	}
	
}

class Grape implements Comparable{
	
	static String[] ORIGIN_NAMES = {"Japan", "Levant", "Canada", "France"};
	static String[] COLOR_NAMES = {"RED", "GREEN"};
	
	String name;
	int color;
	int size;
	int qty;
	int origin;
	
	public Grape(String name, int color, int size, int qty, int origin) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.qty = qty;
		this.origin = origin;
	}
	
	void grapePrint() {
		
		//�ش� �ν��Ͻ��� toString()�� ȣ���Ͽ� �ֿܼ� ����ϴ� �޼����̴�.
		System.out.println("name\t: " + name);
		System.out.println("Color\t: " + COLOR_NAMES[color]);
		System.out.println("Size\t: " + size);
		System.out.println("Qty\t: " + qty);
		System.out.println("Origin\t: " + ORIGIN_NAMES[origin]);
		System.out.println();
	}
	
	@Override
	public String toString() {
		// �� Ŭ������ ���ڿ��� ��ȯ�Ѵٸ� � ������� �����ϴ� �޼���
		// toString()�� �⺻ ������ ���� �ν��Ͻ��� Ŭ���� �̸��� �ּҰ��� ���ڿ��� ��ȯ�ϴ� ���̴�.
		return String.format("\n\t[%s %s %d %d %s]\n", name, COLOR_NAMES[color], size, qty, ORIGIN_NAMES[origin]);
	}

	//�߻�޼ҵ带 �������̵� ����� �ȴ�.
	@Override
	public int compareTo(Object o) {
		/* 
			# �� �޼ҵ��� ��Ģ
			  - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� ������ -1�� �����ؾ� �Ѵ�.	(�Ǵ� ����)
			  - ���� �ν��Ͻ��� �Ű������� ���޵� �Κ��Ͻ����� ũ�� 1�� �����ؾ� �Ѵ�.		(�Ǵ� ���)
			  - �� �ν��Ͻ��� ���� ���� ���̶�� 0�� �����ؾ� �Ѵ�.
			  - �� �⺻ Ÿ���� compare �޼��带 ���� ���� ũ�� �񱵸� �� �� �ִ�.
		 */
		
//		if(this.qty < ((Grape) o).qty) {
//			return -1;
//		}else if(this.qty > ((Grape) o).qty) {
//			return 1;
//		}else {
//			return 0;
//		}
		return Integer.compare(this.qty, ((Grape)o).qty);
		
	}
}

class GrapeMachine_size implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		return Integer.compare(o1.size, o2.size);
	}
}

class GrapeMachine_qty implements Comparator<Grape>{
	
	@Override
	public int compare(Grape o1, Grape o2) {
		
		int temp = Integer.compare(o1.qty, o2.qty) * -1;
		
		//���� �̸� �� / �ε��� �ƴ�!
		if(temp == 0) {
			return o1.ORIGIN_NAMES[o1.origin].compareTo(o2.ORIGIN_NAMES[o2.origin]);
		}else {
			return temp;
		}
	}
}