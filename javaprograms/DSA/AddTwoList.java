import java.util.*;
class AddTwoList
{
    public static void main(String[] args)
    {
        ArrayList<String> list1= new ArrayList<String>();
        list1.add("Rajendra porte");
        list1.add("nandan");
        list1.add("Shivam");
        System.out.println("name of the list :"+list1);

        ArrayList<String> list2= new ArrayList<String>();
        list2.add("67348787");
        list2.add("67456987");
        list2.add("45687482");
        System.out.println("RollNo of the list :"+list2);
        list1.addAll(list2);
        System.out.println("After adding the list:"+list1);

    }
}

