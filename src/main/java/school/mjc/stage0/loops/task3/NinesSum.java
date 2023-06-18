package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int result = 0;
        int number = 9;
        int neW = 9;
        for (int t = 0; t < lengthOfLastNumber; t++) {
            if (result == 0) {
                result = number;
            } else {
                neW = neW * 10;
                number = number + neW;
                result += (number);
            }
        }
        System.out.println(result);

    }
}
