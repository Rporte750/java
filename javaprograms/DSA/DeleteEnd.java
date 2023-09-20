import java.util.Scanner;

public class DeleteEnd
{
    public static class Node
    {
        int data;
        Node next;

        Node ( int data )
        {
            this.data = data;
            this.next = null;
        }
    }

    public static class Head
    {
        Node head;
        Node tail;

        public void create()
        {
            Scanner sc = new Scanner ( System.in );
            int choice;
            int data;

            do
            {
                System.out.println ( "Enter a number" );
                data = sc.nextInt();

                Node n = new Node ( data );

                if ( head == null )
                {
                    head = n;
                    tail = n;
                }
                else
                {
                    tail.next = n;
                    tail = n;
                }

                System.out.println ( "Enter 1 to continue, enter any number to quit" );
                choice = sc.nextInt();
            }
            while ( choice == 1 );
        }

        public void display()
        {
            Node current = head;

            if ( head == null )
                System.out.println ( "Linked list does not exist" );

            while ( current != null )
            {
                System.out.print ( current.data );
                current = current.next;
            }

            System.out.println();
        }

        public void deleteEnd()
        {
            if ( head == null )
                System.out.println ( "List is empty" );
            else
            {
                if ( head != tail )
                {
                    Node current = head;

                    while ( current.next != tail )
                        current = current.next;

                    tail = current;
                    tail.next = null;
                }
                else
                {
                    head = tail = null;     //head = null;
                    //tail = null;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Head h= new Head();
        h.create();
        h.display();
        h.deleteEnd();
        h.display();
    }
} 