package gui.quiz.actions;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

//���̽� �� ������ ���� ��
public class ResultLab extends JLabel{
	
	String str = "";
	
	//�ʱ�ȭ�� ����
	public ResultLab(int result) {
		setText(""+result);
		setBounds(0,0,60,60);
		
		setHorizontalAlignment(JLabel.CENTER);
		
		//���� ���� �༭ ȭ�� ������ ���� - lowered �� ������ ���� ������
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
}

