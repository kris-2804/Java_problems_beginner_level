import java.util.Scanner;

public class ArrivalOfTheGeneral {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int [] arr =    
    new int[n];
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    int minpos  =0 , maxpos =0; 
    for(int i = 0 ; i < n ; i++){
        arr[i] = sc.nextInt();
        if(arr[i]> max)  {
            max = arr[i];
            maxpos = i;

        }

        if(arr[i]<= min){
            min = arr[i];
            minpos = i;

        }




    }
 

   int result =  (maxpos + (n-1)-minpos) ;
   result -= maxpos > minpos ? 1 :0;
    System.out.println(result);
}
}