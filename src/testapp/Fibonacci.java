package testapp;
import java.util.*;

public class Fibonacci {
	
	/*
	 * @param x是需要多少位的fib数列
	 */
	public long creatFib(int x) {
		if (x == 0) {
			return 0;
		}
		if (x == 1) {
			return 1;
		}
		if (x >= 2) {
			return creatFib(x-1)+creatFib(x-2);
		} else {
			return 9999;
		}
	}

}
