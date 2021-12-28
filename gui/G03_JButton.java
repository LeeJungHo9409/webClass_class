package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G03_JButton extends JFrame{
	
	public G03_JButton() {
		super("JButton Test");
		

		JButton btn1 = new JButton();
		
		// �ؽ�Ʈ ����		
		btn1.setText("Button");
		// ��� ����
		btn1.setBackground(new Color(0xf2edc4));
		// �۲� ����
		btn1.setFont(new Font("Forte",Font.BOLD,30));
		// �׼� ������ ���� (�̺�Ʈ ����)
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btn1.setText(""+Math.random());
			}
		});
		
		add(btn1, BorderLayout.CENTER);
		
		setSize(300,300);
		getContentPane().setBackground(Color.white);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new G03_JButton();
	}
}
