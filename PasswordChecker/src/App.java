import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        while (valid == false){
            System.out.println("Input a password 8-16 characters that satisfies 3 out of 4 of these requirments...");
            System.out.println("- Must include a lower case letter");
            System.out.println("- Must include a upper case letter");
            System.out.println("- Must include a number");
            System.out.println("- Must include a symbol");
            System.out.println("Enter a password: ");
            String password = input.next();
            valid = check(password);

        }
        input.close();
        System.out.println("You've entered a valid password!");
    }

    public static boolean check(String password){
        if (password.length() > 8 && password.length() < 16){
            char a;
            int upper = 0;
            int lower = 0;
            int special = 0;
            int num = 0;
            int requirments = 0;
            for (int i = 0; i < password.length(); i++){
                a = password.charAt(i);
                if (Character.isUpperCase(a)){
                    upper += 1;
                }
                if (Character.isLowerCase(a)){
                    lower += 1;
                }
                if (Character.isDigit(a)){
                    num += 1;
                }
                if (!Character.isLetterOrDigit(a)){
                    special += 1;
                }

            }

            if (upper > 0){
                requirments += 1;
                System.out.println("upper satisfied");
            }
            if (lower > 0) {
                requirments += 1;
                System.out.println("lower satisfied");
            }
            if (num > 0){
                requirments += 1;
                System.out.println("number satisfied");
            }
            if (special > 0){
                requirments += 1;
                System.out.println("special satisfied");
            }

            if (requirments >= 3){
                return true;
            }
            
            return false;

        }

        else{
            System.out.println("Please enter valid password...");
            return false;
        }
    }
}
