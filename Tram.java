import java.util.Scanner;

public class Tram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int passangers = 0;
        int  maxseats = 0;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();

            }

        }

        for (int i = 0; i < arr.length; i++) {
            
            if (i == 0) {
               
                maxseats = arr[i][1];
                passangers  = maxseats> passangers ? maxseats : passangers;

            } else {
                maxseats -= arr[i][0];

                maxseats += arr[i][1];
                passangers  = maxseats> passangers ? maxseats : passangers;

            }
        }



        System.out.println(passangers);

    }

}
