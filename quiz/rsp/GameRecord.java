package quiz.rsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class GameRecord {
	ArrayList<User> userDatas = new ArrayList<>();
	User user = new User();
	
	public GameRecord() {}
	
	public void reset() {
		FileOutputStream fileOut = null;
		try {
			fileOut = new FileOutputStream("가위바위보/result.txt", false);
			fileOut.write("".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 위치가 이상한 것 같음");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("작성에 문제 있음");
		}finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("아웃풋 끄기 실패");
			}
		}
		System.out.println("리셋이 완료되었습니다.");
	}
	
	public void fileOut(int round, Rule rule) {
		
		File saveFolder = new File("가위바위보");
		File saveFile = new File("가위바위보/result.ppp");
		String result;
		
		if(!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		
		// try Autoclose 인터페이스가 구현된 클래스들은 try()에 선언할 수 있다.
		try (FileOutputStream fileOut = new FileOutputStream(saveFile, true);
				) {
			result = round + "/" + rule.win + "/" + rule.lose + "/" + rule.draw + " \n";
			fileOut.write(result.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일명이 명확하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("저장이 원활하지 않습니다.");
		}
		System.out.println("작성완료");
	}
	
	// 여기서 출력하지말고 return 값으로 반환해라.
	public void fileInput(int round) { 
		File saveFile = new File("가위바위보/result.ppp");
		
		String result;
		String[] results;
		System.out.println("현재까지 진행된 게임 현황");
		
		if(!saveFile.exists()) {
			//없으면 걍 자기 값 돌려주기...
			return;
		}
		
		try (FileInputStream fileInput = new FileInputStream("가위바위보/result.txt");
		) {
			result = new String(fileInput.readAllBytes());
			//난 넣는 값이 복잡해서 간결하게 해서 split을 쓰면 가능...
			results = result.split("\n");
			
			for(String result_ : results) {
				System.out.println(result_);
			}
			
			//System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 불러오기 실패!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 데이터 불러오기 실패!");
		}
	}

}
