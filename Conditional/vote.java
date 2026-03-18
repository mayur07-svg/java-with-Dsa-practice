import java.util.Scanner;



class vote{
    public static void vote_eligible(int age){

         if(age <= 17){
            System.out.println("Not Eligible for vote");
        }

        else{
            System.out.println("You are Eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        vote_eligible(age);

        sc.close();
    }

}