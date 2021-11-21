package quiz;

import java.util.Arrays;

public class B11_Lotto {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		// 중복없는 7개
		// 당첨될 때까지 번호를 생성한 후 몇회만에 당첨됐는지 출력
		
		
		int i,j=0,count=0,rank=0, random;
		int[] lotto = new int[7];
		int[] lottoH = new int[7];
		boolean loopStop=true;
		
		
		System.out.println("로또 당첨 번호");
		for(i=0; i<7; i++) {
			random = (int)(Math.random()*45) + 1;
			lottoH[i] = random;
			for(j=0; j<i; j++) {
				if(lottoH[i] == lottoH[j]) {
					i--;
					break;
				}
			}
		}
		
		for(i=0; i<7; i++) {
			if(i==6) {
				System.out.printf("+ %d\n",lottoH[i]);
				break;
			}
			System.out.printf("%d ", lottoH[i]);
		}
		
		
		System.out.println("사용자 로또 번호");
		while(loopStop) {
			rank = 6;
			
			//사용자 로또 생성
			for(i=0; i<7; i++) {
				random = (int)(Math.random()*45) + 1;
				lotto[i] = random;
				for(j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
//			System.out.println(Arrays.toString(lotto));
			
			//비교
			for(i=0;i<7;i++) {
				for(j=0;j<7;j++) {
					if(lottoH[i] == lotto[j]) {
						rank--;
						break;
					}
				}
			}
			
			if(rank == 0) {
				loopStop = false;
			}
			
			count++;
			
		}
		System.out.println(Arrays.toString(lotto) + " 총 수행횟수 : " + count);
	}

}
