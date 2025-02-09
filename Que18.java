public class Que18{
     public static void main(String[] args) {
          int[] arr = {1, 2, 3, 2, 4, 1, 5, 3, 2, 4};
          boolean[] visited = new boolean[arr.length];
          System.out.print("Array:: ");
          for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]+" ");
          }
          System.out.println("\nElement : Frequency");
          for (int i = 0; i < arr.length; i++){
               if (visited[i])
                    continue;
               int count = 1;
               for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                         count++;
                         visited[j] = true;
                    }
               }
               System.out.println(arr[i] + " : " + count);
          }
     }
}