package c14;
import java.awt.*;

import javax.swing.*;

public class TestGridLayout extends JApplet {
 
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(8,2));//GridLayout可以构建一个放置组建的网格，组件按照从左至右
		                                  //从上往下的顺序.(8,2)是制订的行数与列数
		for(int i=0; i<10; i++) {
			cp.add(new JButton("Button" + i));
		}
		
	}
	public static void main(String[] args) {
		new Console2().run(new TestGridLayout(), 300, 250);
	}

}
class Console2 {
	//此方法用来抽取类名（使用RTTI），并且移除通常由getClass()方法使用加在前面的“class”字（下面的6换成0试试）
	public String title(Object o) {
		String t = o.getClass().toString();
		if(t.indexOf("class") != -1) {
			t = t.substring(6);
		}
		return t;
	}
	
	public void run(JApplet applet, int width, int height) {
		JFrame frame = new JFrame(title(applet));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//使程序退出
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		frame.setLocation(450, 300);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}
}
