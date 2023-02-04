package Control_Flow_Loops;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }

        int num1RightMostDigit = num1%10;
        int num2RightMostDigit = num2%10;
        int num3RightMostDigit = num3%10;

        while(num1 > 0){
            if((num1RightMostDigit == num2RightMostDigit) || (num1RightMostDigit == num3RightMostDigit)){
                return true;
            }
            while(num2>0){
                if((num2RightMostDigit == num3RightMostDigit)){
                    return true;
                }
                return  false;
            }

        }
        return false;
    }

    public static boolean isValid(int a){
        if((a < 10 || a > 1000)){
            return false;
        }
            return true;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (9, 99, 19));
    }
}
