package Control_Flow_Loops;

public class FlourPacker {

    //Still trying to figure out what the problem mean

    public static boolean canPack(int bigCount, int smallCount, int goal){
        bigCount *= 5;
        int sum = bigCount+smallCount;

        if(goal == sum){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
    }
}
