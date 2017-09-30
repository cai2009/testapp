/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;

/**
 *工厂类，水果的
 * @author caihe
 */
public class FactoryTest {
    public static Fruit getInstance(String classname){
        if ("Apple".equals(classname)){
            return new Apple();
        }else if ("Banana".equals(classname)){
            return new Banana(3,4);
        }else{
            return null;
        }
    }
}
