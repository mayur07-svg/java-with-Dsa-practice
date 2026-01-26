import java.util.Scanner;

class leapyears{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the years");
        int years = sc.nextInt();

        if(years % 4 == 0 && years % 100 != 0){
            System.out.println(years +"leap years");
        }
        else if(years % 400 == 0){
            System.out.println(years+ "leap years");
        }
        else{
            System.out.println(years+"not leap years");
        }
        sc.close();
    }
}