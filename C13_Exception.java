import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	# 예외처리 (Exception)
	
	  - 우리가 에러라고 생각했던 빨간 글씨를 예외라고 부른다.
	  - 자바 문법을 틀리는 것은 예외가 아니라 컴파일 에러(문법 오류)라고 부른다.
	  - 프로그래머가 발생 할 예외를 예측하고 대비해두는 것을 예외처리라고 부른다.
	  - 예외처리의 기본 동작은 프로그램 강제 종료이다.
	
	  - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다.
	  - try문 내부에서 예외가 발생하지 않으면 모두 정상 실행된다.
	  - try문 내부에서 예외가 발생하면 즉시 try문 실행을 중단하고 발생한 예외에 해당하는
	  	catch문으로 넘어가게 된다.
	  - 예외 발생시 catch문에는 발생한 예외에 대한 정보를 담고 있는 인스턴스가 전달된다.
	  - catch문은 중첩이 가능하다.
	  - 예외 발생 여부와 관계없이 무조건 실행하고 싶은 코드는 finally에 작성한다

 */

public class C13_Exception {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		
		
		//순서 중요하다.
		try {
			System.out.print("숫자입력 : ");
			input.nextInt();
			
			System.out.println(arr[(int)(Math.random() * 20)]);
			int a = 10 / 0;
			
		}catch (InputMismatchException e) {
			System.out.println("숫자입력하시라구요..");
			System.out.println("## ERR ##");
			System.out.println("Error Message : " + e.getMessage());
			System.out.println("stack tracce : " + e.getStackTrace());
			
			//스텍 추적
			e.printStackTrace();
			
			//위껄 풀어서 보는 방법
//			StackTraceElement[] st = e.getStackTrace();
//			for(int i = 0; i<st.length; i++) {
//				System.out.println(st[i]);
//			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("님 잘못실행함!");
		}catch (ArithmeticException e) {
			System.out.println("0 나누기 안되요~");
		}catch (Exception e) {
			System.out.println("위의 경우 제외한 모든 예외를 처리 쌉가능");
		}finally {
			System.out.println(" /) /)");
			System.out.println("(  ' ')");
			System.out.println("(  >$ )");
		}
		
		System.out.println("실행중");
	}
}