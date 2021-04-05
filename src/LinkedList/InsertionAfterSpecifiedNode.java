package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class InsertionAfterSpecifiedNode {

    Node head;
int length;

    public void insertion_after_specified_Node(int data, int position){
        //Node new_node = new Node(data);
        //new_node.next=null;
        if(position<0){
            position=0;

        }
        if(head==null){
            head= new Node(data);

        }else if(position==0){
        Node temp = new Node(data);
        temp.next=head;
        head=temp;

        }else {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.next;
            }
            Node new_node = new Node(data);
           /* new_node.next= temp.next;
            temp.next = new_node;*/
           new_node.next=temp.next;
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

       InsertionAfterSpecifiedNode li= new InsertionAfterSpecifiedNode();
       li.insertion_after_specified_Node(23,1);
      //  li.insertion_after_specified_Node(24,2);
        li.printList();

    }
}
