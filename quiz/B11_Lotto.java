package quiz;

import java.util.Arrays;

public class B11_Lotto {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		// �ߺ����� 7��
		// ��÷�� ������ ��ȣ�� ������ �� ��ȸ���� ��÷�ƴ��� ���
		
		
		int i,j=0,count=0,rank=0, random;
		int[] lotto = new int[7];
		int[] lottoH = new int[7];
		boolean loopStop=true;
		
		
		System.out.println("�ζ� ��÷ ��ȣ");
		for(i=0; i<7; i++) {
			random = (int)(Math.random()*45) + 1;
			lottoH[i] = random;
			for(j=0; j<i; j++) {
				if(lottoH[i] == lottoH[j]) {
					i--;
					break;
				}
			}
		}
		
		for(i=0; i<7; i++) {
			if(i==6) {
				System.out.printf("+ %d\n",lottoH[i]);
				break;
			}
			System.out.printf("%d ", lottoH[i]);
		}
		
		
		System.out.println("����� �ζ� ��ȣ");
		while(loopStop) {
			rank = 6;
			
			//����� �ζ� ����
			for(i=0; i<7; i++) {
				random = (int)(Math.random()*45) + 1;
				lotto[i] = random;
				for(j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			
//			System.out.println(Arrays.toString(lotto));
			
			//��
			for(i=0;i<7;i++) {
				for(j=0;j<7;j++) {
					if(lottoH[i] == lotto[j]) {
						rank--;
						break;
					}
				}
			}
			
			if(rank == 0) {
				loopStop = false;
			}
			
			count++;
			
		}
		System.out.println(Arrays.toString(lotto) + " �� ����Ƚ�� : " + count);
	}

}
