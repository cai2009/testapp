/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *二叉搜索树类
 * @author caihe
 */
public class BinaryTree {
    private Node root;
    /**
     * 
     * @param key 要查找的值
     * @return  结点
     */
    public Node find(int key){
        Node current = root;
        
        while (current.data != key){
            if (key < current.data){
                current = current.leftchild;
            }else{
                current = current.rightchild;
            }
            if (current == null){
                return null;
            }  
        }
        return current;
    }
    
    public void insert(int key){
        Node new_node = new Node();
        new_node.data = key;
        
        if (root == null){
            new_node = root;
        }else{
            Node current = root;
            Node parent;
            while(true){
                parent = current;
                if (key < current.data){
                    current = current.leftchild;
                
                    if (current == null){
                        parent.leftchild = new_node;
                    }
                }else{
                    current = current.rightchild;
                    if (current == null){
                        parent.rightchild = new_node;
                    }
                }
                }
            }
        }
    private void inOrderTree(Node root){
        if (root != null){
            inOrderTree(root.leftchild);
            System.out.println(root.data);
            inOrderTree(root.rightchild);
        }
    }
    
    private void preOrderTree(Node root){
        if (root != null){
            System.out.println(root.data);
            preOrderTree(root.leftchild);
            preOrderTree(root.rightchild);
        }
    }
    
    private void lastOrderTree(Node root){
        if (root != null){
            lastOrderTree(root.leftchild);
            lastOrderTree(root.rightchild);
            System.out.println(root.data);
        }
    }
    
    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        
        /*先找key的位置*/
        while (current.data != key){
            if (key < current.data){
                current = current.leftchild;
            }else{
                current = current.rightchild;
            }
            if (current == null){
                return false;
            }
        }
        
        /*TODO:删除未完成*/
        return false;
    }
    
}
