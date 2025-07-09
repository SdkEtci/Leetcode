class Solution {
    public int mySqrt(int x) {
        int result = 1;
        if (x == 1)
            return 1;
        for(long i = 0; i <= x/2; i++){
            if(i*i > x)
                break;
            else
                result = (int) i;
        }

        return result;
    }
}