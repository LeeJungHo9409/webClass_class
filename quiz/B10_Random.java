package quiz;

public class B10_Random {
	/*	
	 	Math.random()�� 0<=x<1 �� ����.
	 	
		�� ���ϴ� ������ ������ ����� ���� (ex.15~65)
		
		  (1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ�. (51)
		  (2) ���ϴ� ���� �� ���� ���� ���ڸ� ���Ѵ�.(15)
		  (3) �Ҽ��� �Ʒ��� �����Ѵ�. (int)
	*/	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomTotal, i;
		double randomValue;
	
		for(i = 0; i<10; i++) {
			randomValue = Math.random();
			randomTotal = (int)(randomValue*100)+1;
			System.out.printf("%f x 100 = %f\tint�� ��ȯ : %d + 1 = %d\n",randomValue,randomValue*100,(int)(randomValue*100),(int)(randomValue*100)+1);
//			System.out.println(Math.random());
//			System.out.print(randomTotal + "\t");
		}
		for(i=0;i<7;i++) {
			System.out.print((int)(Math.random()*45)+1 + " ");
		}

	}

}
