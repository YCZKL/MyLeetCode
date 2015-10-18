public class Solution {

    public int findDuplicate(int[] nums) {

        int min=0,max=nums.length-1;

        while(min<=max)

        {

            int mid=min+(max-min)/2;

            int n=0;    

            for(int i=0;i<nums.length;i++)

            {

                if(nums[i]<=mid)

                    n++;

            }

            if(n>mid)

            {

                max=mid-1;

            }

            else

                min=mid+1;

        }

        return min;

        

    }

}
