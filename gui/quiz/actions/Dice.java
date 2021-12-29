package gui.quiz.actions;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class Dice extends JLabel {
	
	int point;
	int random;
	int x_loca = 100, y_loca = 100;
	
	//초기 화면 다이스 설정
	public Dice() {
		setBounds(x_loca, y_loca, 50, 50);
		setText(""+1);
		setHorizontalAlignment(JLabel.CENTER);
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
	public void loca() {
		x_loca = (int)((Math.random()*300)+100);
		y_loca = (int)((Math.random()*200)+50);
	}
	
	public int getXloca() {
		return x_loca;
	}
	
	public int getYloca() {
		return y_loca;
	}
	
	//버튼 클릭시 각각의 다이스의 값들을 저장
	public void setPointDice(int point) {
		this.point = point;
	}
}
