import java.util.Scanner;

class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String inputString = sc.nextLine(); // ✅ 'sc', not 'scanner'

        // Convert to uppercase to handle both lower & upper cases
        inputString = inputString.toUpperCase();

        // ✅ Use .equals() to compare strings, not '=='
        if (inputString.equals("A") || inputString.equals("E") || 
            inputString.equals("I") || inputString.equals("O") || 
            inputString.equals("U")) {
            System.out.println(inputString + " is a Vowel");
        } else {
            System.out.println(inputString + " is a Consonant");
        }

        sc.close();
    }
}
