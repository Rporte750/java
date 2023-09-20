import java.util.*;
public class MultiLevelInheritance
{
    public static void main(String[] args)

{
    void getStudentDetails(System name, long rollnumber)

    {
        System.out.print("getStudentDetails");
    }
}
class student extends college{
    void getExamDetails(String  Subject)
    {
        System.out.print("getExamDetails");
    }
}
class Exam extends Student 
{
    college c1 = new college();
    Student s2 = new Student();
    Exam E1 = new Exam(); 
}
