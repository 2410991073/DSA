class Solution {
    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            ans = ans << 1;      // left shift answer
            ans = ans | (n & 1); // last bit add karo
            n = n >> 1;          // n ko right shift
        }

        return ans;
    }
}