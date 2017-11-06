package multiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

public class PrintLetters implements Runnable{
    private Lock lock1;
    private Condition con1;
    
    public PrintLetters(Lock l,Condition c) {
//    	    l = new ReentrantLock();
//    	    c = l.newCondition();
    	    this.lock1 = l;
    	    this.con1 = c;
    }
    public void run() {
    	    lock1.lock();
    	    try {
	        char a = 'A';
	        for (int i = 0;i <= 26 ;i++) {
	    	        System.out.println(a);
	    	        a++;
	    	        con1.signalAll();
	    	        try {
						con1.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        }
    	    } finally {
    	    	    lock1.unlock();
    	    }
    }
}
