package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	# HashMap�� �̿��� ��ȭ���θ� �����غ�����.
	  
	  1. PhoneBook���� �׷�/��ȭ��ȣ/[�̸�/����/�ּ�]�� ������ �� �ִ�.
	  
	  2. �׷���� Ű������ ������ �ش� �׷��� HashMap�� ���� �� �ִ�.
	  
	  3. ���� HashMap�� ��ȭ��ȣ�� ������ �� ����� ���������� ���� �� �ִ�.
	  
	# �����ؾ� �� �޼���
	
	  1. ���ο� �׷��� �߰��ϴ� �޼���
	  
	  2. �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
	  
	  3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	  
	  4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	  
	  5. ��ϵ� ��� ��ȣ�� ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
 */

public class D07_PhoneBook {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhoneBook phs = new PhoneBook();
		
		int num = 10;
		while(num != 0) {
			System.out.println("�Է��� ���Ͻø� [1��]��");
			System.out.println("�˻��� ���Ͻø� [2��]��");
			System.out.println("���Ḧ ���Ͻø� [0��]��");
			System.out.print("�Է����ּ��� >> ");
			try {
				num = input.nextInt();
				if(num > 0 && num < 3) {
					phs.numberSet(num);
					phs.meun();
				}else if(num == 0){
					System.out.println("���� ���� �˴ϴ�");
				}else {
					System.out.println("�Է� ������ �����̽��ϴ�. �ٽ� �Է¹ٶ��ϴ�.");
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڰ� �ƴϽó׿�. �ٽ� �Է����ּ���.");
			}
		}
	}
}

class PhoneBook implements Comparable<PhoneBook>{

	Grup g;
	
	Scanner input = new Scanner(System.in);
	ArrayList<Grup> grups = new ArrayList<>();
	
	HashMap<String, HashMap<String, Object>> grupMap = new HashMap<>();
	
	String[] GRUPS_NAMES = {"����", "ģ��", "ȸ�絿��"};
	int grup;
	int number;
	
	public PhoneBook() {};
		
	public void meun(){
		switch (number) {
		
		case 1:
			grupAdd();
			break;
			
		case 2:
			while(true) {
				System.out.println("�̸�����\t�˻��� ���Ͻø� [1��]��");
				System.out.println("��ȭ��ȣ��\t�˻��� ���Ͻø� [2��]��");
				System.out.println("���ϴ� ���ذ��� �����ø� �˻��� ���Ͻø� [3��]��");
				System.out.println("���Ḧ ���Ͻø� �� ��ȣ ������ �ƹ� ��ư��");
				System.out.print("�Է����ּ��� >> ");
				
				switch (input.nextInt()) {
				case 1:
					//�̸����� �˻�
					searchName();
					break;
				case 2:
					//��ȭ��ȣ�� �˻�
					searchTel();
					break;
				case 3:
					//���ϴ� ������ ���� �� �˻�
					hashMapValue();
					break;
				default:
					return;
				}
			}
		default:
			System.out.println("???");
			return;
		}
		
		for(Grup grup : grups) {
			System.out.printf("[�׷�� : %s] %s\n", GRUPS_NAMES[g.grup],grup);
		}
	}
	
	public void hashMapValue() {
		System.out.println(grupMap.get("����"));
	}
	
	public void numberSet(int number) {
		this.number = number;
	}

	// 1. ���ο� �׷��� �߰�
	public void grupAdd() {

		int meunNum = 10;
		
		while(meunNum != 0) {
			System.out.print("�׷��� �Է����ּ��� ");
			grupMeunPrint();
			System.out.println();
			System.out.print("\t>> ");
			grup = (input.nextInt()-1);
			g = new Grup(grup);
			grups.add(g);
			grupMap.put(getGrupName(), g.personMap);
			g.p.setGrup(getGrupName());
			
			System.out.print("��� �����ϳ���? >> ");
			meunNum = input.nextInt();
		}
		
		
	}
	
	// 3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	public void searchName() {
		String name;
		System.out.print("�̸��� �Է� �ٶ��ϴ� >> ");
		name = input.next();
		
		for(int i = 0; i<grups.size(); i++) {
			Grup grup = grups.get(i);
			if(grup.p.name.contains(name)==true) {
				System.out.println(grup);
			}
		}
	}
	
	//4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	public void searchTel() {
		String tel;
		System.out.print("��ȭ��ȣ�� �Է� �ٶ��ϴ� >> ");
		tel = input.next();
		
		for(int i = 0; i<grups.size(); i++) {
			Grup grup = grups.get(i);
			if(grup.tel.contains(tel)==true) {
				System.out.println(grup);
			}
		}
	}
	
//-------------------------------------------------------------------------------------//
	public void grupMeunPrint() {
		for(int i = 0; i<GRUPS_NAMES.length; i++) {
			System.out.printf("[%d. %s]", i+1, GRUPS_NAMES[i]);
		}
	}
	
	public String getGrupName() {
		return GRUPS_NAMES[grup];
	}
//-------------------------------------------------------------------------------------//
	
	@Override
	public String toString() {
		return String.format("%s [�׷�� : %s]", grups, GRUPS_NAMES[grup]);
	}

	@Override
	public int compareTo(PhoneBook o) {
		return Integer.compare((int)g.grup, o.g.grup);
	}
}

//2. �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
class Grup implements Comparator<Person>{
	
	int grup;
	
	Scanner input= new Scanner(System.in);
	ArrayList<Person> persons = new ArrayList<>();
	
	HashMap<String, Object> personMap = new HashMap<>();
	
	Person p;
	String tel;
	
	public Grup(int grup) {
		this.grup = grup;
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� >> ");
		tel = input.next();
		p = new Person();
		persons.add(p);
		personMap.put(tel, p);
		p.setTel(tel);
		//System.out.println(persons);
	}

	@Override
	public String toString() {
		return String.format("[��ȭ��ȣ : %s] %s", tel, persons);
	}

	@Override
	public int compare(Person o1, Person o2) {
		System.out.println("�׷� �� [1��]��");
		System.out.println("��ȭ��ȣ �� [2��]��");
		System.out.println("�̸� �� [3��]��");
		System.out.println("���� �� [4��]��");
		System.out.println("�ּ� �� [5��]��");
		switch (input.nextInt()) {
		case 1:
			return o1.getGrup().compareTo(o2.getGrup());
		case 2:
			return o1.getTel().compareTo(o2.getTel());
		case 3:
			return o1.getName().compareTo(o2.getName());
		case 4:
			return Integer.compare(o1.getAge(), o2.getAge());
		case 5:
			return o1.getAddress().compareTo(o2.getAddress());
		} 
		
		
		return 0;
	}
	
}


//[�̸�/����/�ּ�]�� ����
class Person{
	
	String name, tel, grup;
	int age, address;
	String[] ADDRESS_NAMES = {"��⵵", "��û��", "������", "���", "����", "���ֵ�"};
	Scanner input= new Scanner(System.in);
	
	public Person() {
		System.out.print("�̸��� �Է��ϼ��� >> ");
		name = input.next();
		System.out.print("���̸� �Է��ϼ��� >> ");
		age = input.nextInt();
		System.out.print("�ּҸ� �Է��ϼ��� >> ");
		for(int i = 0; i<ADDRESS_NAMES.length;i++) {
			System.out.printf("[%d. %s]", i+1, ADDRESS_NAMES[i]);
		}
		address = (input.nextInt()-1);
	}
	
	void setTel(String tel) {
		this.tel = tel;
	}
	
	void setGrup(String grup) {
		this.grup = grup;
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	String getAddress() {
		return ADDRESS_NAMES[address];
	}
	
	String getTel() {
		return tel;
	}
	
	String getGrup() {
		return grup;
	}
	
	@Override
	public String toString() {
		return String.format("[�̸� : %s] "
				+ "[���� : %d] "
				+ "[�ּ� : %s]", name, age, ADDRESS_NAMES[address]);
	}
}
