
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.nio.file.*;


public class Calculator {
     

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double input1;
        double input2;

        try {
            input1 = getInput(scanner, "Enter value 1");
            input2 = getInput(scanner, "Enter value 2");
        } catch (InputMismatchException e) {
            System.out.println("Couldn't format as a number");
            return;
        }
        
        chooseOperation(scanner, input1, input2);
    }

    private static void chooseOperation(Scanner scanner, double input1, double input2) {
        System.out.println("+ - * /");
        String operation = scanner.nextLine();

        double result;
        switch(operation){
            case "+":
                result = input1 + input2;
                break;
            case "-":
                result = input1 - input2;
                break;
            case "*":
                result = input1 * input2;
                break;
            case "/":
                result = input1 / input2;
                break;
            default:
                System.out.println("You did not choose a valid operation");
                return;
        }
        System.out.println("The answear is " + result);
    }
    
    private static double getInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble(); 
    }

    // okay google let's push this coding to github


}
