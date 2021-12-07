
public class D04_WrapperClass {
	/*
		# Wrapper Class
		
		  - 기본 타입들을 참조형 타입으로 감싸놓은 클래스들
		  - 각 기본 타입들에 대한 유용한 기능들이 모여있다.
		  
		# 기본형 타입들
		  
		  - byte, short, char, int, long, float, double, boolean
		  
		# 각 기본형 타입에 대한 참조형 이름들 (int, char 타입 제외하곤 다 앞글자 대문자)
		
		  - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	
	public static void main(String[] args) {
		/*
			# Parsing
			
			  - 문자열을 해당 타입의 값으로 변환하는 것
			  - 각 Wrapper 클래스에 static 메소드로 존재한다.  
		 */
		
		//스트링 -> 인티저 타입으로
		int integerNum = Integer.parseInt("123456");
		System.out.println(integerNum);
		
		//스트링 -> 블리언 타입으로 소문자든 대문자든 상관없이 ("true" 만 그외는 false로 자동 입력)
		Boolean booleanResult = Boolean.parseBoolean("True");
		System.out.println(booleanResult);
		
		/*
			# toString
			  
			  - 각 타입의 값을 문자열로 변환하는 기능
			  - 원하는 진법(radix)을 선택할 수도 있다.
		 */
		
		String hex = Double.toHexString(56782156.121254);
		System.out.println(hex);
		//진법으로 바꾸기
		System.out.println(Integer.toString(52345));
		System.out.println(Integer.toString(52345, 2));
		System.out.println(Integer.toString(52345, 8));
		System.out.println(Integer.toString(52345, 16));
		
		//각 타입들의 최대/최소값을 가지고 있는 상수들 ----- 변수 선언없이 사용가능
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		//RADIX는 진법이다. 즉 36 진법이 가장 크게 표현할 수 있다
		System.out.println(Character.MAX_RADIX);
		
		//Character에는 문자에 편하게 다룰 수 있는 static 메서드들이 많다.
		//물론 new Character() 이론상 사용가능하지만 자바에서 자체적으로 막아두었기에 사용할 일이 없을것이다.
		System.out.println("이거 알파벳? " + Character.isAlphabetic('3'));
		System.out.println("이거 알파벳? " + Character.isAlphabetic('Y'));
		
		System.out.println("이거 10진수? " + Character.isDigit('3'));
		System.out.println("이거 10진수? " + Character.isDigit('A'));
		
		//character.isSpace 애도 있는데 아래껄 권장함.
		System.out.println("이거 빈공간? " + Character.isSpaceChar('\t'));
		//아스키코드
		System.out.println(Character.SPACE_SEPARATOR);
		System.out.println(Character.LINE_SEPARATOR);
		System.out.println(Character.PARAGRAPH_SEPARATOR);
		
		System.out.println("이거 소문자? " + Character.isLowerCase('D'));
		System.out.println("이거 소문자? " + Character.isLowerCase('d'));
		System.out.println("이거 대문자? " + Character.isUpperCase('D'));
		System.out.println("이거 대문자? " + Character.isUpperCase('d'));
		
		System.out.println("이 문자의 타입? " +Character.getType('K'));
	} 
}





















