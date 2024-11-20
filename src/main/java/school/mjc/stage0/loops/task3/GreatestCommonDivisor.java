package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == second) {
            System.out.println(first);
        } else if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else {
            int temp;
            if (first > second)
                temp = first;
            else
                temp = second;
            for (int i = 2; i <= temp; i++) {
                if (first > second) {
                    first = first - second;
                } else {
                    second = second - first;
                }
                if (first == second) {
                    System.out.println(first);
                    return;
                }
            }
        }
    }
}
