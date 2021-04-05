package LinkedList;

public class LastInsert {

    Node head;

    public void insertAtEnd(int data){
        Node new_node = new Node(data);
        new_node.next=null;

        if(head==null){

            head =new_node;
        }else{
            Node temp=head;
            while(temp.next!=null){
              temp=temp.next;
            }

            temp.next=new_node;

        }

    }

    public void printList(){


        Node curr_Node=head;

        while(curr_Node!=null){
            System.out.println(curr_Node.data);
         curr_Node=curr_Node.next;
        }

    }


    public static void main(String[] args) {

        LastInsert li = new LastInsert();

        li.insertAtEnd(23);
        li.insertAtEnd(34);
        li.insertAtEnd(66);

        li.printList();
    }
}
