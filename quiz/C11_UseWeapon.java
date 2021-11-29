package quiz;

import java.util.Scanner;

import myobj.weapon.Weapon;

public class C11_UseWeapon {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		Sword sword = new Sword();
		Bow bow = new Bow();
		Spear spear = new Spear();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			sword.attack();
			bow.attack();
			spear.attack();
			
			spear.upgrade();
			bow.upgrade();
			System.out.println("�� ��ȭ�Ͻ�?");
			System.out.println("1. ��ȭ\t 2. ����");
			switch (input.nextInt()) {
			case 1: {
				sword.upgrade();
				break;
			}
			default:
				return;
			}
		}
	}
	
	
}

class Spear extends Weapon{
	
	int count=0;
	
	public Spear() {
		this.name = "Spear";
		this.attack = 8;
		this.level = 1;
		upgrade();
	}
	
	public void upgrade() {
		//5�� �����Ҷ����� ������ 2�� ���
		count++;
		if(count%5==0) {
			attack *= 2;
			level++;
		}
	}
}

class Bow extends Weapon{
	
	public Bow() {
		this.name = "bow";
		this.attack = 5;
		this.level = 1;
		upgrade();
	}
	
	public void upgrade() {
		//�����ϸ� �Ҽ��� ������.
		attack++;
		level++;
	}
}

class Sword extends Weapon{ 
	
	int percent;
	int index=0;
	
	public Sword() {
		// TODO �ڵ� ������ ������ ����
		this.name = "sword";
		this.attack = 10;
		this.level = 1;
		upgrade();
	}
	
	public void upgrade() {
		int randdom = (int)(Math.random()*100);
		
		//Ȯ�� ����
		if(randdom <= 90 && level < 4) {
			System.out.printf("90%c�� [%d] ��ȭ����\n",37,level);
			attack+=4;
			this.level++;
		}else if(randdom <= 70 && level < 7) {
			System.out.printf("70%c�� [%d] ��ȭ����\n",37,level);
			attack+=6;
			this.level++;
		}else if(randdom <= 60 && level < 11) {
			System.out.printf("60%c�� [%d] ��ȭ����\n",37,level);
			attack+=8;
			this.level++;
		}else if(randdom <= 40 && level < 13) {
			System.out.printf("40%c�� [%d] ��ȭ����\n",37,level);
			attack+=8;
			this.level++;
		}else if(randdom <= 10 && level < 16) {
			System.out.printf("10%c�� [%d] ��ȭ����\n",37,level);
			attack+=8;
			this.level++;
		}else {							//���� �ƴϸ� ����(���н� ��ȭ ����)
			System.out.printf("%d%c�� ��ȭ����! [%d] ����..\n", randdom,37, this.level--);
			if(level == 0) {
				level++;
			}
		}
	}
}
