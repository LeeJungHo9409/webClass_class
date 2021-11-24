package quiz;

import java.util.Arrays;
import java.util.Scanner;

/*
	통아저씨 게임을 만들어 보세요
	
	  0. 게임이 시작되면 플레이어가 몇명인지 정한다.
	  1. 플레이어가 돌아가면서 원하는 위치에 칼을 찌른다.
	  2. 칼을 찌를 수 있는 홈은 20개가 있고, 그 중 2개가 꽝이 된다.
	    (매판마다 랜덤으로 설정)
	  3. 잘못된 곳에 칼을 찌른 플레이어가 게임에 패배한다.
	  4. 게임은 계속 이어서 플레이 할 수 있고, 각 플레이어의 정보가 누적 집계되어야 한다.
	  
	  # this()
	  	- 생성자 호출
	  	- 한 생성자에서 다른 생성자를 불러다 사용할 수 있다.
	  	- 생성자 호출은 그 생성자의 첫 번째 구문이어야 한다.
 */

public class C03_PirateGame {
	
	public static void main(String[] args) {
		
		int player;
		GameSet gs = new GameSet();
		while(true) {
			player = gs.GameSet();
			new GamePlay(player, gs.gameDetaArr());
			if(gs.gameEnd() == false) {
				System.out.println("게임종료");
				break;
			}
		}
		
	}
}

//1번
class GameSet{
	int num;
	String goOrStop="yes";
	Scanner input = new Scanner(System.in);
	
	public int GameSet(){
		System.out.println("게임을 시작하기에 앞서, ");
		System.out.print("게임 플레이어가 몇명인지 설정해주세요 > ");
		num = input.nextInt();
		
		if(num<2) {
			System.out.println("정상적으로 입력되지 않았습니다.");
			System.out.println("재입력 부탁드립니다.");
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
		System.out.print("게임을 계속 진행하시겠습니까? [y/n] > ");
		System.out.println("y값이 아닐경우 종료합니다.");
		goOrStop = input.next();
		if(goOrStop.charAt(0) == 'y' || goOrStop.charAt(0) == 'Y') {
			return true;
		}else {
			return false;
		}
	}
}

//실질적게임 플레이
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
			
			System.out.println("\n"+(player+1)+ "번째 플레이어님");
			
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
			
			System.out.print("\n20개의 홈 중 몇번을 찌르시겠습니까? > ");
			playerKnife = input.nextInt();
			player++;
			
			System.out.println(player + "번째 플레이어님의 선택은");
			if(playerKnife <= 0 || playerKnife > 20) {
				System.out.printf("%d 번째로 안됩니다.\n※범위값이 벗어났습니다.※\n다른 홈을 선택 해주세요.\n", playerKnife);
				player = player <= 0 ? player : player--; 
				continue;
			}else if(gameDetaArr[playerKnife-1] == 0) {
				System.out.printf("%d 번째는 안됩니다.\n※다른 플레이어가 선택한 홈입니다.※\n다른 홈을 선택 해주세요.\n", playerKnife);
				continue;
			}
			
			if(gameDetaArr[playerKnife-1] == firstLose || gameDetaArr[playerKnife-1] == firstLose) {
				System.out.printf("%d 번째 선택 하셨습니다.", playerKnife);
				System.out.println(" 통 통 통!\n아저씨가 튕겨져 나왔습니다!");
				System.out.println("GameOver");
				System.out.println("총 누적 횟수 : " + gameToward);
				break;
			}
			gameDetaArr[playerKnife-1] = 0;
			System.out.printf("%d 번째 선택으로 성공하셨습니다. 다음 플레이어로 넘어갑니다.\n", playerKnife);
			
			
//			if(=firstLose)
			if(player == num) {
				System.out.println();
				player = 0;
				gameToward++;
			}
		}
	}
}