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
public class insertsort {
    private long[] arr;
    private int numelem;
    
    public insertsort(int max){
        arr = new long[max];
        numelem = 0;
    }
    
    public void insertArray(long elem){
        arr[numelem] = elem;
        numelem++;
    }
    public void display(){
        for(int i=0;i<=numelem-1;i++){
            System.out.println(arr[i]);
        }
    }
    //每个值都和已经排序好的比较，寻找插入位置
    public void insert_sort(){
        int i,j;
        for(i=1;i<numelem;i++){
            long temp = arr[i];           //从第二个开始
            j=i;
            while(j>0 && arr[j-1]>=temp){    //当前一个值大于本身时
                arr[j] = arr[j-1];            //这个值左移
                --j;                          //此时监视哨左移，继续比较，直到不满足条件
                
            }
            arr[j] = temp;                     //此时的监视哨是arr[j]
            
        }
    }
    
}
