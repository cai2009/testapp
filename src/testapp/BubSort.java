package testapp;
/**
 * 冒泡排序
 * @author caihe
 *
 */
public class BubSort {

	/**
	 * 第1轮排序将最大的值排到队尾
	 * 第2轮排序将第二大的排到倒数第二
	 * 。。。。
	 * @param a
	 */
	public void bubSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;	
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j] > a[j+1]) {
					swap(a,j,j+1);
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
			
		}
	}
	
	/**
	 * 交换
	 */
	public void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
