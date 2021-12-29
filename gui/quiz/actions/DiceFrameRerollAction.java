package gui.quiz.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class DiceFrameRerollAction implements ActionListener{

	JButton chang, btn2;
	JLabel resultTotal, resultNum;
	ArrayList<Dice> labs = new ArrayList<>();
	
	public DiceFrameRerollAction(
			JButton chang,
			JButton btn2,
			JLabel resultTotal,
			JLabel resultNum,
			ArrayList<Dice> labs
			) {
		
		this.chang = chang;
		this.btn2 = btn2;
		this.resultTotal = resultTotal;
		this.resultNum = resultNum;
		this.labs = labs;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int result = 0;
		int number;		
		int[] arr = {0,0,0,0,0,0};
		for(int i =0; i<labs.size(); i++) {
			//클릭시 주사위 number 변경
			number = (int)((Math.random()*6)+1);
			arr[number-1]++;
			setTotalNumber(arr);
			labs.get(i).setPointDice(number);
			
			//클릭시 위치 변경 1
			labs.get(i).loca();
			
			//같은 위치 제외 시키고 위치 변경 2
			for(int j = 0; j<i; j++) {
				if((labs.get(i).getXloca() <= (labs.get(j).getXloca()+50) && 
						(labs.get(i).getXloca() >= (labs.get(j).getXloca()-50))) 
						&& ((labs.get(i).getYloca() <= (labs.get(j).getYloca()+50) && 
								(labs.get(i).getYloca() >= (labs.get(j).getYloca()-50))))) {
					labs.get(i).loca();
					j=-1;
				}
			}
			
			//위치 확정되면 화면에 출력(애 이동)
			labs.get(i).setLocation(labs.get(i).getXloca(), labs.get(i).getYloca());
			
			//변경된 주사위 값을 텍스트로 표시
			labs.get(i).setText(""+ labs.get(i).point);
			
			//resultNum.getString();
			
			//주사위 값 누적
			result+=labs.get(i).point;
		}
		
		//결과값 라벨에 출력위해 결과값 보냄 
		//resultTotal.setResultLab(result);
	}
	
	String str = "";
	public void setTotalNumber(int[] arr) {
		str = "";
		for(int i = 0; i<=5; i++) {
			if(i == 5) {
				str+=arr[i];
			}else {
				str+=arr[i] + " / ";
			}
		}
	}
	
	// 버튼 누르면 변화를 주어야하기에
	public void setResultLab(int result) {	
		str += result;
	}
	
	public String getStr() {
		return str;
	}
	
}
