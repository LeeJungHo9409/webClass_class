package quiz;

public class B07_BreakContinue {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		/*
		 	# continue
		 		
		 		- 반복문 내부에서 사용하면 다음번 반복으로 넘어간다.
		 		- continue를 만나게 되면 이후 남은 반복 코드는 모두 무시한다.
		*/
		
		for(int i=0; i<10; i++) {
			
			if(i==7)
				continue;
			
			System.out.println(i);
			
		}
	}

}
