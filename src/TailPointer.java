public class TailPointer {
    class LinkedList {
        public Node head;

        // Create the Node tail
        public Node  tail;

        public void insertAtEnd(int value) {
            Node newNode = new Node(value);

            // If there are no nodes in the linked list
            // Set the new node as head and tail
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }

            // Set next of tail to the new Node
            tail.next = newNode;


            // Set new Node as the new tail
            tail = newNode;

        }

        public void printValues() {
            Node current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
