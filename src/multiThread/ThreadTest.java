/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//import multiThread.TestABCThread.Run;

/**
 *
 * @author caihe
 */
public class ThreadTest {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(3);    
        for (int i = 0; i < 10; i++) {  
            executorService.execute(new NewThread1("AAAAAAAAAAAAAAAA", 1));  
            executorService.execute(new NewThread1("BBBBBBBBBBBBBBBBB", 2));  
            executorService.execute(new NewThread1("CCCCCCCCCCCCCCcCC", 3));  
        }  
        executorService.shutdown(); 
		

	}
}
