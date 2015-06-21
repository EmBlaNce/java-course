package zad3;

public class Thread1 extends Thread {

	public synchronized void run() {
		for (int i = 0; i < 20; i++) {
			
			System.out.println("Initiating...");
			try {
				
				Thread.sleep(500);
			}
			catch (InterruptedException e) {
			
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
		}
		notifyAll();
	}

}