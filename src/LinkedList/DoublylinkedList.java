package LinkedList;

public class DoublylinkedList {

    Node head;


    public void insertAtEndOfDDL(int data){

        Node new_node = new Node(data);

        if(head==null){

            head=new_node;
           new_node.prev=null;
           head.next=null;
        }else{
            Node temp = head;
            while(temp.next!=null){
              temp=temp.next;
            }
            temp.next=new_node;
            new_node.prev=temp;
        }
    }

    public void printDLL(){

        Node curr_node = head;

        while(curr_node!=null){

            System.out.println(curr_node.data);
            curr_node=curr_node.next;

        }
    }

    public static void main(String[] args) {

        DoublylinkedList dll = new DoublylinkedList();
        dll.insertAtEndOfDDL(23);
        dll.insertAtEndOfDDL(42);
        dll.insertAtEndOfDDL(67);
        dll.printDLL();
    }
}
