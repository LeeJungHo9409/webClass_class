package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import quiz.rsp.GameRecord;
import quiz.rsp.Rule;

public class E03_SaveGame {
	
	/*
 			간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요.
 			(승 무 패)
 			+ 기록 관련 객체(캡슐화)
	 */
	
	
	public static void main(String[] args) {
		
		Rule rule = new Rule();
		GameRecord gr = new GameRecord();
		Scanner input = new Scanner(System.in);
		String str = "";
		int round = 0;
		
		while(!str.contains("n") == true) {
			System.out.println("게임을 시작합니다.");
			
			while(rule.getProgres() == true) {
				round++;
				rule.game();
			}
			
			rule.SetProgres();
			
			try {
				System.out.print("계속 진행하시겠습니까? >> ");
				str = input.next();
			} catch (InputMismatchException e) {
				System.out.println("잘못입력 다시 실행합니다.");
				continue;
			}
			
			gr.fileOut(round, rule);
			gr.fileInput(round);
			round = rule.setGame();	
		}
		
		System.out.print("기록 리셋을 원할시 [0번]을 눌러주세요 >> ");
		try {
			if(input.nextInt() == 0) {
				gr.reset();
			}
		} catch (InputMismatchException e) {}
		
		System.out.println("게임을 종료합니다.");
	}
	
	
	
}
