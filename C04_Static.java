import java.util.Arrays;

/*
	# static (���� ����(Ŭ���� ����) <==> �ν��Ͻ� ����(������ �� ���� ����))
	  
	  - ��� Ŭ�������� �������� �̿�Ǵ� ��ü���鿡 �ٿ��ָ��.
	  - static ������ ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
	  - ��� �ν��Ͻ��� �������� ����ϴ� �ڿ��� �ȴ�.
	  - static ������ �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ������ �ϳ��ۿ� �������� �ʱ� ������
	  	Ŭ���� �̸��� .�� ��� ����� �� �ִ�. (�޸� ������ �ȴ�.)
	  - static ������ ���� �޸𸮸� ������ �� �ִ�.
	  - static �޼ҵ�� static �ڿ����� Ȱ���� �� �ִ� �޼����.
	  - static ���� �ڿ��� �ν��Ͻ��� ����� ������ Ȱ���� �� �ִ�.
	  - static �������� �ν��Ͻ� �ڿ� ���Ұ�.
	  - �ν��Ͻ� ���������� static �ڿ��� ����� �� �ִ�. (�����Ǵ� ����������)

*/
public class C04_Static {
	
	static int beer = 300;
	
	public static void main(String[] args) {
		
//		TrumphCard sk = new TrumphCard(0,13);
//		TrumphCard h10 = new TrumphCard(2,10);
//		
//		sk.height = 600;
//		
//		System.out.println(sk.height);
//		System.out.println(sk.weight);
//		System.out.println(h10.height);
//		System.out.println(h10.weight);
		
		System.out.println("������ �⺻ �ʵ�");
		
		System.out.println();
		System.out.println("���ӵ����� :\t\t"+Player.commonDamage);
		System.out.println("���Ͽ� ġ���Ǵ� �� :\t"+Player.cure);
		System.out.println();
		
		System.out.println("player1");
		Player p1 = new Player();
		p1.info();
		
		System.out.println();
		
		System.out.println("player2");
		Player p2 = new Player();
		p2.info();
		
	}
}

// class ���� Ʈ����ī��
//
//class TrumphCard{
//	int number;
//	int suit;
//	static int height = 400;
//	static int weight = 200;
//	
//	public TrumphCard(int number, int suit) {
//		// TODO Auto-generated constructor stub
//		this.number = number;
//		this.suit = suit;
//	}
//	
//	public static void random() {
//		//���� ���������� static �ֵ��� �޸𸮿� ������ ��ü ���� ���� ���� ���� �����ϸ� �ν��Ͻ��� ���������.
//		//��� �ν��Ͻ��� ����������� �ʾұ� ������ ����� �Ұ��ϴ�.
//		//static �޼ҵ忡���� �ν��Ͻ� ������ ��� �Ұ�.
//		height = 100;
//	}
//}

// �������� : static �ڿ��� ������ Ŭ������ �����غ����� (�ʺ�/����/ũ�� ����)

//������
class Player{
	static int commonDamage = 0;	//���� ���ӵ�����
	static int cure = 10;			//�ڿ� ġ���� �� ���� ���
	int hp, mp;						//�÷��̾��� hp,mp
	int externalDamage;				//��Ÿ
	boolean live, aumour;			//��������, ���ʻ���
	int aumourDurability;			//���� ������
	
	public Player() {
		hp = (int)(Math.random()*500+1);
		mp = (int)(Math.random()*100+1);
		externalDamage = (int)(Math.random()*30+1); 
		aumourDurability = (int)(Math.random()*50+1);
		aumour = true;
	}
	
	//��Ÿ
	int attack() {
		return externalDamage;
	}
	
	//����
	int magic(int number) {
		Number SINGING_ATTACK = new Number(1);
		Number COUNTINUING_ATTACK = new Number(2);
		switch(number) {
		case 1 :
			mp =- 30;
			return commonDamage++;
		case 2 :
			externalDamage = 200;
			return externalDamage;
		}
		
		return 0;
		
	}
	
	//�÷��̾� ���� ����
	boolean playerLive() {
		if(hp <= 0) {
			return false;
		}else {
			return true;
		}
	}
	
	void info() {
		System.out.println("HP 		: " + hp);
		System.out.println("MP 		: " + mp);
		System.out.println("DAMAGE 	: " + externalDamage);
		System.out.println("AURMOR 	: " + aumourDurability);
	}
}

class Number{
	int code = 0; 
	public Number(int code) {
		// TODO Auto-generated constructor stub
		this.code = code;
	}
	int codeReturn() {
		return code;
	}
}