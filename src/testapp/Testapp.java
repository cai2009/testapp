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

}
