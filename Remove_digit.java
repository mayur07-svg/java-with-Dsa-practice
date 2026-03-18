import java.util.*;

class Remove_digit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num :");
        int num = sc.nextInt();
        
        num = num / 10; 
        
        System.out.println(""+num); // remove last digit and print remaining number

    }
}




