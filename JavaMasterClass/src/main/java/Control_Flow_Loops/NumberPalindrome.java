package Control_Flow_Loops;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        String actualNumber = String.valueOf(number);
        int polNumber = Math.abs(number);
        String reverseNumber = "";
        int lastNum = 0;

        if(number<0){
            reverseNumber += "-";
        }
        while(polNumber>0){
            reverseNumber += (polNumber%10);
            polNumber/=10;
        }
        if(reverseNumber.equals(actualNumber)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-707));
    }
}
