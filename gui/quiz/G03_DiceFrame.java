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
		NumberDice numDice = new NumberDice();
		
		//���̽� �� ��ȭ�� ���� ��ư
		DiceButton btn1 = new DiceButton(labs, resultLab, numDice);
		DiceButton btn2 = new DiceButton(labs, resultLab, numDice);
		btn2.setLocation(250, 300);
		add(btn1);
		add(btn2);
		add(resultLab);
		add(numDice);
		
		//setResizable(false) : ������ ũ�� ����
		
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

// ���̽� �ѹ� ���� ����
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

// ���̽� �� ������ ���� ��
class ResultLab extends JLabel{
	
	//�ʱ�ȭ�� ����
	public ResultLab(int result) {
		setText(""+result);
		setBounds(0,0,60,60);
		
		setHorizontalAlignment(JLabel.CENTER);
		
		//���� ���� �༭ ȭ�� ������ ���� - lowered �� ������ ���� ������
		setBorder(new BevelBorder(BevelBorder.LOWERED));
	}
	
	// ��ư ������ ��ȭ�� �־���ϱ⿡
	public void setResultLab(int result) {
		setText(""+result);
	}
	
}

class Dice extends JLabel {
	
	int point;
	int random;
	int x_loca = 100, y_loca = 100;
	
	//�ʱ� ȭ�� ���̽� ����
	public Dice() {
		
		setBounds(x_loca, y_loca, 50, 50);
		setText(""+1);
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
	
	// ����
	public DiceButton(ArrayList<Dice> labs, ResultLab resultLab, NumberDice numDice) {
		
		setText("DICE GHANGE");
		setBounds(100,300,150,50);
		
		// # Control - ��Ʈ��(����)�ҽ��� ��(ȭ��)�ҽ��� �з��� �� �ؾߵȴ�.
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				int number;		
				int[] arr = {0,0,0,0,0,0};
				for(int i =0; i<labs.size(); i++) {
					//Ŭ���� �ֻ��� number ����
					number = (int)((Math.random()*6)+1);
					arr[number-1]++;
					numDice.setTotalNumber(arr);
					labs.get(i).setPointDice(number);
					
					//Ŭ���� ��ġ ���� 1
					labs.get(i).loca();
					
					//���� ��ġ ���� ��Ű�� ��ġ ���� 2
					for(int j = 0; j<i; j++) {
						if((labs.get(i).getXloca() <= (labs.get(j).getXloca()+50) && 
								(labs.get(i).getXloca() >= (labs.get(j).getXloca()-50))) 
								&& ((labs.get(i).getYloca() <= (labs.get(j).getYloca()+50) && 
										(labs.get(i).getYloca() >= (labs.get(j).getYloca()-50))))) {
							labs.get(i).loca();
							j=-1;
						}
					}
					
					//��ġ Ȯ���Ǹ� ȭ�鿡 ���(�� �̵�)
					labs.get(i).setLocation(labs.get(i).getXloca(), labs.get(i).getYloca());
					
					//����� �ֻ��� ���� �ؽ�Ʈ�� ǥ��
					labs.get(i).setText(""+ labs.get(i).point);
					
					numDice.getString();
					
					//�ֻ��� �� ����
					result+=labs.get(i).point;
				}
				
				//����� �󺧿� ������� ����� ���� 
				resultLab.setResultLab(result);
			}
		});	
	}
}
















