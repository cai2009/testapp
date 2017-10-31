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
 *
 * @author 'caihe'
 */
public class NewThread1 implements Runnable {
	private Lock lock = new ReentrantLock();
	private static int count = 0;
	int threadId;
    Thread A;
    Thread B;
    
	
}
