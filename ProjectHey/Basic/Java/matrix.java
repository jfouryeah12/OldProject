import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class matrix extends JFrame 
{
	JPanel pl = new JPanel();
	Font ft = new Font("Roman",Font.ROMAN_BASELINE,18);
	
	
	//Launch this 
	String scroll;
	
	public matrix() 
	{
		
		
		
		//
		String piatos = null;
		for(int i = 0; i <11;i++) 
		{
			for(int a = 0; a <11;a++) {
				scroll =(int)(Math.random()*2)+" ";
				//System.out.print(scroll);
				piatos=scroll;
				System.out.println(piatos);
				JTextField txt = new JTextField(piatos);
				pl.add(txt);
				txt.setLayout(new FlowLayout(FlowLayout.CENTER));
				txt.setFont(ft);
				//txt.setBounds(0,0,500,500);
				txt.setForeground(Color.BLACK);
			}
		}
		
	
		
		
		add(pl); 
		//pl.setLayout(null); 
		pl.setLayout(new FlowLayout(FlowLayout.LEFT));
		pl.setBounds(50,40,243,335);
		pl.setBackground(Color.WHITE);
	
		
		
		
	}
	//@Override
	public static void main(String[]exo) 
	{
		matrix frame = new matrix();
		frame.setBackground(Color.BLACK);
		frame.setBounds(0,0,350,450);
		frame.setLayout(null);
		frame.setTitle("Matrix");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	
		
	}
	//Penge foods mamatay napo ako
	
	
}