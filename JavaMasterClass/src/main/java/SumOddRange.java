public class SumOddRange {

    public static boolean isOdd(int number){
        if(number<0){
            return  false;
        }
        if(number%2!=0){
            return true;
        }else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        int sumOfMatches = 0;
        if((end >= start) && (start > 0) && (end > 0)){
            for(int i=start; i<=end; i++){
                if(isOdd(i)){
                    sumOfMatches += i;
                }
            }
        }else{
            System.out.println(-1);
            return -1;
        }
        System.out.println(sumOfMatches);
        return sumOfMatches;
    }

    public static void main(String[] args) {

        sumOdd(100, -100);
    }
}
