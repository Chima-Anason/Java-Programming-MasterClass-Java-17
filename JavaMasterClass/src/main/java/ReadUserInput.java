import java.util.Scanner;

public class ReadUserInput {

    public static void main(String[] args) {
        int currentYear = 2022;

        try{
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, What is your name?");
        System.out.println("Hi "+ name + ", Thanks for taking the course!");

        String dob = System.console().readLine(" What year were you born?");
        int age = currentYear- Integer.parseInt(dob);
        return "So you are " + age + " years old";
    }

    public static  String getInputFromScanner(int currentYear){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hi, What is your name?");
        String name = scan.nextLine();
        System.out.println("Hi "+ name + ", Thanks for taking the course!");

        System.out.println(" What year were you born?");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth >= " +
                    (currentYear - 125) + " and <= " + (currentYear));
            try{
                age = checkData(currentYear, scan.nextLine());
                validDOB = age < 0 ? false : true;
            }catch (NumberFormatException e){
                System.out.println("Characters not allowed!!! Try again.");
            }

        }while (!validDOB);

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear -125;

        if((dob < minimumYear) || (dob > currentYear)){
            return -1;
        }

        return (currentYear - dob);
    }
}
