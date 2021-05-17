//Program to creating multiple thread
public class MultipleThreading extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Thread name: "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		MultipleThreading m1=new MultipleThreading();
		m1.start();
		MultipleThreading m2=new MultipleThreading();
		m2.start();
		MultipleThreading m3=new MultipleThreading();
		m3.start();

	}

}
