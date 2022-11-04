import java.util.Scanner;

public class boyOrGirl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        
        int sum = 0;

        int[] arr = new int[100];
        for (int i = 0; i < str.length(); i++) {
            arr[ str.charAt(i) -97]++;

        }

       

        for (int i = 0; i < 100; i++) {
          if(arr[i]>0){
            sum++;
          }
        }

        if(sum%2==0){
            System.out.println("CHAT WITH HER!");
        }  else{
            System.out.println("IGNORE HIM!");
        }
    }
}
