import java.util.Scanner;

public class perfectPermutation {

    public static void main(String ... a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==1){ System.out.println(-1); return;}

        System.out.print("2 1 ");
        for(int i = 3 ; i<=n ; i+=2){
            System.out.print(i+1+" ");
            System.out.print(i+" ");
        }


    }

}
