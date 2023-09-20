import java.util.Scanner;
 class circular
 {
    public class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;

        }
    }
    public Node head =null;
    public Node tail =null;

    public void add(int data){
        Node newNode= new Node (data);
        if(head==null)
        {
            head= newNode;
            tail= newNode;
            newNode.next=head;

        }
        else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;

        }
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("list is empty");

        }
        else{
            System.out.println("node of the circular");
            
        }
    }

 }