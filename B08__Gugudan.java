
public class B08__Gugudan {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int i,j;
		
		//�������� ���η� ���
		System.out.println("1. ");
		for(i=2; i<10; i++) {
			System.out.print(i+"��:");
			for(j=1; j<10; j++) {
				System.out.printf("%2dx%d=%2d",i,j,i*j);
			}
			System.out.println();
		}
		
		//�������� ���η� ���
		
		System.out.println("2. ");
		for(i=0;i<10;i++) {
			for(j=2;j<10;j++) {
				if(i==0) {
					System.out.printf("%d��\t",j);
				}else {
					System.out.printf("%dx%d=%2d\t",j,i,j*i);
				}
			}
			System.out.println();
			
		}
	}

}
