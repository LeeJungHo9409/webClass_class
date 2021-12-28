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
		
		// 텍스트 설정		
		btn1.setText("Button");
		// 배경 설정
		btn1.setBackground(new Color(0xf2edc4));
		// 글꼴 설정
		btn1.setFont(new Font("Forte",Font.BOLD,30));
		// 액션 리스너 설정 (이벤트 설정)
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
