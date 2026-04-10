import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showHeader();

        System.out.print("\nCreate Password: ");
        String password = scanner.nextLine();

        if (password.isEmpty()) {
            System.out.println("Invalid Password");
            return;
        }
        if (isValidPassword(password)) {
            System.out.println("Password is valid");
        }
        else {
            System.out.println("Password is invalid");
        }


    }

    public static void showHeader() {
        System.out.println("================================================");
        System.out.println("============= Password Validator ===============");
        System.out.println("================================================");
    }

    public static boolean isValidPassword(String password) {

        if (password.length() < 8) return false;

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) hasDigit = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isUpperCase(c)) hasUpperCase = true;
        }
        return hasDigit && hasLowerCase && hasUpperCase;
    }
}
