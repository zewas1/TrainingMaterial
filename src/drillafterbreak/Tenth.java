package drillafterbreak;

public class Tenth {
    public static void main(String[] args) {

        String number = "133";
        int sum = 0;


        for (int i = 0; i < number.length() ; i++){
            if (number.substring(i,i+1).matches("[0-9]")){
                sum = number.charAt(i) + sum;
            }
        }
        System.out.println(sum);
    }
}
