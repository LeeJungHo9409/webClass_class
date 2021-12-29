package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

import gui.G04_Event_all.action.Btn_Action;

public class G04_Event {
	public static void main(String[] args) {
		JFrame f = new JFrame("Event!");
		
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JLabel status = new JLabel("...ABCDEFG");
		
		status.setFont(new Font("consolas|돋움", Font.BOLD,25));
		
		//Btn_Action ba = new Btn_Action(btn1, btn2, status);
		
		btn1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println("키 눌림! : " + e.getKeyCode());
			}
		});
		
		btn1.addMouseWheelListener(new MouseWheelListener() {
			int count;
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("휠 굴리는중");
				status.setText(Integer.toString(count+=e.getWheelRotation() * -1));
				
			}
		});
		
		btn2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				status.setText("다가간다...");
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				
				status.setText("마우스를 클릭했습니다.");
			}
		});
		
		
		f.add(btn1, BorderLayout.WEST);
		f.add(btn2, BorderLayout.CENTER);
		f.add(status, BorderLayout.SOUTH);
		
		f.setBounds(1000,100,500,500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
