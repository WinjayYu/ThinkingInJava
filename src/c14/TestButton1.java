package c14;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.event.ActionEvent;

public class TestButton1 extends JApplet{
	
	private JButton b1 = new JButton("button 1"), b2 = new JButton("button 2");//´´½¨°´Å¥button1 button2
	private JTextField text = new JTextField(20);
	private ActionListener al = new ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			String s = ((JButton)e.getSource()).getText();
			text.setText(s);
		}
	};

	public void init() {
		b1.addActionListener(al);
		b2.addActionListener(al);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(b1);
		cp.add(b2);
		cp.add(text);
	}
	
	public static void main(String[] args) {
		new Console().run(new TestButton1(), 300, 100);
	}

}