import java.io.Console;
class ConsoleExam{
   public static void main(String[] args){
   System.out.println("using console");
   Console con=System.console();
   if(con!=null){
           con.printf("enter your name");
           String name=con.readLine();
           con.printf("hello,%s!%n",name);
  }else{
          System.out.println("console not available");
    }
}
}
  