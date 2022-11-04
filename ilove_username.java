import java.util.Scanner;

public class ilove_username {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in)    ;
    int n = sc.nextInt();
   int max  , min ;
   int counter  = 0 ;

   int [] arr =  new int[n];


   arr[0] = sc.nextInt();
   max = arr[0];
   min = arr[0];
   



    for(int i = 1 ; i < n; i++){

       
     arr[i]  = sc.nextInt();
     if(arr[i] > max){
        max = arr[i] ;
        ++counter;

     }


     if(arr[i]< min){
        min = arr[i];
      ++counter;

     }

        
    }


    System.out.println(counter);
    }

}
