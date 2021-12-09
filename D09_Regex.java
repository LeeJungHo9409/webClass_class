import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
		# 정규표현식(Regular Expression)
		  
		  - 문자열을 패턴으로 검사할 수 있는 표현식
		  - 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙
		  - 정의한 문자열 패턴과 일치하는 문자열을 걸러낼 수 있다.
		  
		# 자바에서 정규표현식을 다룰 떄 사용하는 클래스
		
		  - Pattern
		  - Matcher
	 */
	
	public static void main(String[] args) {
		
		//정규표현식 : 검사할 문자 Pattern.matches(regex, input) : 
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// []: 해당 위치의 한 글자에 어떤 문자들이 올 수 있는지 정의하는 표현식
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]ee[pk]", "sheek"));
		System.out.println(Pattern.matches("s[lh]ee[ABCDEFG]", "sheeG"));
		System.out.println(Pattern.matches("s[lh]ee[a-zA-Z]", "sheeD"));
		System.out.println(Pattern.matches("s[lh]ee[\\-]", "shee-"));
		
		/*
		 	정규표현식에는 공백허용 안함. 즉, 단어들만 가능.
			[abc] : a 또는 b 또는 c를 모두 허용
			[a-z] : 소문자 모두 허용
			[A-D] : 대문자 모두 허용
			[\\\\]: 역슬래시를 전달하면 escape 역활을 하게 된다.
			[a-e&&c-z] : a-e와 c-z를 모두 만족시키는 문자를 허용 (교집합)
			
			# 하나로 여러 문자를 나타내느 것들
			  .		: 모든 문자
			  [\\d]	: 모든 숫자
			  [\\D]	: 숫자를 제외한 모든 것
			  \s	: 모든 공백
			  \S	: 공백을 제외한 모든 것들
			  \w	: 일반적인 문자들을 허용 [a-zA-Z0-9_]
			  \W	: \w를 제외한 모든 것 
			  
			# 해당 패턴이 적용될 문자의 개수를 설정하는 방법
			  .{n} 	: {}앞의 패턴이 n개 일치해야 한다.
			  .{n,m}: {}앞의 패턴이 최소 n개 최대 m개 일치해야 한다.
			  .{n,}	: {}앞의 패턴이 최소 n개 이상 일치해야한다.
			  .? 	: ? 앞의 패턴이 0번 또는 한번 나와야 한다.
			  .+	: + 앞의 패턴이 최소 한번 이상 나와야 한다.
			  .*	: * 앞의 패턴이 0번 이상 나와야 한다.
			  
		 */
		System.out.println(Pattern.matches("[a-d&&b-f]", "a"));
		System.out.println(Pattern.matches("...", "abc"));
		System.out.println(Pattern.matches("\\d..", "7bc"));
		System.out.println(Pattern.matches("[\\da]..", "abc"));
		System.out.println(Pattern.matches("\\d\\s..", "7 bc"));
		System.out.println(Pattern.matches("\\d\\s..", "7\nbc"));
		
		System.out.println(Pattern.matches(".{5}", "12345"));
		System.out.println(Pattern.matches("\\D{8}", "#$@%abcd"));
		System.out.println(Pattern.matches("\\D{2,4}", "#$@%abcd"));
		System.out.println(Pattern.matches("\\D{5,}", "#$@%abcd"));
		
		//차이점
		System.out.println(Pattern.matches("abc\\d", "abc"));
		System.out.println(Pattern.matches("abc\\d?", "abc"));
		
		//최소 한번 이니까.
		System.out.println(Pattern.matches("abc\\d+", "abc"));
		System.out.println(Pattern.matches("abc\\d+", "abc111"));
		
		//없어도 트루고 있어도 트루다.
		System.out.println(Pattern.matches("abc\\d*", "bc"));
		System.out.println(Pattern.matches("abc\\d*", "abc111"));
		
		//연습문제 : 해당 문자열이 핸드폰 번호인지 검사할 수 있는 경규표현식을 만들어보세요
		System.out.println(Pattern.matches("010\\-\\d{4}\\-\\d{4}", "010-1224-1234") ? "핸드폰 번호 입니다." : "핸드폰 번호 형식이 틀립니다.");
		//연습문제 : 해당 문자열이 이메일인지 검사할 수 있는 경규표현식을 만들어보세요
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.?[a-zA-Z]+)*","dssdf123@na12r.co#") ? "이메일입니다." : "이메일이 아닙니다.");
		
		// Matcher 클래스로 긴 문자열 검사하기
		String fruits = "apple/banana/kiwi/mango/pineapple/redapple/greenapple/apple";
		
		// 1. 원하는 정규표현식을 컴파일하여 인스턴스를 생성
		Pattern pattern = Pattern.compile("apple");
		// 2. 컴파일 한 정규표현식으로 원하는 문자열을 검사하기 위한 Matcher 인스턴스가 반환된다.
		Matcher matcher = pattern.matcher(fruits);
		
		// 3. matcher를 이용해 검사를 진행한다.
		if(matcher.find()) {
			System.out.println("-----------------------------");
			System.out.println("찾은것: " + matcher.group());
			System.out.println("찾은것의 시작 위치 : " + matcher.start());
			System.out.println("찾은것의 마지막 위치 : " + matcher.end());
		}
		
		
	}

}
















