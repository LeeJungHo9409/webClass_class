package quiz;

import java.util.Arrays;

public class B12_Array2Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0,j=0, sum=0, count=0;
		double avg=0;
		
		int[][] numArr = new int[][] {
			{1,1,1,1,1},
			{1,1,1},
			{1,1,1,1,1,1,1,1},
			{1,1},
			{1,1,1,1},
		};
		//1. numArr의 모든 값을 0~100 사이의 랜덤 정수로 바꿔주세요	
		
		int max_column = 0;
		for(i=0; i<numArr.length; i++) {
			for(j=0;j<numArr[i].length; j++) {
				int len = numArr[i].length;
				max_column = len > max_column ? len : max_column;
			}
		}
		
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[max_column];
		
		System.out.println("1번 출력");
		for(i=0; i<numArr.length; i++) {	
			for(j=0;j<numArr[i].length; j++) {
				numArr[i][j] = (int)(Math.random()*101);
				//2-1. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합 출력해보세요.
				sum += numArr[i][j];
				//3. numArr의 각 행의 합을 구해서 출력해보세요.
				rowSum[i] += numArr[i][j];
				//4. numArr의 각 열의 합을 구해서 출력해보세요.
				colSum[j] += numArr[i][j];
				System.out.printf("[%3d ] ", numArr[i][j]);
				count++;
			}
			System.out.println();
		}
		//2-2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 평균 출력해보세요.
		avg = (double)sum/count;
		//2번 문제 출력
		System.out.println("\n2번 출력");
		System.out.printf("총합은 %d 이며 평균값은 %d / %d = %.2f 이다.\n", sum, sum, count, avg);
		System.out.println();
		//3번 출력
		System.out.println("3. 행합출력");
		for(i=0;i<rowSum.length;i++) {
			System.out.printf("[%d]\n",rowSum[i]);
		}
		System.out.println();
		//4번 출력
		System.out.println("4. 열합출력");
		for(i=0;i<colSum.length;i++) {
			System.out.printf("[%d]  ",colSum[i]);
		}
	}
	

}
