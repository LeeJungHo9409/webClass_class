package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G02_BorderLayout {
	
	/*
	 	�����̳ʿ��� ���̾ƿ��� ������ �� �ִ�.
	 	# BorderLayout
	 	  - �������ϰ� ����� �̷���� ���̾ƿ�
	 	  - ������Ʈ�� �߰��� �� ��ġ�� �Բ� �����ؾ� �Ѵ�.
	 */
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Border Layout!");
		f.setLayout(new BorderLayout(30,30));
		
		BorderLayout layout = (BorderLayout) f.getLayout();
		
		//f.add(new JButton("1"), BorderLayout.CENTER);
		f.add(new JButton("2") {
			{
				setBackground(Color.cyan);
			}
		}, BorderLayout.EAST);
		f.add(new JButton("3"), BorderLayout.SOUTH);
		f.add(new JButton("4"), BorderLayout.WEST);
		f.add(new JButton("5"), BorderLayout.NORTH);
		
		f.setBounds(100,100,1300,1000); //��ġ�� ũ�⸦ �ѹ��� �����ϴ� �޼ҵ�
		//f.setSize(1300, 1000);
		//f.setLocation(100, 100);
		f.getContentPane().setBackground(Color.black);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
