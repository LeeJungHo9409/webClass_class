
public class D08_String {
	public static void main(String[] args) {
		String fruits = "apple/banana/kiwi/grape/pineapple/melon/watermelon/grapefruit";
		
		//split(delim) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다.
		String[] split_result = fruits.split("/"); 
		for(String fruit : split_result) { System.out.println(fruit); }
		
		// join(delim, iterable ....) : 여러 문자열을 연결한다. iterable -> foreact도 들어갈 수 있다.
		// static 메소드라 인스턴스를 접근해도 상관없음
		String join_result = String.join(", ", split_result);
		System.out.println(join_result);
		
		System.out.println(String.join(".", "감자","고구마","호박","참외","가지","오이"));
		
		// contains(seq): 해당 문자열이 포함되어 있는지 검사한다.
		System.out.println("mango : 포함?" + fruits.contains("mango"));
		System.out.println("apple : 포함?" + fruits.contains("apple"));
		
		// startsWith(seq) : 해당 문자열로 시작하는지 검사
		String url = "http://www.naver.com";
		
		System.out.println("443?" + url.startsWith("https://"));
		System.out.println("80?" + url.startsWith("http://"));
		System.out.println("21?" + url.startsWith("ftp://"));
		
		String fileName = "screenshot.jpg";
		
		// endsWith(seq) : 해당 문자열로 끝나는지 검사한다.
		System.out.println(".com? " + url.endsWith(".com"));
		System.out.println(".co.kr? " + url.endsWith(".co.kr"));
		System.out.println(".net? " + url.endsWith(".net"));
		System.out.println(".go.kr? " + url.endsWith(".go.kr"));
		
		System.out.println(".jpeg? " + fileName.endsWith(".jpeg"));
		System.out.println(".jpg? " + fileName.endsWith(".jpg"));
		System.out.println(".exe? " + fileName.endsWith(".exe"));
		
		//replace(old, new) :
		String email = "billgates@microsoft.com";
		String replaced = email.replace("microsoft", "linux");
		
		System.out.println("Before replace : " + email);
		System.out.println("After replace : " + replaced);
		
		// substring(start) : 문자열을 start부터 마지막까지 자른 인스턴스를 반환한다.
		// substring(start, end) : 문자열을 start부터 end미만까지 자른 인스턴스를 반환한다.
		System.out.println(email.substring(8));
		System.out.println(email.substring(8, 12));
		
		//toUpperCase() : 문자열을 모두 대문자로 변환한 인스턴스를 반환한다.
		//toLowerCase() : 문자열을 모두 소문자로 변환한 인스턴스를 반환한다.
		System.out.println(email.toUpperCase());
		
		fruits = "apple/banana/kiwi/grape/pineapple/melon/watermelon/grapefruit/";
		
		//indexOf(seq) : 원하는 문자열의 인덱스를 반환한다.
		//indexOf(seq, start) : start부터 원하는 문자열을 찾아 인덱스를 반환한다.
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.indexOf("apple", 1));
		
		fruits += fruits;
		fruits += fruits;
		fruits += fruits;
		
		System.out.println(fruits);
		
		String[] result = fruits.split("/");
		//18인덱스
		
		int found = -1;
		while((found = fruits.indexOf("grape", found + 1)) != -1) { System.out.println(found); }
		
		String today = String.format("%d년 %d월 %d일", 2021,12,8);
		System.out.println(today);
		
		
		//문자열 값을 반환한다. 객체도 됨..
		String str = String.valueOf(123.1234);
	}
}
