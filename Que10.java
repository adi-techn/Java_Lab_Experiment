import java.util.*;
public class Que10{
     public static void main(String[] args) {
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number::");
          n=sc.nextInt();
          int sum=0,m=n;
          while (n!=0) {
               int r=n%10;
               sum+=r;
               n/=10;
          }
          if(m%sum==0){
               System.out.println("Yes");
          }
          else{
               System.out.println("No");
          }
          sc.close();
     }
}
