class Solution {
    public int romanToInt(String s) {
        int counter = 0;
        int prev = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = 0;

            if (c == 'I') {
                value = 1;
            } 
            else if (c == 'V') {
                value = 5;
            } 
            else if (c == 'X') {
                value = 10;
            } 
            else if (c == 'L') {
                value = 50;
            } 
            else if (c == 'C') {
                value = 100;
            } 
            else if (c == 'D') {
                value = 500;
            } 
            else if (c == 'M') {
                value = 1000;
            }

            if (prev < value) {
                counter += (value - 2 * prev);
            } else {
                counter += value;
            }
            prev = value;
        }
        
        return counter;
    }
}
