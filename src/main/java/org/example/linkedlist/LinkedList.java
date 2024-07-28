package org.example.linkedlist;


public class LinkedList {

    Node head = null;

    LinkedList insertNode(Node data){
        if (head == null){
            head = data;
        }else {
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = data;
        }
        return this;
    }

    void printLinkedList(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    int lengthOfLinkedList(){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            count += 1;
            temp = temp.next;
        }
        return count;
    }

    Node deleteHead(){
        if (head == null){
            return head;
        }else {
            Node temp = head;
            head = head.next;
            return temp;
        }
    }

    Node deleteAtLast(){
        if (head == null || head.next == null){
            return head;
        }else {
            Node temp = head;
            while (temp.next.next!=null){
                temp = temp.next;
            }
            Node temp1 = temp.next;
            temp.next = null;
            return temp1;
        }
    }
    
    Node deleteNodeAt(int k){
        if (k==1){
            return deleteHead();
        } else if (k==lengthOfLinkedList()) {
            return deleteAtLast();
        }else {
            int count = 0;
            Node prev = null,temp = head;
            while(temp!=null){
                count++;
                if (count==k){
                    prev.next = prev.next.next;
                    return temp;
                }
                prev = temp;
                temp = temp.next;
            }

            return null;

        }
    }

    void insertAtHead(Node data){
        Node temp = head;
        data.next = temp;
        head = data;
    }

    //Find Middle of a Linked list

}

class main{
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        l1.insertNode(n1)
                .insertNode(n2)
                .insertNode(n3)
                .insertNode(n4)
                .insertNode(n5)
                .insertNode(n6);
        System.out.println("\nLength = "+l1.lengthOfLinkedList());
        l1.printLinkedList();
        l1.deleteHead();
        l1.printLinkedList();
        l1.deleteAtLast();
        l1.printLinkedList();
        l1.deleteNodeAt(3);
        l1.printLinkedList();
        l1.insertAtHead(new Node(0));
        l1.printLinkedList();

    }
}
