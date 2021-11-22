
public class B12_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number = {1,2,3,4,5};
		int[][] arrs= {{1,2,3,4,5}, number};
		int i, j;
		int x,y;
		double z;
	
		for(i=0;i<number.length; i++) {
			System.out.printf("%d\t",number[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(i=0;i<arrs.length; i++) {
			for(j=0;j<arrs[i].length; j++) {
				System.out.printf("arr[%d][%d] : [%d]\n",i,j,arrs[i][j]);
			}
			System.out.println();
		}
		
		//2차원 배열 응용하기
		
		int[][][] tetris = {
				{
					{0,1,1},
					{0,0,1},
					{0,0,1}
				},
				{
					{1,1,0},
					{1,0,0},
					{1,0,0}
				},
				{
					{0,0,0,1},
					{0,0,0,1},
					{0,0,0,1},
					{0,0,0,1}
				},
				{
					{1,1},
					{1,1},
				},
				{
					{1,0,0},
					{1,1,0},
					{0,1,0}
				},
				{
					{0,0,1},
					{0,1,1},
					{0,0,1}
				}
				
				
		};
		
		for(i=0;i<tetris.length; i++) {
//			z = Math.random()*6-3;
//			System.out.println((int)z);
			System.out.println("block " + i);
			for(j=0;j<tetris[i].length; j++) {
				for(int k=0;k<tetris[i][j].length; k++) {
					if(tetris[i][j][k] == 1) {
						System.out.print("■ ");
					}else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
		}
	}

}
