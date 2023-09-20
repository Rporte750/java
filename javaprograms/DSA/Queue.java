import java.util.*;
class Queue
{
    public static void main(String[] args) 
    {
        PriorityQueue<String> que= new PriorityQueue<>();
        que.add("Sudarshan");
        que.add("Rajendra");
        que.add("Shiva");
        que.add("Abhishek");
        System.out.println(que);
    }
}