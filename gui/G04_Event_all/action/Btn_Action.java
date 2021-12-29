package gui.G04_Event_all.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class Btn_Action implements ActionListener{
	
	JButton btn1;
	JButton btn2;
	JLabel status;
	
	public Btn_Action(JButton btn1, JButton btn2, JLabel status) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.status = status;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		btn1.addMouseWheelListener(new MouseWheelListener() {
			int count;
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				System.out.println("휠 굴리는중");
				status.setText(Integer.toString(count+=e.getWheelRotation() * -1));
			}
		});
		
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				status.setText("마우스를 클릭했습니다.");
			}
		});
		
	}

}
