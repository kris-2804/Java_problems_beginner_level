import java.util.Scanner;

public class ultrafastMaths {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String result = "";


        for( int i = 0 ; i < a.length(); i++){
            if(a.charAt(i)!=b.charAt(i)){
                result+="1";
            }else{
                result+="0";
                

            }
        }


        System.out.println(result);
    }

}
