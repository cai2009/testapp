/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

/**
 *
 * @author caihe
 */
public class ThreadTest {
    public static void main(String[] args){
        Object al1 = new Object();
        Object al2 = new Object();
        Object al3 = new Object();
        NewThread a = new NewThread("A",al2,al1);
        NewThread b = new NewThread("B",al3,al2);
        NewThread c = new NewThread("C",al1,al3);
//        System.out.println("running");
        
    }
}
