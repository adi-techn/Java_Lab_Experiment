public class Que21 {
     public static void main(String[] args) {
          int[] arr = {2,5,4,1};
          System.out.print("Array::");
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
          }
          System.out.println();
          int min1 = Integer.MAX_VALUE;
          int min2 = Integer.MAX_VALUE;
          for (int num : arr) {
               if (num < min1) {
                    min2 = min1;
                    min1 = num;
               } 
               else if (num < min2){
                    min2 = min2;
                    min2 = num;
               }
          }
          System.out.println("Product of Two lowest numbers in array: " + (min1*min2));
     }
}
