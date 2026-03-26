public class Solution {
    public static int divide(int dividend, int divisor) {

        // overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {
            int shift = 0;

            while (a >= (b << shift)) {
                shift++;
            }

            shift--; // step back
            result += (1 << shift);
            a -= (b << shift);
        }

        return sign * result;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3)); // 3
        System.out.println(divide(7, -3)); // -2
    }
}