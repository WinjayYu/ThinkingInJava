package c14;
import java.awt.*;

import javax.swing.*;

public class TestGridLayout extends JApplet {
 
	public void init() {
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(8,2));//GridLayout���Թ���һ�������齨������������մ�������
		                                  //�������µ�˳��.(8,2)���ƶ�������������
		for(int i=0; i<10; i++) {
			cp.add(new JButton("Button" + i));
		}
		
	}
	public static void main(String[] args) {
		new Console2().run(new TestGridLayout(), 300, 250);
	}

}
class Console2 {
	//�˷���������ȡ������ʹ��RTTI���������Ƴ�ͨ����getClass()����ʹ�ü���ǰ��ġ�class���֣������6����0���ԣ�
	public String title(Object o) {
		String t = o.getClass().toString();
		if(t.indexOf("class") != -1) {
			t = t.substring(6);
		}
		return t;
	}
	
	public void run(JApplet applet, int width, int height) {
		JFrame frame = new JFrame(title(applet));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ʹ�����˳�
		frame.getContentPane().add(applet);
		frame.setSize(width, height);
		frame.setLocation(450, 300);
		applet.init();
		applet.start();
		frame.setVisible(true);
	}
}
