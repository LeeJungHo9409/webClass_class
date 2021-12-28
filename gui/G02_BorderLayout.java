package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class G02_BorderLayout {
	
	/*
	 	컨테이너에는 레이아웃을 설정할 수 있다.
	 	# BorderLayout
	 	  - 동서남북과 가운데롤 이루어진 레이아웃
	 	  - 컴포넌트를 추가할 때 위치를 함께 지정해야 한다.
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
		
		f.setBounds(100,100,1300,1000); //위치랑 크기를 한번에 지정하는 메소드
		//f.setSize(1300, 1000);
		//f.setLocation(100, 100);
		f.getContentPane().setBackground(Color.black);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
