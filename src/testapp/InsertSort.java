package testapp;
/**
 * 插入排序
 * @author caihe
 *
 */
public class InsertSort {
	/**
	 * 第1轮对比，将前2个值排序
	 * 第2轮将第三个值插入到合适的位置，前3个值排序
	 * 。。。。
	 * @param arr
	 */
	public void insertSort (int[] arr) {
		for (int i = 1; i < arr.length; i++ ) {
			int j = i;
			while (j > 0 && arr[j] < arr[j-1]) {
				swap(arr, j, j-1);
				j--;
			}
		}
	}
	
	public void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
