import java.util.Scanner;
//Linked List - Insertion at end
//Insertion at end is fairly straightforward.
//
//See the following steps:
//
//Make a new node with the desired value.
//1. Start at the head and move to the last node of the linked list.
//2. Insert the new node after the last node.
//3. The only edge case is when there is no value in the linked list. In that case, we set the head of the linked list to the new node.

import java.util.Scanner;

class linkedlistend {

    private static class MyLinkedList {

        // This is the node class which is instantiated whenever we add a new element to the list
        private class node {
            int value;
            node next;

            public node(int val) {
                this.value = val;
                this.next = null;
            }
        }

        // Head pointer is stored to maintain beginning of the list
        node head;

        public MyLinkedList(){
            head=null; // NULL because initially the list is empty
        }

        public void insertAtEnd(int val){

            node newnode = new node(val);

            if(this.head==null){
                // The list is empty, thus we just need to assign head to the only element
                this.head = newnode;


            }
            else{
                // Iterating towards the end of the list
                node cur = this.head;
                while(cur.next != null ){
                    cur = cur.next;
                }
                // Updating the next pointer of the this element
                cur.next = newnode;
            }
        }

        public void print(){
            node temp = this.head;
            while(temp!=null){
                System.out.printf("%d ",temp.value);
                temp=temp.next;
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            int value = sc.nextInt();
            list.insertAtEnd(value);
        }
        list.print();
    }
}

// wap to enter an array of an natural number which consist of n natural numbers from 1 t0 10 find the missing element in the array