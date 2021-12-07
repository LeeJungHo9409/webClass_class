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
	static String[] CIV_NAME = {"�ѱ�", "�߱�", "�Ϻ�", "���þ�", "������", "����", "�̱�"};
	Playtime pt;
	Score sc;
	int civ;

	@Override
	public int compareTo(Record o) {
		return Integer.compare(sc.getScore(), o.sc.getScore());
	}
	
	@Override
	public String toString() {
		return String.format("\n�÷��� ���� : %s, �÷��� Ÿ�� : %s\n"
				+ "\t��\t: %d\n"
				+ "\t��������\t: %d\n"
				+ "\t��ȭ����\t: %d\n"
				+ "\t�ܱ�����\t: %d\n"
				+ "\t��������\t: %d\n"
				+ "\t��������\t: %d\n"
				+ "\t����\t: %d\n"
				,CIV_NAME[civ], pt, sc.turn, sc.science, sc.culture, sc.diplomacy, sc.tour, sc.religion, sc.getScore()); //�÷��� Ÿ�� : %d", CIV_NAME[civ], pt);
	}
	
	public Record(int civ, Playtime playtime) {
		this.pt = playtime;
		this.civ = civ;
		this.sc = new Score();
	}
}

class Score{
	int turn;
	int science;			//����
	int culture;			//��ȭ
	int diplomacy;			//�ܱ�
	int tour;				//����
	int religion;			//����
	
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
		return String.format("%d�� %d�ð� %d�� %d��", day, hour, minute, second);
	}
}
