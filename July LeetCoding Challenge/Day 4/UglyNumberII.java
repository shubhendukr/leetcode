class Solution {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        int index2 = 0, index3 = 0, index5 = 0;
        int factor2Sequence = 1, factor3Sequence = 1, factor5Sequence = 1;
        for (int i = 0; i < n; i++) {
            uglyNumbers[i] = Math.min(Math.min(factor2Sequence, factor3Sequence), factor5Sequence);
            
            // the ith UglyNumber is in factor2 sequence, then update sequence2
            if (factor2Sequence == uglyNumbers[i]) {
                factor2Sequence = 2 * uglyNumbers[index2++];
            }
            
            // the ith UglyNumber is in factor3 sequence, then update sequence3
            if (factor3Sequence == uglyNumbers[i]) {
                factor3Sequence = 3 * uglyNumbers[index3++];
            }
            
            // the ith UglyNumber is in factor5 sequence, then update sequence5
            if (factor5Sequence == uglyNumbers[i]) {
                factor5Sequence = 5 * uglyNumbers[index5++];
            }
        }
        
        //return the nth UglyNumber
        return uglyNumbers[n-1];
    }
}
