public class Que13{
     public static int Sum(int num){
         int sum=0;
         while(num>0){
             int rem=num%10;
             sum+=rem;
             num/=10;
         }
         return sum;
     }
     public static boolean isPrime(int num){
         int count=0;
         for(int i=1;i<=num;i++){
             if(num%i==0){
                 count++;
             }
         }
         if(count==2){
             return true;
         }
         return false;
     }
     public static boolean isArmstrong(int num){
         int sum=0;
         int m=num;
         int digits = Integer.toString(num).length();
         while(num>0){
             int rem=num%10;
             sum +=Math.pow(rem,digits);
             num/=10;
         }
         if(sum==m){
             return true;
         }
         return false;
     }
     public static boolean isPerfect(int num){
         int sum=0;
         for(int i=1;i<num;i++){
             if(num%i==0){
                 sum+=i;
             }
         }
         if(sum==num){
             return true;
         }
         return false;
     }
     public static void main(String[] args) {
         int num=3;
         System.out.println("Sum is:"+Sum(num));
         System.out.println("Is prime:"+isPrime(num));
         System.out.println("Is armstrong:"+isArmstrong(num));
         System.out.println("Is perfect:"+isPerfect(num));
     }
 }
 
 
