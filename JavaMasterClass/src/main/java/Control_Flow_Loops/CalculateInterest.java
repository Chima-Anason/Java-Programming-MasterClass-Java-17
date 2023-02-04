package Control_Flow_Loops;

public class CalculateInterest {

    public static double calculateInterest(double amount, double interestRate){
        return  (amount * (interestRate/100));
    }

    public static void main(String[] args) {

        for(double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(100.00,rate);
            System.out.println("$100.00 at " + rate + "% interest = " + interestAmount);
        }

        System.out.println("\n");

        for(double i = 7.5; i<= 10; i+= 0.25){
            double interestAmount = calculateInterest(100.00,i);
            if(interestAmount>8.5){
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
        }


    }

}
