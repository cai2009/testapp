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
public class CreatArray {
    private int[] arr;
    private int l;         //array length
    
    public CreatArray(int s){
        arr = new int[s];
        l = 0;
    }
    
    public void insert(int s){
        arr[l] = s;
        l++;
    }
    
    public void delete(int i){     //i是下标
        int temp;
        int j = 0;
        if(i<l && i>=0){
            for(j=0;j<l;j++){
                while(arr[j] == arr[i]){
                    temp = arr[i];
                    j = j+1;
                    arr[i] = arr[j];
                   
                    l--;
                    System.out.println("delete"+temp);
                }
//                System.out.println("delete"+temp);
            }
        }
    }
         
        
    
    
    public void display(){
        for(int i=0;i<l;i++){
            System.out.println(arr[i]);
        }
    }
}
