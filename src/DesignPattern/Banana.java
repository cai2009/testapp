/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;

/**
 *工厂模式
 * @author caihe
 */
public class Banana implements Fruit{
    public int i;
    public int j;
    
    public Banana(int x, int y){
        i = x;
        j = y;
    }
    
    @Override
    public void color(){
        System.out.println("eat banana");
    }
    @Override
    public void eat(){
        System.out.println("yellow");
    }
    public void sharp(){
        System.out.println("long");
    }
    
    public int get(){
        return i+j;
    }
}
