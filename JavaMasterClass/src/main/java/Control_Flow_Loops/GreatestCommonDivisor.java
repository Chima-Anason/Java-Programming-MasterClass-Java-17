package Control_Flow_Loops;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int GCD = 1;
        int firstHolder = first;
        int secondHolder = second;

        if (first < second) {
            for (int i = 1; i<first+1; i++) {
                if (firstHolder % i == 0 && secondHolder % i == 0) {
                    GCD = i;
                }
            }
        }
        else {
            for (int i = 1; i<second+1; i++) {
                if (firstHolder % i == 0 && secondHolder % i == 0) {
                    GCD = i;
                }
            }
        }
        return GCD;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}
