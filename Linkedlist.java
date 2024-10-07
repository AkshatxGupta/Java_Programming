public class Linkedlist {
    public static class Node{
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head ;
    public static Node tail ;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head =tail = newNode;
            return ;
        }
        newNode.next = head ;//newNode next = head
        head = newNode;//head = newNode
    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head =tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode ;
    }
    public void print(){
        if( head==null ){
            System.out.println("LL is empty ");
            return;
        }
        Node temp = head ;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add (int idx , int data) {
        Node newNode = new Node(data);
        Node temp = head ;
        int i =0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx -1; temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(int size) {
        if(size ==0 ){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null ;
            return val ;
        }
        int val = head.data;
        head = head.next;
        return val;
    }
    public int removeLast(int size) {
        if(size ==0 ){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1) {
            int val = head.data;
            head = tail = null ;
            return val ;
        }
        //prev : i = size -2
        Node prev = head;
        for(int i=0; i<size -2; i++){
            prev= prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }
    public int itrsearch(int key) {
        Node temp= head;
        int i=0;
        while (temp!=null) {
            if(temp.data==key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head , int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper (head.next, key) ;
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head,key);
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthfromEnd(int n) {
        int sz = 0;
        Node temp = head;
        while (temp!=null) {
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return;
        }
        int i=1;
        int iTofind = sz-n;
        Node prev = head;
        while (i<iTofind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.add(2, 7);
        ll.print();
        ll.removeFirst(5);
        ll.print();
        ll.removeLast(4);
        ll.print();
        System.out.println(ll.itrsearch(7));
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(2);
        ll.print();

    }
}
