package c14;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame {
	public static void main(String[] args) {
		new TestFrame().launchFrame();
	}
	
	public void launchFrame() {
		setTitle("testFrame");
		this.setLocation(300, 400);
		setSize(300, 500);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});	
		setVisible(true);
	}
}
