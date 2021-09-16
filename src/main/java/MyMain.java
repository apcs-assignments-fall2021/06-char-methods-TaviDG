public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (!(ch>='A'&& ch<='Z')){
            return ch;
        }
        int x=ch+32;
        return (char)x;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        if (!(ch>='a'&& ch<='z')) {
            return ch;
        }
        int x=ch-32;
        return (char)x;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
        String x = "";
        for (int i=0; i<(str.length());i++){
            char ch = str.charAt(i);
            if (!(ch>=48 && ch<=57)){
                x= x + ch;
            }
        }
        return x;
    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println("to lower");
        System.out.println(toLower('A'));//a
        System.out.println(toLower('c'));//c
        System.out.println(toLower('J'));//j
        System.out.println("to upper");
        System.out.println(toUpper('d'));//D
        System.out.println(toUpper('K'));//K
        System.out.println("remove number tests");
        System.out.println(removeNumbers("54873h324i"));//hi
        System.out.println(removeNumbers("35n3a54th23an"));//nathan
    }
}
