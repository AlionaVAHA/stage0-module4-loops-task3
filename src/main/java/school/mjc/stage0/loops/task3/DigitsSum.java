package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
           int number = 77;
        String newNumber = "" + number;
        int fres = 0;
        for (int t = 0; t < newNumber.length(); t++) {
            int newN = number % 10;
            fres = fres + newN;
            number = number / 10;
        }
        System.out.println(fres);
    }
}
