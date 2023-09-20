// // // // // public class LargestInArrayExample{  
// // // // //     public static int getLargest(int[] a, int total){  
// // // // //     int temp;  
// // // // //     for (int i = 0; i < total; i++)   
// // // // //             {  
// // // // //                 for (int j = i + 1; j < total; j++)   
// // // // //                 {  
// // // // //                     if (a[i] > a[j])   
// // // // //                     {  
// // // // //                         temp = a[i];  
// // // // //                         a[i] = a[j];  
// // // // //                         a[j] = temp;  
// // // // //                     }  
// // // // //                 }  
// // // // //             }  
// // // // //            return a[total-1];  
// // // // //     }  
// // // // //     public static void main(String args[]){  
// // // // //     int a[]={1,2,5,6,3,2};  
// // // // //     int b[]={44,66,99,77,33,22,55};  
// // // // //     System.out.println("Largest: "+getLargest(a,6));  
// // // // //     System.out.println("Largest: "+getLargest(b,7));  
// // // // //     }}  

// // // // package com.test.kashaf;
// // // // import java.util.*;
// // // // public class SecondLargestNumber 
// // // // {
// // // //  public static void main(String[] args) 
// // // //  {
// // // //   int arr[] = {2,7,3,29,23,17,11};
// // // //   int max=0;
// // // //   int secondmax=0;
// // // //   int thirdmax=0;
// // // //   for(int i=0;i<arr.length;i++)
// // // //    if(arr[i]>max)
// // // //     max = arr[i];
// // // //   for(int i=0;i<arr.length;i++)
// // // //    if(arr[i] >secondmax && arr[i]<max)
// // // //     secondmax=arr[i];
// // // //   for(int i=0;i<arr.length;i++)
// // // //    if(arr[i] >thirdmax && arr[i]<seco\|ndmax)
    
// // // //     thirdmax=arr[i];
// // // //   System.out.println("Second Max : "+secondmax);
// // // //   System.out.println("Third Max : "+thirdmax);
  
  

// // // //  }

// // // // }

// // // package rungta.dsa.programs;
// // // import java.util.*;
// // // public class ArrayReverse 
// // // {
// // //  static int n;   // size of array
// // //  public static void main(String[] args) 
// // //  {
// // //   System.out.println("Enter any number : ");
// // //   Scanner sc1 = new Scanner(System.in);
// // //   n = sc1.nextInt();
// // //   int arr[] = new int[n];
// // //   for(int i=0; i<arr.length;i++)
// // //   {
// // //    System.out.print("Enter the data  : ");
// // //    arr[i]=sc1.nextInt();
// // //   }
// // //   System.out.println("");
// // //   for(int i=0; i<arr.length;i++)
// // //   {
// // //    System.out.print(arr[i]+ " ");
// // //   }
// // //   int j=arr.length-1;
// // //   int temp = 0;
// // //   for(int i=0;i<j; i++,j--)
// // //   {
// // //    temp= arr[i];
// // //    arr[i] = arr[j];
// // //    arr[j] = temp;
// // //   }
// // //   System.out.println("");
// // //   for(int i=0; i<arr.length;i++)
// // //   {
// // //    System.out.print(arr[i]+ " ");
// // //   }
// // //  }

// // // }

// // class MakeString 
// // {
// // public static void main(String args[ ]) {
// //  char arr[] ={'J','a','v','a',’ ‘,’j’,’2’,’e’,’e’};
// //  String s1 = new String(arr);
// //  String s2 = new String(s1);
// //  System.out.println(s1);
// // System.out.println(s2); 
// // String  s3 = new String(arr);
// // System.out.println(s1.length());
// // String s4 = new String(arr);
// // String s5 = "abc"; // use string literal
// // System.out.println("abc".length());
// // //String Concatenation
// // int age = 20;
// // String s6 = "He is " + age + " years old.";
// // System.out.println(s6);
// // //Using concatenation to prevent long lines.
// // String  s7 = “ An apple a day " +
// //   “  keeps the doctor away " +
// //   “ if the doctor is good looking " +
// //   “ keep the apple away.";
// // System.out.println( s7 );
// //   }
// // }

package rungta.dsa.programs;

public class StringDemo2 
{
 public static void main(String args[]) 
 {
  String str1 = "JAVA";
  String str2 = "J2EE";
  String str3 = str1;
  String str4 = "java";
  System.out.println(str1.length());
  System.out.println(str1.charAt(3));
  if (str1.equals(str2))
   System.out.println("OK fine");
  else
   System.out.println("NOT fine");
  if(str1.equals(str3))
   System.out.println("Again OK");
  else
   System.out.println("Not OK");
  System.out.println(str1.equals(str2));
  System.out.println(str1.equals(str3));
  System.out.println(str1.equals(str4));
  System.out.println("");
  System.out.print(str1.equalsIgnoreCase(str4));   
  }
 }