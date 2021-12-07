import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
	# Compare
	  - 비교하다 
	  
	# Comparable
	  - 비교가능하다
	  - 이 인터페이스를 구현한 클래스는 서로 크기 비교가 가능한 클래스가 된다.
	  
	# Comparator
	  - 비교하는사람
	  - 이 인터페이스를 구현한 클래스는 비교의 기준으로 사용할 수 있다.
 */

public class D06_Comparator {
	
	public static void main(String[] args) {
		Grape muscat = new Grape("머스켓",1, 100, 20, 0);
		Grape sultana = new Grape("설태너",1, 80, 30, 1);
		Grape cabernetSauvignon = new Grape("카베르네 소비뇽",0, 60, 80, 2);
		Grape pinotNoir = new Grape("피노 누아르",0, 110, 10, 3);
		Grape shiraz = new Grape("시라즈", 1, 90, 52, 3);
		Grape pinotNoir1 = new Grape("피노 누아르",0, 110, 10, 2);
		Grape shiraz2 = new Grape("시라즈", 1, 90, 52, 2);
		Grape shiraz3 = new Grape("시라즈", 1, 90, 52, 1);
		
		//System.out.println(muscat.compareTo(pinotNoir));
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(muscat);
		grapes.add(sultana);
		grapes.add(cabernetSauvignon);
		grapes.add(pinotNoir);
		grapes.add(shiraz);
		grapes.add(pinotNoir1);
		grapes.add(shiraz2);
		grapes.add(shiraz3);
		
		/*
		muscat.grapePrint();
		sultana.grapePrint();
		cabernetSauvignon.grapePrint();
		pinotNoir.grapePrint();
		shiraz.grapePrint();*/
		
//		System.out.println(grapes);
//		Collections.sort(grapes);
//		System.out.println(grapes);
//		Collections.reverse(grapes);
//		System.out.println(grapes);
		
//		Collections.sort(grapes, new GrapeMachine_size());
//		System.out.println(grapes);

		System.out.println("기준");
		System.out.println(grapes);
		System.out.println();
		System.out.println("변경 후");
		Collections.sort(grapes, new GrapeMachine_qty());
		System.out.println(grapes);
	}
	
}

class Grape implements Comparable{
	
	static String[] ORIGIN_NAMES = {"Japan", "Levant", "Canada", "France"};
	static String[] COLOR_NAMES = {"RED", "GREEN"};
	
	String name;
	int color;
	int size;
	int qty;
	int origin;
	
	public Grape(String name, int color, int size, int qty, int origin) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.qty = qty;
		this.origin = origin;
	}
	
	void grapePrint() {
		
		//해당 인스턴스의 toString()을 호출하여 콘솔에 출력하는 메서드이다.
		System.out.println("name\t: " + name);
		System.out.println("Color\t: " + COLOR_NAMES[color]);
		System.out.println("Size\t: " + size);
		System.out.println("Qty\t: " + qty);
		System.out.println("Origin\t: " + ORIGIN_NAMES[origin]);
		System.out.println();
	}
	
	@Override
	public String toString() {
		// 이 클래스를 문자열로 반환한다면 어떤 모양일지 정의하는 메서드
		// toString()의 기본 동작은 현재 인스턴스의 클래스 이름과 주소값을 문자열로 반환하는 것이다.
		return String.format("\n\t[%s %s %d %d %s]\n", name, COLOR_NAMES[color], size, qty, ORIGIN_NAMES[origin]);
	}

	//추상메소드를 오버라이드 해줘야 된다.
	@Override
	public int compareTo(Object o) {
		/* 
			# 비교 메소드의 규칙
			  - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 작으면 -1을 리턴해야 한다.	(또는 음수)
			  - 현재 인스턴스가 매개변수로 전달된 인슽턴스보다 크면 1을 리턴해야 한다.		(또는 양수)
			  - 두 인스턴스가 서로 같은 값이라면 0을 리턴해야 한다.
			  - 각 기본 타입의 compare 메서드를 통해 쉽게 크기 비굘르 할 수 있다.
		 */
		
//		if(this.qty < ((Grape) o).qty) {
//			return -1;
//		}else if(this.qty > ((Grape) o).qty) {
//			return 1;
//		}else {
//			return 0;
//		}
		return Integer.compare(this.qty, ((Grape)o).qty);
		
	}
}

class GrapeMachine_size implements Comparator<Grape>{
	@Override
	public int compare(Grape o1, Grape o2) {
		return Integer.compare(o1.size, o2.size);
	}
}

class GrapeMachine_qty implements Comparator<Grape>{
	
	@Override
	public int compare(Grape o1, Grape o2) {
		
		int temp = Integer.compare(o1.qty, o2.qty) * -1;
		
		//사전 이름 순 / 인덱스 아님!
		if(temp == 0) {
			return o1.ORIGIN_NAMES[o1.origin].compareTo(o2.ORIGIN_NAMES[o2.origin]);
		}else {
			return temp;
		}
	}
}