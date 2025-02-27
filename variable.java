class variable 
{
         static int m=100;
         void add()
         {
             int n=90;
             System.out.println("value of n"+n);
         }
   public static void main(String[] args)
   {
           int data=50;
           System.out.println("data value is"+data);
           System.out.println("value of m"+m);
           variable v1= new variable();
           v1.add();
} 
}