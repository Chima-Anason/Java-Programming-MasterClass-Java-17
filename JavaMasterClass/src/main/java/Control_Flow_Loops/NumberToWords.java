package Control_Flow_Loops;

public class NumberToWords {
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int countEnd = getDigitCount(number);
        int numMule;
        int count = 0;
        number = reverse(number);
        while (count < countEnd) {
            numMule = number % 10;
            number /= 10;
            count++;
            switch(numMule) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }
    }

    public static int reverse (int number) {
        int mule = 0;
        int numMule;
        boolean negNum = false;

        if (number < 0) {
            negNum = true;
            number = Math.abs(number);
        }

        while (number > 0) {
            numMule = number % 10;
            number /= 10;
            mule = Integer.valueOf(String.valueOf(mule) + String.valueOf(numMule));
        }

        if (negNum == true) {
            mule = mule * -1;
        }
        return mule;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }

        return count;
    }
}