package loopai;

public class NestedLoops {
    public static void main(String[]args){
        int x = 30;
        int sum = 0;

        for (int i = 0; i < x; i ++){
            for (int j = 0; j < x ; j++){
                System.out.println("h = " + j);
            }

            System.out.println("i = " + i);
           //sum+= i;
           //System.out.println(sum);
        }
    }
}
