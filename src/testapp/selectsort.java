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
public class selectsort {
    private long[] arr;
    private int numelem;
    
    public selectsort(int max){
        arr = new long[max];
        numelem=0;
    }
    public void insert(long elem){
        arr[numelem] = elem;
        numelem++;
    }
    public void display(){
        for(int i=0;i<=numelem-1;i++){
            System.out.println(arr[i]+" ");
        System.out.println(" ");
        }
    }
    public void select_sort(){
        int i,j,min;
        long temp;
        long deb;
        for(i=0;i<numelem-1;i++){
            min=i;//假设最左的元素最小
            for(j=i+1;j<numelem;j++){
                if(arr[j]<arr[min]){         //如果min更大，得到新的min
                    min=j;
//                    deb = arr[min];          //debug
                }
                temp = arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }    
                 
            
        }
    }
    
}
