public class Solution {
    public int getSum(int a, int b) {
        while (b != 0) { // Repeat until there is no carry
            int carry = a & b; // Calculate the carry
            a = a ^ b; // Calculate the sum without considering the carry
            b = carry << 1; // Shift the carry to the left by 1 position
        }
        
        return a; // Return the final sum
    }
}
