import java.util.*;
public class Que6_1{
     public static void main(String[] args) {
          int n;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter number of rows::");
          n=sc.nextInt();
          for(int i=0;i<=n;i++){
               System.out.print("*");
               if(i%2!=0){
                    for(int j=1;j<i;j++){
                         System.out.print("*");
                    }
               }
               System.out.println();
          }
          sc.close();
     }
}