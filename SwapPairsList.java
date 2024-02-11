import java.util.LinkedList;
//import java.util.List;

public class SwapPairsList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public Node pair(Node head) {
        Node temp = new Node(0);
        temp.next = head;
        Node returnnode = temp;
        while (temp.next != null && temp.next.next != null) {
            Node curr = temp.next;
            Node nex = temp.next.next;
            temp.next = nex;
            curr.next = nex.next;
            nex.next = curr;
            temp = curr;

        }
        return returnnode.next;
    }

    public void printlist() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // list.add(7);
        // System.out.println(list);
        SwapPairsList list1 = new SwapPairsList();
        list1.addfirst(7);
        list1.addfirst(6);
        list1.addfirst(5);
        list1.addfirst(4);
        list1.printlist();
        list1.head = list1.pair(list1.head);
        list1.printlist();
    }
}
