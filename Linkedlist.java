class LinkedList {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        while(i<index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;


    }

    public int removeFirst(){
        size--;
        if (head == null) {
            System.out.print("LL is empty");
            return 0;
        }else if(head.next==null){
            int val =head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast(){
        Node prev = head;
        if (size == 0) {
            System.out.print("LL is empty");
            return 0;
        }else if(size==1){
            int val =head.data;
            head = tail = null;
            return val;
        }
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data ;
        tail = prev;
        tail.next = null;
        return val;
    } 

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.print("LL is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addLast(4);
        ll.addFirst(1);
        ll.addMiddle(2,3);
        ll.addLast(5);
        ll.print();
    }
}
