import java.util.*;
public class Que9{
     public static void main(String[] args) {
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter the number::");
          n=sc.nextInt();
          float sum=0;
          float a=1;
          for(int i=0;i<n;i++){
               sum+=a;
               a=(a/2);
          }
          System.out.println("Sum::"+sum);
          sc.close();
     }
}
