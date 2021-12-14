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
 			������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����.
 			(�� �� ��)
 			+ ��� ���� ��ü(ĸ��ȭ)
	 */
	
	
	public static void main(String[] args) {
		
		Rule rule = new Rule();
		GameRecord gr = new GameRecord();
		Scanner input = new Scanner(System.in);
		String str = "";
		int round = 0;
		
		while(!str.contains("n") == true) {
			System.out.println("������ �����մϴ�.");
			
			while(rule.getProgres() == true) {
				round++;
				rule.game();
			}
			
			rule.SetProgres();
			
			try {
				System.out.print("��� �����Ͻðڽ��ϱ�? >> ");
				str = input.next();
			} catch (InputMismatchException e) {
				System.out.println("�߸��Է� �ٽ� �����մϴ�.");
				continue;
			}
			
			gr.fileOut(round, rule);
			gr.fileInput(round);
			round = rule.setGame();	
		}
		
		System.out.print("��� ������ ���ҽ� [0��]�� �����ּ��� >> ");
		try {
			if(input.nextInt() == 0) {
				gr.reset();
			}
		} catch (InputMismatchException e) {}
		
		System.out.println("������ �����մϴ�.");
	}
	
	
	
}
