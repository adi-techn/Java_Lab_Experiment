public class lab_exercise{
     public static void sort(int arr[]){
         for(int i=0;i<arr.length-1;i++){
             for(int j=i+1;j<arr.length;j++){
                 if(arr[i]>arr[j]){
                     int temp=arr[j];
                     arr[j]=arr[i];
                     arr[i]=temp;
                 }
             }
         }
         for(int i=0;i<arr.length;i++){
             System.out.print(arr[i]+" ");
         }
         System.out.println();
     }
     public static int linearSearch(int arr[],int t){
         for(int i=0;i<arr.length;i++){
             if(t==arr[i]){
                 return i;
             }
         }
         return -1;
     }
     public static void restArray(int arr[],int i){
         int arr1[]=new int[arr.length-i];
         int k=0;
         for(int j=i;j<arr.length;j++){
             arr1[k++]=arr[j];
         }
         for(int j=0;j<arr1.length;j++){
             System.out.print(arr1[j]+" ");
         }
         System.out.println();
     }
     public static boolean isEqual(int arr[],int arr1[]){
         boolean r=false;
         int c=0;
         if(arr.length==arr1.length){
             for(int i=0;i<arr.length;i++){
                 if(arr[i]==arr1[i]){
                     c++;
                 }
             }
             if(c==arr.length){
                 r=true;
             }
         }
         return r;
     }
     public static void main(String[] args) {
         int arr[]={4,2,5,7,1,13,17};
         int arr1[]={4,2,5,7,1,13,17};
         System.out.print(isEqual(arr, arr1));
         System.out.println();
         restArray(arr, 3);
         sort(arr);
         System.out.println("Max Number::"+arr[arr.length-1]);
         System.out.println("Min Number::"+arr[0]);
         System.out.println("Index position::"+linearSearch(arr, 5));
     }
 }
 