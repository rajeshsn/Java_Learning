package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class InsertAtBegin {


    Node head;


    public void insertAtBegin(int data) {

    Node new_node = new Node(data);
        new_node.prev=null;
    if(head==null) {
        head = new_node;
    }else{
        Node temp =head;
        while(temp.prev!=null){
            temp=temp.prev;
        }
       temp.prev=new_node;
    }

}

public void printElement(){

Node current_node=head;

while(current_node!=null){

    System.out.println(current_node.data);
    current_node=current_node.prev;
}
}

    public static void main(String[] args) {
       InsertAtBegin inab =new InsertAtBegin();

       inab.insertAtBegin(34);
       inab.insertAtBegin(23);
       inab.insertAtBegin(65);

       inab.printElement();

    }

}
