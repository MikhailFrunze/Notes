package de.telran;

public class PersonLinkedList {
    int size = 0;
    Node first = null;
    Node end = null;

    ///TODO
    /* Implement in PersonLinkedList
    1. Person get(int index)
    2. remove (int index)
    3. add(Person p, int index)
     */

    public void add(Person p) {
        if (first == null) {
            Node newNode = new Node(p, null, null);
            first = newNode;
            end = newNode;
        } else {
            Node newNode = new Node(p, end, null);
            end.next = newNode;
            end = newNode;
        }
        size++;
    }

    public void add(int index, Person p) {
        Node left;
        Node right;

        if (size == index) {
            left = end;
            right = null;
        } else {
            right = getNodeByIndex(index);
            left = right.prev;
        }

        Node node = new Node(p, left, right);
        if (left != null)
            left.next = node;
        else
            first = node;

        if (right != null)
            right.prev = node;
        else
            end = node;
        size++;
    }

    public Person get(int index) {
        Node node = getNodeByIndex(index);
        return node.person;
    }

    public void remove(int index) {
        Node nodeToRemove = getNodeByIndex(index);
        Person res = nodeToRemove.person;
        removeNode(nodeToRemove);

    }

    private Node getNodeByIndex(int index) {
        if (index < 0 || index >= size)
            throw new CustomOutOfBoundsException();

        Node res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    private void removeNode(Node node) {
        Node node1 = first;

        for (int i = 0; i < size; i++)
            if (node.equals(node1) && node1.equals(first)) {
                first.next.prev=null;

            } else if (node.equals(node1) && node1.equals(end)) {
                end.prev.next.equals(null);
            } else if (node.equals(node1) && node1.next==null && node1.prev.equals(null)) {
                node1.equals(null);
            } else {
                System.out.println("The node doesn't exist");
            }
        size--;
    }



    public int size() {
        return size;
    }

    public void print() {
        Node current = first;
        while (current != null) {
            System.out.println(current.person);
            current = current.next;
        }

    }


    class Node {
        Person person;
        Node prev;
        Node next;

        public Node(Person person, Node prev, Node next) {
            this.person = person;
            this.prev = prev;
            this.next = next;
        }

    }
}
