import java.util.Scanner;

public class B08_isPrime {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		// ����ڷκ��� ���ڸ� ����� �Է¹����� 1����
		// �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����غ�����.
		
		int i,j,num,lineCount=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("����� �Է����ּ��� : ");
		num = input.nextInt();
		
		if(num < 0) {
			System.out.println("����� �Է����ּ���!!!!!!");
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
		
		System.out.println("\n�Ҽ� ��� : "+lineCount+"��");
		
	}

}
