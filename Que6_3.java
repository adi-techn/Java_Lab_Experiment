import java.util.*;
public class Que6_3{
     public static void main(String[] args) {
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter number of rows::");
          n=sc.nextInt();
          int a=1;
          for(int i=0;i<n;i++){
               for(int j=0;j<=i;j++){
                    System.out.print(a);
               }
               a++;
               System.out.println();
          }
          sc.close();
     }
}
