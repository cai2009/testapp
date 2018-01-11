package testapp;

import java.util.*;

/*
 * 数组练习题
 */
public class SumOfArray {

	/*
	 * @param l输入的List 把一个数组里的数组和全部列出，比如1和2列出来1，2，12，21.s
	 */
	public void listAll(List l, String obj) {
		if (l != null) {
			System.out.println(obj);
		}
		for (int i = 0; i < l.size(); i++) {
			List temp = new LinkedList(l);
			listAll(temp, obj + temp.remove(i));
		}

	}

	/*
	 * 利用1，2，2,3，4，打印不同的排列 不能有重复
	 * 
	 * @param s = "1,2,2,3,4"
	 */
	public void listAll1(String s, String p) {
		// 记录排列种类
		int count = 0;
		if (s.length() < 1) {
			if ("" != p) {
				System.out.println(p);
			}
		} else {
			int[] arr = new int[s.length()];
			for (int i = 0; i < s.length(); i++) {
				// 找到第一个索引值,arr存储的是s的索引值，当搜索到2时，仍然认为索引是1
				arr[i] = s.indexOf(s.charAt(i));
			}

			for (int i = 0; i < s.length(); i++) {
				//
				if (i == arr[i]) {
					listAll1(s.substring(1), p + s.substring(0, 1));
				}
				s = s.substring(1) + s.substring(0, 1);
			}
		}
	}

	/*
	 * 一个数组，出现次数最多的数字就是支配者，将其求出
	 */
	public void chargerNum(int[] arr) {
		ArrayList list = new ArrayList();
		TreeSet set = new TreeSet();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			set.add(arr[i]);
		}
		Collections.sort(list);

		Iterator it = set.iterator();
		int max = 0; // 存储value最大值
		int maxEle = 0; //存储arr中的最大值
		int value = 0;
		while (it.hasNext()) {
			int tempNum = (int) it.next();
			int begin = list.indexOf(tempNum);
			int end = list.lastIndexOf(tempNum);
			value = end - begin + 1;

			for (int i = 0; i < list.size(); i++) {
				if (max < value) {
					max = value;
					maxEle = (int) list.get(max);
				}
			}
		}
		System.out.println(maxEle);
	}
	
	/*
	 * 约瑟夫环问题，15个教徒，15个非教徒，30个人环成环，从第一个人
	 * 开始报数，每到第9个人就扔下海，循环，直到剩下15人。怎样排列能
	 * 剩下15个教徒
	 * 
	 * @param people 总人数
	 * @num 下水的人的数字
	 */
	public void jewRing(int people, int num) {
		ArrayList list = new ArrayList();
		for (int i = 0; i < people; i++) {
			list.add(i);
		}
		
		int k = 0; //从k开始数
		while (list.size() > 0) {
			//下水的人的位置
			k = k + num; 
			//用于判断是否超出数组长度
			k = k % (list.size()) - 1;
			//当k值已经等于剩余数组的长度后，输出数组最后一个值，且k从头开始计数
			if (k < 0) {
				System.out.println(list.get(list.size() - 1));
				list.remove(list.size() - 1);
				k = 0;
			} else {
				System.out.println(list.get(k));
				list.remove(k);
			}
		}
	}

}
