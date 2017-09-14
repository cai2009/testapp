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
public class shellsort {
    public static void shellsort(int[] arr, int len)
    {
        int i,j,gap;
        
        for(gap=len/2;gap>0;gap/=2)           //把数组分成2部分，gap是增量
        {
            for(i=gap;i<len;i++)
            {
                int temp = arr[i];
                for(j=i-gap;j>0;j-=gap)
                {
                    if(temp<arr[j])
                    {
                        arr[j+gap] = arr[j];
                    }
                    else
                    {
                        break;
                    }
                    
                }
                arr[j+gap] = temp;
            }
        }
    }
    
    public static void main(String args[])
    {
        int[] array = {111,2,16,32,3,12,11,99,56};
        shellsort(array,9);
        for(int i : array)
        {
            System.out.println(i);
        }
    }
}
