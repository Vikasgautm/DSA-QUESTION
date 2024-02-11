public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("List already empty ");
            return;
        }
        head = head.next;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("List already empty ");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node curNode = head;
        Node secondNode = head.next;
        while (secondNode.next != null) {
            curNode = curNode.next;
            secondNode = secondNode.next;
        }
        curNode.next = null;
    }

    public void printlist() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("gautam");
        list.addfirst("vikas");
        list.addlast("is");
        list.addlast("good");
        list.addlast("boy");
        list.printlist();
        list.removefirst();
        list.removelast();
        list.printlist();
    }
}
