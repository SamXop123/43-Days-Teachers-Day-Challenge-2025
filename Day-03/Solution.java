class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.isEmpty()) return true;

        String raw = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();

        for (int i = 0; i < raw.length(); i++) {
            if (raw.charAt(i) != raw.charAt(raw.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
