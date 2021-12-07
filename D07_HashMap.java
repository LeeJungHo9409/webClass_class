import java.util.HashMap;
//��¼�� inner Ŭ����...?
import java.util.Map.Entry;
import java.util.Set;

/*
	# Map
	  - �����͸� Key-Value �� ������ �����ϴ� ����� �ڷ� ����
	  - �ε��� ��� Key ���� ���� Value�� ������ �� �ֵ�.
	  - Key�� �ߺ��� ������� �ʴ´�.
 */

public class D07_HashMap {
	public static void main(String[] args) {
		//ù ��° ���׸��� key�� Ÿ���̰� �� ��° ���׸��� Value�� Ÿ���̴�.
		HashMap<String, String> dest = new HashMap<>();
		HashMap<String, Object> humanData = new HashMap<>();
		
		humanData.put("�̸�", "�浿��");
		humanData.put("����", 123);
		
		//put(k,v) : �ش� Ű�� ���� �����Ѵ�.
		dest.put("�п�", "������ ��â��");
		dest.put("��", "�����ֽ� �ٻ굿");
		dest.put("ȸ��", "������ �Ｚ��");
		
		//get(key) : Ű���� ���� ���� ������.
		System.out.println(dest.get("��"));
		System.out.println(dest.get("�п�"));
		
		// putIfAbsent(key, value) : �ش� Ű���� ��������� ���� �ִ´�. ������� ������ ���� ������.
		// ��� ������ ä��� null �����Ѵ�.
		System.out.println(dest.putIfAbsent("�Ĵ�", "�����ֽ� ���ݵ�"));
		// ��� ���� ���� ���� ���� ���� ������.
		System.out.println(dest.putIfAbsent("�Ĵ�", "�����ֽ� ���"));
		System.out.println(dest.putIfAbsent("�Ĵ�", "�����ֽ� ���"));
		
		// put �޼���� �̹� �����ϴ� ���� ���� �� �� �ִ�.
		dest.put("ȸ��", "�Ǳ�");
		System.out.println(dest.get("ȸ��"));
		
		/*
			# �ݺ������� MapŸ�� Ȱ���ϱ�
			
			  - keySet() : �ش� ���� �����ϴ� ��� Ű���� Set Ÿ������ ��ȯ�Ѵ�. (�ߺ������� set���� ������ �������)
			  - values() : �ش� ���� ��� ����� �̷���� Collection�� ��ȯ�Ѵ�. (������ �ִ� �ߺ��� ���� ���� �ֱ⿡ Collection���� ��ȯ�Ѵ�.)
			  - entrySet() : Entry<key, value>�� �̷���� set�� ��ȯ�Ѵ�.
		 */
		
		//Ű�� �������⿡
		for(String key : dest.keySet()) {
			System.out.println(dest.get(key));
		}
		
		for(String value : dest.values()) {
			System.out.println(dest.get(value));
		}
		
		//inner class �� Ư¡�� ���� ������ �ʿ䰡 ���°� ������ �а� ����. 
		for(Entry<String, String> entry : dest.entrySet()) {
			System.out.printf("Ű [%s], �� : [%s]\n", entry.getKey(), entry.getValue());
		}
	}
}
