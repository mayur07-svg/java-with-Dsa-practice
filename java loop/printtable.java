import java.util.Scanner;

class printtable {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        


         // loop use for print table
         for(int i = 1; i <= 10; i++){
            System.out.println(num +"*" +i + ":" +num*i);

         }
         sc.close();
    }
}