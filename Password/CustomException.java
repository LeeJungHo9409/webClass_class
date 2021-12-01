package Password;

import java.util.InputMismatchException;

public class CustomException extends Exception{}

class NotPasswordString extends Exception{
	public NotPasswordString() {
		super("문자가 섞여 있지 않습니다.");
	}
}

class NotPasswordSpecial extends Exception{
	public NotPasswordSpecial() {
		super("특수문자 제한 범위를 벗어났습니다."
				+ "\n[ ! , @ , # , $ , % , ^ , & ]");
	}
}

class NotPasswordRange extends Exception{
	public NotPasswordRange() {
		super("비밀번호는 최소 8자이상 24자 이하를 충족시켜주셔야 합니다.");
	}
}

class NotPasswordNumber extends Exception{
	public NotPasswordNumber() {
		super("숫자가 없거나 모두 숫자인 경우입니다.");
	}
}