import java.util.Scanner;

public class amusingJoke {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        int disamilrity  =0; 
        int [] properarray = new int[100];
        int [] resultarray = new int[100];
  int counter = 0;


        for(int i = 0 ; i < str1.length(); i++){
            properarray[str1.charAt(i)-65]++;

        }
        for(int i = 0 ; i < str2.length(); i++){
            properarray[str2.charAt(i)-65]++;



        }


        for(int i = 0 ; i< str3.length() ; i++){
            resultarray[str3.charAt(i)-65]++;

        }


        for(int i = 0 ; i< 100 ; i++){
            if(resultarray[i]!=properarray[i]) counter++;
        }


         System.out.println(counter==0 ? "YES" : "NO");
    }
    
}
