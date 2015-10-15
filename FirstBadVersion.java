class Solution extends VersionControl {

    public int firstBadVersion(int n) {

        if(n==0)

            return -1;

        int low=1,high=n,mid;

        while(low+1<high)

        {

            mid=low+(high-low)/2;

            if(isBadVersion(mid)==true)

            {

                high=mid;

            }

            else

            {

                low=mid;

            }

        }

       if(isBadVersion(low)==true)

            return low;

            else if(isBadVersion(high)==true)

                return high;

                else

                    return -1;

    }

}
