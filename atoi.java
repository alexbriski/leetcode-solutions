/**
 *  
 * @author Szilva Sandor
 *
 *  https://leetcode.com/problems/string-to-integer-atoi/

 */

class Solution {
    public int myAtoi(String str) {
        try {
            if (str.contains("+-") || str.contains("-+"))
                return 0;
            String numberStr = "";
            int cnt = str.length();
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    numberStr = str.substring(i);
                    break;
                }
                cnt = i;                
            }
            boolean isNegative = false;
            cnt = 0;
            for (int i = 0; i<numberStr.length();i++) {
                if (numberStr.charAt(i) == '-') {
                    isNegative = true;
                    continue;
                }
                if (numberStr.charAt(i) == '+') {
                    continue;
                }
                if (numberStr.charAt(i) != '0') {
                    break;
                } else {
                    cnt++;
                }
            }
            if (cnt > 0)
                numberStr = isNegative ? "-" + numberStr.substring(cnt) : numberStr.substring(cnt-1);
            
            System.out.println(numberStr);
            cnt = 0;
            for (int i=0; i<numberStr.length();i++) {
                if (numberStr.charAt(i) == '-') {
                    continue;
                }
                if (numberStr.charAt(i) == '+' && i+1<numberStr.length()) {
                    if (numberStr.charAt(i+1) == '+' || i==0)
                        continue;
                }
                if (numberStr.charAt(i) != '0' && numberStr.charAt(i) != '1' && numberStr.charAt(i) != '2'
                  && numberStr.charAt(i) != '3' && numberStr.charAt(i) != '4' && numberStr.charAt(i) != '5'
                  && numberStr.charAt(i) != '6' && numberStr.charAt(i) != '7' && numberStr.charAt(i) != '8'
                  && numberStr.charAt(i) != '9') {
                    break;
                } else {
                    cnt = i;
                }
            }
            numberStr = numberStr.substring(0, cnt+1).trim().replace(".","").replace("+", "");
            if (numberStr.length() > 15) {
                return numberStr.contains("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            long number = Long.parseLong(numberStr); 
            if (number > Long.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (number < Long.MIN_VALUE)
                return Integer.MIN_VALUE;   
            else if (number > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (number < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;    
            else
                return (int)number;
        } catch (Exception ex) {
            System.out.println(ex);
            return 0;
        }
    }
}
