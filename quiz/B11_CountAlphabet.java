package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int i,j;
		int[][] alphabetCount = new int[2][26];
		char[] str;
		char[][] alphabet = new char[2][26];
		String txt = ""; 
		Scanner input = new Scanner(System.in);
		
		//알파벳 입력
		for(i = 0; i<2; i++) {
			for(j = 0; j<26; j++) {
				alphabet[i][j] = i > 0 ? (char)('a' + j) : (char)('A' + j);
			}
		}
		
		//알파벳 출력
		for(i = 0; i<2; i++) {
			for(j = 0; j<26; j++) {
				if(j%10==0) {
					System.out.println();
				}
				System.out.printf("[%c]",alphabet[i][j]);
			}
			System.out.println();
		}
		
		//사용자로부터 문장 하나 입력
		System.out.print("\n문장을 입력해주세요\n\t>");
		txt = input.nextLine();
		str = new char[txt.length()];
		
		//해당 문장에 어떤 알파벳 구분 (대소문자 구분)
		for(i=0; i<txt.length(); i++) {
			str[i] += txt.charAt(i);
			
			//소문자
			for(j=0; j<alphabet[1].length; j++) {
				if(str[i] == alphabet[1][j]) {
					alphabetCount[1][j]++;
				}
			}
			
			//대문자
			for(j=0; j<alphabet[0].length; j++) {
				if(str[i] == alphabet[0][j]) {
					alphabetCount[0][j]++;
				}
			}
		}
		
		//해당 알파벳 몇 번 등장했는지 출력
		System.out.println("입력하신 문장은 '"+ txt +"' 입니다.");
		for(j=0;j<alphabet[0].length;j++) {
			if(alphabetCount[0][j]!=0) {
				System.out.printf("[알파벳 : %c  알파벳계수 : %d]\n",alphabet[0][j],alphabetCount[0][j]);
			}
		}
		System.out.println();
		
		for(j=0;j<alphabet[1].length;j++) {
			if(alphabetCount[1][j]!=0) {
				System.out.printf("[알파벳 : %c  알파벳계수 : %d]\n",alphabet[1][j],alphabetCount[1][j]);
			}
		}
	}

}
