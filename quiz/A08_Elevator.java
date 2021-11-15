package quiz;
import java.util.Scanner;

public class A08_Elevator {
	
	public static void main(String[] args) {
		
		double elevaWeight=600,							//엘리베이터 총무게 
				add, total, 							//두 물건을 더한 값, 엘리베이터 뺀 값
				firWeight, secWeight;					//물건 1의 무게, 물건 2의 무게
		Scanner input = new Scanner(System.in);
		
		System.out.print("첫번째 물건 무게를 작성해주세요 : ");
		firWeight = input.nextDouble();
		System.out.print("두번째 물건 무게를 작성해주세요 : ");
		secWeight = input.nextDouble();		

		add = firWeight + secWeight;
		total = elevaWeight - add;

		System.out.printf("두 물건의 총무게는 : %.2fkg 이고, 엘리베이터 무게는 %.2fkg 입니다.\n", add, elevaWeight);
		System.out.printf("엘리베이터 무게와 두 물건의 비교하여 더 적재가능한 무게는 %.2fkg입니다.\n", total);
		
		//if(total > 0) {
		//	System.out.printf("엘리베이터 무게와 두 물건의 비교하여 더 적재가능한 무게는 %.2fkg입니다.\n", total);
		//}else{
		//	System.out.printf("엘리베이터 무게를 %.2fkg 만큼 초과하여 더이상 적재할 수 없습니다.\n", Math.abs(total));
		//}
	}

}
