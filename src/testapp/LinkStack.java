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
public class LinkStack {
    private LinkList link_stack;
    
    public LinkStack(){
        link_stack = new LinkList();
    }
    
    public void push_link_stack(int s){
        link_stack.insert_node(s);
        
    }
    
    public Link pop_link_stack(){
        return link_stack.delete_node();
    }
    
    public void display_link_stack(){
        link_stack.display_linklist();
    }
    
}
