public class LinkedList {
    
    private Node head;
    private int size;

    public void add(int value){

        if (head == null){

            head = new Node(value);
            size = 1;

            return;
        }

        Node currentNode = head;

        while(currentNode.next != null){

            currentNode = currentNode.next;
        }

        currentNode.next = new Node(value);
        size++;
    }

    public void reverse(){
        reverse(head.next, head);
    }

    private void reverse(Node currentNode, Node previousNode){

        if (head == null || head.next == null)
            return;
        
        if (currentNode.next == null)
            head = currentNode;
        else
            reverse(currentNode.next, currentNode);
        
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void printList(){
        
        Node currentNode = head;

        while(currentNode != null){

            System.out.print(currentNode.value + " ");

            currentNode = currentNode.next;
        }
        System.out.println();
    }

    private class Node{

        int value;
        Node next;

        Node() {}
        Node(int _value) {this.value = _value;}
        Node(int _value, Node _next) {this.value = _value; this.next = _next;}
    }
}
