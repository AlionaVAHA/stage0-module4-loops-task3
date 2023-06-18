package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
         String newNumber = "" + t;
        int fres = 0;
        for (int k = 0; k < newNumber.length(); k++) {
            int newN = t % 10;
            fres = fres + newN;
            t = t / 10;
        }
        System.out.println(fres);

    }
}
