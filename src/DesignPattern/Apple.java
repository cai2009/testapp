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
public class Apple implements Fruit{
    @Override
    public void eat(){
        System.out.println("eat apple");
    }
    @Override
    public void color(){
        System.out.println("red");
    }
    
}
