package testapp;
import java.util.*;
/*
 * 一个字符串包含a-z，找出出现次数最多的字母和出现次数，如果有相同的就都求出来
 */
public class MultiCharacter {
	
	public void getNum(String s) {
		TreeSet set = new TreeSet();
		ArrayList list = new ArrayList();
		//数组便于遍历
		char[] ch = s.toCharArray();
		for (int i = 0; i<ch.length; i++) {
			//转成字符串,放进list，以便于排序
			list.add(String.valueOf(ch[i]));
			//使用TreeSet，将重复的字母删掉，且自然排序，之后用于迭代器
			set.add(String.valueOf(ch[i]));
		}
		//list排序
		Collections.sort(list);
		
		//将list转字符串
		StringBuffer strBuf = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			strBuf.append(list.get(i));
		}
		
		String input_str = strBuf.toString();
		
		//存储字母
		String maxCh = "";
		//存储出现次数
		int num = 0;
		Iterator it = set.iterator();
		ArrayList templist = new ArrayList();
		//用set迭代器遍历
		while (it.hasNext()) {
			String tempStr = (String) it.next();
			int begin = input_str.indexOf(tempStr);
			int end = input_str.lastIndexOf(tempStr);
			//元素第一次出现的位置和最后出现的位置之差加1就是元素个数。此时的input_str是排序过的
			int maxNum = end - begin + 1;
			
			if (num < maxNum) {
				num = maxNum;
				maxCh = tempStr;
				templist.add(tempStr);
			} else if (num == maxNum){
				templist.add(tempStr);
			}
	   	}
		
		int index = 0;
		for (int j = 0; j < templist.size(); j++) {
			if (templist.get(j).equals(maxCh)) {
				index = j;
				break;
			}
		}
		
        for (int j = index; j < templist.size(); j++) {
        	    System.out.println("maxCharacter is "+ templist.get(j));
        }
        
        System.out.println(num);
	}

}
