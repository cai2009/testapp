/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;

/**
 *主方法，客户端
 * 工厂模式,目的是减少客户端代码改动
 * @author caihe
 */
public class Client {
    public static void main(String[] args){
        Fruit f = FactoryTest.getInstance("Apple");
        f.color();
        
    }
}
