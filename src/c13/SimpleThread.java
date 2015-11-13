package c13;

public class SimpleThread extends Thread{
	private int  i = 5;
	private static int countThread = 0;
	
	public SimpleThread() {
		super("" + ++countThread);
		start();
	}
	
	public String toString() {
		return getName() + ":" + i;
	}
	
	public void run() {
		while(true) {
			System.out.println(this);
			if(0 == i--) return;
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String [] args) throws InterruptedException {
		for(int i=0; i<5; i++) {
			new SimpleThread().join();
		}
	}
}
