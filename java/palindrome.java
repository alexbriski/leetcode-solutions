/**
 *  
 * @author Szilva Sandor
 *
 * https://leetcode.com/problems/palindrome-number/

 */

class Solution {
    public int reverse(int x) {
        try {
            String numberStr = Integer.toString(x);
            String numberInverted = "";
            for (int i = numberStr.length() - 1; i >= 0; i--)
                numberInverted += Character.toString(numberStr.charAt(i));        
            if (numberInverted.charAt(numberInverted.length()-1) == new Character('-')) {
                numberInverted = "-" + numberInverted.replace("-", "");
            }
            return Integer.parseInt(numberInverted);    
        } catch (NumberFormatException ex) {
            return 0;
        }
        
    }
}
