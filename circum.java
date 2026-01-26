
import java.util.Scanner;


class circum{

    public static double  circle(float r) {
        return  2*13.4*r;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        float r = sc.nextFloat();


        double result = circle(r);
        System.out.println("result : "+result);


        

        sc.close();
    }

}