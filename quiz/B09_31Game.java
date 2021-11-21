package quiz;
import java.util.Scanner;

public class B09_31Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 31 게임을 만들어보세요.
		// 처음에는 몇명으로 시작할지 선택 입력 
		// 여러 플레이어가 번갈아가면서 숫자를 선택 (단 1~3만 입력 가능)
		// 진행 순서는 랜덤으로 진행
		// 마지막에 31 이상의 숫자를 입력하는 플레이어가 패배.
		
		//(turn % player) = 현재 플레이어 넘버
		
		int random;
		int i=0, playerMax, player = 1, playerValue, temp;
		Scanner input = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│        BASKINROBBINS 31           │");
		System.out.println("│              GAME                 │");
		System.out.println("└───────────────────────────────────┘");
		
		while(i<31) {
			System.out.print("\tPlayer 수를 입력해주세요 > ");
			playerMax = input.nextInt();
//			if(playerMax > 5 || playerMax <= 1) {
//			(최대인원 : 5명)
//				System.out.println("Game Play 를 위한 권장 사항을 충족해 주십시오");
//				System.out.println("2명 이상이며 5명 이하이어야 합니다.");
//				continue;
//			}
			
			if(playerMax <= 1) {
				System.out.println("Game Play 를 위한 권장 사항을 충족해 주십시오");
				System.out.println("\t  2명 이상이어야 합니다.");
				continue;
			}
			
			System.out.println("※※※※※※※※※※※Game Start※※※※※※※※※※※");
			random = (int)(Math.random()*playerMax)+1;
			
			while(true) {
				
				temp = random;
				
//				else if(player >= playerMax+1) {
//					player = 1;
//				}
				
//				System.out.printf("Player%d > ", (turn % player) +1);
				System.out.printf("\t%d player 님 입력주세요 > ", random);
				playerValue = input.nextInt();
				
				i+=playerValue;
				
				if(playerValue > 3 || playerValue < 0) {
					i-=playerValue;
//					player--;
					System.out.println("\t※1~3 사이로 입력해주세요.※");
					continue;
				}else {
					System.out.printf("\t  %d player님 %d 입니다.\n", random, i);
				}
//				player++;
				
				random = (int)(Math.random()*playerMax)+1;
				
				if(i >= 31) {
					System.out.printf("\t%d Player님이 패배하였습니다.\n", temp);
					break;
				}
			}			
			System.out.println("※※※※※※※※※※※Game End※※※※※※※※※※※");
		}
	}
}