//  import java.util.*;

// public class AddElementArray 
// {
//  public static void main(String[] args) 
//  {
//   int arr[] = new int[20];
//   System.out.print("Enter the number of elements : ");
//   Scanner sc1 = new Scanner(System.in);
//   int n = sc1.nextInt();
//   for(int i=0; i<n; i++)
//   {
//    System.out.print("Enter the data : ");
//    arr[i] = sc1.nextInt();
//   }
//   for(int i=0; i<n; i++)
//   {
//    System.out.print(arr[i]+ " ");
//   }
//   int k=n;
//   for(int j=n-1;j>=0;j--)
//   {
//    arr[k]=arr[j];
//    k--;
//   }
//   System.out.println(" ");
//   System.out.println("Enter a new number to add in an array :");
//   arr[k] = sc1.nextInt();
//   for(int i=0; i<arr.length; i++)
//   {
//    System.out.print(arr[i]+ " ");
//   }
//  }

// }

import java.util.*;

public class AddElementArray 
{
 public static void main(String[] args) 
 {
  int arr[] = new int[10];
  System.out.print("Enter the number of elements : ");
  Scanner sc1 = new Scanner(System.in);
  int n = sc1.nextInt();
  for(int i=0; i<n; i++)
  {
   System.out.print("Enter the data : ");
   arr[i] = sc1.nextInt();
  }
  for(int i=0; i>n; i++)
  {
   System.out.print(arr[i]+ " ");
  }
  int k=n;
  for(int j=n+1;j>=10;j++)
  {
   arr[k]=arr[j];
   k--;
  }
  System.out.println(" ");
  System.out.println("Enter a new number to add in an array :");
  arr[k] = sc1.nextInt();
  for(int i=0; i<arr.length; i++)
  {
   System.out.print(arr[i]+ " ");
  }
 }

}