

public class A09_TypeCasting {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		//	# 타입 캐스팅
		//	  - 데이터의 타입을 변화시키는 것
		//	  - 타입이 자연스럽게 변화는 경우와 강제로 변화시키는 경우가 있다
		//		
		//	# 암묵적 타입 캐스팅 (타입이 자연스럽게 변하는 경우)
		//	  - 작은 타입에서 큰 타입으로 변할 때는 아무 문제가 생기지 않는다.
		//	  - 그 외에도 문제가 생기지 않을 타입 변환은 캐스팅을 직접하지 않ㅇ아도 저절로 변한다.		
		//		
		//	# 명시적 타입 캐스팅 (프로그래머가 직접 강제로 변화시키는 경우)
		//	  - 큰 타입의 값을 작은 타입으로 변환 시킬 때는 문제가 생길 가능성이 있다.
		//	  - 그 외에도 문제가 생길 가능성이 있는 타입 변환은 명시적으로 타입을 변환시켜야 한다.
		
		//	# 타입의 크기 순서
		//	  byte < short < int < long < float < double
		
		//	char : 부호가 없는 타입		(범위를 생각해서 타입 캐스팅하자 -값이 없음!!!! 원그려봐서 생각해보기..)
		
		long _long = Long.MAX_VALUE;
		float _float = _long;
		int _int = 30000; 
		byte _byte = 127;
		
		int a = _byte;
		
		_byte = (byte)_int; // 강제 변환
		
		System.out.println("long 최대값을 float에 넣은 값 : " + _float);
		System.out.println("float 최솟값 : " + (float)Long.MIN_VALUE);
		System.out.println("int("+_int+") 강제 변환 byte : " +_byte);
		
		// 크기에 관계없이 문제가 생길 가능성이 있는 경우 타입 캐스팅이 필요하다.
		_byte = -2;
		char ch = (char)_byte;
		System.out.println("ch : " + (int)ch);
		
		// 문제가 생기지는 않지만 값이 다르게 해석될 필요가 있는 경우에도 타입캐스팅을 사용한다.
		System.out.println((char)122);
		System.out.println((int)122);
	}

}
