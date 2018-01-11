package testapp;

/*
 * 数组排序的各种方法
 */
public class ArraySort {
	/*
	 * @l 要排序的数组 从小到大
	 */
	public void bubSort(int[] l) {
		int temp = 0;
		for (int i = 0; i < l.length; i++) {
			for (int j = i + 1; j < l.length; j++) {
				if (l[i] > l[j]) {
					temp = l[j];
					l[j] = l[i];
					l[i] = temp;
				}
			}
		}
	}

	/*
	 * 插入排序，先排序前2个，再依次插入
	 */
	public void insertSort(int[] l) {
		int temp = 0;
		for (int i = 1; i < l.length; i++) {
			int j = i;
			while (j > 0 && l[j] < l[j - 1]) {
				temp = l[j];
				l[j] = l[j - 1];
				l[j - 1] = temp;
				j--;
			}
		}
	}

	/**
	 * 选择排序 假设最小值，最小值的下标记录 循环对比，将最小值不断替换 第2个循环是对比最小值之后的每个值
	 */
	public void selectSort(int[] l) {
		int min = 0;
		int temp = 0;
		for (int i = 0; i < l.length; i++) {
			min = l[i];
			for (int j = i + 1; j < l.length; j++) {
				if (min > l[j]) {
					temp = l[min];
					l[min] = l[j];
					l[j] = temp;
				}
			}
		}
	}

	/*
	 * 希尔排序，基于插入排序
	 */
	public void shellSort(int[] l) {
		int gap = 1; // 初始化间隔为1
		// 计算最大间隔
		while (gap < l.length / 3) {
			gap = gap * 3 - 1;
		}
		while (gap > 0) {
			int temp = 0;
			for (int i = gap; i < l.length; i++) {
				int j = i;
				while (j > 0 && l[j] > l[j - 1]) { // 改成<会有bug，不知道为啥，不想改了
					temp = l[j];
					l[j] = l[j - 1];
					l[j - 1] = temp;
					j--;
				}
				gap = (gap - 1) / 3;
			}
		}
	}

	/*
	 * 并归排序
	 */
	public void mergeSort(int[] l, int front, int end, int[] temp) {
		if (front < end) {
			int mid = (front + end) / 2;
			// System.out.println("diguiqian:"+"mid="+mid+"front="+front+"end="+end);
			mergeSort(l, front, mid, temp);
			// System.out.println("diyici:"+"mid="+mid+"front="+front+"end="+end);
			mergeSort(l, mid + 1, end, temp);
			// System.out.println("dierci:"+"mid="+mid+"front="+front+"end="+end);
			merge(l, front, mid, end, temp);
			// System.out.println("merge: "+"mid="+mid+"front="+front+"end="+end);
		}
	}

	public void merge(int[] arr, int left, int mid, int right, int[] temp) {
		int le = left;
		int ri = mid + 1;
		int t = 0; // temp临时指针
		// System.out.println("le33=" + le);
		// System.out.println("ri33=" + ri);
		// System.out.println("left33=" + left);
		// System.out.println("right33=" + right);
		// 先对拆分的数组排序
		while (le <= mid && ri <= right) {
			if (arr[le] <= arr[ri]) {
				temp[t++] = arr[le++];
			} else {
				temp[t++] = arr[ri++];
				// System.out.println("ri33=" + ri);
			}
		}
		// for (int x = 0; x < temp.length; x++) {
		// System.out.println("before: "+ temp[x]);
		// }
		// System.out.println("le= " + le);
		while (le <= mid) {
			temp[t++] = arr[le++];
		}
		// System.out.println("ri= " + ri);
		while (ri <= right) {
			temp[t++] = arr[ri++];
			// System.out.println("ri=" + ri);
		}
		// for (int x = 0; x < temp.length; x++) {
		// System.out.println(temp[x]);
		// }

		t = 0;
		while (left <= right) {
			arr[left++] = temp[t++];
			// System.out.println("left="+left);
			// System.out.println("right="+right);
		}
	}

	/*
	 * 堆排序 升序大顶堆 降序小顶堆 TODO:BUG!!!
	 */
	public void heapSort(int[] l) {
		buildMaxHeap(l);
		for (int i = l.length - 1; i > 1; i--) {
			swap(l,0,i);
			maxHeap(l,i,0);
		}
	}

	/*
	 * 交换
	 */
	public void swap(int[] l, int a, int b) {
		int temp = l[a];
		l[a] = l[b];
		l[b] = temp;
	}

	/*
	 * @param l
	 * 
	 * @param len
	 * 
	 * @param x 元素下标
	 */
	private void buildMaxHeap(int[] l) {
		int half = (l.length-1-1)/2;  //从最后一个节点的父节点开始
		// 从下往上做大顶堆
		for (int i = half; i >= 0; i--) {
			maxHeap(l, l.length, i);
		}
	}

	private void maxHeap(int[] l, int heapsize, int index) {
		int temp = l[index];//根节点
		//i初始化为子节点，向下搜索
		for (int i = index*2+1; i<heapsize; i=2*i+1) {
			//如果右孩子大于左孩子，取右孩子
			if (i < heapsize && l[i] <= l[i+1]) {
				i++;
			}
			//根节点大于子节点，如果不，则将子节点调整至根节点
			if (temp>l[i]) {
				break;
			} else {
				l[index] = l[i];
				index = i;
			}
		}
		l[index] = temp;   //没看懂
	}

	/*
	 * 快速排序
	 * 选第一个是基准值
	 * @param l
	 * @param left数组左指针
	 * @param right数组右指针
	 */
	public void quickSort1(int[] l, int left, int right) {
		if (left < right) {
			int privot = left;
			int front = left;
			int end = right;
			while (front < end) {
				while (front < end && l[privot] <= l[end]) {
					end--;
				}
				if (front < end) {
					l[front] = l[end];
					front++;
				}
				while (front < end && l[privot] > l[front]) {
					front++;
				}
				if (front < end) {
					l[end] = l[front];
					end--;
				}
			}
			l[front] = l[privot];
			quickSort1(l, left, front - 1);
			quickSort1(l, front + 1, right);
		}
	}
	
	/*
	 * 中间取值的快速排序,感觉不对
	 */
	public void quickSort2(int[] l, int left, int right) {
		if (left < right) {
			int privot = (right+left) / 2;
			swap(l,left,privot);
			int privot_new = left;
			int front = left;
			int end = right;
			while (front < end) {
				while (front < end && l[privot_new] <= l[end]) {
					end--;
				}
				if (front < end) {
					l[front] = l[end];
					front++;
				}
				while(front < end && l[privot_new] > l[front]) {
					front++;
				}
			    if (front < end) {
			    	    l[end] = l[front];
			    	    end--;
			    }
			}
			l[front] = l[privot_new];
			quickSort2(l,left,front-1);
			quickSort2(l,front+1,right);
		}
	}

}
