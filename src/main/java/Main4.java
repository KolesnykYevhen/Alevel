

public class Main4 {

    public static void main(String[] args){
//        nomer1();
//        nomer2();
//        nomer3();
//        nomer4();
//        nomer5();
    }

    private static void nomer1(){
        String str = "Hello world!";
        int last = str.length()-1;
        char ch = str.charAt(last);
        char ch2 = str.charAt(0);
        System.out.println("Перший символ "+"- " + ch2);
        System.out.println("Останній символ "+"- " + ch);

    }
    private static void nomer2() {
        String Str = "Java Exercises";
        String Str1 = "Java Exercise";
        if (Str.equals(Str1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    private static void nomer3() {
        String str = "Stephen Edwin King";
        boolean got = str.contains("Walter Winchell");
        System.out.println(str +  " contains 'Walter Winchell' - " + got);
        got = str.contains("Edwin");
        System.out.println( str + " contains 'Edwin' - " + got);
    }
    private static void nomer4() {
        String str = "Stephen Edwin King";
        if("Walter Winchell".equalsIgnoreCase(str)){
            System.out.println(str + " contains" + "Walter Winchell");
        }else if ("stephen edwin king".equalsIgnoreCase(str)){
            System.out.println(str + " contains" + " stephen edwin king" );
        }
    }
    private static void nomer5() {
        String str = new String("Red is favorite color");
        System.out.println(str.startsWith("Red") );
        String str1 = new String("Orange is also my favorite color");
        System.out.println(str1.startsWith("Red") );
    }
}
