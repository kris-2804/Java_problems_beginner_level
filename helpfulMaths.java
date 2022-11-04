import java.util.Scanner;

public class helpfulMaths {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        if(inputString.length() ==1){
            System.out.println( inputString);
            return;


        }

        String [ ] arr = inputString.split("\\+");
        for(int i = 0 ; i< arr.length-1 ; i++){
            if(Integer.parseInt(arr[i])>Integer.parseInt(arr[i+1])){
                String temp =  arr[i];

                arr[i] = arr[i+1];
                arr[i+1] =  temp;


              i= -1;

            }
        }



        System.out.println(String.join("+", arr));

         sc.close();
        
    }
}
