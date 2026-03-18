import  java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;


        do{
            System.out.println("Enter the number either 1 or 0");
             choice = sc.nextInt();

        if (choice == 1){
            System.out.println("Enter your marks : ");
            int marks = sc.nextInt();
            if(marks >= 90){
                System.out.println("This is good");
            }

        else if(marks <= 89&& marks >= 60){
            System.out.println("This is also good");
        }

        else if (marks <= 59 && marks >= 0) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter but our effort does.");
        }

        else{
            System.out.println("This is also");
        }

        }

        } while(choice != 0);



       

    }
    
}






// class loops {
//     public static void main(String[] args) {
//         int i =0;
//         do{
//             System.out.println("hey you");

//             i = i-1;
//         }while (i< 5);

//     }
// } 