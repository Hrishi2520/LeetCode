class Solution {
    public boolean isHappy(int n) {
        int sum = getTotal(n);
        if(sum == 1) return true;
        if(sum > 1 && sum < 5) return false;
        return isHappy(sum);
    }

    public static int getTotal(int n) {
        int sum = 0;
        while(n > 0) {
            int rem = n %10;
            sum += (rem * rem);
            n /= 10;
        }
        return sum;
    }
}