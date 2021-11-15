
/*
	  # Eclipse 유용한 단축키
		- Ctrl + F11 : 빌드
		- Ctrl + [+, -] : 글씨 크기 조절
		- Ctrl + M : 해당 창 최대/최소화 
		- Ctrl + X : 잘라내기
		- Ctrl + C : 복사
		- Ctrl + V : 붙여넣기
		- Ctrl + w : 코딩창 닫기
		- Ctrl + Shift + w : 모든 코딩창 닫기
		- Alt + 방향키 : 줄 바꾸기
		
	  # 블록지정 관련
	  	- Shift + 방향키 : 방향키 블록 지정
	  	- Home : 커서를 해당 줄의 맨 앞으로 이동
		- End : 커서를 해당 줄의 맨 뒤로 이동
		
	  # 들여쓰기 관련
	  	- Tab : 들여쓰기
	  	- Shift + Tab : 거꾸로 들여쓰기
	  	- Ctrl + Shift + F : 해당 파일의 모든 Java 코드를 자동으로 들여쓰기
	
	  # Windows 관련  	
	  	- [Win] + d : 바탕화면 바로 보기
	  	- [Win] + e : 탐색기
	  	- [Win] + 방향키 : 창 크기 조절 하기
	  	- [Win] + [Shift] + s : 캡쳐
*/

public class A01_Escape {
	/*
	 # Escape 문자
	   - 특수한 기능을 가진 문자들을 표현하기 위한 문법
	   - 그냥 출력하려고 하면 여러 문제가 발생하는 문자들을 안전하게 출력할 수 있다.
	   - 앞에 \(역슬래시)가 붙은 문자는 컴파일러가 이스케이프 문자로 간주한다.
	   - 앞에 붙은 역슬래시와 뒤의 한 문자를 합쳐 하나의 문자로 인식한다.
	 */
	public static void main(String[] args){
		
		System.out.println("\\\\코드값 : "+(int)'\\'+'\n');
//		\\ : Escape Sequence 기능을 사용하지 않고 콜솔창에 출력을 위한 방법
		
		System.out.println("???");
		System.out.println("??\n?");
		System.out.println("\\n코드값 : " + (int)'\n');
//		\n : 줄바꿈을 해당하는 이스케이프 문자 (linefeed, breakline, newline)
		
		System.out.println("\n하이\t요!\t\n\\t코드값 : "+(int)'\t');
//		\t : 탭기능
		
		System.out.println("\n\" 코드값 \"");
		System.out.println("\\\" 코드값 : " + (int)'\"');
//		\" : 그냥 "를 출력하기 위한 이스케이프 문자
		
		System.out.println("\n\'코'");
		System.out.println("\\\' 코드값 : " + (int)'\'');
//		\' : 그냥 '를 출력하기 위한 이스케이프 문자
	}
}





























