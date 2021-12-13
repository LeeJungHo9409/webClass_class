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
			fileOut = new FileOutputStream("����������/result.txt", false);
			fileOut.write("".getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ��ġ�� �̻��� �� ����");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�ۼ��� ���� ����");
		}finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�ƿ�ǲ ���� ����");
			}
		}
		
		System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		
	}
	
	void fileOut(int round, Rule rule) {
		FileOutputStream fileOut = null;
		
		String result;
		
		try {
			fileOut = new FileOutputStream("����������/result.txt", true);
			result = "��" + round + " ���� >> [�� : " + rule.win + "] [�� : " + rule.lose + "] [���º� : " + rule.draw + "]\n";
			fileOut.write(result.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���ϸ��� ��Ȯ���� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ��Ȱ���� �ʽ��ϴ�.");
		} finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("���ᰡ ���� �ʾҽ��ϴ�.");
			}
		}
		System.out.println("�ۼ��Ϸ�");
	}
	
	void fileInput(int round, Rule rule) {
		FileInputStream fileInput = null;
		String result;
		System.out.println("������� ����� ���� ��Ȳ");
		try {
			fileInput = new FileInputStream("����������/result.txt");
			result = new String(fileInput.readAllBytes());
			System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �ҷ����� ����!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ������ �ҷ����� ����!");
		}finally {
			try {
				fileInput.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("���� ���� ����");
			}
		}
	}

}
