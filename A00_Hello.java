public class A00_Hello {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
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
		
		i=0;
		System.out.println();
		while(true) {
			System.out.print("*");
			i++;
			if(i>10) {
				break;
			}
		}
	}
}