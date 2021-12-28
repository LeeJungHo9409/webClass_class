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
		
		//다이스 값 변화를 위한 버튼
		DiceButton btn = new DiceButton(labs, resultLab);
		add(btn);
		add(resultLab);
		
		
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

// 다이스 값 총합을 위한 라벨
class ResultLab extends JLabel{
	
	//초기화면 설정
	public ResultLab(int result) {
		setText(""+result);
		setSize(60,60);
		setLocation(0,0);
		setHorizontalAlignment(JLabel.CENTER);
		
		//보더 값을 줘서 화면 테투리 생성 - lowered 는 안으로 들어가게 보여줌
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
	// 버튼 누르면 변화를 주어야하기에
	void setResultLab(int result) {
		setText(""+result);
	}
	
}

class Dice extends JLabel {
	
	int point;
	int random;
	int x_loca = 100, y_loca = 100;
	
	//초기 화면 다이스 설정
	public Dice() {
		
		setText(""+1);
		setSize(50,50);
		setLocation(x_loca, y_loca);
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
	
	public DiceButton(ArrayList<Dice> labs, ResultLab resultLab) {
		setText("DICE GHANGE");
		setSize(300, 100);
		
		setLocation(100,300);
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				System.out.println();
				for(int i =0; i<labs.size(); i++) {
					//클릭시 주사위 number 변경
					labs.get(i).setPointDice((int)((Math.random()*6)+1));
					labs.get(i).loca();
					//labs.get(i).setLocation(labs.get(i).getXloca(), labs.get(i).getYloca());
					System.out.print("[ " + labs.get(i).point + "_" + labs.get(i).x_loca + " / " + labs.get(i).y_loca+"\n");
					//클릭시 주사위 위치 변경
					for(int j = 0; j<i; j++) {
						if((labs.get(i).getXloca() <= (labs.get(j).getXloca()+50) && 
								(labs.get(i).getXloca() >= (labs.get(j).getXloca()-50))) 
								&& (labs.get(i).getYloca() <= (labs.get(j).getYloca()+50) && 
										(labs.get(i).getYloca() >= (labs.get(j).getYloca()-50)))) {
							System.out.println("1");
							labs.get(j).loca();
							j=0;
						}
					}
					
					labs.get(i).setLocation(labs.get(i).getXloca(), labs.get(i).getYloca());
					System.out.print("[ " + labs.get(i).point + "_" + labs.get(i).x_loca + " / " + labs.get(i).y_loca);
					System.out.print("]\n");
					
					//변경된 주사위 값을 텍스트로 표시
					labs.get(i).setText(""+ labs.get(i).point);
					
					//주사위 값 누적
					result+=labs.get(i).point;
				}
				
				//결과값 라벨에 출력위해 결과값 보냄 
				resultLab.setResultLab(result);
			}
		});
	}
}
















