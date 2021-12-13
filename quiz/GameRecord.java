package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GameRecord {
	
	public GameRecord() {}
	
	void reset() {
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
	
	void fileOut(int round, Rule rule) {
		FileOutputStream fileOut = null;
		
		String result;
		
		try {
			fileOut = new FileOutputStream("가위바위보/result.txt", true);
			result = "총" + round + " 라운드 >> [승 : " + rule.win + "] [패 : " + rule.lose + "] [무승부 : " + rule.draw + "]\n";
			fileOut.write(result.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일명이 명확하지 않습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("저장이 원활하지 않습니다.");
		} finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("종료가 되지 않았습니다.");
			}
		}
		System.out.println("작성완료");
	}
	
	void fileInput(int round, Rule rule) {
		FileInputStream fileInput = null;
		String result;
		System.out.println("현재까지 진행된 게임 현황");
		try {
			fileInput = new FileInputStream("가위바위보/result.txt");
			result = new String(fileInput.readAllBytes());
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 불러오기 실패!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 데이터 불러오기 실패!");
		}finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 종료 실패");
			}
		}
	}

}
