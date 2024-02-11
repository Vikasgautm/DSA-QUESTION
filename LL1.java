public class LL1 {
    Node head;
    private int size;

    LL1() {
        size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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
        if (head.next == null) {
            head.next = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void addmiddle(int index, String data) {
        Node newNode = new Node(data);
        if (index > size - 1 || index < 0) {
            System.out.println(" index invalid plese given the ccorect index  to add the middle node");
            return;
        }
        // size++;
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        if (index == size) {
            Node curNode = head;
            while (curNode.next != null) {
                curNode = curNode.next;
            }
            curNode.next = newNode;
        }
        Node curNode = head;
        Node lastNode = head.next;
        for (int i = 1; i < index; i++) {
            curNode = lastNode;
            lastNode = lastNode.next;
        }
        curNode.next = newNode;
        newNode.next = lastNode;
    }

    public void removefirst() {
        if (head == null) {
            System.out.println("Linkes lIst already empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void removelast() {
        if (head == null) {
            System.out.println("Linkes List already empty");
            return;
        }
        size--;
        Node curNode = head;
        Node remNode = head.next;
        while (remNode.next != null) {
            curNode = remNode;
            remNode = remNode.next;
        }
        curNode.next = null;
    }

    public void remmiddle(int index) {
        if (head == null) {
            System.out.println("Linkes List already empty");
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        size--;
        Node curNode = head;
        Node midNode = head.next;
        for (int i = 1; i < index; i++) {
            curNode = midNode;
            midNode = midNode.next;
        }
        curNode.next = midNode.next;
    }

    public void printlist() {
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ->");
            curNode = curNode.next;
        }
        System.out.println("NULL");
    }

    public int getsize() {
        return size;
    }

    public void reverseIterative() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addfirst("gautam");
        list.addfirst("vikas");
        list.addlast("are");
        list.addlast("boy");
        list.addmiddle(4, "Taniya");
        list.removefirst();
        list.removelast();
        // list.removelast();
        // list.removelast();
        list.remmiddle(1);
        list.printlist();
        // list.reverseIterative();
        // list.printlist();
        list.head = list.reverseRecursive(list.head);
        list.printlist();
        System.out.println(list.getsize());

    }
}
