import java.util.HashMap;
//어쩌다 inner 클래스...?
import java.util.Map.Entry;
import java.util.Set;

/*
	# Map
	  - 데이터를 Key-Value 한 쌍으로 저장하는 방식의 자료 구조
	  - 인덱스 대신 Key 값을 통해 Value에 접근할 수 있따.
	  - Key는 중복을 허용하지 않는다.
 */

public class D07_HashMap {
	public static void main(String[] args) {
		//첫 번째 제네릭은 key의 타입이고 두 번째 제네릭은 Value의 타입이다.
		HashMap<String, String> dest = new HashMap<>();
		HashMap<String, Object> humanData = new HashMap<>();
		
		humanData.put("이름", "길동이");
		humanData.put("나이", 123);
		
		//put(k,v) : 해당 키에 값을 저장한다.
		dest.put("학원", "구리시 인창동");
		dest.put("집", "남양주시 다산동");
		dest.put("회사", "강남구 삼성동");
		
		//get(key) : 키값을 통해 값을 꺼낸다.
		System.out.println(dest.get("집"));
		System.out.println(dest.get("학원"));
		
		// putIfAbsent(key, value) : 해당 키값이 비어있으면 값을 넣는다. 비어있지 않으면 값을 꺼낸다.
		// 비어 있을땐 채우고 null 리턴한다.
		System.out.println(dest.putIfAbsent("식당", "남양주시 지금동"));
		// 비어 있지 않을 때는 기존 값을 꺼낸다.
		System.out.println(dest.putIfAbsent("식당", "남양주시 가운동"));
		System.out.println(dest.putIfAbsent("식당", "남양주시 가운동"));
		
		// put 메서드는 이미 존재하는 값을 덮어 쓸 수 있다.
		dest.put("회사", "판교");
		System.out.println(dest.get("회사"));
		
		/*
			# 반복문으로 Map타입 활용하기
			
			  - keySet() : 해당 맵의 존재하는 모든 키들을 Set 타입으로 반환한다. (중복없으니 set으로 꺼내도 상관없음)
			  - values() : 해당 맵의 모든 값들로 이루어진 Collection을 반환한다. (하지만 애는 중복이 있을 수도 있기에 Collection으로 반환한다.)
			  - entrySet() : Entry<key, value>로 이루어진 set을 반환한다.
		 */
		
		//키만 가져오기에
		for(String key : dest.keySet()) {
			System.out.println(dest.get(key));
		}
		
		for(String value : dest.values()) {
			System.out.println(dest.get(value));
		}
		
		//inner class 의 특징은 굳이 가져올 필요가 없는걸 구현해 둔게 많음. 
		for(Entry<String, String> entry : dest.entrySet()) {
			System.out.printf("키 [%s], 값 : [%s]\n", entry.getKey(), entry.getValue());
		}
	}
}
