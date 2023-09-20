import java.util.Scanner;
public class Singlylinkedlist {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static class Head {
        Node head = null;
        Node tail = null;

        public void main() {

            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Enter the data: ");
                int a = sc.nextInt();
                System.out.println("Enter 1 to continue: ");
                n = sc.nextInt();
                Node obj = new Node(a);
                if (head == null) {
                    head = obj;
                    tail = obj;
                } else {
                    tail.next = obj;
                    tail = obj;
                }
            } while (n == 1);
        }

        public void display() {
            Node current = head;
            if (head == null) {
                System.out.println("program terminate");
            }
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }

        public void insertionAt_Beg() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the data: ");
            int a = sc.nextInt();
            Node newNode = new Node(a);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head.next;
                head.next = newNode;
            }
        }
    }

    public static void main(String[] args){
        Head h = new Head();
        h.main();
        h.display();
        h.insertionAt_Beg();
        h.display();

}
}