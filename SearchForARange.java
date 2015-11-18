public class Solution {

    public int[] searchRange(int[] nums, int target) {

        int[] out={-1,-1};

        if(nums.length==0||nums==null)return out;

        int len=nums.length;

        int begin=0;

        int end=len-1;

        int mid=0;

        while(begin<=end)

        {

            mid=(begin+end)/2;

            if(nums[mid]<target)

                begin=mid+1;

            else

                end=mid-1;

        }

        int left=(begin<len && nums[begin]==target)?begin:-1;

        if(left==-1)return out;

        int low=left;

        int right=len-1;

        while(low<=right)

        {

            mid=(low+right)/2;

            if(nums[mid]<=target)

                low=mid+1;

            else

                right=mid-1;

        }

        out[0]=left;

        out[1]=right;

        

        return out;

        



    }

}
