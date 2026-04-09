import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Security Module - Password Validator ===\n");
        System.out.print("Create Password: ");
        String password = scanner.nextLine();

        if(isValid((password))){
            System.out.println("Success: Password is valid");
        }
        else {
            System.out.println("Failed: Password is invalid");
        }

    }
    public static boolean isValid(String pass) {
        if (pass.length() < 8 ) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasDigit = true;

            if (hasLowerCase && hasUpperCase && hasDigit) break;


        }
        return hasLowerCase && hasUpperCase && hasDigit;
    }
}
