package quiz;
import java.util.Scanner;

public class B05_ForBasicQize {
	
	public static void main(String[] arge) {
		
		int i,max_num,sum=100;
		Scanner input = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		max_num = input.nextInt();
		
		if(max_num < 0) {
			// ���� ���� ���� �϶�
			
			//1��
			System.out.println("1.");
			for(i=max_num; i<0; i++) {
				sum+=i;
				if(i%10==0 && i!=max_num) {
					System.out.println("//"+i);
				}
				System.out.printf("%d\t", sum);
			}
			
			System.out.printf("\n������ ���� : %d\n\n", sum);
			
			
			//2��
			System.out.println("2.");
			for(i=1000; i>=max_num; i--) {
				if(i%10==0 && i!=1000) {
					System.out.println();
				}
				System.out.printf("%d\t", i);
			}
			System.out.println("\n");
			
			
			//3��
			System.out.println("3.");
			for(i=-1;i>max_num; i--) {
				if(i%7==0) {
					System.out.printf("%d\t", i);
				}
			}
			System.out.println();
			
		}else {
			// ���� ���� ��� �϶�
			
			//1��
			System.out.println("1.");
			for(i=0; i<=max_num; i++) {
				sum+=i;
				if(i%10==0 && i!=max_num) {
					System.out.println("//"+i);	
				}
				System.out.printf("%d\t", sum);
			}
			System.out.printf("\n������ ���� : %d\n\n", sum);
			
			
			//2��
			System.out.println("2.");
			for(i=1000; i>=max_num; i--) {
				if(i%10==0 && i!=1000) {
					System.out.println();
				}
				System.out.printf("%d\t", i);
			}
			System.out.println("\n");
			
			
			//3��
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
