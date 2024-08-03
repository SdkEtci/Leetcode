class Solution {
    public boolean isHappy(int n) {
        // We dont know size bc of that we use ArrayList
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int sum = 0;

        // For finding digits of n
        do {
            digits.add(n % 10);
            n = n / 10;
        } while (n != 0);

        for (int i : digits) {
            sum += i * i;
        }

        // Recursive function
        if (sum == 1)
            return true;
        else if (sum < 7) // if it is smaller than 7, it cant be happy number
            return false;
        else
            return isHappy(sum);
    }
}