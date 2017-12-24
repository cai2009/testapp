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
class Value {
	int i = 15;
}

public class ThreadTest {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.first();
	}

	public void first() {
		int i = 0;
		Value v = new Value();
		v.i = 25;
		System.out.println(v.i);
	}

}
