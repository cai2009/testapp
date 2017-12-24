/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

import java.lang.Math;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 二叉树问题合集
 * 
 * @author caihe
 */
public class Node {
	int data;
	Node leftchild;
	Node rightchild;
	
	public Node(int d) {
		this.data = d;
		this.leftchild = null;
		this.rightchild = null;
	}
	
	/*
	 * 创建树
	 * @param l 数据源
	 * @param i 计数器
	 */
	public void creatBinaryTree(Node root, int d) {
		if (root == null) {
			root = new Node(d);
		} else {
			if (root.leftchild == null) {
				root.leftchild = new Node(d);
			} else {
				creatBinaryTree(root.leftchild, d);
			}
			if (root.rightchild == null) {
				root.rightchild = new Node(d);
			} else {
				creatBinaryTree(root.rightchild, d);
			}
		}
	}

	/**
	 * 求二叉树的最大深度
	 * 
	 * @param n
	 *            树节点
	 */
	public int maxDeap(Node n) {
		if (n == null) {
			return 0;
		}
		int left = maxDeap(n.leftchild);
		int right = maxDeap(n.rightchild);
		return Math.max(left, right) + 1;
	}

	/**
	 * 求二叉树的最小深度 两种方法： 使用递归，相当于遍历了整个二叉树，递归返回深度浅的那棵子树的深度。
	 * 按层检查有没有叶子节点，有的话停止检查，返回当前层数。至于实现这个按层检查， 可以用递归的方法。该法不用遍历整个树。 1.当根节点为空时，返回0
	 * 2.当只有左子节点（无右子节点）时，返回 1 3.当只有右子节点（无左子节点）时，返回 1
	 * 4.当左右子节点都存在时，分别计算左子树和右子树的深度，min(左子树最小深度，右子树最小深度)+1
	 * 
	 * @param n
	 *            Integer.MAX_VALUE = 2^31-1 Integer.MIN_VALUE = -2^31-1
	 */
	public int minDeap(Node n) {
		if (n != null) {
			int left = Integer.MIN_VALUE;
			int right = Integer.MIN_VALUE;
			if (n.leftchild != null) {
				left = minDeap(n.leftchild);
			}
			if (n.rightchild != null) {
				right = minDeap(n.rightchild);
			}
			if (left < right) {
				return left + 1;
			} else if (right < left) {
				return right + 1;
			} else if (left == right && left != Integer.MAX_VALUE) {
				return left + 1;
			} else {
				return 1;
			}
		}
		return 0;
	}

	/**
	 * 求二叉树节点个数
	 */
	public int numOfNode(Node n) {
		if (n == null) {
			return 0;
		}
		int left = numOfNode(n.leftchild);
		int right = numOfNode(n.rightchild);
		return left + right + 1;
	}

	/**
	 * 二叉树叶子节点个数 无子节点，度为0，是叶子节点 度指的是子树
	 */
	public int numOfLeafNode(Node n) {
		if (n == null) {
			return 0;
		}
		if (n.leftchild == null && n.rightchild == null) {
			return 1;
		}
		int left = numOfLeafNode(n.leftchild);
		int right = numOfLeafNode(n.rightchild);
		return left + right;

	}

	/**
	 * 求二叉树第k层节点的个数
	 */
	public int numOf_K_Level_Node(int k, Node n) {
		if (n == null || k < 1) {
			return 0;
		}
		if (k > maxDeap(n)) {
			return 0;
		}
		if (k == 1) {
			return 1;
		}
		int left = numOf_K_Level_Node(k, n.leftchild);
		int right = numOf_K_Level_Node(k, n.rightchild);
		return left + right;

	}

	/**
	 * 判断二叉数是否是平衡二叉树
	 * 
	 * 平衡二叉树: 它是一 棵空树或它的左右两个子树的高度差的绝对值不超过1， 并且左右两个子树都是一棵平衡二叉树，
	 * 同时，平衡二叉树必定是二叉搜索树，反之则不一定。 平衡二叉树的常用实现方法有红黑树、AVL、替罪羊树、Treap、伸展树等。
	 */
	public boolean isBalancedTree(Node n) {
		if (n == null) {
			return true;
		}
		int left = maxDeap(n.leftchild);
		int right = maxDeap(n.rightchild);
		int value = Math.abs(left - right);
		return value > 1 ? false : true;
	}

	/**
	 * 判断是否是完全二叉树 二叉树最多只有最下面两层的节点的度小于2（度为1或0），且最下面的叶子都依次在该层 的最左面的位置上
	 * 
	 * 若设二叉树的深度为h，除第 h 层外， 其它各层 (1～h-1) 的结点数都达到最大个数， 第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。
	 * 
	 * 思想：根据完全二叉树的定义，对完全二叉树按照从上到下、从左到右的层次遍历，应该满足一下两条要求： ●某节点没有左孩子，则一定无右孩子
	 * ●若某节点缺左或右孩子，则其所有后继一定无孩子 若不满足上述任何一条，均不为完全二叉树。
	 * 算法思路：采用层序遍历算法，用cm变量值表示迄今为止二叉树为完全二叉树 （其初值为1，一旦发现不满足上述条件之一，则置cm为0），
	 * hasNoChild变量值表示迄今为止所有节点均有左右孩子（其初值为1），
	 * 一旦发现一个节点没有左孩子或没有右孩子时置hasNoChild为0），在遍历完毕后返回cm的值。
	 */
	public boolean isCompletedTree(Node n) {
		int cm = 1; // 表示现在仍是完全二叉树，如果为0，则不是。
		int hasNoChild = 1; // 表示现在所有节点都有左右孩子，为0则不是。
		if (n == null) {
			return true;
		}
		Queue<Node> q = new ArrayDeque<Node>();
		q.offer(n); // 根节点入队
		while (!q.isEmpty()) {
			n = q.poll();
			if (hasNoChild == 1) {
				if (n.leftchild != null || n.rightchild != null) {
					cm = 0;
					break;
				}
			} else {
				if (n.leftchild != null && n.rightchild != null) {
					q.offer(n.leftchild);
					q.offer(n.rightchild);
				} else if (n.leftchild != null && n.rightchild == null) {
					cm = 0;
					break;
				} else {
					hasNoChild = 1;
				}

			}
		}
		return cm == 1 ? true : false;
	}

	/**
	 * 判断2个二叉树是否完全相同
	 */
	public boolean isSameTree(Node n, Node m) {
		if (n == null && m == null) {
			return true;
		} else if (n == null || m == null) {
			return false;
		}
		if (n.data != m.data) {
			return false;
		}
		boolean left = isSameTree(n.leftchild, m.leftchild);
		boolean right = isSameTree(n.rightchild, m.rightchild);
		return left && right;

	}

	/**
	 * 判断2个二叉树是否互为镜像
	 */
	public boolean isMirrorTree(Node n, Node m) {
		if (n == null && m == null) {
			return true;
		}
		if (n == null || m == null) {
			return false;
		}
		if (n.data != m.data) {
			return false;
		}
		boolean left = isMirrorTree(n.leftchild, m.leftchild);
		boolean right = isMirrorTree(n.rightchild, m.rightchild);
		return left && right;

	}

	/**
	 * 翻转二叉树 也就是镜像
	 */
	public Node mirrorTree(Node n) {
		if (n == null) {
			return null;
		}
		Node left = mirrorTree(n.leftchild);
		Node right = mirrorTree(n.rightchild);
		n.leftchild = right;
		n.rightchild = left;
		return n;
	}

	/**
	 * 求2个二叉树的最低公共祖先节点
	 */
	public Node getCommonParentsNode(Node root, Node t1, Node t2) {
		if (findNode(root.leftchild, t1)) {
			if (findNode(root.rightchild, t2)) {
				return root;
			} else {
				return getCommonParentsNode(root.leftchild, t1, t2);
			}
		} else {
			if (findNode(root.leftchild,t2)) {
				return root;
			} else {
				return getCommonParentsNode(root.rightchild,t1,t2);
			}
		}

	}
	/*
	 * 查看此结点是否在树里
	 */
	public boolean findNode(Node root, Node n) {
		if (root == null && n == null) {
			return false;
		}
		if (root == n) {
			return true;
		}
		boolean found = findNode(root.leftchild,n);
		if (!found) {
			found = findNode(root.rightchild,n);
		}
		return found;
		
	}

	/**
	 * 前序遍历
	 */
	public int preTravel(Node n) {
		if (n != null) {
			int temp = n.data;
			System.out.println(temp);
			preTravel(n.leftchild);
			preTravel(n.rightchild);
			return temp;
		}
		return 0;

	}

	/*
	 * 中序遍历
	 */
	public int midTravel(Node n) {
		if (n == null) {
			return 0;
		}
		midTravel(n.leftchild);
		int temp = n.data;
		midTravel(n.rightchild);
		return temp;
	}

	/*
	 * 后序遍历
	 */
	public int lastTravel(Node n) {
		if (n == null) {
			return 0;
		}
		lastTravel(n.leftchild);
		lastTravel(n.rightchild);
		return n.data;

	}

	/*
	 * 给出前序遍历和中序遍历，构造二叉树 注意点; 1.确定整棵二叉树的根节点即先序遍历中的第一个元素root
	 * 2.确定root在中序遍历元素的位置，root左边的元素为二叉树的左子树元素Lchild，右边为右子树元素Rchild
	 * 3.在先序遍历中找到最先出现Lchild中元素的那个元素，为Lchild的根节点——root的左孩子节点，
	 * 同理找出Rchild的根节点——root的右孩子节点 4.重复2,3步骤直至二叉树构建完成;
	 */
	public Node reConstructBinaryTree(int data, int[] pre, int[] mid, int start_pre, int start_mid, int end_mid) {
		return null;
	}

	/*
	 * 插入节点
	 */
	public Node insertNode(Node root, int value) {
		
			return root;
	}

	/*
	 * 输入一个整数k和一个二叉树，打印二叉树中节点值的和等于输入整数k的所有的路径 思路： 1.判断树是否为null、是否只有根节点
	 * 2.用前序遍历方法，可以首先访问节点，然后将节点入队列（或栈均可）， 并将数值和之前入队列的总和num相加
	 * 3.判断当前之和否满足给定值，判断当前节点是否叶节点。 若当前值等于给定值，且当前节点是叶节点，则打印路径信息；
	 * 若当前值小于给定值，且当前节点不是叶节点，则递归调用该节点的左右子树； 若当前值大于给定值，无需递归了（在默认节点值为正数的情况下）
	 */
	public ArrayDeque findTreePath(int k, Node n) {
		ArrayDeque path = new ArrayDeque();
		int current = 0; // 节点值的和
		if (n == null) {
			return path;
		}
		if (n.leftchild == null && n.rightchild == null) {
			return path;
		}
		boolean isLeaf = true;
		ArrayDeque que_treenode = new ArrayDeque();
		current = current + n.data;
		que_treenode.offer(current);
		if (current == k && isLeaf) {
			path.offer(que_treenode);
		}
		findTreePath(current, n.leftchild);
		findTreePath(current, n.rightchild);
		path.remove(path.size() - 1);
		return path;
	}

	/*
	 * 二叉树的搜索区间
	 */
	public ArrayDeque searchRange(Node n, int k1, int k2) {
		ArrayDeque list_node = new ArrayDeque();
		if (n == null || n.data < k1) {
			return list_node;
		}
		searchRange(n.leftchild, k1, k2);
		if (n.data > k1 && n.data < k2) {
			list_node.offer(n.data);
		}
		searchRange(n.rightchild, k1, k2);
		return list_node;
	}

	/*
	 * 二叉树的层次遍历 类似广度优先搜索
	 */
	public void levelTravel(Node n) {
		ArrayDeque q = new ArrayDeque();
		Node current = null;
		if (n == null) {
			return;
		}
		q.offer(n);
		while (!q.isEmpty()) {
			current = (Node) q.poll(); // 此处不懂,出队会类型转换？
			System.out.println(current.data);
			if (n.leftchild != null) {
				q.offer(current.leftchild);
			}
			if (n.rightchild != null) {
				q.offer(current.rightchild);
			}
		}
	}

	/*
	 * 二叉树的2个节点的最长距离 二叉树中两个节点的最长距离可能有三种情况： 1.左子树的最大深度+右子树的最大深度为二叉树的最长距离
	 * 2.左子树中的最长距离即为二叉树的最长距离 3.右子树种的最长距离即为二叉树的最长距离 因此，递归求解即可
	 */
	public int getMaxDistance(Node n) {
		if (n == null) {
			return 0;
		}
		int left = maxDeap(n.leftchild);
		int right = maxDeap(n.rightchild);
		if (n.leftchild != null && n.rightchild != null) {
			return left + right;
		} else if (n.leftchild != null && n.rightchild == null) {
			return left;
		} else {
			return right;
		}
	}

	/*
	 * 给出 n，问由 1...n 为节点组成的不同的二叉查找树有多少种？ h(n)=C(2n,n)/(n+1)
	 */
	public int getKindOfTree(int n) {
		int num1 = 1;
		int num2 = 1;
		int result = 0;
		if (n == 1) {
			return 1;
		}
		if (n >= 2) {
			for (int i = 1; i <= 2 * n; i++) {
				num1 = num1 * i;
			}
			for (int j = 1; j <= n; j++) {
				num2 = num2 * j;
			}

			result = num1 / num2 * num2 * (n + 1);
		}

	return result;

	}

	/*
	 * 判断是否是二叉搜索树 一棵BST定义为： 节点的左子树中的值要严格小于该节点的值。 节点的右子树中的值要严格大于该节点的值。 左右子树也必须是二叉查找树。
	 * 一个节点的树也是二叉查找树。
	 * 
	 */
	public boolean isSearchBinaryTree(Node n) {
		if (n == null) {
			return false;
		}
		if (n.leftchild.data < n.data && n.rightchild.data > n.data) {
			return true;
		}
		boolean left = isSearchBinaryTree(n.leftchild);
		boolean right = isSearchBinaryTree(n.rightchild);
		return left&right;

	}

}
