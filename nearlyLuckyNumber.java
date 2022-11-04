import java.util.Scanner;
 
public class nearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        sc.nextLine();

        String number = sc.next();
 
        int counter = 0;
 
        for (int i = 0; i < len; i++) {
            if (i != len- 1 && number.charAt(i) == number.charAt(i + 1)){counter++;}
              
 
        }
 
        System.out.println(counter);
 
    }
 
}