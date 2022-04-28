class Solution {
    public int[] countBits(int n) {
        int[] output =new int[n+1];
        for(int i=1;i<output.length;i++){
            output[i]=output [i>>1]+i%2;
        }
        return output;
        
        
    }
}