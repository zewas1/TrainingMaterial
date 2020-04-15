package fourthday;

class CheckDuplicates {
    public static boolean isEmpty(String s){
        return s == null || s.length() == 0;
    }

    public static int countMatches (String text, String str){
        if (isEmpty(text) || isEmpty(str)){
            return 0;
        }
        return text.split(str, -1).length -1;
    }

    public static void main(String[] args) {
        String text = "JAVA is a Language, is a Coffee, is an Island. JAVA";
        String str = "JAVA";

        int count = countMatches(text.toLowerCase(), str.toLowerCase());
        System.out.println("Java kartojasi: " + count);
    }
}