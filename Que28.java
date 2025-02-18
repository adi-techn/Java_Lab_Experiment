import java.util.Scanner;

class Multiplier{
    static int multiply(int a, int b) {
        return a*b;
    }
    static int multiply(int a, int b, int c) {
        return a*b*c;
    }
    static int multiply() {
        Scanner sc=new Scanner(System.in);
        int result=1;
        while(true){
            System.out.print("Enter the number (Press * to stop):");
            String num=sc.nextLine();
            if(num.equals("*")){
                break;
            }
            result*=Integer.valueOf(num);
        }
        return result;
    }
}
public class Que28{
    public static void main(String[] args) {
        System.out.println("Multiply 2 numbers: " + Multiplier.multiply(2, 3));
        System.out.println("Multiply 3 numbers: " + Multiplier.multiply(2, 3, 4));
        
        System.out.println("Multiply more numbers: " + Multiplier.multiply());
    }
}