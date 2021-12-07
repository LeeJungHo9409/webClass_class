package quiz;

import java.util.ArrayList;

/*
	String.compare()�� �̿��Ѵٸ� �� ���ܾ��� ũ�⸦ ���� ���� �� �ִ�.
	
	�� �ܾ �����ϸ� � �ܾ ���������� ���� �����ϴ��� �˷��ִ� �޼��带 �����Ͻÿ�.
	compareTo()�� ������� ���� �����غ�����.
 */

public class D06_CompareString {
	public static void main(String[] args) {
		System.out.println(stringCompareTo("act", "actad"));
		System.out.println(stringCompareTo("act", "patds"));
		System.out.println(stringCompareTo("bec", "actad"));
	}
	
	static int stringCompareTo(String valueFirst, String valueLast) {
		
		int i;
		int lineMin;
		
		valueFirst = valueFirst.toLowerCase();
		valueLast = valueLast.toLowerCase();
		
		if(valueFirst.length() < valueLast.length()) {
			lineMin = valueFirst.length();
		}else {
			lineMin = valueLast.length();
		}
		
		//System.out.println(lineM);
		
		for(i = 0; i<lineMin;i++) {
			if(valueFirst.charAt(i) != valueLast.charAt(i)) {
				return Math.abs(valueFirst.charAt(i) - valueLast.charAt(i));
			}
		}
		
		if(valueFirst.length() == valueLast.length()) {
			return 0;
		}else if(valueFirst.length() > valueLast.length()){
			return valueFirst.charAt(lineMin)-'a';
		}else {
			return valueLast.charAt(lineMin)-'a';
		}
	}
}
