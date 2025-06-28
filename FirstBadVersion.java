public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;  // Calculate mid to prevent overflow
            if (isBadVersion(mid)) {
                right = mid;  // Narrow the search to the left side including mid
            } else {
                left = mid + 1;  // Narrow the search to the right side excluding mid
            }
        }
        
        return left;  // left will point to the first bad version
    }
}
