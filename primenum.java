import java.util.*;
public class primenum {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

//  int count = 0;

// for (int i = 1; i <= n; i++) {
//     if (n % i == 0) { 
//         count++; 
//     }
// }

// if (count == 2) {
//     System.out.println("Prime");
// } else {
//     System.out.println("Not Prime");
// }

boolean isprime =true;

if(n <= 1){
    System.out.println(n+"is not a prime number :");
}
else{
    for(int i = 2; i < n; i++){
        if (n % i == 0){
            isprime = false;
            break;
        } 
     } 
    

if(isprime){
    System.out.println(n+" is a prime number");
}
else{
    System.out.println(n+" is not a prime number");
}
        
    }
    
}
 }

