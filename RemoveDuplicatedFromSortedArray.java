c class Solution {

    public int removeDuplicates(int[] nums) {

        int len=nums.length;

        if(len==0)return 0;

        int index=0;

        for(int i=1;i<len;i++)

        {

            if(nums[index]!=nums[i])

            {

                nums[++index]=nums[i];

            }

        }

        return index+1;

    }

}
