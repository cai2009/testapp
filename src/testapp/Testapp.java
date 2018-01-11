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


<<<<<<< HEAD
		Map<String, Integer> m = new HashMap<String, Integer>();
		String s = "RRRRRR";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String key = String.valueOf(c);
			if (m.containsKey(key)) {
				m.put(key, m.get(key) + 1);
			} else {
				m.put(key, 1);
			}
		}
		System.out.println(m);
		System.out.println(m.get("r"));

		LeetCode leet = new LeetCode();
		leet.differentColor(s);

	}

=======
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	String s = "asdCV中国sss";
        SubStr ssss = new SubStr();
        String temp = ssss.cutString(s, 2);
        System.out.println(temp);
    }

>>>>>>> 1bac3acbecb0a5983d14490dedab0ae5a2685a61
}
