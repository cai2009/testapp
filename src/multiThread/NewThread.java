/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;
import java.lang.InterruptedException;
/**
 *建立三个线程，A线程打印10次A，B线程打印10次B,C线程打印10次C，要求线程同时运行，交替打印10次ABC
 * @author caihe
 */
public class NewThread implements Runnable{
    Thread t;
    String str;
    Object pre;  //lock
    Object self;
    int threadId;
    public  NewThread(String s,Object l1,Object l2){
        this.str = s;
        this.pre = l1;
//        this.threadId = id;
        this.self = l2;
        t = new Thread(this,str);
//        System.out.println("Thread: "+str+"started");
        t.start();
    }
    @Override
    public void run(){
        int count = 0;
        while(count<10){
            synchronized(pre){
                synchronized(self){
                    System.out.println(str);
                    count++;
                    try{
                    Thread.sleep(10);//主动释放CPU，保证aBC顺序
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    self.notify();
                }
                try{
                    pre.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
