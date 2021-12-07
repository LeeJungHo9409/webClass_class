package quiz;

import java.util.ArrayList;

/*
	String.compare()를 이용한다면 두 영단어의 크기를 쉽게 비교할 수 있다.
	
	두 단어를 전달하면 어떤 단어가 사전상으로 먼저 등장하는지 알려주는 메서드를 구현하시오.
	compareTo()를 사용하지 말고 구현해보세요.
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
