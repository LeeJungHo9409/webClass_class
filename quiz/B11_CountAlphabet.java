package quiz;

import java.util.Scanner;

public class B11_CountAlphabet {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int i,j;
		int[][] alphabetCount = new int[2][26];
		char[] str;
		char[][] alphabet = new char[2][26];
		String txt = ""; 
		Scanner input = new Scanner(System.in);
		
		//���ĺ� �Է�
		for(i = 0; i<2; i++) {
			for(j = 0; j<26; j++) {
				alphabet[i][j] = i > 0 ? (char)('a' + j) : (char)('A' + j);
			}
		}
		
		//���ĺ� ���
		for(i = 0; i<2; i++) {
			for(j = 0; j<26; j++) {
				if(j%10==0) {
					System.out.println();
				}
				System.out.printf("[%c]",alphabet[i][j]);
			}
			System.out.println();
		}
		
		//����ڷκ��� ���� �ϳ� �Է�
		System.out.print("\n������ �Է����ּ���\n\t>");
		txt = input.nextLine();
		str = new char[txt.length()];
		
		//�ش� ���忡 � ���ĺ� ���� (��ҹ��� ����)
		for(i=0; i<txt.length(); i++) {
			str[i] += txt.charAt(i);
			
			//�ҹ���
			for(j=0; j<alphabet[1].length; j++) {
				if(str[i] == alphabet[1][j]) {
					alphabetCount[1][j]++;
				}
			}
			
			//�빮��
			for(j=0; j<alphabet[0].length; j++) {
				if(str[i] == alphabet[0][j]) {
					alphabetCount[0][j]++;
				}
			}
		}
		
		//�ش� ���ĺ� �� �� �����ߴ��� ���
		System.out.println("�Է��Ͻ� ������ '"+ txt +"' �Դϴ�.");
		for(j=0;j<alphabet[0].length;j++) {
			if(alphabetCount[0][j]!=0) {
				System.out.printf("[���ĺ� : %c  ���ĺ���� : %d]\n",alphabet[0][j],alphabetCount[0][j]);
			}
		}
		System.out.println();
		
		for(j=0;j<alphabet[1].length;j++) {
			if(alphabetCount[1][j]!=0) {
				System.out.printf("[���ĺ� : %c  ���ĺ���� : %d]\n",alphabet[1][j],alphabetCount[1][j]);
			}
		}
	}

}
