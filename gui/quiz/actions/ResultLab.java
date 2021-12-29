package gui.quiz.actions;

import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

//다이스 값 총합을 위한 라벨
public class ResultLab extends JLabel{
	
	String str = "";
	
	//초기화면 설정
	public ResultLab(int result) {
		setText(""+result);
		setBounds(0,0,60,60);
		
		setHorizontalAlignment(JLabel.CENTER);
		
		//보더 값을 줘서 화면 테투리 생성 - lowered 는 안으로 들어가게 보여줌
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
}

