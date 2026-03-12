class Solution {
    public int[] plusOne(int[] digits) {

        // Start checking from the last digit
        for(int i = digits.length - 1; i >= 0; i--) {

            // If the digit is less than 9
            if(digits[i] < 9) {

                // Simply add 1
                digits[i]++;

                // Return the updated array
                return digits;
            }

            // If digit is 9, it becomes 0
            // because 9 + 1 = 10 (0 stays, carry goes left)
            digits[i] = 0;
        }

        // If all digits were 9 (example: 9,9,9)
        // we need a new array with one extra space
        int[] result = new int[digits.length + 1];

        // Put 1 at the beginning
        // example: 999 + 1 = 1000
        result[0] = 1;

        // Return the new array
        return result;
    }
}