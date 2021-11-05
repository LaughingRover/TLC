// package com.project.student;

// import java.util.*;


// public class BagOfStudents<Item> implements Iterable<Item> {
//     private Node<Item> first;
//     private int n;

 
//     private static class Node<Item> {
//         private Item item;
//         private Node<Item> next;
//     }

   
//     public BagOfStudents() {
//         first = null;
//         n = 0;
//     }

   
//     public boolean isEmpty() {
//         return first == null;
//     }

   
//     public int size() {
//         return n;
//     }

  
//     public void add(Item item) {
//         Node<Item> oldfirst = first;
//         first = new Node<Item>();
//         first.item = item;
//         first.next = oldfirst;
//         n++;
//     }

//     public void remove(Item item) { 
//         // Store previous front and move front one node ahead
//         // oldfirst = first.item;
//         // first.item = first.next;
 
//         // If front becomes NULL, then change rear also as NULL
//         // if (this.front == null)
//         //     this.rear = null;

//     }



//     public Iterator<Item> iterator()  {
//         return new LinkedIterator(first);  
//     }

  
//     private class LinkedIterator implements Iterator<Item> {
//         private Node<Item> current;

//         public LinkedIterator(Node<Item> first) {
//             current = first;
//         }

//         public boolean hasNext() { return current != null; }

//         public void remove(Item item) {
//           while(next() != null) {
//             if(current == item)
//           }
//         }

//         public Item next() {
//             if (!hasNext()) throw new NoSuchElementException();
//             Item item = current.item;
//             current = current.next; 
//             return item;
//         }
//     }

// }