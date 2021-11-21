package quiz;

public class B10_Array {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		int[] arr = new int[200];
		int i;
		
		for(i=0; i<200; i++) {
			arr[i] = i;
			
			arr[i] += 1;
			
			System.out.print(arr[i] + " ");
		}
	}

}
