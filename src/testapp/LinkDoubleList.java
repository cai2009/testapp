/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp;

/**
 *
 * @author caihe
 */
public class LinkDoubleList {
    private Link rear;
    private Link front;
    //front进rear出
    public LinkDoubleList(){
        rear = null;
        front = null;
    }
    
    public void insert_d_link(int s){
        Link new_node = new Link(s);
        if(rear == null){
            rear = new_node;         //尾指针为空时，插入新的节点
        }
        else{
            front.next = new_node;    //非空，头指针的下一个值是插入的节点
        }
        front  = new_node;           //将头指针指向当前节点
    }
    
    public int delete_d_link(){
        int temp = rear.int_data;    //临时变量，存储队列当前的rear值
        if(rear.next == null)       //尾指针的下一个值是空，则队列为空
            front = null;
        rear = rear.next;           //非空，尾指针指向下一个值，删除尾指针指向的节点
        return temp;
    }
    
    public void display_d_link(){
        Link current = rear;
        while(current != null){
            int i = current.int_data;
            current = current.next;
            System.out.println(i);
        }
        
    }
}
