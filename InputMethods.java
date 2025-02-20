import java.util.Scanner;
public class InputMethods {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("enter your name:");
     String name=scanner.next();
     scanner.nextLine();
     System.out.println("enter ypur college name");
     String college=scanner.nextLine();
     System.out.println("enter your roll number");
     int rollNumber=scanner.nextInt();
     System.out.println("enter your first year marks");
     float marks= scanner.nextFloat();
     scanner.close();
     System.out.println("-------your details------\n");
     System.out.println("name:"+name);
     System.out.println("\ncollege:"+college);
     System.out.println("\npercentage:"+marks);
     }
 }

            
          