package c14;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class BoxLayout1 extends JApplet {
	public void init() {
		JPanel jpv = new JPanel();
		//BoxLayout可以在水平方向活着垂直方向控制组件的位置
		jpv.setLayout(new BoxLayout(jpv, BoxLayout.Y_AXIS));
		for(int i=0; i<5; i++) {
			jpv.add(new JButton("jpv" + i));
		}
		JPanel jph = new JPanel();
		jph.setLayout(new BoxLayout(jph, BoxLayout.X_AXIS));
		for(int i=0; i<5; i++) {
			jph.add(new JButton("jph" + i));
		}
		Container cp = getContentPane();
		cp.add(BorderLayout.EAST, jpv);
		cp.add(BorderLayout.NORTH, jph);
		//this.setLayout(new FlowLayout());
		//this.setLayout(null);
		/*jph.setBounds(20, 20, 1000, 20);//绝对定位
		cp.add(jph);*/
		//jph.add(new JButton("jph" + 5));
		cp.setVisible(true);
		
	}
	
	public static void main(String [] args) {
		Console.run(new BoxLayout1(), 450, 200);
	}
}
