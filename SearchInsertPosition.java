c class Solution {

    public int searchInsert(int[] nums, int target) {

            int count=0;

            for(int i=0;i<nums.length;i++)

            {

            if(target<nums[0])

            {

                count=0;

            }

            else if(target>nums[nums.length-1])

            {

                count=nums.length;

            }

            else if(nums[i]<target && target<=nums[i+1])

            {

                count=i+1;

            }

        }

        return count;

    }

}
