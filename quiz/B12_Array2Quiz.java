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
		//1. numArr�� ��� ���� 0~100 ������ ���� ������ �ٲ��ּ���	
		
		int max_column = 0;
		for(i=0; i<numArr.length; i++) {
			for(j=0;j<numArr[i].length; j++) {
				int len = numArr[i].length;
				max_column = len > max_column ? len : max_column;
			}
		}
		
		int[] rowSum = new int[numArr.length];
		int[] colSum = new int[max_column];
		
		System.out.println("1�� ���");
		for(i=0; i<numArr.length; i++) {	
			for(j=0;j<numArr[i].length; j++) {
				numArr[i][j] = (int)(Math.random()*101);
				//2-1. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���� ����غ�����.
				sum += numArr[i][j];
				//3. numArr�� �� ���� ���� ���ؼ� ����غ�����.
				rowSum[i] += numArr[i][j];
				//4. numArr�� �� ���� ���� ���ؼ� ����غ�����.
				colSum[j] += numArr[i][j];
				System.out.printf("[%3d ] ", numArr[i][j]);
				count++;
			}
			System.out.println();
		}
		//2-2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ��� ����غ�����.
		avg = (double)sum/count;
		//2�� ���� ���
		System.out.println("\n2�� ���");
		System.out.printf("������ %d �̸� ��հ��� %d / %d = %.2f �̴�.\n", sum, sum, count, avg);
		System.out.println();
		//3�� ���
		System.out.println("3. �������");
		for(i=0;i<rowSum.length;i++) {
			System.out.printf("[%d]\n",rowSum[i]);
		}
		System.out.println();
		//4�� ���
		System.out.println("4. �������");
		for(i=0;i<colSum.length;i++) {
			System.out.printf("[%d]  ",colSum[i]);
		}
	}
	

}
