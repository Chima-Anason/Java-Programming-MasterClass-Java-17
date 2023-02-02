public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }

        int evenNumber = 0;
        while(number>0){
            if(number%2 ==0){
                evenNumber += (number%10);
            }
            number/=10;
        }
        System.out.println(evenNumber);
        return evenNumber;
    }

    public static void main(String[] args) {
        getEvenDigitSum(252);
    }
}
