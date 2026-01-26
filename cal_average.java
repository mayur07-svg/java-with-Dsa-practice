
import java.util.Scanner;



class cal_average{

    public static double  average(double num1,double  num2,double  num3){
        return (num1 + num2 + num3 ) / 3 ;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        double num1 = sc.nextInt();
        System.out.println("enter the number :");
        double num2 = sc.nextInt();
        System.out.println("enter the number :");
        double num3 = sc.nextInt();


        double result = average(num1, num2, num3);

        System.out.println("The Average : " + result);

        sc.close();



    }
}