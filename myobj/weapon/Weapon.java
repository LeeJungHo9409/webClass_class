package myobj.weapon;

//이 클래스를 상속받은 무기를 3가지 이상 만들어 보세요.
//각 무기는 강화 확률 및 공격력이 달라야 합니다.
//각 클래스에 대한 테스트는 quiz.C11_UseWeapon 클래스를 실행하면 진행됩니다.

abstract public class Weapon {
	
	protected String name;
	protected int attack;
	protected int level;
	
	//final을 붙인 메서드는 오버라이드가 불가능해진다.
	final public void attack() {
		System.out.printf("'%s'로 허수아비를 공격해\n", name);
		System.out.printf("'%d'의 데미지를 입혔습니다.\n", attack);
	}
	
	abstract public void upgrade();
	
}
