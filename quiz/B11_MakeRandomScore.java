package quiz;

public class B11_MakeRandomScore {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int i, sum=0,min=100,max=0, aver;
		int[] student = new int[100];
		String strMax = "", strMin="";
		
		//1. 학생 100명의 점수(0~100)를 랜덤으로 생성하여 배열에 저장
		for(i = 0; i< student.length; i++) {
			student[i] = (int)(Math.random()*100)+1;
		
			//3. 저장된 배열의 값을 활용해 모든 학생들의 평균 점수를 구해주세요
			sum+=student[i];
			
			//4. 저장된 배열으 ㅣ값을 활용해 점수가 가장 낮은 학생와 가장 높은 학생의 점수를 구하세요
			if(max < student[i]) {
				max = student[i];
				strMax = i + "번째는 " + max + "점으로 제일 큽니다";
			}
			if(min > student[i]) {
				min = student[i];
				strMin = i + "번째는 " + min + "점으로 제일 작습니다";
			}
		}
		
		//2. 저장된 배열의 값을 보기 좋은 형태로 출력해보세요.
		
		for(i = 1; i<=student.length; i++) {
			System.out.printf("%3d ",student[i-1]);
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("\n제일 큰값 : " + strMax);
		System.out.println("\n제일 작은값 : " + strMin);
		System.out.println("총 합계는 " + sum + "점이고, 평균값은 " + (double)sum/100 + "점입니다.");
	}

}
