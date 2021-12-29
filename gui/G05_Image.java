package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class G05_Image extends JFrame{
	
	/*JLabel 을 이용해 이미지를 넣어보자!*/
	
	int count=0;
	File fold = new File("Icon");
	File[] files = fold.listFiles();
	ArrayList<String> img = new ArrayList<>();
	
	public G05_Image() {
		super("Print Image!");
		
		JLabel lab = new JLabel("IMG");
		JButton btn = new JButton("버튼임");
		add(btn, "South");
		add(lab, "Center");
		
		for(File file : files) {
			img.add(file.getPath());
		}
		
		lab.setHorizontalAlignment(JLabel.CENTER);
		
		// 연습문제 : 버튼을 누르며 다양한 그림들이 순차적으로 순환되도록 만들어보세요.
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loopSty(lab);
			}
		});
		
		btn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == 10) {
					loopSty(lab);
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1300, 700, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new G05_Image();
	}
	
	public void loopSty(JLabel lab) {
		
		lab.setText("");
		lab.setIcon(new ImageIcon(img.get(count++%img.size())));
		
	}

	
}
