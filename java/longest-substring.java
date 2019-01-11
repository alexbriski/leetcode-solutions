class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character currChar = s.charAt(i);
            if (!characters.contains(currChar)) {
                characters.add(currChar);
            }
            else {
                int index = s.indexOf(currChar);
                s = s.substring(index+1);
                characters.clear();
                characters.add(s.charAt(0));
                i = 0;
                continue;
            }
            if (characters.size() > longest) {
                longest = characters.size();
            }                
        }
        return longest;
    }
}
