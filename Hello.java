public class Hello {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i=0,j=0, sp=0;
		System.out.println("hello, java");
		
		for(i=0; i<=5; i++) {
			for(sp=5; sp>i; sp--) {
				System.out.print(" ");
			}
			for(j=0; j<(i*2)+1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
