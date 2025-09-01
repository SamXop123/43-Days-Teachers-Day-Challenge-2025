class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int digit = 0;
            if (num == 0) {
                digit = 1;
            } else {
                while (num != 0) {
                    num = num / 10;
                    digit++;
                }
            }
            if(digit % 2 == 0) {
                count++;
            } 
        }
        return count;
    }
}
