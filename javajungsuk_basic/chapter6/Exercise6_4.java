package javajungsuk_basic.chapter6;

public class Exercise6_4 {
    static double getDistance(int x, int y, int x2, int y2) {
        return Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
    }

    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
