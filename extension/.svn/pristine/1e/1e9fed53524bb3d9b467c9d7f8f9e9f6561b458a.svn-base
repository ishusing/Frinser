package com.frinser.linkedList;



/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
/*class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}
*/

//package com.java2novice.ds.linkedlist;
 
import java.util.NoSuchElementException;
 
public class DoublyLinkedListImpl {
 
    private Node head;
    private Node tail;
    private int size;
     
    public DoublyLinkedListImpl() {
        size = 0;
    }
    /**
     * this class keeps track of each element information
     * @author java2novice
     *
     */
    private class Node {
        String query;
        String id;
        Node next;
        Node prev;
 
        public Node(String query, String id, Node next, Node prev) {
            this.query = query;
            this.id = id;
            this.next = next;
            this.prev = prev;
        }
    }
    /**
     * returns the size of the linked list
     * @return
     */
    public int size() { return size; }
     
    /**
     * return whether the list is empty or not
     * @return
     */
    public boolean isEmpty() { return size == 0; }
     
    /**
     * adds element at the starting of the linked list
     * @param element
     */
    public void addFirst(String query, String id) {
        Node tmp = new Node(query, id, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
        System.out.println("adding: "+query + "," + id);
    }
     
    /**
     * adds element at the end of the linked list
     * @param element
     */
    public void addLast(String query, String id) {
         
        Node tmp = new Node(query, id, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+query + "," + id);
    }
     
    /**
     * this method walks forward through the linked list
     */
    public void iterateForward(){
         
        System.out.println("iterating forward..");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.query  + "," + tmp.id);
            tmp = tmp.next;
        }
    }
     
    /**
     * this method walks backward through the linked list
     */
    public void iterateBackward(){
         
        System.out.println("iterating backword..");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.query + "," + tmp.id);
            tmp = tmp.prev;
        }
    }
     
    /**
     * this method removes element from the start of the linked list
     * @return
     */
    public String removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+tmp.query  + "," + tmp.id);
        return tmp.id;
    }
     
    /**
     * this method removes element from the end of the linked list
     * @return
     */
    public String removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.query + "," + tmp.id);
        return tmp.query;
    }
     
    public static void main(String a[]){
         
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();
        dll.addFirst("query1","id1");
        dll.addFirst("query2","id2");
        dll.addFirst("query3","id3");
        dll.addLast("query4","id4");
        dll.iterateForward();
        dll.removeFirst();
        dll.removeLast();
        dll.iterateBackward();
    }
}
