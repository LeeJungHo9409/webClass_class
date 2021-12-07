package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*
 	���� ����� ����� ������ �� �ִ� ������ Ŭ���� �ϳ� ����
	���� ������� ����� �����ϰ� �ش� ����� Ŭ���� Ÿ�Ӽ� / ���������� ��� 
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
		
		System.out.println("����");
		System.out.println(playerArr);
		
		System.out.println();
		System.out.println("Ÿ�� ��");
		Collections.sort(playerArr, new Rank_Time());
		System.out.println(playerArr);
		
		System.out.println();
		System.out.println("���� ��");
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
