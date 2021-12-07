
public class D04_WrapperClass {
	/*
		# Wrapper Class
		
		  - �⺻ Ÿ�Ե��� ������ Ÿ������ ���γ��� Ŭ������
		  - �� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�.
		  
		# �⺻�� Ÿ�Ե�
		  
		  - byte, short, char, int, long, float, double, boolean
		  
		# �� �⺻�� Ÿ�Կ� ���� ������ �̸��� (int, char Ÿ�� �����ϰ� �� �ձ��� �빮��)
		
		  - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	
	public static void main(String[] args) {
		/*
			# Parsing
			
			  - ���ڿ��� �ش� Ÿ���� ������ ��ȯ�ϴ� ��
			  - �� Wrapper Ŭ������ static �޼ҵ�� �����Ѵ�.  
		 */
		
		//��Ʈ�� -> ��Ƽ�� Ÿ������
		int integerNum = Integer.parseInt("123456");
		System.out.println(integerNum);
		
		//��Ʈ�� -> ���� Ÿ������ �ҹ��ڵ� �빮�ڵ� ������� ("true" �� �׿ܴ� false�� �ڵ� �Է�)
		Boolean booleanResult = Boolean.parseBoolean("True");
		System.out.println(booleanResult);
		
		/*
			# toString
			  
			  - �� Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� ���
			  - ���ϴ� ����(radix)�� ������ ���� �ִ�.
		 */
		
		String hex = Double.toHexString(56782156.121254);
		System.out.println(hex);
		//�������� �ٲٱ�
		System.out.println(Integer.toString(52345));
		System.out.println(Integer.toString(52345, 2));
		System.out.println(Integer.toString(52345, 8));
		System.out.println(Integer.toString(52345, 16));
		
		//�� Ÿ�Ե��� �ִ�/�ּҰ��� ������ �ִ� ����� ----- ���� ������� ��밡��
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		//RADIX�� �����̴�. �� 36 ������ ���� ũ�� ǥ���� �� �ִ�
		System.out.println(Character.MAX_RADIX);
		
		//Character���� ���ڿ� ���ϰ� �ٷ� �� �ִ� static �޼������ ����.
		//���� new Character() �̷л� ��밡�������� �ڹٿ��� ��ü������ ���Ƶξ��⿡ ����� ���� �������̴�.
		System.out.println("�̰� ���ĺ�? " + Character.isAlphabetic('3'));
		System.out.println("�̰� ���ĺ�? " + Character.isAlphabetic('Y'));
		
		System.out.println("�̰� 10����? " + Character.isDigit('3'));
		System.out.println("�̰� 10����? " + Character.isDigit('A'));
		
		//character.isSpace �ֵ� �ִµ� �Ʒ��� ������.
		System.out.println("�̰� �����? " + Character.isSpaceChar('\t'));
		//�ƽ�Ű�ڵ�
		System.out.println(Character.SPACE_SEPARATOR);
		System.out.println(Character.LINE_SEPARATOR);
		System.out.println(Character.PARAGRAPH_SEPARATOR);
		
		System.out.println("�̰� �ҹ���? " + Character.isLowerCase('D'));
		System.out.println("�̰� �ҹ���? " + Character.isLowerCase('d'));
		System.out.println("�̰� �빮��? " + Character.isUpperCase('D'));
		System.out.println("�̰� �빮��? " + Character.isUpperCase('d'));
		
		System.out.println("�� ������ Ÿ��? " +Character.getType('K'));
	} 
}





















