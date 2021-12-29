package gui.quiz;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class G05_HangMan {
	
	 /*
	 	1. � �ܾ ���� ��� �ش� �ܾ��� ���̸�ŭ _�� ������ش�.
	 	
	 	2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϸ� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _�� ���ĺ����� �ٲ۴�.
	 	
	 	3. ����ڰ� ��� _�� �����ϸ� �� �� ���� ������� ������ּ���.
	 	
	 	4. ���� �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���.
	 */
	
	
	public static void main(String[] args) {
		new View();
	}
}

class View extends JFrame{
	
	final String[] PATH = {"hangman/die.png",
			"hangman/head.png",
			"hangman/body.png",
			"hangman/arm.png",
			"hangman/leg.png"
			};
	
	public View() {
		super("Print Image!");
		
		ArrayList<JLabel> labs = new ArrayList<>();
		
		for(int i = 0; i<PATH.length; i++) {
			labs.add(new JLabel());
			labs.get(i).setIcon(new ImageIcon(PATH[PATH.length - (i+1)]));
			labs.get(i).setVisible(false);
			add(labs.get(i));
		}
		
		setLayout(null);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		String hitTxt = new WordConver().randomHitTxt();
		new hangMan(hitTxt, labs);	
	}
}

class hangMan{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int life;

	public hangMan(String hitTxt, ArrayList<JLabel> labs) {
		
		String str = "";
		int count= 0;
		
		char[] txts = new char[hitTxt.length()]; ;
		life = labs.size();
		
		for(int i = 0; i<txts.length; i++) {
			txts[i] = '_';
		}
		
		while(!hitTxt.equals(str)) {
			
			boolean answer = true;
			
			System.out.println(hitTxt);
			System.out.println(txts);
			System.out.println("���� ������� >> ");
			try {
				str = in.readLine();
				str = str.toUpperCase();
				
				if(hitTxt.length() < str.length()) {
					System.out.println("������ �ʰ��Դϴ�. �ٽ� �Է��ϼ���");
					continue;
				}
				
				for(int i = 0; i<hitTxt.length(); i++) {
					for(int j = 0; j<str.length(); j++) {
						if(hitTxt.charAt(i) == str.charAt(j)) {
							txts[i] = str.charAt(j);
							answer = false;
						}
						
					}
					
					if(hitTxt.length()-1 == i && answer == true) {
						if(life() == 0) {
							System.out.println("Game Over");
							return;
						}
						switch (life) {
						case 4:
							labs.get(life).setBounds(0,0,300,400);
							labs.get(life).setVisible(true);
							break;
						case 3:
							labs.get(life).setBounds(150,80,100,100);
							labs.get(life).setVisible(true);
							break;
						case 2:
							labs.get(life).setBounds(150,170,100,180);
							labs.get(life).setVisible(true);
							break;
						case 1:
							labs.get(life).setBounds(75,200,300,100);
							labs.get(life).setVisible(true);
							break;
						case 0:
							labs.get(life).setBounds(100,300,300,100);
							labs.get(life).setVisible(true);
							break;
						}
					}
				}
				
				str="";
				for(char txt : txts) {
					str+=txt;
				}
			} catch (IOException e) {
				System.out.println("��Ȯ�� ���� ��������!");
			}
			count++;
		}
		
		System.out.printf("[�� : %s], [%d��]���� �����ϼ̽��ϴ�.",hitTxt, count);
	}
	
	int life() {
		return life--;
	}
}

class WordConver{
	
	//txt ���� ����
	File f = new File("hangman.txt");
	
	//���� ���ƴٴϴ� ���ܾ ���°Ŷ� 
	ArrayList<String> hitTxts = new ArrayList<>();
	String hitTxt="";
	String[] words;
	
	Pattern pattern = Pattern.compile("\\w");
	Matcher matcher;
	
	public WordConver() {
		
		try(FileReader input = new FileReader(f,Charset.forName("UTF-8"))){
			int ch;
			int count = 0;
			int startNum;
			
			while((ch = input.read()) != -1) {
				hitTxt += (char)ch;
			}
			
			words = hitTxt.split("\n");
		
			for(String word : words) {
				startNum = 0;
				hitTxt="";
				matcher = pattern.matcher(word);
				for(int i = 0 ; i<word.length(); i++) {
					if(matcher.find(startNum)) {
						startNum = matcher.end();
						hitTxt += matcher.group();
					}
				}
				hitTxts.add(hitTxt);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public String randomHitTxt() {
		
		int random = (int)(Math.random()*hitTxts.size());
		hitTxt = hitTxts.get(random).toUpperCase();
		
		return hitTxt;
	}
}