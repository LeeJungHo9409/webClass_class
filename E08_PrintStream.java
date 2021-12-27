import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class E08_PrintStream {
	
	/*
		# PrintStream, PrintWriter
		 - 데이터들을 더 편리하게 출력할 수 있는 클래스
		 - printf(), println() 등의 편리한 메서드들이 구현되어 있다.
	 */
	
	public static void main(String[] args) {
		File f = new File("practice/print.txt");
		
		try( PrintWriter out = new PrintWriter(
				new BufferedWriter(
						new FileWriter(f, Charset.forName("EUC-KR"))))
			){
			out.println("Hello, PrintWriter!!");
			out.printf("이름 : %s\n", "홍길동");
			out.printf("나이 : %d\n", 25);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File f2 = new File("practice/printstream.txt");
		
		try(PrintStream out = new PrintStream(
				new BufferedOutputStream(
						new FileOutputStream(f2)));) {
			out.println("Hello, PrintStream!");
			out.println("한글쓰");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
