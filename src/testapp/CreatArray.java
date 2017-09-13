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
public class CreatArray 
{
    private int[] arr;
    private int l;         //array length
    
    public CreatArray(int s)
    {
        arr = new int[s];
        l = 0;             
    }
    
    public void insert(int s)
    {
        arr[l] = s;
        l++;
    }
    
    public void delete()
    {     
        System.out.println("delete:" + arr[l-1]);
        l--;
    }
    
         
        
    
    
    public void display()
    {
        for(int i=0;i<l;i++){
            System.out.print(arr[i]);
        }
    }
    
//    public static void main(String args[])
//    {
//        CreatArray arr = new CreatArray(10);
//        arr.insert(1);
//        arr.insert(3);
//        arr.insert(10);
//        arr.insert(111);
//        arr.insert(12);
//        arr.insert(15);
//        arr.display();
//        arr.delete();
//        arr.display();
//    }
    
}


