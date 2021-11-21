package quiz;

public class B10_Random {
	/*	
	 	Math.random()은 0<=x<1 의 범위.
	 	
		※ 원하는 범위의 정수를 만드는 절차 (ex.15~65)
		
		  (1) 생성된 랜덤 소수에 원하는 숫자의 개수를 곱한다. (51)
		  (2) 원하는 숫자 중 가장 작은 숫자를 더한다.(15)
		  (3) 소수점 아래를 삭제한다. (int)
	*/	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomTotal, i;
		double randomValue;
	
		for(i = 0; i<10; i++) {
			randomValue = Math.random();
			randomTotal = (int)(randomValue*100)+1;
			System.out.printf("%f x 100 = %f\tint로 변환 : %d + 1 = %d\n",randomValue,randomValue*100,(int)(randomValue*100),(int)(randomValue*100)+1);
//			System.out.println(Math.random());
//			System.out.print(randomTotal + "\t");
		}
		for(i=0;i<7;i++) {
			System.out.print((int)(Math.random()*45)+1 + " ");
		}

	}

}
