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
public class LinkQueue {
    private LinkDoubleList link_queue;
    
    public LinkQueue(){
        link_queue = new LinkDoubleList();
    }
    
    public void insert_queue(int s){
        link_queue.insert_d_link(s);
    }
    
    public void delete_queue(){
        link_queue.delete_d_link();
    }
    
    public void display_queue(){
        link_queue.display_d_link();
    }
}
