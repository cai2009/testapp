package testapp;
import java.util.*;
/*
 * 数组练习题
 */
public class SumOfArray {
	
	/*
	 * @param l输入的List
	 * 把一个数组里的数组和全部列出，比如1和2列出来1，2，12，21.s
	 */
	public void listAll (List l, String obj) {
		if (l != null) {
			System.out.println(obj);
		}
		for (int i = 0;i<l.size();i++) {
			List temp = new LinkedList(l);
			listAll(temp, obj+temp.remove(i));
		}
		
	}
	
	/*
	 * 利用1，2，2,3，4，5，打印不同的排列
	 * 不能有重复
	 */
	public void listAll1 () {
		int[] arr = new int[] {1, 2, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++) {
			
		}
	}

}
