import java.util.*;
class Exception
{
    public static void main(String[] args)
{
void divide(int a, int b);
{
    int result;
    try {
        result=a/b;
    }
    catch(ArithmeticException ex)
    {
        System.out.print("ex :");
    }
    System.out.println("result");
}
}