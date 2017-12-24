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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	String s = "asdCV中国sss";
        SubStr ssss = new SubStr();
        String temp = ssss.cutString(s, 2);
        System.out.println(temp);
    }

}
