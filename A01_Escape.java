
/*
	  # Eclipse ������ ����Ű
		- Ctrl + F11 : ����
		- Ctrl + [+, -] : �۾� ũ�� ����
		- Ctrl + M : �ش� â �ִ�/�ּ�ȭ 
		- Ctrl + X : �߶󳻱�
		- Ctrl + C : ����
		- Ctrl + V : �ٿ��ֱ�
		- Ctrl + w : �ڵ�â �ݱ�
		- Ctrl + Shift + w : ��� �ڵ�â �ݱ�
		- Alt + ����Ű : �� �ٲٱ�
		
	  # ������� ����
	  	- Shift + ����Ű : ����Ű ��� ����
	  	- Home : Ŀ���� �ش� ���� �� ������ �̵�
		- End : Ŀ���� �ش� ���� �� �ڷ� �̵�
		
	  # �鿩���� ����
	  	- Tab : �鿩����
	  	- Shift + Tab : �Ųٷ� �鿩����
	  	- Ctrl + Shift + F : �ش� ������ ��� Java �ڵ带 �ڵ����� �鿩����
	
	  # Windows ����  	
	  	- [Win] + d : ����ȭ�� �ٷ� ����
	  	- [Win] + e : Ž����
	  	- [Win] + ����Ű : â ũ�� ���� �ϱ�
	  	- [Win] + [Shift] + s : ĸ��
*/

public class A01_Escape {
	/*
	 # Escape ����
	   - Ư���� ����� ���� ���ڵ��� ǥ���ϱ� ���� ����
	   - �׳� ����Ϸ��� �ϸ� ���� ������ �߻��ϴ� ���ڵ��� �����ϰ� ����� �� �ִ�.
	   - �տ� \(��������)�� ���� ���ڴ� �����Ϸ��� �̽������� ���ڷ� �����Ѵ�.
	   - �տ� ���� �������ÿ� ���� �� ���ڸ� ���� �ϳ��� ���ڷ� �ν��Ѵ�.
	 */
	public static void main(String[] args){
		
		System.out.println("\\\\�ڵ尪 : "+(int)'\\'+'\n');
//		\\ : Escape Sequence ����� ������� �ʰ� �ݼ�â�� ����� ���� ���
		
		System.out.println("???");
		System.out.println("??\n?");
		System.out.println("\\n�ڵ尪 : " + (int)'\n');
//		\n : �ٹٲ��� �ش��ϴ� �̽������� ���� (linefeed, breakline, newline)
		
		System.out.println("\n����\t��!\t\n\\t�ڵ尪 : "+(int)'\t');
//		\t : �Ǳ��
		
		System.out.println("\n\" �ڵ尪 \"");
		System.out.println("\\\" �ڵ尪 : " + (int)'\"');
//		\" : �׳� "�� ����ϱ� ���� �̽������� ����
		
		System.out.println("\n\'��'");
		System.out.println("\\\' �ڵ尪 : " + (int)'\'');
//		\' : �׳� '�� ����ϱ� ���� �̽������� ����
	}
}





























