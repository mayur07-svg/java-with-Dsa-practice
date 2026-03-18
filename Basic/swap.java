import java.util.Scanner;

class swap {

    static void swapnum() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number num :");
        int num = sc.nextInt();

        System.out.println("Enter the number num2 :");
        int num2  = sc.nextInt();

        System.out.println("Before value Num :"+num);
        System.out.println("Before value Num2 :"+num2);

        int temp = num;
        num = num2;
        num2 = temp;

        System.out.println("After value Num :"+num);
        System.out.println("After value Num2 :"+num2);

        sc.close();
    }

    public static void main(String[] args) {
        swapnum();
    }
}