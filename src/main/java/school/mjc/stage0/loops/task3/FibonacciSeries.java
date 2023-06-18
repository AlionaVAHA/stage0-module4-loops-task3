package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
         int number = 0;
        int secondNumber = 1;
        int number3 = 0;
        System.out.println(number);
        for (int t = 0; t < lastFibonacci; t++) {
            if (number3 == lastFibonacci) {
                
                break;
            } else {
                number3 = number + secondNumber;
                number = secondNumber;
                secondNumber = number3;
                System.out.println(number);

            }
        }
    }
}
