import java.util.Scanner;

public class petyaAndStrings {
//     aslkjlkasdd
// asdlkjdajwi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "aslkjlkasdd";
        String str2 = 
                       "asdlkjdajwi";
        int sum = 0;
        int sum2 = 0;

        str = str.toUpperCase();
        str2 = str2.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            sum += (int)str.charAt(i);
            sum2 += (int) str2.charAt(i);
       

            System.out.println(str.charAt(i)+"             "+str2.charAt(i));
            

            System.out.println(sum + "           "+ sum2);

        }

        System.out.println(sum == sum2 ? 0 : sum > sum2 ? 1 : -1);

    }
}
