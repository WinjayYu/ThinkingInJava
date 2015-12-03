package c14;
import java.util.*;
import java.util.List;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestArea extends JFrame {

	private JButton b = new JButton("Add Data");
	private JTextArea  t = new JTextArea(20, 20);
	//String s;
	List l = new ArrayList();
	Iterator it;
	
	public TestArea() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(char i='a'; i<='z'; i++){
					l.add(new Character(i));
					 
				}
				it = l.iterator();
				
				//t.append(l.);
				//s = "area" + "\n";
				while(it.hasNext()){
					t.append(it.next().toString() + "\n");
					//System.out.println((char)it.next());
				}
			}
		});
//System.out.println(s);
		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JScrollPane(t));
		cp.add(b);
		pack();
		cp.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Console().run(new TestArea(), 300,500);	
	}

}
