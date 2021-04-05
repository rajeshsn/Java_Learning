package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Remove {

    Node head;

    Node last;


    public void insertAtEnd(int data){
        Node new_node = new Node(data);
       // new_node.next=null;

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


    public void removeNodeAtEnd(){

        if(head==null){

            System.out.println("list is empty");
        }else{
            Node temp =head;

            while(temp.next!=null){
                last=temp;
                temp= temp.next;
            }

            last.next=null;

        }

    }

    public void printNode(){

        Node curr_node =head;
if(curr_node!=null) {
    while (curr_node.next != null) {

        System.out.println(curr_node.data);
        curr_node = curr_node.next;
    }

    System.out.println(curr_node.data);

}
    }

    public static void main(String[] args) {

      /*  LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(23);
        li.add(24);
        li.add(66);
        li.add(45);

        Iterator itr = li.listIterator();
while (itr.hasNext()){

    System.out.println(itr.next());
}*/

        Remove rm = new Remove();

        rm.insertAtEnd(45);
        rm.insertAtEnd(90);
        rm.insertAtEnd(78);
        rm.insertAtEnd(43);
        rm.insertAtEnd(11);
        rm.printNode();
        System.out.println("****Deleted at the end of list*******");
        rm.removeNodeAtEnd();
        rm.removeNodeAtEnd();

        rm.printNode();

    }
}
