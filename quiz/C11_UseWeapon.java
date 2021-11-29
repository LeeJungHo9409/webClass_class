package quiz;

import java.util.Scanner;

import myobj.weapon.Weapon;

public class C11_UseWeapon {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
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
			System.out.println("검 강화하쉴?");
			System.out.println("1. 강화\t 2. 종료");
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
		//5번 공격할때마다 데미지 2배 상승
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
		//어택하면 할수록 강해짐.
		attack++;
		level++;
	}
}

class Sword extends Weapon{ 
	
	int percent;
	int index=0;
	
	public Sword() {
		// TODO 자동 생성된 생성자 스텁
		this.name = "sword";
		this.attack = 10;
		this.level = 1;
		upgrade();
	}
	
	public void upgrade() {
		int randdom = (int)(Math.random()*100);
		
		//확률 적용
		if(randdom <= 90 && level < 4) {
			System.out.printf("90%c로 [%d] 강화성공\n",37,level);
			attack+=4;
			this.level++;
		}else if(randdom <= 70 && level < 7) {
			System.out.printf("70%c로 [%d] 강화성공\n",37,level);
			attack+=6;
			this.level++;
		}else if(randdom <= 60 && level < 11) {
			System.out.printf("60%c로 [%d] 강화성공\n",37,level);
			attack+=8;
			this.level++;
		}else if(randdom <= 40 && level < 13) {
			System.out.printf("40%c로 [%d] 강화성공\n",37,level);
			attack+=8;
			this.level++;
		}else if(randdom <= 10 && level < 16) {
			System.out.printf("10%c로 [%d] 강화성공\n",37,level);
			attack+=8;
			this.level++;
		}else {							//성공 아니면 실패(실패시 강화 감소)
			System.out.printf("%d%c로 강화실패! [%d] 떡락..\n", randdom,37, this.level--);
			if(level == 0) {
				level++;
			}
		}
	}
}
