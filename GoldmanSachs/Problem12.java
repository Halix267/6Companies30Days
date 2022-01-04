// 1^2 + 2^2 + ...... +n^2
class Solution {
    static Long squaresInChessBoard(Long N) {
        // code here
        
       return (N*(N+1)*(2*N+1))/6;
    }
};
