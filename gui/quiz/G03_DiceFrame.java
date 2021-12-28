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
	 	�ֻ��� ������ ��ư�� ������ �ֻ��� �ټ����� ��� �������� ���ϴ� gui ���α׷��� ��������
	 	
	 	��ư�� ���������� �� ���ڰ� � ���Դ����� ������ּ���.
	 */
	
	public G03_DiceFrame() {
		
		//5�� ���̽��� ���� ����
		ArrayList<Dice> labs = new ArrayList<>(); 
		for(int i = 0; i<5; i++) {
			labs.add(new Dice());
			add(labs.get(i));
		}
		
		//���̽� �� ��� ��
		ResultLab resultLab = new ResultLab(0);
		
		//���̽� �� ��ȭ�� ���� ��ư
		DiceButton btn = new DiceButton(labs, resultLab);
		add(btn);
		add(resultLab);
		
		
		//JFrame ȭ�� ����
		setLayout(null);
		setTitle("Dice!");
		setSize(500, 500);
		
		//ȭ�� ����� ���
		setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new G03_DiceFrame();
	}
	
}

// ���̽� �� ������ ���� ��
class ResultLab extends JLabel{
	
	//�ʱ�ȭ�� ����
	public ResultLab(int result) {
		setText(""+result);
		setSize(60,60);
		setLocation(0,0);
		setHorizontalAlignment(JLabel.CENTER);
		
		//���� ���� �༭ ȭ�� ������ ���� - lowered �� ������ ���� ������
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
	// ��ư ������ ��ȭ�� �־���ϱ⿡
	void setResultLab(int result) {
		setText(""+result);
	}
	
}

class Dice extends JLabel {
	
	int point;
	int random;
	int x_loca = 100, y_loca = 100;
	
	//�ʱ� ȭ�� ���̽� ����
	public Dice() {
		
		setText(""+1);
		setSize(50,50);
		setLocation(x_loca, y_loca);
		setHorizontalAlignment(JLabel.CENTER);
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
	//��ư Ŭ���� ������ ���̽��� ������ ����
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
					//Ŭ���� �ֻ��� number ����
					labs.get(i).setPointDice((int)((Math.random()*6)+1));
					labs.get(i).loca();
					//labs.get(i).setLocation(labs.get(i).getXloca(), labs.get(i).getYloca());
					System.out.print("[ " + labs.get(i).point + "_" + labs.get(i).x_loca + " / " + labs.get(i).y_loca+"\n");
					//Ŭ���� �ֻ��� ��ġ ����
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
					
					//����� �ֻ��� ���� �ؽ�Ʈ�� ǥ��
					labs.get(i).setText(""+ labs.get(i).point);
					
					//�ֻ��� �� ����
					result+=labs.get(i).point;
				}
				
				//����� �󺧿� ������� ����� ���� 
				resultLab.setResultLab(result);
			}
		});
	}
}
















