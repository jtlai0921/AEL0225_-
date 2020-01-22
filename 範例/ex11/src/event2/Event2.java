package event2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyJFrame extends JFrame implements ActionListener{
	private JPanel contentPane;
	public MyJFrame() {                                   
	 		setTitle("事件處理");                                 
	 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
	 		setBounds(100, 100, 300, 200);                        
	 		contentPane = new JPanel();                           
	 		setContentPane(contentPane);                          
	 		contentPane.setLayout(null);                          
		
		    JButton button = new JButton("事件來源");             
	 		button.addActionListener(this);                                 
	 		button.setBounds(100, 50, 90, 25);                    
	 		contentPane.add(button);    
		    setVisible(true);   
	}                   
	public void actionPerformed(ActionEvent e) {        
			JOptionPane.showMessageDialog(null, "處理事件");
	}
}

public class Event2 {
	public static void main(String[] args) {
		MyJFrame f= new MyJFrame();
	}
}
