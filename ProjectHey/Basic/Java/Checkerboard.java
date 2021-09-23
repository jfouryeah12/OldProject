import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Checkerboard extends JFrame{
	JButton[] bt = new JButton[4 * 8];
	JButton[] bt2 = new JButton[4 * 8];
	
	public Checkerboard() {
		
		System.out.println("Check");
		
	
		
		for(int x = 0; x < bt.length; x++) {
			bt[x] = new JButton("");
			bt[x].setBackground(Color.BLACK);
			
		}for(int x =0; x < bt2.length; x++) {
			bt2[x] = new JButton("");
			bt2[x].setBackground(Color.WHITE);
		}

		JPanel pp = new JPanel();
		pp.setSize(400,400);
		pp.setLayout(new GridLayout(8, 8));
	for(int x = 0; x < 8; x++) 
	{
		if(x % 2 == 0) {
			for(int a = 0; a < 4; a++) {
				System.out.println("[1]Add work data base of "+bt);
				pp.add(bt[ 4 * x + a ]);
				pp.add(bt2[ 4 * x + a ]);
			}
		}else {
			for(int a = 0; a < 4; a++ ) {
				System.out.println("[2]Add work data base of "+bt2);
				pp.add(bt2[4 * x + a]);
				pp.add(bt[4 * x + a]);
			}
		}
		
		
	}
	add(pp);
	}
	
	public static void main(String[]arg) {
		Checkerboard hey = new Checkerboard();
		hey.setTitle("CheckerBoard"); // title 
		hey.setSize(600,600);
		hey.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hey.setVisible(true);
		hey.setLocationRelativeTo(null);
		
		
		
		
	}
}