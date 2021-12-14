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
	
	public void fileOut(int round, Rule rule) {
		
		File saveFolder = new File("����������");
		File saveFile = new File("����������/result.ppp");
		String result;
		
		if(!saveFolder.exists()) {
			saveFolder.mkdir();
		}
		
		// try Autoclose �������̽��� ������ Ŭ�������� try()�� ������ �� �ִ�.
		try (FileOutputStream fileOut = new FileOutputStream(saveFile, true);
				) {
			result = round + "/" + rule.win + "/" + rule.lose + "/" + rule.draw + " \n";
			fileOut.write(result.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���ϸ��� ��Ȯ���� �ʽ��ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("������ ��Ȱ���� �ʽ��ϴ�.");
		}
		System.out.println("�ۼ��Ϸ�");
	}
	
	// ���⼭ ����������� return ������ ��ȯ�ض�.
	public void fileInput(int round) { 
		File saveFile = new File("����������/result.ppp");
		
		String result;
		String[] results;
		System.out.println("������� ����� ���� ��Ȳ");
		
		if(!saveFile.exists()) {
			//������ �� �ڱ� �� �����ֱ�...
			return;
		}
		
		try (FileInputStream fileInput = new FileInputStream("����������/result.txt");
		) {
			result = new String(fileInput.readAllBytes());
			//�� �ִ� ���� �����ؼ� �����ϰ� �ؼ� split�� ���� ����...
			results = result.split("\n");
			
			for(String result_ : results) {
				System.out.println(result_);
			}
			
			//System.out.println(result);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �ҷ����� ����!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("���� ������ �ҷ����� ����!");
		}
	}

}
