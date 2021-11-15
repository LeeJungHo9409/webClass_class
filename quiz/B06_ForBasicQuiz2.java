package quiz;

public class B06_ForBasicQuiz2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int i,j, temp=1, sum;
		int randomValue;
		int[] randomArr = new int[100];
		
		//20~40 출력
		System.out.println("0.");
		for(i=20; i<=40; i++) {
			if(i%5 == 0 && i!=20) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}
		
		System.out.println("\n");
		
		//1~100 숫자를 한줄에 10개씩 출력
		
		System.out.println("1.");
		for(i=1; temp<100; i++) {
			for(j=0; j<10; j++) {
				System.out.print((temp + j) + "\t");
			}
			
			temp=(i*10)+1;			
			System.out.println();
		}
		
		System.out.println();
		
		//랜덤값으로 1~100 숫자 표현
		System.out.println("1-1.");
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				randomValue = (int)((Math.random()*100)+1);
				if(randomArr[randomValue-1] != randomValue) {
					randomArr[randomValue-1] = randomValue;
					System.out.print(randomValue + "\t");
				}else {
					j--;
				}
			}			
			System.out.println();
		}
		
		System.out.println();
		
		//50~80 3의 배수 출력
		System.out.println("2.");
		for(i=50; i<=80; i++) {
			if(i%3 == 0) {
				System.out.print(i+"\t");
			}
			
		}
		System.out.println("\n");
		
		//200~100 거꾸로 출력
		System.out.println("4.");
		for(i=200; i>=100; i--) {
			if(i%5 == 0 && i!=200) {
				System.out.println();
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n");
		
		//1~55 모두 더한 결과 출력
		sum = 0;
		System.out.println("5.");
		for(i=1; i<=55; i++) {
			sum += i;
		}
		
		System.out.println(sum);

	}

}
