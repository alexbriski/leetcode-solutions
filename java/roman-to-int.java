class Solution {
  public int romanToInt(String s) {
      s = s.trim();
      int intNumber = 0;
      for (int i = 0; i < s.length(); i++) {
          Character c = s.charAt(i);
          if (i+1 < s.length()) {
              Character nextC = s.charAt(i+1);
              boolean isSubtract = false;
              if (c == 'I' && nextC == 'V') {
                  intNumber+=4;
                  isSubtract = true;
              }
              if (c == 'I' && nextC == 'X') {
                  intNumber+=9;
                  isSubtract = true;
              }
              if (c == 'X' && nextC == 'L') {
                  intNumber+=40;
                  isSubtract = true;
              }
              if (c == 'X' && nextC == 'C') {
                  intNumber+=90;
                  isSubtract = true;
              }
              if (c == 'C' && nextC == 'D') {
                  intNumber+=400;
                  isSubtract = true;
              }
              if (c == 'C' && nextC == 'M') {
                  intNumber+=900;
                  isSubtract = true;
              }
              if (isSubtract) {                    
                  i++;
                  continue;
              }
          }
          if (c == 'I') {
              intNumber += 1;
          }
          if (c == 'V') {
              intNumber += 5;
          }
          if (c == 'X') {
              intNumber += 10;
          }
          if (c == 'L') {
              intNumber += 50;
          }
          if (c == 'C') {
              intNumber += 100;
          }
          if (c == 'D') {
              intNumber += 500;
          }
          if (c == 'M') {
              intNumber += 1000;
          }
      }
      return intNumber;
      
  }
}
