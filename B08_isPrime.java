import java.util.Scanner;

public class B08_isPrime {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		// 사용자로부터 숫자를 양수를 입력받으면 1부터
		// 입력한 숫자 사이에 존재하는 모든 소수슬 출력해보세요.
		
		int i,j,num,lineCount=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 : ");
		num = input.nextInt();
		
		if(num < 0) {
			System.out.println("양수를 입력해주세요!!!!!!");
		}else {
			for(i=1; i<=num; i++) {
				for(j=2; j<=i; j++) {
					if(j==i || i==2){
						lineCount++;
						System.out.printf("%d\t",i);
						if(lineCount % 10 == 0) {
							System.out.println();
						}
					}else if(i%j==0) {
						break;
					}
				}
			}
			
		}
		
		System.out.println("\n소수 계수 : "+lineCount+"개");
		
	}

}
