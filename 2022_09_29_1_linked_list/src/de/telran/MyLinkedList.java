package de.telran;

public class MyLinkedList<T> {
    Node<T> first = null;
    Node<T> last = null;
    int size = 0;

    public void add(T object) {
        Node<T> newNode = new Node<>();
        newNode.object = object;
        if (size == 0) {
            first=newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        size++;
    }

    public void print(){
        Node node = first;
        while (node.next!=null){
            System.out.println();
            node=node.next;
        }
    }
}

class Node<T> {
    Node prev;
    Node next;
    T object;
}

/*Ключевые слова
*
* Красно черное дерево*/
