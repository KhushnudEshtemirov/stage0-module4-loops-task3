package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum1 = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum2 += 9 * Math.pow(10, j);
            }
            sum1 += sum2;
        }
        System.out.println(sum1);
    }
}
