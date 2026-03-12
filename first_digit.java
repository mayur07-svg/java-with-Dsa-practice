
import java.util.Scanner;


class first_digit{

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter number");
        int num = sc.nextInt();
     


        while(num >= 10){
            num = num / 10;
        }

        System.out.println("first Digit :"+num);





        
        
    }
}