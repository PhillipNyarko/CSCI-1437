import java.util.Scanner; // import scanner class

public class PhoneTester { // main class
    public static void main(String[] args) { // main method

        Scanner input = new Scanner(System.in); // initialize scanner to for getting input
        String phoneNumber; // create variable to holder the user's phone number
        boolean validNumber = true; // boolean valuer to hold validity state of phone number
        StackOfCharacters parenthesis = new StackOfCharacters(); // stack to store parentheses
        StringBuilder characters = new StringBuilder(); // string builder to hole all non parentheses characters
        String validNumberPattern = "//d{3}[ -]//d{3}[ -]//d{4}"; // regex pattern to for acceptable phone numbers

        System.out.println("Please enter a valid phone number"); // prompt user
        phoneNumber = input.nextLine(); // store user input as a string

        int currentCharacterIndex = 0;
        while(validNumber){
            if(phoneNumber.charAt(currentCharacterIndex) == '('){
                parenthesis.push(phoneNumber.charAt(currentCharacterIndex));
            }else if(phoneNumber.charAt(currentCharacterIndex) == ')'){
                parenthesis.pop();
                if(parenthesis.empty()){
                    validNumber = false;
                }
            }else{
                characters.append(phoneNumber.charAt(currentCharacterIndex));
            }
            if (currentCharacterIndex > 10){
                currentCharacterIndex++;
            }
        }
        if(parenthesis.empty()){
            validNumber = true;
        }
        if(!validNumberPattern.matches(String.valueOf(characters))){
            validNumber = false;
        }

        if(validNumber) {
            System.out.print("The number is valid");
        }else{
            System.out.println("The number is not valid");
        }
    }
}
