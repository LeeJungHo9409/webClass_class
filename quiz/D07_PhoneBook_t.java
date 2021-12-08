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
	
	//�����ں��� �� ������ �ʱ�ȭ ����
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
	
	//1. ���ο� �׷��� �߰��ϴ� �޼ҵ�
	void addGroup(String groupName) {
		//Ű���� �������� ����
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<>());
		} else {
			System.out.println("�̹� �����ϴ� �׷��Դϴ�.");
		}
	}
	
	//2. �׷쿡 ���ο� ������ �߰��ϴ� �޼ҵ�
	void addInfo(Info info) {
		HashMap<String, Info> groupMap = phonebook.get(info.group);
		
		if(groupMap == null) {
			System.out.println("�������� ���� �׷��Դϴ�.");	
			return;
		}
		
		if(groupMap.containsKey(info.tel)) {
			System.out.println("�̹� ��ϵ� ��ȣ�Դϴ�.");
			return;
		}
		
		groupMap.put(info.tel, info);
	}
	
	public static void main(String[] args) {
		
		D07_PhoneBook_t pb = new D07_PhoneBook_t();
		
		pb.addGroup("ģ��");
		pb.addInfo(new Info("����ȣ", "1231321321", 20, "ģ��"));
		pb.addInfo(new Info("�̰�", "45454546", 19, "ģ��"));
		pb.addInfo(new Info("��ȣ��", "456789", 10, "ģ��"));
		pb.addInfo(new Info("�ڹο�", "1231456", 8, "ģ��"));
		pb.addInfo(new Info("����ȣ", "12345452", 11, "ģ��"));
		
		
		pb.addGroup("����");
		pb.addInfo(new Info("ȣ��ȣ", "1298421", 0, "ģ��"));
		pb.addInfo(new Info("ȣ��ȣ", "12112621321", 0, "����"));
		
		System.out.println("�׷����");
		Set<Info> result = pb.searchByName("��ȣ");
		System.out.println(result);
		
		System.out.println("��ȣ���");
		result = pb.searchByTel("12");
		System.out.println(result);
		
		pb.print("age",true);
		pb.print("name",true);
		pb.print("tel",false);
	}
	
	Set<Info> searchByName(String keyword) {
		Set<Info> searchResult = new HashSet<>(); // �����ڸ� Ÿ�� HashMap �ѹ� ã��
		for(String groupName : phonebook.keySet()) {
			HashMap<String, Info> group = phonebook.get(groupName); // ���� HashMap���� Tel ��ȣ�� ã�´�.			
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
		for(String groupTel : phonebook.keySet()) { // Ÿ�� HashMap �ѹ� ã��
			HashMap<String, Info> group = phonebook.get(groupTel);
			for(String phoneNumber : group.keySet()) { // ���� HashMap���� Tel ��ȣ�� ã�´�.
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
				System.out.println("���ı����� �߸���!");
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
		return String.format("[�׷�� : %s]\t[��ȭ��ȣ : %s]\t[�̸� : %s]\t[���� : %d]\n", 
				group, tel, name, age);
	}

}
