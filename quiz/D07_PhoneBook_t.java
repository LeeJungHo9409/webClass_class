package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
		HashSet, HashMap, Colloction, compare, compareTo, ArrayList
 */


public class D07_PhoneBook_t {
	
	static HashMap<String, Comparator> comparators = new HashMap<>();
	
	//생성자보다 더 빠르게 초기화 가능
	static {
		comparators.put("name", new NameComparator());
		comparators.put("group", new GroupComparator());
		comparators.put("tel", new TelComparator());
		comparators.put("age", new ageComparator());
	}
	
	private static class NameComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			return o1.name.compareTo(o2.name);
		}
		
	}
	
	private static class GroupComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			return o1.group.compareTo(o2.group);
		}
		
	}
	
	private static class TelComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			return o1.tel.compareTo(o2.tel);
		}
		
	}
	
	private static class ageComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.age, o2.age);
		}
		
	}
	
	HashMap<String, HashMap<String, Info>> phonebook = new HashMap<>();
	String groupName;
	
	//1. 새로운 그룹을 추가하는 메소드
	void addGroup(String groupName) {
		//키값이 없을때만 실행
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());
		} else {
			System.out.println("이미 존재하는 그룹입니다.");
		}
	}
	
	//2. 그룹에 새로운 데이터 추가하는 메소드
	void addInfo(Info info) {
		HashMap<String, Info> groupMap = phonebook.get(info.group);
		
		if(groupMap == null) {
			System.out.println("존재하지 않은 그룹입니다.");	
			return;
		}
		
		if(groupMap.containsKey(info.tel)) {
			System.out.println("이미 등록된 번호입니다.");
			return;
		}
		
		groupMap.put(info.tel, info);
	}
	
	public static void main(String[] args) {
		
		D07_PhoneBook_t pb = new D07_PhoneBook_t();
		
		pb.addGroup("친구");
		pb.addInfo(new Info("이정호", "1231321321", 20, "친구"));
		pb.addInfo(new Info("이경", "45454546", 19, "친구"));
		pb.addInfo(new Info("장호준", "456789", 10, "친구"));
		pb.addInfo(new Info("박민영", "1231456", 8, "친구"));
		pb.addInfo(new Info("김정호", "12345452", 11, "친구"));
		
		
		pb.addGroup("가족");
		pb.addInfo(new Info("호이호", "1298421", 0, "친구"));
		pb.addInfo(new Info("호이호", "12112621321", 0, "가족"));
		
		System.out.println("그룹출력");
		Set<Info> result = pb.searchByName("이호");
		System.out.println(result);
		
		System.out.println("번호출력");
		result = pb.searchByTel("12");
		System.out.println(result);
		
		pb.print("age",true);
		pb.print("name",true);
		pb.print("tel",false);
	}
	
	Set<Info> searchByName(String keyword) {
		Set<Info> searchResult = new HashSet<>(); // 따지자면 타겟 HashMap 한번 찾고
		for(String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName); // 들어온 HashMap에서 Tel 번호로 찾는다.			
			for(String phoneNumber : group.keySet()) {
				Info info = group.get(phoneNumber);
				if(info.name.contains(keyword)) {
					searchResult.add(info);
				}
			}
		}
		return searchResult;
	}
	
	Set<Info> searchByTel(String keyword) {
		
		Set<Info> searchResult = new HashSet<>();
		for(String groupTel : phonebook.keySet()) { // 타겟 HashMap 한번 찾고
			HashMap<String, Info> group = phonebook.get(groupTel);
			for(String phoneNumber : group.keySet()) { // 들어온 HashMap에서 Tel 번호로 찾는다.
				Info info = group.get(phoneNumber);
				if(info.tel.contains(keyword)) {
					searchResult.add(info);
				}
			}
		}
		return searchResult;
	}
	
	public void print(String columnName, boolean asc) {
		
		for(String groupName : phonebook.keySet()) {
			System.out.println("#### " + groupName + " ####" );
			
			List<Info> infos = new ArrayList<>(phonebook.get(groupName).values());
			
			if(!comparators.containsKey(columnName)) {
				System.out.println("정렬기준이 잘못됨!");
				return;
			}
			
			Collections.sort(infos, comparators.get(columnName));
			
			if(!asc) {
				Collections.reverse(infos);
			}
			
			for(Info info : infos) {
				System.out.println(info);
			}
		}
	}

}

class Info{
	String name, tel, group;
	int age;
	public Info(String name, String tel, int age, String group) {
		this.age = age;
		this.name = name;
		this.tel = tel;
		this.group = group;
	}
	
	@Override
	public String toString() {
		return String.format("[그룹명 : %s]\t[전화번호 : %s]\t[이름 : %s]\t[나이 : %d]\n", 
				group, tel, name, age);
	}

}
