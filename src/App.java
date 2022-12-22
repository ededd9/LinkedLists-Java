public class App {
    public static void main(String[] args){
        Node head = new Node(10);
        Node nodeB = new Node(4);
        Node nodeC = new Node(2);
        Node nodeD = new Node(9);
        Node nodeE = new Node(19);
        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        LinkedList test = new LinkedList();
        test.head = head;
        System.out.println("Head count: " + test.countNodes(head));
        System.out.println("Current head:" + test.getCurrentNode() + "Current head value: " + test.getCurrentNode().data);
    }
}
