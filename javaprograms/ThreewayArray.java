import java.util.*;

public class ThreewayArray
{
    public static void main (String args[]);
    int arr1[] = new int [6];
    int arr2[] = {4,6,8,2,1};
    int arr3[] = new int [7];
    Scanner sc1 = new Scanner(System.in);
    System.out.println(" Enter the size of array =");
    int size = sc1.nextInt();
    int arr3[] = new int [size];
    arr1[0] = 34;
    arr1[1] = 55;
    arr1[2] = 98;
    arr1[3] = 100;
    arr1[4] = 23;
    for (int i=0; i<arr3.length; i++) 
    {
        System.out.println("enter the data =");
        arr3[i] = sc1.nextIn();
    }
    {
        System.out.println("arr1.length");
        System.out.println("arr2.length");
        System.out.println("arr3.length");
        for (int i=0; i<arr3.length;i++)
        {
            System.out.println(arr3[i]+"  ");
           
        }

    }
  
}
 


