package multiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class PrintNumbers implements Runnable {
	private Lock lock2;
	private Condition con2;

	public PrintNumbers(Lock l, Condition c) {
		// l = new ReentrantLock();
		// c = l.newCondition();
		this.lock2 = l;
		this.con2 = c;
	}

	public void run() {
		lock2.lock();
		try {
			for (int i = 1; i <= 52; i++) {
				System.out.println(i);
				if (i % 2 == 0) {
					con2.signalAll();

					try {
						con2.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} finally {
			lock2.unlock();
		}
	}
}
