import java.util.Scanner;
public class horshoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int arr[] =  new int[4];

        outer: for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();

            for (int j = i; j >= 0; j--) {
                if (i != j && arr[i] == arr[j]) {
                    counter++;
                    continue outer;

                }

            }
        }
        
        System.out.println(counter);
    }
}
