/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *划分算法
 * @author caihe
 */
public class Partition {
//    @SuppressWarnings("empty-statement")
    @SuppressWarnings("empty-statement")
    public static void partition(int[] arr,int mid)
    {
        int numelem;
        numelem = arr.length;
        int leftptr = 0;
        int rightptr = numelem-1;
        int middle = mid;              //根据这个值划分
        int debug = 0;
        while(true)
        {
            while(leftptr<numelem && arr[leftptr++]<middle);
            {
//                leftptr++;     
            }
            while(rightptr>-1 && arr[rightptr--]>=middle);
            {
//                rightptr--;
            }
            if(leftptr>=rightptr)
            {
                break;
            }
            else
            {
                swap(arr[leftptr],arr[rightptr]);
                debug++;
                System.out.println("debug"+ debug);
                
            }
            
        }
//        for(int k=0;k<numelem;k++)
//        {
//            System.out.println(k);
//        }
        
    }
    
    public static void swap(int a,int b)
    {
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    
    public static void main(String[] args)
    {
        int[] array = {3,51,1,10,18,5,4,7,89,8};
        System.out.println("ssss");
        partition(array,10);
        for(int k=0;k<array.length;k++)
        {
            System.out.println(array[k]);
        }
    }
}
