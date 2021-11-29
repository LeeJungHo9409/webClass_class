import Program.HaelthCare;
import Program.Pokemon;
import Program.Program;

/*

	# ��ü�� ������
	 - ��ü�� �پ��� ���¸� ���� �� �ִ�.
	 - ������ �����̱⵵ �ϰ� ����̱⵵ �ϴ�.
	 - ����� ��������� ������ �ƴ� ���� �ִ�.
	 
 */

public class C06_Polymorphism {
	
	public static void main(String[] args) {
		
		Program p1 = new Program();
		HaelthCare care = new HaelthCare();
		Program p2 = new HaelthCare();
		
		//�ڽ� Ÿ���� �θ� Ÿ���� �� �� �ִ�.(��ĳ����)
		//��ĳ������ �Ǿ��� ���� �ڽ� Ŭ�������� ������ �ִ� ����� ��� �ؾ������.
		
		//��ĳ���� �� �ν��Ͻ��� �ڽ� Ŭ�������� �������̵��� �θ� Ŭ������ �޼��带 ����ϴ� ���
		//�������̵� �� ������ ����
		
		//�ش� �ν��Ͻ��� � Ŭ������ �ν��Ͻ����� �˻��� �� �ִ�.
		System.out.println(p1 instanceof HaelthCare);
		System.out.println(care instanceof HaelthCare);
		System.out.println(p2 instanceof HaelthCare);
		
		Program[] programs = {
				new Program(), new HaelthCare(), new Program(), new HaelthCare(), new Program(), new HaelthCare()
		};
		
		
		//�پ缺
		for(int i = 0; i<programs.length; i++) {
			if(programs[i] instanceof HaelthCare) {
				// ��ĳ���� �� �ν��Ͻ��� ���� ����� ����ϱ� ���ؼ��� �ٿ� ĳ���� �ؾ��Ѵ�.
				((HaelthCare)programs[i]).walk();
			}
		}
		
		execute(new Program());
		execute(new HaelthCare());
		execute(new Pokemon());
	}
	
	public static void execute(Program p) {
		p.create();
	}

}
