public class Fibonacci {
    public static long fib(int number) {
        if (number <= 1) return number;
        else return fib(number-1) + fib(number-2);
    }

    public static void main() {
        int N = 10;
        for (int i = 1; i <= N; i++)
            System.out.println(i + ": " + fib(i));
    }

}
