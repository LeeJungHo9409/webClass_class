package quiz;

public class B11_MakeRandomScore {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int i, sum=0,min=100,max=0, aver;
		int[] student = new int[100];
		String strMax = "", strMin="";
		
		//1. �л� 100���� ����(0~100)�� �������� �����Ͽ� �迭�� ����
		for(i = 0; i< student.length; i++) {
			student[i] = (int)(Math.random()*100)+1;
		
			//3. ����� �迭�� ���� Ȱ���� ��� �л����� ��� ������ �����ּ���
			sum+=student[i];
			
			//4. ����� �迭�� �Ӱ��� Ȱ���� ������ ���� ���� �л��� ���� ���� �л��� ������ ���ϼ���
			if(max < student[i]) {
				max = student[i];
				strMax = i + "��°�� " + max + "������ ���� Ů�ϴ�";
			}
			if(min > student[i]) {
				min = student[i];
				strMin = i + "��°�� " + min + "������ ���� �۽��ϴ�";
			}
		}
		
		//2. ����� �迭�� ���� ���� ���� ���·� ����غ�����.
		
		for(i = 1; i<=student.length; i++) {
			System.out.printf("%3d ",student[i-1]);
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n���� ū�� : " + strMax);
		System.out.println("\n���� ������ : " + strMin);
		System.out.println("�� �հ�� " + sum + "���̰�, ��հ��� " + (double)sum/100 + "���Դϴ�.");
	}

}
