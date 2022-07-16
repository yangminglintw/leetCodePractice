package leetcode;

public class FirstBadVersion {
    private boolean isBadVersion(int version) {
        return true;
    }
    public int firstBadVersion(int n) {

        int low = 1;
        int high = n;

        while (low < high) {
            int med = low + (high - low) / 2;

            if (isBadVersion(med)) {
                high = med;
            } else {
                low = med + 1;
            }
        }

        return low;
    }
}
