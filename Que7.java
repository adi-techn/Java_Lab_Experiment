import java.util.*;
public class Que7{
     public static void main(String[] args) {
          int principle_amount,rate,time;
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter principle amount::");
          principle_amount=sc.nextInt();
          System.out.print("Enter Interest rate::");
          rate=sc.nextInt();
          System.out.print("Enter time(in years)::");
          time=sc.nextInt();
          int acc_interest,final_amount;
          acc_interest=((principle_amount*rate)/100)*time;
          System.out.println("Accured Interest::"+acc_interest);
          final_amount=(principle_amount+acc_interest);
          System.out.println("Final Amount::"+final_amount);
          sc.close();
     }
}
