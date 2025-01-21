import java.util.*;
public class Que8{
     public static void main(String[] args) {
          int num;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number::");
          num=sc.nextInt();
          int odd=0,even=0;
          while(num!=0){
               int r=num%10;
               if(r%2==0){
                    even+=r;
               }
               else{
                    odd+=r;
               }
               num/=10;
          }
          System.out.println("Even Sum::"+even);
          System.out.println("Odd Sum::"+odd);
          sc.close();
     }
}
