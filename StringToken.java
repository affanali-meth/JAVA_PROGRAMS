import java.util.StringTokenizer;
class StringToken{
     public static void main(String[] args) {
           StringTokenizer st = new StringTokenizer("this statement is passed directly inside the class",",");
           System.out.println("tokens extracted from  the string using StringTokenizer");
           while(st.hasMoreTokens()){
              System.out.println(st.nextToken());
}
}
}