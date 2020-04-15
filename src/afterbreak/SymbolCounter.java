package afterbreak;

public class SymbolCounter {
    public static void main(String[]args){
        String stringToCount = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";

        // kintamuju apsibrezimas
        int raidziuSkaicius = 0;
        int tarpeliuSkaicius = 0;
        int skaiciuSkaicius = 0;
        int kituSimboliuSkaicius = 0;

        //ciklo pagalba perbegti per eilute
        for (int i = 0; i < stringToCount.length(); i++){
            if (stringToCount.substring(i,i+1).matches("[a-zA-Z]")){
                raidziuSkaicius ++;
            }
            else if (stringToCount.substring(i,i+1).matches(" ")){
                tarpeliuSkaicius ++;
            }
            else if (stringToCount.substring(i,i+1).matches("[0-9]")){
                skaiciuSkaicius ++;
            }
            else if (stringToCount.substring(i,i+1).matches("[^A-Za-z0-9]")){
                kituSimboliuSkaicius ++;
            }

        }
        System.out.println("Raidziu skaicius: " + raidziuSkaicius);
        System.out.println("Tarpu skaicius: " + tarpeliuSkaicius);
        System.out.println("Skaiciu skaicius: " + skaiciuSkaicius);
        System.out.println("Kitu simboliu skaicius: " + kituSimboliuSkaicius);

    }
}
