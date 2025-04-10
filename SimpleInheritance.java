class Employee{
       String name;
       double salary;
       void showDetails(){
             System.out.println("name: "+name);
             System.out.println("salary: "+salary);
       }
}
class Developer extends Employee{
        String prgLang;
        void showDeveloperInfo(){
                System.out.println(prgLang+" developer");
     }
}
class SimpleInheritance{
         public static void main(String[] args){
              Developer dev=new Developer();
              dev.name="Amy";
              dev.salary=80000;
              dev.prgLang="Python";
              dev.showDetails();
              dev.showDeveloperInfo();
      }
}