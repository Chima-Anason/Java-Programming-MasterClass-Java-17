public class WhileLoop {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                oddCount++;
                //Continue here: means continue the loop
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if(evenCount>=5){
                //Break here: means end the loop
                break;
            }

        }
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }

    public static boolean isEvenNumber(int number){
        if((number%2)==0){
            return  true;
        }else{
            return false;
        }
    }
}
