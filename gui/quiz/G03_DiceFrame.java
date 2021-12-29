package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class G03_DiceFrame extends JFrame{
	
	/*
	 	주사위 던지기 버튼을 누르면 주사위 다섯개가 모두 랜덤으로 변하는 gui 프로그램을 만들어보세요
	 	
	 	버튼을 누를때마다 각 숫자가 몇개 나왔는지도 출력해주세요.
	 */
	
	public G03_DiceFrame() {
		
		//5개 다이스를 위한 저장
		ArrayList<Dice> labs = new ArrayList<>(); 
		for(int i = 0; i<5; i++) {
			labs.add(new Dice());
			add(labs.get(i));
		}
		
		//다이스 값 출력 라벨
		ResultLab resultLab = new ResultLab(0);
		NumberDice numDice = new NumberDice();
		
		//다이스 값 변화를 위한 버튼
		DiceButton btn1 = new DiceButton(labs, resultLab, numDice);
		DiceButton btn2 = new DiceButton(labs, resultLab, numDice);
		btn2.setLocation(250, 300);
		add(btn1);
		add(btn2);
		add(resultLab);
		add(numDice);
		
		//setResizable(false) : 프레임 크기 고정
		
		//JFrame 화면 설정
		setLayout(null);
		setTitle("Dice!");
		setSize(500, 500);
		
		//화면 가운데로 출력
		setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new G03_DiceFrame();
	}
	
}

// 다이스 넘버 숫자 개수
class NumberDice extends JLabel{
	String str = "";
	
	public NumberDice() {
		setText("0 / 0 / 0 / 0 / 0 / 0 ");
		setBounds(140,400,200,60);
		setHorizontalAlignment(JLabel.CENTER);
	}
	
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
	
	public void getString() {
		setText(str); 
	}
}

// 다이스 값 총합을 위한 라벨
class ResultLab extends JLabel{
	
	//초기화면 설정
	public ResultLab(int result) {
		setText(""+result);
		setBounds(0,0,60,60);
		
		setHorizontalAlignment(JLabel.CENTER);
		
		//보더 값을 줘서 화면 테투리 생성 - lowered 는 안으로 들어가게 보여줌
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
	// 버튼 누르면 변화를 주어야하기에
	public void setResultLab(int result) {
		setText(""+result);
	}
	
}

class Dice extends JLabel {
	
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
	
	//버튼 클릭시 각각의 다이스의 값들을 저장
	public void setPointDice(int point) {
		this.point = point;
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
}

class DiceButton extends JButton{
	
	// 뷰기능
	public DiceButton(ArrayList<Dice> labs, ResultLab resultLab, NumberDice numDice) {
		
		setText("DICE GHANGE");
		setBounds(100,300,150,50);
		
		// # Control - 컨트롤(동작)소스와 뷰(화면)소스는 분류를 꼭 해야된다.
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				int number;		
				int[] arr = {0,0,0,0,0,0};
				for(int i =0; i<labs.size(); i++) {
					//클릭시 주사위 number 변경
					number = (int)((Math.random()*6)+1);
					arr[number-1]++;
					numDice.setTotalNumber(arr);
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
					
					numDice.getString();
					
					//주사위 값 누적
					result+=labs.get(i).point;
				}
				
				//결과값 라벨에 출력위해 결과값 보냄 
				resultLab.setResultLab(result);
			}
		});	
	}
}
















