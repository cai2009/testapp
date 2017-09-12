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
public class LinkList {
    private Link first_node;
    
    public LinkList() {
        first_node = null;
    }
    
    public void insert_node(int i){
        Link new_node = new Link(i);
        new_node.next = first_node;
        first_node = new_node;
        
    }
    //按顺序删除
    public Link delete_node(){
        Link temp = first_node;
        first_node = first_node.next;
        return temp;
    }
    
    public void display_linklist(){
        int i;
        System.out.println("first->last");
        Link current = first_node;
        while(current != null){
            i = current.int_data;
            current = current.next;
            System.out.println(i);
        }
        
    }
    
    public Link find(int key){
        Link current = first_node;
        while(current.int_data != key){
            if(current.next == null){
                return null;
            }
            else
                current = current.next;
        }
        return current;
    }
    
    public Link point_key_delete(int key){
        Link current = first_node;
        Link temp = first_node;
        //查找key
        while(current.int_data != key){
            if(current.next == null){
                return null;
            }
            else{
                temp = current;      //在current被赋值到下一个之前，将current保存下来，之后temp就是前一个值。           
                current = current.next;
            }
        }
        if(current == first_node){
            first_node = first_node.next;               
        } 
        else
            temp.next = current.next;         //删除结点
        return current;
    }
    
    
}
