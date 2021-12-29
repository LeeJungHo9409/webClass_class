package gui.quiz.actions;

import javax.swing.JLabel;

public class NumberDice extends JLabel{
	// 다이스 넘버 숫자 개수

	
	public NumberDice() {
		setText("0 / 0 / 0 / 0 / 0 / 0 ");
		setBounds(140,400,200,60);
		setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void getString(String str) {
		setText(str); 
	}
	
	
}
