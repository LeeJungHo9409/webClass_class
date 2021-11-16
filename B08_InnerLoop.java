
public class B08_InnerLoop {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int i , j , k;
		for(i = 0; i<10; i++) {
			System.out.println("================================= 바깥 반복문" + i);
			
			for(j = 0; j<6; j++) {
				System.out.printf("------------------------------ 안쪽 반복문 %d-%d\n",i,j);
				
				for(k=0; k<3; k++) {
					System.out.printf("+++++++++++++++++++제일 안쪽 반복문 %d-%d-%d\n", i, j, k);
				}
			}
		}
		
		System.out.println("------------구구단-----------");
		System.out.print("\t");
		for(j=1; j<10;j++) {
			System.out.print("*"+j+"\t");
		}
		System.out.println();
		for(i = 2; i<10; i++) {
			System.out.print(i+"단 : \t");
			for(j=1; j<10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

}
