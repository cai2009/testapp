package testapp;

/**
 * 快速排序
 * @param left 左指针
 * @param right 右指针
 * @param privot 基准值
 * @param arr
 * @author 'caihe'
 */
public class QuickSort {

	int privot;       //基准


	public void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			System.out.println("quick");
			dealPrivot(arr, left, right);
			privot = right - 1;
			int i = left;
			int j = right - 1;
			while (true) {
				/**
				 * 从左面开始扫描，直到大于枢纽值
				 */
				while (arr[++i] < arr[privot]) {
				}
				/**
				 * 从右面扫描
				 */
				while (j > left && arr[--j] > arr[privot]) {
				}
				if (i < j) {
					swap(arr, i, j);
				} else {
					break;
				}
			}
			if (i < right) {
				swap(arr, i, right - 1);
			}
			quickSort(arr, left, i - 1);
			quickSort(arr, i + 1, right);
			
		} else {
			System.out.println("ssb");
		}
	}
	
	/**
	 * 处理privot，三数取中，然后对三个数排序，最后将中间值放到倒数
	 * 第二。
	 */
	public void dealPrivot(int[] arr ,int l, int r) {
	    int mid = (l+r) / 2;      //取中值作为基准值
	    if (arr[l] > arr[mid]) {   
	    	    swap(arr,l,mid);
	    }
	    if (arr[l] > arr[r]) {
	    	    swap(arr,l,r);
	    }
	    if (arr[r] < arr[mid]) {
	    	    swap(arr,r,mid);
	    }
	    swap(arr,r - 1, mid);
	}
	
	public void swap(int[] a, int x , int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	

}
