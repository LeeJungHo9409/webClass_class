package quiz;

public class B09_WhileBasicQuiz {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int i,j, sum, lineCount;
		
		//1��
		//1~1000 ���̿� �ִ� ��� 3�� ����� ����
		System.out.println("1.");
		
		i=1;
		sum=0;
		while(i++ < 1000) {
			if(i%3==0) {
				System.out.printf("%6d ",sum);
				sum+=i;
				System.out.printf("+ %3d = %6d\t",i,sum);
				if(i%9==0) {
					System.out.println();
				}
			}
			
		}
		System.out.println("\n���� : " + sum);
		
		//2��
		//400~201 ���ٿ� 10���� ���
		System.out.println("\n2.");
		i=400;
		while(i >= 201) {
			System.out.print(i + "\t");
			i--;
			if(i%10==0 && i!=400) {
				System.out.println();
			}
		}
		
		
		//3��
		//1~200 ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����
		System.out.println("\n3.");
		i=0;
		sum=0;
		lineCount=0;
		while(i++ < 200) {
			if(i%2!=0 && i%3!=0) {
				System.out.printf("%4d + %3d ",sum,i);
				sum+=i;
				System.out.printf("= %4d\t",sum);
				lineCount++;
				if(lineCount%3==0) {
					System.out.println();
				}
			}
			
		}
		System.out.println("\n���� : " + sum);
		
		
		//4��
		//1~200 ���� �� �Ҽ��� ����
		System.out.println("\n4.");
		i=1;
		sum=0;
		lineCount=0;
		while(i++ < 200) {
			j=1;
			while(j++ < i) {
				if(j==i || i==2){
					lineCount++;
					System.out.printf("%4d + %4d = ",sum, i);
					sum+=i;
					System.out.printf("%4d\t",sum);
					if(lineCount % 3== 0) {
						System.out.println();
					}
				}else if(i%j==0) {
					break;
				}
			}
		}
		
		System.out.println("\n���� : " + sum);

	}

}
