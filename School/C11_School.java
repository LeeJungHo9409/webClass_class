package School;

public class C11_School {
	
	/*
		1. 프로그래밍 반 / 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 운영체제, 자료구조 점수가 있다.
		
		2. 네트워크 반 / 학생들은 각자의 국어, 영어, 리눅스, 네트워크, CCNA 점수가 있다.
		
		3. 머신러닝 반 / 학생들은 각자의 국어, 영어, 수학, 통계학, 머신러닝 점수가 있다.
		
		4. 각 반의 정원은 25~35명이다.
		
		5. 모든 학생의 과목별 점수와 이름은 랜덤으로 생성한다.
		  학번은 중복없이 순차적으로 생성되어야 한다. (또는 중복없는 랜덤도 가능)
		  
		6. 각 학생의 성적표 메서드를 통해 이름 / 각 과목 점수 / 총점 / 평균점수를 볼 수 있어야 한다.
		 
	 */
	
	public static void main(String[] args) {
		SchoolClass[] sc = new SchoolClass[3];
		
		for(int i = 0; i<sc.length; i++) {
			System.out.println("================================================");
			System.out.println((i+1)+"반");
			sc[i] = new SchoolClass(i+1);
			sc[i].ClassPrint();
			System.out.println("===============================================");
		}
	}
}
