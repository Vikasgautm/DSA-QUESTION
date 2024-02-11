public class MergeTwoList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            lastNode.next=newNode;
        }
        lastNode.next=newNode;
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
    public void printlist1(){
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data +" ");
            curNode=curNode.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MergeTwoList list=new MergeTwoList();
       // MergeTwoList list1=new MergeTwoList();
       list.addfirst(0);
        list.addlast(1);
        list.addlast(2);
        list.addlast(3);
        list.printlist1();
    }
}
