/*
	# 대입 연산자
	  = : 왼쪽의 변수에 오른쪽의 값을 대입한다.
	  
	# 복합 대입 연산자
	  - 변수에 결과를 누적시키는 연산을 줄여서 표현한다.
	  - +=, -=, *=, ....
	  
	# 단항 연산자
	  - 1씩 누적시키는 연산을 더 줄여서 표현한 연산
	  - ++, --의 위치에 따라 결과가 달라진다.
	
*/

public class B05_Operator03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		대입연산
		int x=10;

//		복합 대입 연산
		x*=2;
		x*=2;
		x*=2;
		x*=2;
		System.out.println(x);
		
		x=30;
		x+=3;
		System.out.println(x);
//		System.out.println(x+=3);
		System.out.println(x);
		
		System.out.println(x-=15);
		System.out.println(x*=3);
		System.out.println(x/=5);
		System.out.println(x%=3);
		
//		단항 연산자
		x=30;
		x++;
		System.out.println(x);
		++x;
		System.out.println(x);
		x--;
		System.out.println(x);
		--x;
		System.out.println(x);
		
	}

}
