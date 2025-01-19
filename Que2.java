public class Que2{
     public static void main(String[] args) {
         int a=5,b=10;
         //Swap without using 3rd variable
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("a: "+a);
         System.out.println("b: "+b);
         //Swap using 3rd variable
         int c=50,d=100,temp=0;
         temp=c;
         c=d;
         d=temp;
         System.out.println("a: "+c);
         System.out.println("b: "+d);
     }
 }
 
 