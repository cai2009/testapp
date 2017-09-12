/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author caihe
 */
public class stackx {
    private long[] stackArray;
    private int maxsize;
    private int top;
    
    public stackx(int x){
        maxsize = x;
        stackArray = new long[maxsize];
        top = -1;
    }
    
    public void push_stack(int elem){
        ++top;
        stackArray[top] = elem;
    }
    public void pop_stack(){
        System.out.println(stackArray[top]);
        top--;
    }
    public Boolean is_empty(){
        if(top == -1){
            return true;
        }
        else
            return false;    
    }
    public Boolean is_full(){
        if(top == maxsize-1){
            return true;
        }
        else
            return false;
        
    }
    
}
