

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

/*
	# throw
	 - 즉시 원하는 예외를 발생시킨다.
	 
	# throws
	 - 해당 메서드에서 발생할 수 있는 예외에 대한 처리를 메서드를 호출한 곳으로 미룰 수 있다.
	 
	# 꼭 처리하지 않아도 되는 예외
	 - RuntimeException 클래스를 상속 받은 예외들은 반드시 처리하지 않아도 된다.
	 - 예외 처리를 하지 않아도 컴파일 에러는 발생하지 않느다.
	 
	# 필수로 처리해야되는 예외
	 - Exception 클래스를 상속받은 예외들은 처리하지 않으면 컴파일이 불가능하다.
	 - 반드시 try - catch로 처리 되어야 컴파일 진행 가능
 */

public class C14_Throw {
	
	
	//쓰로우 애들을 필수적으로 처리해야된다! 라고 생각하면 좋음. 예외처리를 전가, 미룬다 가능!
	public static int awesomeMothod2() throws FileNotFoundException, IOException {
		switch ((int)(Math.random()*10)) {
		case 0:
			throw new IOException("IOExecption 11111111111111111");
		case 1:
			throw new FileNotFoundException("1임");
		case 2:
			throw new IOException("IOExecption 22222222222222222");
		default:
			throw new IllegalArgumentException("뱅뱅");
		}
	}
	
	public static int awesomeMothod() {

		try {
			switch ((int)(Math.random()*10)) {
			case 0:
				throw new IOException("IOExecption 11111111111111111");
			case 1:
				throw new FileNotFoundException("1임");
			case 2:
				throw new IOException("IOExecption 22222222222222222");
			default:
				throw new IllegalArgumentException();
			}
		}catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public static void main(String[] args) {

		try {
			awesomeMothod2();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
