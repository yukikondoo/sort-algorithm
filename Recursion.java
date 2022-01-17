import java.lang.invoke.ClassSpecializer.Factory;

public class Recursion {

    // Factorial means !
    // 3! = 3 * 2 * 1
    public static void main(String[] args){

        System.out.println(recursiveFactorial(4));

    }

    // 4! = 4 * 3!
    public static int recursiveFactorial(int num){
        if (num == 0){
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    
    public static int iterativeFactorial(int num){
        if (num == 0){
            return 1;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *=i;

        }
    }


}
