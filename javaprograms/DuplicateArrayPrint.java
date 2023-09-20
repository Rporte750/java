import java.util.*;
public class DuplicateArrayPrint 
{
 public static void print(int[] arr)
 {
  System.out.printf(" %d",arr[0]);
  for(int i=0;i<arr.length;i++)
   System.out.printf(", %d", arr[i]);
  System.out.println("");
 }
 public static void print(Object[] arr)
 {
  System.out.print("In Object Array :");
  System.out.printf("%s", arr[0]);
  System.out.println();
  for(int i=1;i<arr.length;i++)
  {
   System.out.print(arr[i]+" ");
  }
 }
 public static void main(String[] args) 
 {
  int[] a1 = {22,55,99};
  print(a1);
  int[] b1 = (int[]) a1.clone();
  print(b1);
  String[] str = {"Rajendra","porte","Bruce", "LEE"};
  print(str);
 }

}