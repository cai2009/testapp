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
    	    int[] arr = {10000,18,9,7,6,5,3,4,2,1,0,-1,1800};
    	    QuickSort ss = new QuickSort();
    	    ss.quickSort(arr, 0, arr.length-1);
    	    for(int i = 0;i<arr.length;i++) {
//    	       	System.out.println(arr[i]);
    	    }
    	    int[] arr1 = {10000,18,9,7,6,5,3,4,2,1,0,-1,1800};
    	    BubSort b = new BubSort();
    	    b.bubSort(arr1);
    	    for(int i = 0;i<arr1.length;i++) {
    	       	System.out.println(arr1[i]);
    	    }

   
        
        
    }
    
}
