package Control_Flow_Loops;

public class LargestPrime {

    public static int getLargestPrime(int number){

            if (number <= 1) {
                return -1;
            }
            for (int i = 2; i < number; i++) {
                while (number % i == 0) {
                    number = number / i;
                    if (number == 2) {
                        i++;
                    }
                }
            }
            return number;
        }
}
