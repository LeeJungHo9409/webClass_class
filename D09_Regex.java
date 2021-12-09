import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
		# ����ǥ����(Regular Expression)
		  
		  - ���ڿ��� �������� �˻��� �� �ִ� ǥ����
		  - Ư�� ���α׷��� ���� �ִ� ���� �ƴ� ������ ��Ģ
		  - ������ ���ڿ� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�.
		  
		# �ڹٿ��� ����ǥ������ �ٷ� �� ����ϴ� Ŭ����
		
		  - Pattern
		  - Matcher
	 */
	
	public static void main(String[] args) {
		
		//����ǥ���� : �˻��� ���� Pattern.matches(regex, input) : 
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// []: �ش� ��ġ�� �� ���ڿ� � ���ڵ��� �� �� �ִ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lh]eep", "sleep"));
		System.out.println(Pattern.matches("s[lh]eep", "sheep"));
		System.out.println(Pattern.matches("s[lh]ee[pk]", "sheek"));
		System.out.println(Pattern.matches("s[lh]ee[ABCDEFG]", "sheeG"));
		System.out.println(Pattern.matches("s[lh]ee[a-zA-Z]", "sheeD"));
		System.out.println(Pattern.matches("s[lh]ee[\\-]", "shee-"));
		
		/*
		 	����ǥ���Ŀ��� ������� ����. ��, �ܾ�鸸 ����.
			[abc] : a �Ǵ� b �Ǵ� c�� ��� ���
			[a-z] : �ҹ��� ��� ���
			[A-D] : �빮�� ��� ���
			[\\\\]: �������ø� �����ϸ� escape ��Ȱ�� �ϰ� �ȴ�.
			[a-e&&c-z] : a-e�� c-z�� ��� ������Ű�� ���ڸ� ��� (������)
			
			# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
			  .		: ��� ����
			  [\\d]	: ��� ����
			  [\\D]	: ���ڸ� ������ ��� ��
			  \s	: ��� ����
			  \S	: ������ ������ ��� �͵�
			  \w	: �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
			  \W	: \w�� ������ ��� �� 
			  
			# �ش� ������ ����� ������ ������ �����ϴ� ���
			  .{n} 	: {}���� ������ n�� ��ġ�ؾ� �Ѵ�.
			  .{n,m}: {}���� ������ �ּ� n�� �ִ� m�� ��ġ�ؾ� �Ѵ�.
			  .{n,}	: {}���� ������ �ּ� n�� �̻� ��ġ�ؾ��Ѵ�.
			  .? 	: ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�.
			  .+	: + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�.
			  .*	: * ���� ������ 0�� �̻� ���;� �Ѵ�.
			  
		 */
		System.out.println(Pattern.matches("[a-d&&b-f]", "a"));
		System.out.println(Pattern.matches("...", "abc"));
		System.out.println(Pattern.matches("\\d..", "7bc"));
		System.out.println(Pattern.matches("[\\da]..", "abc"));
		System.out.println(Pattern.matches("\\d\\s..", "7 bc"));
		System.out.println(Pattern.matches("\\d\\s..", "7\nbc"));
		
		System.out.println(Pattern.matches(".{5}", "12345"));
		System.out.println(Pattern.matches("\\D{8}", "#$@%abcd"));
		System.out.println(Pattern.matches("\\D{2,4}", "#$@%abcd"));
		System.out.println(Pattern.matches("\\D{5,}", "#$@%abcd"));
		
		//������
		System.out.println(Pattern.matches("abc\\d", "abc"));
		System.out.println(Pattern.matches("abc\\d?", "abc"));
		
		//�ּ� �ѹ� �̴ϱ�.
		System.out.println(Pattern.matches("abc\\d+", "abc"));
		System.out.println(Pattern.matches("abc\\d+", "abc111"));
		
		//��� Ʈ��� �־ Ʈ���.
		System.out.println(Pattern.matches("abc\\d*", "bc"));
		System.out.println(Pattern.matches("abc\\d*", "abc111"));
		
		//�������� : �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ���ǥ������ ��������
		System.out.println(Pattern.matches("010\\-\\d{4}\\-\\d{4}", "010-1224-1234") ? "�ڵ��� ��ȣ �Դϴ�." : "�ڵ��� ��ȣ ������ Ʋ���ϴ�.");
		//�������� : �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ���ǥ������ ��������
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.?[a-zA-Z]+)*","dssdf123@na12r.co#") ? "�̸����Դϴ�." : "�̸����� �ƴմϴ�.");
		
		// Matcher Ŭ������ �� ���ڿ� �˻��ϱ�
		String fruits = "apple/banana/kiwi/mango/pineapple/redapple/greenapple/apple";
		
		// 1. ���ϴ� ����ǥ������ �������Ͽ� �ν��Ͻ��� ����
		Pattern pattern = Pattern.compile("apple");
		// 2. ������ �� ����ǥ�������� ���ϴ� ���ڿ��� �˻��ϱ� ���� Matcher �ν��Ͻ��� ��ȯ�ȴ�.
		Matcher matcher = pattern.matcher(fruits);
		
		// 3. matcher�� �̿��� �˻縦 �����Ѵ�.
		if(matcher.find()) {
			System.out.println("-----------------------------");
			System.out.println("ã����: " + matcher.group());
			System.out.println("ã������ ���� ��ġ : " + matcher.start());
			System.out.println("ã������ ������ ��ġ : " + matcher.end());
		}
		
		
	}

}
















