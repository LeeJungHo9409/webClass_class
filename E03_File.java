import java.io.File;
import java.io.IOException;

/*
 	# java.io.File
 	  - 파일 시스템에 저장된 한 파일 또는 디렉토리의 정보를 담은 클래스
 	  - 인스턴스에 담겨있는 정보를 바탕으로 이미 존재하는 파일을 수정할 수 있다.
 	  - 새로운 인스턴스를 생성하여 새로운 파일 또는 디렉토리를 파일 시스템에 추가할 수도 있다.
 */

public class E03_File {
	public static void main(String[] args) {
		File f1 = new File("practice/abc.txt");
		File f2 = new File("exercise/day01/quiz03");
		
		// exists() : 해당 경로에 파일 또는 디렉토리가 존재하는지 검사
		System.out.println(f1.exists());
		System.out.println(f2.exists());
		
		//canXXX() : 권한 확인
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.canExecute());
		
		//delete() : 파일 삭제
		
		//mkdir() : 해당 경로에 디렉토리 생성 / 다중 폴더 생성시 오류발생되거나 생성되지 않음
		//createNewFile() : 해당 경로에 파일 생성
		//mkdirs() : 해당 경로에 파일 생성 
		
		if(!f2.exists()) {
			//f2.mkdir();
			//f2.mkdirs();
		}
		
		//isDirectory() : 해당 경로의 파일이 디렉토리인지 검사
		System.out.println(f1.isDirectory());
		System.out.println(f1.isFile());
		
		
	}
}
