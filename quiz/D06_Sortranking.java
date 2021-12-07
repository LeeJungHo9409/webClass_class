package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 	여러 사람의 기록을 저장할 수 있는 데이터 클래스 하나 설계
	여러 사람들의 기록을 저장하고 해당 기록을 클리어 타임순 / 점수순으로 출력 
 */

public class D06_Sortranking {
	public static void main(String[] args) {	
		ArrayList<Player> playerArr = new ArrayList<>();
		
		
		for(int i = 0; i<(int)(Math.random()*10+3); i++) {
			String name = "";
			for(int j=0; j<(int)(Math.random()*5+1); j++) {
				name += (char)((int)(Math.random()*25+97));
			}
			playerArr.add(new Player(name, (Math.random()*1000), (int)(Math.random()*100)));
		}
		
		System.out.println("기준");
		System.out.println(playerArr);
		
		System.out.println();
		System.out.println("타임 순");
		Collections.sort(playerArr, new Rank_Time());
		System.out.println(playerArr);
		
		System.out.println();
		System.out.println("점수 순");
		Collections.sort(playerArr, new Rank_Point());
		System.out.println(playerArr);
	}
}

class Player{
	
	String name;
	double timeRank;
	int value;
	
	public Player(String name, double timeRank, int value) {	
		this.name = name;
		this.timeRank = timeRank;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public double getTimeRank() {
		return timeRank;
	}
	public int getPoint() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("[%s\t%.2f\t%d]\n", name, timeRank, value);
	}
}

class Rank_Time implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return Double.compare(o1.timeRank, o2.timeRank);
	}
}

class Rank_Point implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		return Integer.compare(o1.value, o2.value) * -1;
	}
}
