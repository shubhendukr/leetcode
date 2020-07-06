class Solution {
    public int arrangeCoins(int n) {
        int rowNo = 1;
        while (n >= rowNo) {
            n -= rowNo++;
        }
        
        return rowNo - 1;
    }
}
