 public class Factorial {

 public static void main(String[] args) {

        System.out.println(calc(10));
 }
//This will return the factorization
  public static double calcFactorial(double number){
    if (number <= 1)
        return 1;

        else

            return number * calcFactorial(number-1);
  }

 }
