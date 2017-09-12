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
public class bubsort {
    private long[] arr;
    private int numelem;
    
    public bubsort(int max){
        arr = new long[max];
        numelem = 0;
    }
    public void insertArray(long elem){
        arr[numelem] = elem;
        numelem++;
        
    }
    public void displayArray(){
        for(int i =0;i<=numelem-1;i++){
            System.out.println(arr[i] + "sb");
        }
    }
    public void bublebsort(){
        int j,k;
        long temp;
        for(j=0;j<=numelem-1;j++){
            for(k=0;k<=numelem-j;k++){
                if(arr[k]<arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
                
            }
        }
        
    }
    //这个遍历方法比较好
    public void rebublesort(){
        int j,k;
        long temp;
        for(j=numelem-1;j>0;j--){
            for(k=0;k<j;k++){
                if(arr[k]>arr[k+1]){
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                            
                }
            }
        }
    }
    
    
    
}
