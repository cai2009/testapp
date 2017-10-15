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
 * @author caihe
 */
public class NewThread1 implements Runnable{
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();
    private Condition pre = lock2.newCondition();
    private Condition self = lock1.newCondition();
    Thread t;
    String str;
    int threadId;
    NewThread1(String s,int id){
        str = s;
        threadId = id;
        t = new Thread(this,str);
        t.start();
    }
    
    @Override
    public void run(){
       int count = 0;
       while(count<10){
           lock1.lock();
           try{
               lock2.lock();
               try{
                   System.out.println(str);
                   count++;
                   self.signalAll();
                   
               }finally{
                   lock2.unlock();
               }
               try{
                   pre.await();
               }catch(InterruptedException e){
                   e.printStackTrace();
               }
               
           }finally{
               lock1.unlock();
           }
       }
       
    }
}
