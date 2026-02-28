import java.util.*;

class  Reverse_Num{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber :");
        int num = sc.nextInt();
        int reverse = 0;
        int digit;

        while(num > 0){
            digit = num % 10;  // Get Remender as last digit
            reverse = reverse * 10 + digit;
            num = num / 10;   //Remove last digit
        }


        System.out.println(reverse);




    }
}