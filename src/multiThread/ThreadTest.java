/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//import multiThread.TestABCThread.Run;

/**
 *
 * @author caihe
 */
public class ThreadTest {
	public static void main(String[] args) {
		Lock l = new ReentrantLock();
		Condition c = l.newCondition();
		PrintLetters t1 = new PrintLetters(l,c);
		PrintNumbers t2 = new PrintNumbers(l,c);
        new Thread(t2).start();
        new Thread(t1).start();
//		System.out.println("run");
	 
		

	}
}
