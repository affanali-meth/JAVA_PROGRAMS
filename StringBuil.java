import java.util.*;
class StringBuil{
      public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the string");
         String s1=sc.next();
         s1.concat("hey");
        System.out.println("string after concat is "+s1);
        StringBuilder sb=new StringBuilder("hello");
        System.out.println("capacity is "+sb.capacity());
        sb.append("hi");
        System.out.println("string after appending "+sb);
}}