package testapp;
/**
 * 选择排序
 * @author caihe
 *
 */
public class selectsort {
	/**
	 * 假设最小值，最小值的下标记录
	 * 循环对比，将最小值不断替换
	 * 第2个循环是对比最小值之后的每个值
	 */
	public void selectSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					swap(arr,j,min);
				}
			}
		}
	}
	public void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
