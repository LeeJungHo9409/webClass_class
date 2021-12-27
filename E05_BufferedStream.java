import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalTime;

public class E05_BufferedStream {
	
	/*
	 	# Buffered
	 	 - 데이터를 한개씩 여러번 전달하는 것보다 중간에 버퍼를 두고 한번에 전달하는 것이 효율
	 	 - 버퍼 방식이 미리 구현된 클래스들은 앞에 Buffered라는 이름이 붙여 있다.
	 	 - BufferedInputStream ...
	 	
	 */

	static File f = new File("frankenstein.txt");
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		read1();
		long end = System.currentTimeMillis();
		System.out.println("read1에 걸린 시간 : " + (end-start) + "ms");
		
		start = System.currentTimeMillis();
		read2();
		end = System.currentTimeMillis();
		System.out.println("read2에 걸린 시간 : " + (end-start)+"ms");
		
		start = System.currentTimeMillis();
		read3();
		end = System.currentTimeMillis();
		System.out.println("read3에 걸린 시간 : " + (end-start)+"ms");
	}
	
	static void read1() {
		try(FileReader in = new FileReader(f);){
			
			int ch;
			while((ch = in.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static void read2() {
		try(FileReader in = new FileReader(f);){
			
			int ch;
			char[] buffer = new char[20];
			while((ch = in.read(buffer)) != -1) {
				System.out.print(new String(buffer, 0, ch));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void read3() {
		
		// 8KB가 기본크키다...
		try(BufferedReader in = new BufferedReader(new FileReader(f))){
			
			String line;
			while((line = in.readLine())!= null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
