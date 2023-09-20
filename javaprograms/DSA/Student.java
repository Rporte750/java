import java.util.*;
class Student
{
    public static void main(String [] args)
    {
        ArrayList<String>Student = new ArrayList<>();
        Student.add("Rajendra Porte ");
        Student.add("Nandan");
        System.out.println(Student);
        Iterator <String> itr= Student.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
