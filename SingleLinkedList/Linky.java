class Node {
    int data;      // Data of the node
    Node next;     // Reference to the next node
    
    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
class Linky {
    Node head;  // Head (or first node) of the list

    // Constructor to initialize an empty linked list
    public Linky() {
        this.head = null;
    }

    // Method to add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  
        } else {
            Node last = head;
            // Traverse to the last node
            while (last.next != null) {
                last = last.next;
            }
            // Set the next of the last node to the new node
            last.next = newNode;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        // Traverse through the list and print each node's data
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null"); 
    }
}