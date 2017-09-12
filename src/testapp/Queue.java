/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *尾插头出
 * @author caihe
 */
public class Queue {
    private long[] q_array;
    private int front,rear;
    private int maxsize;
    private int numelem;           //元素个数
    
    public Queue(int s){
        q_array = new long[s];
        front = 0;
        rear = -1;
        maxsize = s;
        numelem = 0;
        
    }
    public Boolean is_empty(){
        if(numelem == maxsize)
            return true;
        else
            return false;
                
    }
    
    public Boolean is_full(){
        if(numelem == 0)
            return true;
        else
            return false;
    }
    public void insert_queue(int elem){
//        if(rear == maxsize-1)
//            rear = -1;
//            System.out.println("full!");
//            System.out.println(maxsize);
                    
        q_array[++rear] = elem;
        numelem++;
            
    }
    
    public long remove_queue(){
        if(rear == -1){
//            System.out.println("empty");
            return 0;  
        }
        else{
            numelem--;
            return q_array[front++];
        }
    }
}
