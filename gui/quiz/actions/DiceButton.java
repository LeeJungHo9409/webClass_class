package gui.quiz.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class DiceButton extends JButton{
	
	// # Control - 컨트롤(동작)소스와 뷰(화면)소스는 분류를 꼭 해야된다.
	
	// 뷰기능
	public DiceButton() {
		setText("DICE GHANGE");
		setBounds(100,300,150,50);
	}
}
