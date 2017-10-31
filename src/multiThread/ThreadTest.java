/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author caihe
 */
public class ThreadTest {
	public static void main(String[] args) {
		NewThread1 a = new NewThread1("A",1);
		NewThread1 b = new NewThread1("B",2);
		NewThread1 c = new NewThread1("C",0);
		

	}
}
