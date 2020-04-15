package secondday;

public class StringBuilderIntro {
    public static void main(String[] args){
        /*
        String str1 = "str";
        String str2 = str1.concat("1");
        System.out.println(str2);
        */

        //Note, string are immutable almost all of the time.
        String string = new String("Zaliasis");
        //string.concat(" Vanagas");
        String string2 = string.concat(" Vanagas");
        System.out.println(string2);
        //StringBuffer and StringBuilder are used
        //mutable, thread safe for synchronisation.
        StringBuffer buffer = new StringBuffer("Raudonas");
        //Vis dar vienas ir tas pats objektas
        buffer.append(" Tigras");
        buffer.replace(0,8, "Baltas");
        buffer.delete(0,2);
        System.out.println(buffer);
        //Faster than stringBuffer
        StringBuilder builder = new StringBuilder("Geltonas");
        builder.append("Lokys");
        builder.replace(0,8, "Baltasis ");
        builder.delete(8, 10);
        System.out.println(builder);
    }
}