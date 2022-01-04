class Solution {
    static int findPosition(int N , int M , int K) {
        // code here
        
        if((K+M-1)%N==0) return N;
        return (K+M-1)%N;
    }
};
