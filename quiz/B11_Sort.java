package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B11_Sort {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int i,j,temp=0, min=99999, random;
		int[] sort_1 = new int[10];
		int[] sort_2 = new int[10];
		
		//������ �Է�
		for(i=0; i<10; i++) {
			random = (int)(Math.random()*99999);
			sort_1[i] = random;
			sort_2[i] = random;
		}
		
		//��������
		System.out.println("�������� : "+Arrays.toString(sort_1)+"\n");
		for(i=0;i<sort_1.length; i++) {
			min = 99999;
			for(j=i;j<sort_1.length; j++) {
				if(sort_1[j] < min) {
					temp = sort_1[i];
					min = sort_1[j];
					sort_1[i] = min;
					sort_1[j] = temp;
				}
			}
			System.out.println(Arrays.toString(sort_1));
		}
		
		System.out.println();
		System.out.println("���ð�� : "+Arrays.toString(sort_1));
		System.out.println();
		
		
		//��������
		System.out.println("�������� : "+Arrays.toString(sort_2)+"\n");
		for(i=(sort_2.length-2);i>=0; i--) {
			if(sort_2[i] > sort_2[i+1]) {
				temp = sort_2[i];
				sort_2[i] = sort_2[i+1];
				sort_2[i+1] = temp;
				if(i<sort_2.length-2) {
					i+=2;
				}
				
			}
			System.out.println(Arrays.toString(sort_2));
		}
		
		System.out.println();
		System.out.println("���� ��� : " + Arrays.toString(sort_2));
	}

}
