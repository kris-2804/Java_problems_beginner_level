import java.util.Scanner;

public class cupBoards { 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr [][] = new int[n][2];
     


    int right = 0 ;
    int left = 0;


    for(int i = 0 ; i < n ; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();

            left+= arr[i][0];
            right += arr[i][1];
    

    }

    
    left = (left <=(n/2))? left : n-left;
    right = ( right <= (n/2) )? right : n-right;    

    
    System.out.println(right+left);


    }
    
}
