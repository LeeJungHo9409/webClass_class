package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	# HashMap을 이용해 전화번부를 구현해보세요.
	  
	  1. PhoneBook에는 그룹/전화번호/[이름/나이/주소]를 저장할 수 있다.
	  
	  2. 그룹명을 키값으로 넣으면 해당 그룹의 HashMap을 꺼낼 수 있다.
	  
	  3. 꺼낸 HashMap에 전화번호를 넣으면 그 사람의 개인정보를 꺼낼 수 있다.
	  
	# 구현해야 할 메서드
	
	  1. 새로운 그룹을 추가하는 메서드
	  
	  2. 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
	  
	  3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	  
	  4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	  
	  5. 등록된 모든 번호를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
 */

public class D07_PhoneBook {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PhoneBook phs = new PhoneBook();
		
		int num = 10;
		while(num != 0) {
			System.out.println("입력을 원하시면 [1번]을");
			System.out.println("검색을 원하시면 [2번]을");
			System.out.println("종료를 원하시면 [0번]을");
			System.out.print("입력해주세요 >> ");
			try {
				num = input.nextInt();
				if(num > 0 && num < 3) {
					phs.numberSet(num);
					phs.meun();
				}else if(num == 0){
					System.out.println("정상 종료 됩니다");
				}else {
					System.out.println("입력 범위를 넘으셨습니다. 다시 입력바랍니다.");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자가 아니시네요. 다시 입력해주세요.");
			}
		}
	}
}

class PhoneBook implements Comparable<PhoneBook>{

	Grup g;
	
	Scanner input = new Scanner(System.in);
	ArrayList<Grup> grups = new ArrayList<>();
	
	HashMap<String, HashMap<String, Object>> grupMap = new HashMap<>();
	
	String[] GRUPS_NAMES = {"가족", "친구", "회사동료"};
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
				System.out.println("이름으로\t검색을 원하시면 [1번]을");
				System.out.println("전화번호로\t검색을 원하시면 [2번]을");
				System.out.println("원하는 기준값이 있으시면 검색을 원하시면 [3번]을");
				System.out.println("종료를 원하시면 윗 번호 제외한 아무 버튼을");
				System.out.print("입력해주세요 >> ");
				
				switch (input.nextInt()) {
				case 1:
					//이름으로 검색
					searchName();
					break;
				case 2:
					//전화번호로 검색
					searchTel();
					break;
				case 3:
					//원하는 값으로 정렬 후 검색
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
			System.out.printf("[그룹명 : %s] %s\n", GRUPS_NAMES[g.grup],grup);
		}
	}
	
	public void hashMapValue() {
		System.out.println(grupMap.get("가족"));
	}
	
	public void numberSet(int number) {
		this.number = number;
	}

	// 1. 새로운 그룹을 추가
	public void grupAdd() {

		int meunNum = 10;
		
		while(meunNum != 0) {
			System.out.print("그룹을 입력해주세요 ");
			grupMeunPrint();
			System.out.println();
			System.out.print("\t>> ");
			grup = (input.nextInt()-1);
			g = new Grup(grup);
			grups.add(g);
			grupMap.put(getGrupName(), g.personMap);
			g.p.setGrup(getGrupName());
			
			System.out.print("계속 진행하나요? >> ");
			meunNum = input.nextInt();
		}
		
		
	}
	
	// 3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	public void searchName() {
		String name;
		System.out.print("이름을 입력 바랍니다 >> ");
		name = input.next();
		
		for(int i = 0; i<grups.size(); i++) {
			Grup grup = grups.get(i);
			if(grup.p.name.contains(name)==true) {
				System.out.println(grup);
			}
		}
	}
	
	//4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	public void searchTel() {
		String tel;
		System.out.print("전화번호를 입력 바랍니다 >> ");
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
		return String.format("%s [그룹명 : %s]", grups, GRUPS_NAMES[grup]);
	}

	@Override
	public int compareTo(PhoneBook o) {
		return Integer.compare((int)g.grup, o.g.grup);
	}
}

//2. 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
class Grup implements Comparator<Person>{
	
	int grup;
	
	Scanner input= new Scanner(System.in);
	ArrayList<Person> persons = new ArrayList<>();
	
	HashMap<String, Object> personMap = new HashMap<>();
	
	Person p;
	String tel;
	
	public Grup(int grup) {
		this.grup = grup;
		System.out.print("전화번호를 입력하세요 >> ");
		tel = input.next();
		p = new Person();
		persons.add(p);
		personMap.put(tel, p);
		p.setTel(tel);
		//System.out.println(persons);
	}

	@Override
	public String toString() {
		return String.format("[전화번호 : %s] %s", tel, persons);
	}

	@Override
	public int compare(Person o1, Person o2) {
		System.out.println("그룹 순 [1번]을");
		System.out.println("전화번호 순 [2번]을");
		System.out.println("이름 순 [3번]을");
		System.out.println("나이 순 [4번]을");
		System.out.println("주소 순 [5번]을");
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


//[이름/나이/주소]를 저장
class Person{
	
	String name, tel, grup;
	int age, address;
	String[] ADDRESS_NAMES = {"경기도", "충청도", "강원도", "경상도", "전라도", "제주도"};
	Scanner input= new Scanner(System.in);
	
	public Person() {
		System.out.print("이름을 입력하세요 >> ");
		name = input.next();
		System.out.print("나이를 입력하세요 >> ");
		age = input.nextInt();
		System.out.print("주소를 입력하세요 >> ");
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
		return String.format("[이름 : %s] "
				+ "[나이 : %d] "
				+ "[주소 : %s]", name, age, ADDRESS_NAMES[address]);
	}
}
