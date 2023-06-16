package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
           int k = firstBoarder + 1;
        int res = 0;
        for (int t = firstBoarder; t < secondBoarder - 1; t++) {
            res += k;
            k++;
        }
        System.out.println(res);
    }
    
}
