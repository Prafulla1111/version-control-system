class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkList{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next =  head;
        head = newNode;
    }
}

public void display(){
    Node current = head;
    while(current!=null){
        System.out.println(current.data+"");
        current=current.next;
    }
    System.out.print();
}

public public static void main(String args[]) {
LinkList list = new LinkList();
list.insert(1);
list.insert(2);
list.insert(3);
list.insert(4);

System.out.println("LinkList:");
list.display();

}    
}