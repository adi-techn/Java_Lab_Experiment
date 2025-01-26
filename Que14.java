import java.util.Scanner;
public class Que14{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int bin_no=0,pow=0,m=n;
        while(n>0){
                int rem=n%2;
                bin_no+=(rem*(int)Math.pow(10, pow));
                pow++;
                n/=2;
        }
        StringBuilder hex = new StringBuilder();
        while(m>0){
                int remainder = m%16;
                if (remainder < 10) {
                    hex.insert(0, (char) ('0' + remainder));
                } else {
                    hex.insert(0, (char) ('A' + (remainder - 10)));
                }
                m/=16; 
        }
        System.out.println("The binary representation is:"+bin_no);
        System.out.println("The hexadecimal representation is:"+ hex);
    }
}
