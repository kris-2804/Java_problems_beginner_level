import java.util.*;
      

public class MinimumElement {
     static Scanner sc = new Scanner(System.in);
         public static int readInteger(){
             
             
             int  n =  sc.nextInt();
             
             return   n;
         }
         
         
         
         public static int[] readElements(int n ){
             
             int [] arr = new int[n];
             for(int i = 0 ; i< n ;i++){
                 
                 
                 arr[i] = sc.nextInt();
                 
             
                 
                 
                 }
             
             
             return arr;
             
             
             
             
             
             
             
         }
         
         
         public static int findMin(int[] arr){
             int min = arr[0];
             for(int i = 0 ; i< arr.length ; i++){
                min = min < arr[i] ?  arr[i] : min;
             }
             
             
             return min;
         }
}