public class LinkedList {
    Node head;
    int size;

    public LinkedList(){
        this.head = null;
        this.size = 0;
    }
    public Node getCurrentNode(){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }
    public int countNodes(Node head){
        int count = 1;
        Node current = head;
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
   
}
