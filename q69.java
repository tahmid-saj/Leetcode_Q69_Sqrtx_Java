class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        } else if (x == 1 || x == 2) {
            return 1;
        }

        int high = x, low = 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (x / mid == mid) {
                return mid;
            }
            else if (x / mid < mid) {
                high = mid - 1;
            }
            else if (x / mid > mid) {
                low = mid + 1;
            }
        }

        return high;
    }
}
