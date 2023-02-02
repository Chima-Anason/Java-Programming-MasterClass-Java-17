public class SharedDigit {

   /* public static boolean hasSharedDigit(int a, int b){
        if(a<10 || b<10 || a>99 || b>99){
            return false;
        }
        int a_lastDigit = a%10;
        a = a/10;
        int b_lastDigit = 0;
        int count =0;

        while (count<1){
            b_lastDigit = b%10;
            b/= 10;
            count++;
        }

        if((a_lastDigit == b_lastDigit) || (a_lastDigit == b)){
            return true;
        }else if((a == b_lastDigit) || (a == b)){
            return true;
        }else{
            return false;
        }
    }*/

// Second Approach
    public static boolean hasSharedDigit (int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int compare1 = 0;
        int compare2 = 0;
        while (num1 > 0) {
            compare1 = num1 % 10;
            num1 /= 10;
            int originalNum2 = num2;
            while (originalNum2 > 0) {
                compare2 = originalNum2 % 10;
                originalNum2 /= 10;
                if (compare1 == compare2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 24));
    }


}
