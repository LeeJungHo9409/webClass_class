package quiz;
import java.util.Scanner;

public class B05_ForBasicQize {
	
	public static void main(String[] arge) {
		
		int i,max_num,sum=100;
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		max_num = input.nextInt();
		
		if(max_num < 0) {
			// 받은 수가 음수 일때
			
			//1번
			System.out.println("1.");
			for(i=max_num; i<0; i++) {
				sum+=i;
				if(i%10==0 && i!=max_num) {
					System.out.println("//"+i);
				}
				System.out.printf("%d\t", sum);
			}
			
			System.out.printf("\n최종값 총합 : %d\n\n", sum);
			
			
			//2번
			System.out.println("2.");
			for(i=1000; i>=max_num; i--) {
				if(i%10==0 && i!=1000) {
					System.out.println();
				}
				System.out.printf("%d\t", i);
			}
			System.out.println("\n");
			
			
			//3번
			System.out.println("3.");
			for(i=-1;i>max_num; i--) {
				if(i%7==0) {
					System.out.printf("%d\t", i);
				}
			}
			System.out.println();
			
		}else {
			// 받은 수가 양수 일때
			
			//1번
			System.out.println("1.");
			for(i=0; i<=max_num; i++) {
				sum+=i;
				if(i%10==0 && i!=max_num) {
					System.out.println("//"+i);	
				}
				System.out.printf("%d\t", sum);
			}
			System.out.printf("\n최종값 총합 : %d\n\n", sum);
			
			
			//2번
			System.out.println("2.");
			for(i=1000; i>=max_num; i--) {
				if(i%10==0 && i!=1000) {
					System.out.println();
				}
				System.out.printf("%d\t", i);
			}
			System.out.println("\n");
			
			
			//3번
			System.out.println("3.");
			for(i=1;i<=max_num;i++) {
				if(i%7==0) {
					System.out.printf("%d\t", i);
				}
			}
			System.out.println();

		}
		
	}

}
