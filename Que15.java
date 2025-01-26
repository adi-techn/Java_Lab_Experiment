public class Que15{
     static int n1=0,n2=1,n3=0;
     static void fib_rec(int count){
         if(count>0){
             n1=n2;
             n2=n3;
             n3=n1+n2;
             System.out.print(" "+n3);
             fib_rec(count-1);
         }
     }
     public static void fib(int count){
         int m1=0,m2=1,m3=1;
         System.out.print("Fibonacci Series::"+m1+" "+m2);
         for(int i=2;i<count;i++){
             m1=m2;
             m2=m3;
             m3=m1+m2;
             System.out.print(" "+m3+" ");
         }
     }
     public static void main(String[] args) {
         int count=10;
         System.out.print("Fib Series with recursion:: "+n1+" "+n2);
         fib_rec(count-2);
         System.out.println();
         fib(count-2);
     }
 }