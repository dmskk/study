package javajungsuk_basic.chapter6;

public class Exercise6_18 {
    static boolean isNumber(String str) {
        str = str.replaceAll("[0-9]", "");
        if(str.length() > 0) return false;
        return true;
    }

    public static void main(String[] args) {
        String str = "1234";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
