import java.util.Scanner;


class greatnum {
    public static void  grether(int num1,int num2,int num3){

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater than the other numbers");
        } 
        else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater than the other numbers");
        } 
        else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 + " is greater than the other numbers");
        } 
        else {
            System.out.println("All numbers are equal or there is a tie");
        }
    

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();


        grether(num1, num2, num3);



        sc.close();
    }
    
}






// USE return code 

// public static int grether(int num1, int num2, int num3) {

//     if (num1 >= num2 && num1 >= num3) {
//         return num1;
//     } else if (num2 >= num1 && num2 >= num3) {
//         return num2;
//     } else {
//         return num3;
//     }
// }

