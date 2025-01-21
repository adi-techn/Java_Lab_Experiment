
import java.util.*;
public class Que11{
     public static void main(String[] args) {
          int x,y;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter x::");
          x=sc.nextInt();
          System.out.print("Enter y::");
          y=sc.nextInt();
          if(x>y || x<0||y<0){
               System.out.print("Invalid input...Enter x & y again::");
               x=sc.nextInt();
               y=sc.nextInt();
          }
          boolean a=true;
          for(int i=x;i<=y;i++){
               a=true;
               for(int j=2;j<i;j++){
                    if(i%j==0){
                         a=false;
                         break;
                    }
               }
               if(a==true){
                    System.out.print(i+" ");
               }
          }
          sc.close();
     }
}