import java.util.Scanner;

public class softDrinnking {  
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np= sc.nextInt();
        
    int  totalMililiters = (k*l)/nl;
    int totalLimes = c*d;
    int salt = p/np;



    int result = totalLimes < totalMililiters && totalLimes < salt ? totalLimes : totalMililiters < salt ? totalMililiters : salt ;



    System.out.println(result/n);

       
    }
    
}
