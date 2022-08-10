/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstVersion = 1;
        int lastVersion = n;
        
        while(firstVersion <= lastVersion){
            int midVersion = firstVersion + (lastVersion - firstVersion)/2;
            boolean isBadVersion = isBadVersion(midVersion);
            
            if(isBadVersion){
                lastVersion = midVersion - 1;
            }else{
                firstVersion = midVersion + 1;
            }
        }
        return firstVersion;
    }
    
}