import java.util.Scanner;


public class Walkboter {
   public static  Scanner sc = new Scanner(System.in);

    public static void solve(int T) {

        int M =  sc.nextInt();
        int N = sc.nextInt();
        int P = sc.nextInt();

        int arr[][] = new int[M][N];

        int steps = 0;

        for (int i = 0; i < M; i++) {

        for (int j = 0; j < N; j++) {

        arr[i][j] = sc.nextInt();

        }
        }

        for (int i = 0; i < N; i++) {
            int tempmax = 0;

            for (int j = 0; j < M; j++) {
                if (arr[j][i] > arr[P - 1][i]) {
                    tempmax = arr[j][i];

                }

                if (arr[j][i] > tempmax) {
                    tempmax = arr[j][i];

                }

            }

            steps += tempmax - arr[P - 1][i];

        }
        System.out.println("Case #"+T+": "+steps);
    }

    public static void main(String[] args) {

        int T = sc.nextInt();
        int t = T;
        T = 1;

        while (t> 0) {
            solve(T);
          

            T++;
            t--;

        }

    }
}
