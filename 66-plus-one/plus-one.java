class Solution {
    public int[] plusOne(int[] digits) {
        // Start checking from the last digit
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
              digits[i]++; // increment by 1
                return digits;
            }
            digits[i] = 0;// If digit is 9, it becomes 0 because 9 + 1 = 10 
        }
        int[] result = new int[digits.length + 1];
          result[0] = 1; // Put 1 at start 
          return result;
    }
}