package quiz;

import java.util.Arrays;
import java.util.Scanner;

/*
	������� ������ ����� ������
	
	  0. ������ ���۵Ǹ� �÷��̾ ������� ���Ѵ�.
	  1. �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���.
	  2. Į�� � �� �ִ� Ȩ�� 20���� �ְ�, �� �� 2���� ���� �ȴ�.
	    (���Ǹ��� �������� ����)
	  3. �߸��� ���� Į�� � �÷��̾ ���ӿ� �й��Ѵ�.
	  4. ������ ��� �̾ �÷��� �� �� �ְ�, �� �÷��̾��� ������ ���� ����Ǿ�� �Ѵ�.
	  
	  # this()
	  	- ������ ȣ��
	  	- �� �����ڿ��� �ٸ� �����ڸ� �ҷ��� ����� �� �ִ�.
	  	- ������ ȣ���� �� �������� ù ��° �����̾�� �Ѵ�.
 */

public class C03_PirateGame {
	
	public static void main(String[] args) {
		
		int player;
		GameSet gs = new GameSet();
		while(true) {
			player = gs.GameSet();
			new GamePlay(player, gs.gameDetaArr());
			if(gs.gameEnd() == false) {
				System.out.println("��������");
				break;
			}
		}
		
	}
}

//1��
class GameSet{
	int num;
	String goOrStop="yes";
	Scanner input = new Scanner(System.in);
	
	public int GameSet(){
		System.out.println("������ �����ϱ⿡ �ռ�, ");
		System.out.print("���� �÷��̾ ������� �������ּ��� > ");
		num = input.nextInt();
		
		if(num<2) {
			System.out.println("���������� �Էµ��� �ʾҽ��ϴ�.");
			System.out.println("���Է� ��Ź�帳�ϴ�.");
			return 0;
		}
		return this.num;
	}
	
	public int[] gameDetaArr() {
		
		int[] gameDetaArr = new int[20];
		
		for(int i = 0; i<gameDetaArr.length; i++) {
			gameDetaArr[i] = (int)(Math.random()*21)+1;
			for(int j=0; j<i; j++) {
				if(gameDetaArr[i] == gameDetaArr[j]) {
					i--;
					break;
				}
			}
		}
		return gameDetaArr;
	}
	
	public boolean gameEnd() {
		System.out.print("������ ��� �����Ͻðڽ��ϱ�? [y/n] > ");
		System.out.println("y���� �ƴҰ�� �����մϴ�.");
		goOrStop = input.next();
		if(goOrStop.charAt(0) == 'y' || goOrStop.charAt(0) == 'Y') {
			return true;
		}else {
			return false;
		}
	}
}

//���������� �÷���
class GamePlay{
	
	int firstLose = (int)(Math.random()*21)+1;
	int SceundLose = (int)(Math.random()*21)+1;
	int random;
	
	Scanner input = new Scanner(System.in);
	
	GamePlay(){};

	public GamePlay(int num, int[] gameDetaArr){
		
		int player = 0;
		int gameToward = 0;
		int playerKnife;
		
		while(true) {
			
			System.out.println("\n"+(player+1)+ "��° �÷��̾��");
			
			for(int i=0; i<20; i++) {
				if(i%5 == 0 && i!=0) {
					System.out.println();
				}
				if(gameDetaArr[i] != 0) {
					System.out.print("[ O ] ");
				}else {
					System.out.print("[ X ] ");
				}
				
			}
			
			System.out.print("\n20���� Ȩ �� ����� ��ðڽ��ϱ�? > ");
			playerKnife = input.nextInt();
			player++;
			
			System.out.println(player + "��° �÷��̾���� ������");
			if(playerKnife <= 0 || playerKnife > 20) {
				System.out.printf("%d ��°�� �ȵ˴ϴ�.\n�ع������� ������ϴ�.��\n�ٸ� Ȩ�� ���� ���ּ���.\n", playerKnife);
				player = player <= 0 ? player : player--; 
				continue;
			}else if(gameDetaArr[playerKnife-1] == 0) {
				System.out.printf("%d ��°�� �ȵ˴ϴ�.\n�شٸ� �÷��̾ ������ Ȩ�Դϴ�.��\n�ٸ� Ȩ�� ���� ���ּ���.\n", playerKnife);
				continue;
			}
			
			if(gameDetaArr[playerKnife-1] == firstLose || gameDetaArr[playerKnife-1] == firstLose) {
				System.out.printf("%d ��° ���� �ϼ̽��ϴ�.", playerKnife);
				System.out.println(" �� �� ��!\n�������� ƨ���� ���Խ��ϴ�!");
				System.out.println("GameOver");
				System.out.println("�� ���� Ƚ�� : " + gameToward);
				break;
			}
			gameDetaArr[playerKnife-1] = 0;
			System.out.printf("%d ��° �������� �����ϼ̽��ϴ�. ���� �÷��̾�� �Ѿ�ϴ�.\n", playerKnife);
			
			
//			if(=firstLose)
			if(player == num) {
				System.out.println();
				player = 0;
				gameToward++;
			}
		}
	}
}