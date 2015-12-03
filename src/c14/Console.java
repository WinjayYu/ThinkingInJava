package c14;

import javax.swing.*;
import java.awt.event.*;

/*
 * һ����ʾ��ܣ��Ժ��Swing���ӽ�ʹ�ñ����
 */
public class Console {
	public static String title(Object o) {
		String t = o.getClass().toString();
		if(t.indexOf("class") != -1)
			t = t.substring(6);//���Ե���class ��
		    //t = t.substring(0);
		return t;
	}
	
	public static void run(JFrame frame, int width, int height) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ʹ�����˳�
		frame.setSize(width, height);
		frame.setLocation(450, 300);
		frame.setVisible(true);
	}
	
	public static void run(JApplet applet, int width, int height) {
		JFrame frame = new JFrame(title(applet));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ʹ�����˳�
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		frame.setLocation(450, 300);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}
	
	public static void run(JPanel panel, int width, int height) {
		JFrame frame = new JFrame(title(panel));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(panel);
		frame.setSize(width, height);
		frame.setVisible(true);
	 }
}
