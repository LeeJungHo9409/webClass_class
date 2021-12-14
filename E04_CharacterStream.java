import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E04_CharacterStream {
	
	/*
		# InputStream / OutputStream
		
		 - byte단위로 데이터를 전송
		 
		# Reader / Writer
		 
		 - char단위로 데이터를 전송
		 - 2byte 이상의 데이터를 전송할떄는 어떤 방식(Charset, 문자집합)으로 쪼개고 합칠것인지를 정해야한다.
		  								어떤 문자Set을 사용할지 정해야 한다.
		
		# Charset
		 - ASCII코드 까지는 모든 문자셋이 동일하지만 그 이후의 문자 코드 각 회사가 독자적으로 만들었다.
		 - MS949	: 마이크로소프트의 문자셋
		 - EUC-KR	: 이클립스가 좋아하는 문자셋
		 - UTF-8	: 가장 표준이 되는 문자셋
		 
		# incoding -> 0,1 -> decoding -> 우리가 알수있는...
	 */
	
	public static void main(String[] args) {
		File testFile = new File("practice/char.txt");
		
		//문자단위로 전송가능
		try (FileWriter out = new FileWriter(testFile, Charset.forName("UTF-8"));
		){
			//누적 입력
			//추가할 데이터를 모아놓는다.
			
			for(int i = 0; i<10; i++) {
				out.append("Hello, World (안녕, 세상아)\n");
			}
			
			// flush() : 추가된 데이터들을 파일로 내보낸다.
			// close()시에 자동으로 flush()가 실행된다.
			//out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileReader in = new FileReader(testFile, Charset.forName("UTF-8"));) {
			
			int len;
			char[] buffer = new char[20];
			
			while ((len = in.read(buffer))!=-1) {
				System.out.print(new String(buffer, 0, len));
			}
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
