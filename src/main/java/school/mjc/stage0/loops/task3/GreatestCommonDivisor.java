package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int gcd =0;
        int t;
        for (t = 1; t <= first && t <= second; t++) {
            if (first % t == 0 && second % t == 0) {
                gcd = t;
            }
        }
        System.out.println(gcd);
    }
}
