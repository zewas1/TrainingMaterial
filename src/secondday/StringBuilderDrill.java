package secondday;

public class StringBuilderDrill {
    public static void main(String[] args) {

        System.out.println((char)(1+2+'c'));
        /*
        String string = new String("Zaliasis");
        String string2 = string.concat(" Vanagas");

        System.out.println(string2);
        System.out.println(string);

        StringBuffer buffer = new StringBuffer("Raudonasis");
        buffer.append(" Tigras");
        buffer.delete(0, 2);
        System.out.println(buffer);

        buffer.replace(0, 8, "Baltas");

        System.out.println(buffer);

        StringBuilder builder = new StringBuilder("Melynasis");
        builder.append(" banginis");
        System.out.println(builder);
        //builder.delete(0,1);
        builder.replace(0, 9, "Juodasis");
        System.out.println(builder);
*/
        StringBuilder sarasas = new StringBuilder("Tomas, Arturas");
        sarasas.append(", Tautvydas");
        System.out.println(sarasas);
        sarasas.append(", Jonas, Petras");
        System.out.println(sarasas);
        sarasas.replace(7,14,"Virginijus");
        System.out.println(sarasas);

        StringBuffer sarasas1 = new StringBuffer("Tomas, Arturas");
        sarasas1.append(", Tautvydas");
        System.out.println(sarasas1);
        sarasas1.append(", Jonas, Petras");
        System.out.println(sarasas1);
        sarasas1.replace(7,14,"Virginijus");
        System.out.println(sarasas1);
    }
}