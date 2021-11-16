
public class B08__Gugudan {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int i,j;
		
		//구구단을 가로로 출력
		System.out.println("1. ");
		for(i=2; i<10; i++) {
			System.out.print(i+"단:");
			for(j=1; j<10; j++) {
				System.out.printf("%2dx%d=%2d",i,j,i*j);
			}
			System.out.println();
		}
		
		//구구단을 세로로 출력
		
		System.out.println("2. ");
		for(i=0;i<10;i++) {
			for(j=2;j<10;j++) {
				if(i==0) {
					System.out.printf("%d단\t",j);
				}else {
					System.out.printf("%dx%d=%2d\t",j,i,j*i);
				}
			}
			System.out.println();
			
		}
	}

}
