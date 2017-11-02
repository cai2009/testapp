/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

/**
 *看到网上一道题，三个线程按顺序打印A、B、C循环10次
 * @author 'caihe'
 */
public class NewThread1 implements Runnable {
	public static Lock lock = new ReentrantLock();
	public static Condition self = lock.newCondition();
	public static int count = 0;
	String str;                 //thread name
	int threadId;
    NewThread1(String s,int id) {
    	    this.str = s;
    	    this.threadId = id;
    }
    
    @Override
    public void run() {
    	    	    lock.lock();
    	    	    try {
    	    	    	        while (true) {
	    	    	            if (count % 3 == threadId - 1) {
	    	    	            	    System.out.println(str);
	    	    	            	    count++;
	    	    	            	    self.signalAll();
	    	    	            	    break;
	    	    	            } else {
	    	    	            	    try {
	    	    	            	    	    self.await();
	    	    	            	    }catch (InterruptedException e) {
	    	    	            	    	    e.printStackTrace();
	    	    	            	    }
	    	    	            }    	    	            
    	    	    	        }
    	    	    } finally {
    	    	    	    lock.unlock();
    	    	    }  	    
    }	
}
