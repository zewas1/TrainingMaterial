package fifthday;

public class ArrayMax {
    public static void main(String[] args) {


        double[] myArray = {3, 711, -8, 11};

        double max = myArray[0];

        for (int i=1; i<myArray.length; i++){
            if (myArray[i] > max){
                max = myArray[i];
            }
        }
        System.out.println("Max is: "+ max);
    }
}