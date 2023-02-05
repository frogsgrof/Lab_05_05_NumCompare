public class Main {
    public static void main(String[] args) {

        // Directions:
        /*
        A program that takes two numbers as inputs from the user and compares them.
        It indicates if they are equal or if they are not indicates the one that is less.
        This program should be bullet-proofed. If either input is not a number, the program should
        indicate that the user should try again and terminate.

        EMBED SCREENSHOTS OF NETBEANS HERE SHOWING YOUR PROGRAM RUN:
         */

        // Pseudocode:
        /*
        String input1
        String input2
        boolean input1IsValid = true
        boolean input2IsValid = true
        int num1
        int num2

        do
            output "Enter two numbers to compare them."
            output "Enter your first number:"
            input input1
            output "You entered: " + input1

            for index = 1 to input1.length() step 1
                if input1.charAt(index - 1) != some value between 0-9 then
                    input1IsValid = false
                endIf
            endFor

            if NOT input1IsValid then
                output "Error: number not recognized."
            endIf

        while input1IsValid == false

        do
            output "Enter your second number:"
            input input2
            output "You entered:" + input2

            for index = 1 to input2.length() step 1
                if input2.charAt(index - 1) != some value between 0-9 then
                    input2IsValid = false
                endIf
            endFor

            if NOT input2IsValid then
                output "Error: number not recognized."
            endIf

        while input2IsValid == false

        num1 = Integer.parseInt(input1)
        num2 = Integer.parseInt(input2)

        if num1 == num2 then
            output "Result: " + num1 + " is equal to " + num2 + "."
        else if num1 < num2 then
            output "Result: " + num1 + " is less than " + num2 + "."
        else
            output "Result: " + num1 + " is greater than " + num2 + "."
        endIf

         */

        // Real code starts here

        String input1 = "4"; // pretend user input // I use some string methods, so the inputs are stored as Strings
        String input2 = "4";

        boolean input1IsValid;
        boolean input2IsValid;

        int num1; // stores inputs after they have been converted to ints
        int num2;

        // asks for input1 and checks if it's an integer. if not, repeats. once it comes up with a valid input1,
        // it does the same for input2.
        do {
            input1IsValid = true; // reset to true at the beginning to prevent infinite loops during testing

            System.out.println("Enter two integers to compare them.\n" +
                    "Enter your first number:");

            // start test code:
            System.out.println("[Imagine user input]");
            input1 = "4"; // pretend user input
            System.out.println("You entered: " + input1);
            // end test code.

            // loops over the length of input1
            for (int i = 1;  i < input1.length() ; i++){
                // For each character in input1, it checks if it is not a value 0-9. if it is not a value
                if (!(input1.charAt(i - 1) == 0 ||     // 0-9, then it sets input1IsValid to false,
                        input1.charAt(i - 1) == 1 ||   // and then prints an error message.
                        input1.charAt(i - 1) == 2 ||
                        input1.charAt(i - 1) == 3 ||   // At the end of the do...while loop, if
                        input1.charAt(i - 1) == 4 ||   // input1IsValid is false, then that triggers the loop.
                        input1.charAt(i - 1) == 5 ||
                        input1.charAt(i - 1) == 6 ||
                        input1.charAt(i - 1) == 7 ||
                        input1.charAt(i - 1) == 8 ||
                        input1.charAt(i - 1) == 9)) {

                    // input1 is determined invalid as soon as a character comes up that is not a value 0-9.
                    input1IsValid = false;

                    // If it finds a character that is not a value 0-9, there is no need to keep checking.
                    break;

                } // end if inside for
            } // end for

            // once outside the for loop, it does a final check if input1 is not an integer.
            // if not, it prints an error message.
            if (!input1IsValid) {
                System.out.println("ERROR: unrecognized integer. Try again.");
                input1 = "4"; // THIS IS TO PREVENT AN INFINITE LOOP DURING TESTING
                System.out.println("[input1 was set to '4']");
            }

        } while (!input1IsValid);
        // end input 1 loop

        // Now the exact same test happens for input2 (except the opening message):
        do {
            input2IsValid = true; // once again to prevent infinite loops during testing

            System.out.println("Enter your second number:");
            // test code:
            System.out.println("[Imagine user input]");
            System.out.println("You entered: " + input2);
            // end test code.

            // loops over the length of input2:
            for (int i = 1 ; i < input2.length() ; i++) {
                if (!(input2.charAt(i - 1) == 0 ||
                        input2.charAt(i - 1) == 1 ||
                        input2.charAt(i - 1) == 2 ||
                        input2.charAt(i - 1) == 3 ||
                        input2.charAt(i - 1) == 4 ||
                        input2.charAt(i - 1) == 5 ||
                        input2.charAt(i - 1) == 6 ||
                        input2.charAt(i - 1) == 7 ||
                        input2.charAt(i - 1) == 8 ||
                        input2.charAt(i - 1) == 9)) {

                    input2IsValid = false;
                    break;

                } // end if inside for
            } // end for

            // final check + error message:
            if (!input2IsValid) {
                System.out.println("ERROR: unrecognized integer. Try again.");
                input2 = "4"; // THIS IS TO PREVENT AN INFINITE LOOP DURING TESTING
                System.out.println("[input2 was set to '4']");
            }

        }  while (!input2IsValid);
        // end input2 loop

        // at this point, both input1 and input2 should be verified integers

        // converts the inputs from Strings into integers and stores them in num1 and num2
        num1 = Integer.parseInt(input1);
        num2 = Integer.parseInt(input2);

        // finally compares the integers
        if (num1 == num2) {
            System.out.println("Result: " + num1 + " is equal to " + num2 + ".");
        } else if (num1 > num2) {
            System.out.println("Result: " + num1 + " is less than " + num2 + ".");
        } else {
            System.out.println("Result: " + num1 + " is greater than " + num2 + ".");
        }


    } // end main


} // end class