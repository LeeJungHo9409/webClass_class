package gui.quiz;

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class G05_HangMan {
	
	 /*
	 	1. 어떤 단어가 답인 경우 해당 단어의 길이만큼 _를 출력해준다.
	 	
	 	2. 사용자가 알파벳을 하나씩 입력하면 해당 알파벳이 포함되어 있다면 _를 알파벳으로 바꾼다.
	 	
	 	3. 사용자가 모든 _를 제거하면 몇 번 만에 맞췄는지 출력해주세요.
	 	
	 	4. 정답 단어는 단어들이 적혀있는 파일에서 하나를 랜덤으로 뽑아주세요.
	 */
	
	
	public static void main(String[] args) {
		new View();
	}
}

class View extends JFrame{
	
	final String[] PATH = {"hangman/die.png",
			"hangman/head.png",
			"hangman/body.png",
			"hangman/left.png",
			"hangman/right.png"};
	
	public View() {
		super("Print Image!");
		
		ArrayList<JLabel> labs = new ArrayList<>();
		labs.add(
				new JLabel()
				);
		JTextArea txtArea = new JTextArea();
		JButton btn = new JButton();
		
		txtArea.setBorder(new BevelBorder(BevelBorder.LOWERED));;
		txtArea.setBounds(50, 400, 200, 50);
		
		add(txtArea);
		
		setLayout(null);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		String hitTxt = new WordConver().randomHitTxt();
		new hangMan(hitTxt);	
	}
}

class hangMan{
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int life = 5;

	public hangMan(String hitTxt) {
		
		String str = "";
		int count= 0;
		char[] txts = new char[hitTxt.length()]; ;
		
		for(int i = 0; i<txts.length; i++) {
			txts[i] = '_';
		}
		
		while(!hitTxt.equals(str)) {
			System.out.println(hitTxt);
			System.out.println(txts);
			System.out.println("답을 적어보세요 >> ");
			try {
				str = in.readLine();
				str = str.toUpperCase();
				
				if(hitTxt.length() < str.length()) {
					System.out.println("범위값 초과입니다. 다시 입력하세요");
					continue;
				}
				
				for(int i = 0; i<hitTxt.length(); i++) {
					for(int j = 0; j<str.length(); j++) {
						if(hitTxt.charAt(i) == str.charAt(j)) {
							txts[i] = str.charAt(j);
						}
					}
				}
				
				str="";
				for(char txt : txts) {
					str+=txt;
				}
			} catch (IOException e) {
				System.out.println("정확한 값을 적으세요!");
			}
			count++;
		}
		
		System.out.printf("[답 : %s], [%d번]만에 성공하셨습니다.",hitTxt, count);
	}
	
	int life() {
		return life--;
	}
}

class WordConver{
	
	//txt 정답 파일
	File f = new File("hangman.txt");
	
	//웹에 돌아다니는 영단어를 따온거라 
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