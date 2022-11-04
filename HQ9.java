import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        if(inputString.contains("H")||inputString.contains("Q")||inputString.contains("9")){
  System.out.println("YES");

        }else{
            System.out.println("NO");
        }
    }
    
}
