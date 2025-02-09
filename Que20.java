public class Que20{
     public static void main(String[] args){
          int[] arr = {1,1,0,2,4,7,7,4,5,0,8,0};
          int nonZeroIndex = 0;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] != 0) {
               arr[nonZeroIndex] = arr[i];
               nonZeroIndex++;
               }
          }    
          while (nonZeroIndex < arr.length) {
               arr[nonZeroIndex] = 0;
               nonZeroIndex++;
          }
          System.out.print("Array after moving zeros to the end: ");
          for (int num : arr){
               System.out.print(num + " ");
          }
     }
}