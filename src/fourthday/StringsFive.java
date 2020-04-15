package fourthday;

import org.apache.commons.lang3.StringUtils;

public class StringsFive {
    public static void main(String[] args) {
        String s = "abcdefghij abcd defg";
        char c = s.charAt(9);
        System.out.println(c);
        System.out.println(s.indexOf( 'j' ));
        System.out.println(s.indexOf( 'X' ));//doesnt exist
        System.out.println( "===============" );
        System.out.println(s.indexOf( 'd' )); //1st occurence
        System.out.println(s.lastIndexOf( 'd' )); //last occurence
        //2nd occurence ???
        int x = s.indexOf('d');
        int y = s.indexOf('d', x+1);
        System.out.println("VALUE y: " + y);

        //how many times did it occur
        int count = 0;
        for(int i=0; i < s.length(); i++) {
            if(s.charAt(i) == 'd')
            count++;
        }

        System.out.println("Letter d occurred: " + count);
        System.out.println("===============" );
        String str = "JAVA is a Language, is a Coffee, is an Island. JAVA ";
        String find_str = "is";
        String findJava = "JAVA";

        int countJava = StringUtils.countMatches(str.toLowerCase(), findJava.toLowerCase());
        System.out.println(countJava);
        System.out.println("===============\n" );

        /*
        System.out.println(str.indexOf(find_str));
        System.out.println(str.lastIndexOf(find_str));
        System.out.println(str.length());

        for (int i = 0; i < str.length();i++){
            if (str.substring(i) == findJava){
                countJava++;
            }
        }
         */
       // System.out.println("Java is repeated: " + countJava);
        //2nd occurence ???
        //count number of times word appears in string java

        String gun = "Tx-Ray-300";
        String[] arr = gun.split("-");
        System.out.println(arr[2]);

        String bill = "10/45/76/34/81";
        String[] arr2 = bill.split("/");
        System.out.println(arr2[4]);
    }
}