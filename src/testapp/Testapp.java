/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.util.*;

/**
 *
 * @author caihe
 */
public class Testapp {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

	    String[] array = new String[] { "1", "2", "3", "4" };
	    int[] array1 = new int[] {1,2,3,4};
	    char[] array2 = new char[] {'1', '2', '3', '4'};
	    SumOfArray s = new SumOfArray();
	    List ll = Arrays.asList(array);
//		s.listAll(ll, "");
		
		Fibonacci fib = new Fibonacci();
		long svv = fib.creatFib(7);
		ArrayList uuuu = new ArrayList(20);
//		System.out.println(svv);
		
		String ss = "aaaaffffffffaaaaccaf";
		MultiCharacter test = new MultiCharacter();
		test.getNum(ss);
		
		
		
		
		
		
	}

	
    	  
    	  

    	    
    	    
     
        
    
    
}
