package Control_Flow_Loops;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double sum = 0;
        double avg;

        while(true) {
            System.out.println("Enter a number, or any character to exit:");
            String nextEntry = scanner.nextLine();

            try{
                double number = Double.parseDouble(nextEntry);
                sum += number;
                count++;
            }catch (NumberFormatException e){
                break;
            }
        }
        avg = sum/count;
        System.out.println("SUM = " + Math.round(sum) + " AVG = " + Math.round(avg));

    }


    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
