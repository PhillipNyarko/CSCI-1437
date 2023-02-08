import java.util.Scanner;

public class NumberValidator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String phoneNumber;
        String pattern = "\\d{3}[- ]?\\d{3}[- ]?\\d{4}"; // regex expression for pattern with optional  hyphen or space

        System.out.println("Please enter a phone number:");
        phoneNumber = input.nextLine();

        if(phoneNumber.matches(pattern)){
            System.out.println("This is a valid phone number");
        }else{
            System.out.println("This is not a valid phone number");
        }
    }
}