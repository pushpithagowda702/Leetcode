public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0, end = n;
        int badVer = n;
        while(start <= end) {
            int mid = start + (end - start)/2;
            
            if(isBadVersion(mid)) {
                badVer = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return badVer;
    }
}