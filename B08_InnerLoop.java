
public class B08_InnerLoop {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		int i , j , k;
		for(i = 0; i<10; i++) {
			System.out.println("================================= �ٱ� �ݺ���" + i);
			
			for(j = 0; j<6; j++) {
				System.out.printf("------------------------------ ���� �ݺ��� %d-%d\n",i,j);
				
				for(k=0; k<3; k++) {
					System.out.printf("+++++++++++++++++++���� ���� �ݺ��� %d-%d-%d\n", i, j, k);
				}
			}
		}
		
		System.out.println("------------������-----------");
		System.out.print("\t");
		for(j=1; j<10;j++) {
			System.out.print("*"+j+"\t");
		}
		System.out.println();
		for(i = 2; i<10; i++) {
			System.out.print(i+"�� : \t");
			for(j=1; j<10; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}
	}

}
