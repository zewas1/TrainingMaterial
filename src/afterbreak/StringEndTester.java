package afterbreak;

public class StringEndTester {
    public static void main(String[] args){
        String eiluteKuriaTikrinam = "Labas, mano vardas Matas";
        String eilutesPabaiga = "atas";

        String endOfLongString = eiluteKuriaTikrinam.substring(eiluteKuriaTikrinam.length() - eilutesPabaiga.length());

        if (compareStrings(endOfLongString, eilutesPabaiga)){
           // System.out.println(eiluteKuriaTikrinam + " baigiasi raidem: " + endOfLongString);
            System.out.printf("Eilute \"%s\" pasibaiga sutampa su eilute \"%s \"", eiluteKuriaTikrinam, eilutesPabaiga);
        } else{
            System.out.println(eiluteKuriaTikrinam + " nesibaigia raidem: " + endOfLongString);
        }
    }
    private static boolean compareStrings(String endofLongString, String eilutesPabaiga){
        return endofLongString.equalsIgnoreCase(eilutesPabaiga);
    }
}
