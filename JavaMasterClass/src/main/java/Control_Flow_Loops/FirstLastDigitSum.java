package Control_Flow_Loops;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }else if(number==0){
            return 0;
        }

        int lastDigit = number%10;
        int firstDigit = 0;

        while(number>0){
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println(firstDigit+lastDigit);
        return firstDigit+lastDigit;
    }


    public static void main(String[] args) {
        sumFirstAndLastDigit(5);
    }
}
