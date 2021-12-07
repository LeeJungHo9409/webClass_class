package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class D06_sortRanking_t {
	
	public static void main(String[] args) {
		
		ArrayList<Record> records = new ArrayList<>();
		
		records.add(new Record(0, new Playtime(3,5,33,23)));
		records.add(new Record(1, new Playtime(15,2,28,11)));
		records.add(new Record(2, new Playtime(7,7,6,29)));
		records.add(new Record(3, new Playtime(9,8,9,21)));
		records.add(new Record(4, new Playtime(20,11,20,18)));
		records.add(new Record(5, new Playtime(13,15,29,17)));
		records.add(new Record(6, new Playtime(11,9,28,25)));
		
		Collections.sort(records);
		
		for(Record record : records) {
			System.out.println(record);
		}
	}

}

class Record implements Comparable<Record>{
	static String[] CIV_NAME = {"한국", "중국", "일본", "러시아", "프랑스", "독일", "미국"};
	Playtime pt;
	Score sc;
	int civ;

	@Override
	public int compareTo(Record o) {
		return Integer.compare(sc.getScore(), o.sc.getScore());
	}
	
	@Override
	public String toString() {
		return String.format("\n플레이 국가 : %s, 플레이 타임 : %s\n"
				+ "\t턴\t: %d\n"
				+ "\t과학점수\t: %d\n"
				+ "\t문화점수\t: %d\n"
				+ "\t외교점수\t: %d\n"
				+ "\t관광점수\t: %d\n"
				+ "\t종교점수\t: %d\n"
				+ "\t총점\t: %d\n"
				,CIV_NAME[civ], pt, sc.turn, sc.science, sc.culture, sc.diplomacy, sc.tour, sc.religion, sc.getScore()); //플레이 타임 : %d", CIV_NAME[civ], pt);
	}
	
	public Record(int civ, Playtime playtime) {
		this.pt = playtime;
		this.civ = civ;
		this.sc = new Score();
	}
}

class Score{
	int turn;
	int science;			//과학
	int culture;			//문화
	int diplomacy;			//외교
	int tour;				//관광
	int religion;			//종교
	
	public Score(){
		Random ran = new Random();
		turn = ran.nextInt(51) + 100;
		science = ran.nextInt(1001) + 3000;
		culture = ran.nextInt(1001) + 3000;
		diplomacy = ran.nextInt(1001) + 3000;
		tour = ran.nextInt(1001) + 3000;
		religion = ran.nextInt(1001) + 3000;
	}
	
	public int getScore(){
		return (200-turn) * (science + culture + diplomacy + tour + religion);
	}
}

class Playtime{
	int day;
	int hour;
	int minute;
	int second;
	
	public Playtime(int day, int hour, int minute, int second) {
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	@Override
	public String toString() {
		return String.format("%d일 %d시간 %d분 %d초", day, hour, minute, second);
	}
}
