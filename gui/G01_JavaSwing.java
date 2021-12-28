package gui;

import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G01_JavaSwing {
	/*
	 	# Java Swing
	 	  - javax.swing 패키지의 클래스들
	 	  - 해당 운영체제의 GUI 프로그램을 만들 수 있다.
	 	  
	 	# Container
	 	  - 여러 컴포넌트를 배치할 수 있는 판
	 	  - JFrame, JPanel, JDialog 등
	 	  - 컨테이너에는 레이아웃을 설정 할 수 있다.
	 	
	 	# Component
	 	  - 컨테이너 위에 배치할 수 있는 부품
	 	  - 버튼 표 슬라이더 메뉴 등
	 	  
	 */
	
	public static void main(String[] args) {
		
		// Container
		JFrame frame = new JFrame("Hello, GUI");
		
		// 프레임을 만들고 프레임 위에 컴퍼넌트를 부팅면서 GUI 프로그램을 만들 수 있다.		
		JButton btn1 = new JButton("Button One");
		btn1.setLocation(50,50);
		btn1.setSize(100,50);
		//JLabel lab1 = new JLabel("hello");
		frame.add(btn1);
		
		// 레이아웃 설정 (null로 설정하면 레이아웃 해제)
		frame.setLayout(null);
		// 해당 프레임을 보이는 상태로 설정한다. (설정하면서 화면에 그린다.)
		frame.setVisible(true);
		// 프레임 크기 설정
		frame.setSize(1300, 1000);
		// X버튼 눌렀을 때의 동작을 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
