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
public class Testapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        
       CreatArray arr = new CreatArray(10);
       for(int i=0;i<=9;i++){
           arr.insert(i);
       }
       arr.display();
       arr.delete(2);
       System.out.println("sss");
       arr.display();
       arr.delete(2);
       arr.display();
        
    }
    
}
