class Number{
     int a,b;
     void sum(){
         System.out.println("a+b:"+(a+b));
     }
     void sub(){
         System.out.println("a-b:"+(a-b));
     }
     void prod(){
         System.out.println("a*b:"+(a*b));
     }
     void divide(){
         System.out.println("a/b:"+(a/b));
     }
 }
 public class Que4{
     public static void main(String[] args) {
         Number calc=new Number();
         calc.a=5;
         calc.b=10;
         calc.sum();calc.sub();calc.prod();calc.divide();
     }
 }
 
 
