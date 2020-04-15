package drillafterbreak;

public class loopSix {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 7, 3, 10, 9};
        int sum = 0;
        int evens = 0;
        int odds = 0;

        for (int i = 0; i < arrayOfInts.length; i++){

            if (arrayOfInts[i]%2!=1){
                evens ++;
            }
            else if (arrayOfInts[i]%2!=0){
                odds ++;
            }
        }

        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);

    }
}
