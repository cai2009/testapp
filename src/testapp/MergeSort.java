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
public class MergeSort {
    public static void remergesort(int[] arr,int first,int last,int[] leftarr,int[] rightarr)
    {
        if(first < last)
        {
            int mid = (first+last)/2;
            remergesort(arr,first,mid,leftarr,rightarr);
            remergesort(arr,mid+1,last,leftarr,rightarr);
            merge(arr,first,mid,last,leftarr,rightarr);
        }
    }
    
    public static void mergesort(int[] arr)
    {
        int[] left_arr = new int[arr.length];
        int[] right_arr = new int[arr.length];
        remergesort(arr,0,arr.length-1,left_arr,right_arr);
        
    }
    
    public static void merge(int[] arr,int first,int mid,int last,int[] left_arr,int[] right_arr)
    {
        int left_arr_len = mid-first+1;
        int right_arr_len = last-mid;
//        int[] left_arr = new int[left_arr_len];
//        int[] right_arr = new int[right_arr_len];
        
        int i = 0;
        int j = 0;
        for(i=0;i<left_arr_len;i++)
        {
            left_arr[i] = arr[first+i];
            
        }
        
        for(j=0;j<right_arr_len;j++)
        {
            right_arr[j] = arr[mid+1+j];
        }
        
        i = 0;
        j = 0;
        int k = first;
        
        while(i < left_arr_len && j < right_arr_len)
        {
            if(left_arr[i] <= right_arr[j])
            {
                arr[k] = left_arr[i];
                k++;
                i++;
            }
            else
            {
                arr[k] = right_arr[j];
                k++;
                j++;
            }
        }
        
        if(i < left_arr_len)
        {
            arr[k] = left_arr[i];
            k++;
            j++;
        }
        if(j < right_arr_len)
        {
            arr[k] = right_arr[j];
            k++;
            j++;
        }
        
    }
    
    public static void main(String args[])
    {
        int[] array = {6,4,17,88,14,32,90,109,74,1111};
        mergesort(array);
        
        for(int i : array)
        {
            System.out.println(i);
        }
        
    }
}
