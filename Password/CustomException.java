package Password;

import java.util.InputMismatchException;

public class CustomException extends Exception{}

class NotPasswordString extends Exception{
	public NotPasswordString() {
		super("���ڰ� ���� ���� �ʽ��ϴ�.");
	}
}

class NotPasswordSpecial extends Exception{
	public NotPasswordSpecial() {
		super("Ư������ ���� ������ ������ϴ�."
				+ "\n[ ! , @ , # , $ , % , ^ , & ]");
	}
}

class NotPasswordRange extends Exception{
	public NotPasswordRange() {
		super("��й�ȣ�� �ּ� 8���̻� 24�� ���ϸ� ���������ּž� �մϴ�.");
	}
}

class NotPasswordNumber extends Exception{
	public NotPasswordNumber() {
		super("���ڰ� ���ų� ��� ������ ����Դϴ�.");
	}
}