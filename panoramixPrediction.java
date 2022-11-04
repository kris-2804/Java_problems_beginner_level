import java.util.Scanner;

public class panoramixPrediction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt()    ;
        int b = sc.nextInt();
        if(!isPrime(b)){
        System.out.println("NO");
        return;
        }else{


            for (int i = a + 1; i < b; i++) {
            
                if(isPrime(i)){
                    System.out.println("NO");
                    return;
                }
               
            
               }
    
            
    
           
        }

      
        System.out.println("YES");
        

       

    }


    public static boolean isPrime(int number){

        int counter = 0;

        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                counter++;
            }

        }


        return counter == 0 ;

    }

}
