import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        //int sum = 0;
        double sum = 0;

        while(counter <= 5){
            System.out.println("Enter number #"+ counter + ":");
            String nextNumber = scanner.nextLine();
            try{
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }

        //do-while loop
        /*do{
            System.out.println("Enter number #"+ counter + ":");
            String nextNumber = scanner.nextLine();
            try{
                //int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
        }while((counter <= 5));*/

        System.out.println("The sum of the 5 number :" + sum);
    }
}
