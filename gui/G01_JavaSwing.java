package gui;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G01_JavaSwing {
	/*
	 	# Java Swing
	 	  - javax.swing ��Ű���� Ŭ������
	 	  - �ش� �ü���� GUI ���α׷��� ���� �� �ִ�.
	 	  
	 	# Container
	 	  - ���� ������Ʈ�� ��ġ�� �� �ִ� ��
	 	  - JFrame, JPanel, JDialog ��
	 	  - �����̳ʿ��� ���̾ƿ��� ���� �� �� �ִ�.
	 	
	 	# Component
	 	  - �����̳� ���� ��ġ�� �� �ִ� ��ǰ
	 	  - ��ư ǥ �����̴� �޴� ��
	 	  
	 */
	
	public static void main(String[] args) {
		
		// Container
		JFrame frame = new JFrame("Hello, GUI");
		
		// �������� ����� ������ ���� ���۳�Ʈ�� ���ø鼭 GUI ���α׷��� ���� �� �ִ�.		
		JButton btn1 = new JButton("Button One");
		btn1.setLocation(50,50);
		btn1.setSize(100,50);
		//JLabel lab1 = new JLabel("hello");
		frame.add(btn1);
		
		// ���̾ƿ� ���� (null�� �����ϸ� ���̾ƿ� ����)
		frame.setLayout(null);
		// �ش� �������� ���̴� ���·� �����Ѵ�. (�����ϸ鼭 ȭ�鿡 �׸���.)
		frame.setVisible(true);
		// ������ ũ�� ����
		frame.setSize(1300, 1000);
		// X��ư ������ ���� ������ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
