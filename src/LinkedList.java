public class LinkedList {
    Node head;
    int size;
    //constructor
    public LinkedList(){
        this.head = null;
        this.size = 0;
    }
    //getCurrentNode method
    public Node getCurrentNode(){
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        return current;
    }
    //countNodes method
    public int countNodes(Node head){
        int count = 1;
        Node current = head;
    
        while(current.next != null){
            count++;
            current = current.next;
        }
        return count;
    }
    //addNode method
    public void addNode(Node node){
        getCurrentNode().next = node;
    }
    public Node getNodeAtIndex(int index){
        Node current = head;
        
        int count = 0;
        while(current.next != null){
            if(count == index){
                System.out.println("Current nodes data: " + current.data);
                return current;
            }
            count++;
            current = current.next;
        }
        return null;
    }
    public void removeNode(Node node){
        Node current = head;
        while(current.next != null){
            if(current == node){
                current = null;
                break;
            }
            current = current.next;
        }
    }
   
}
