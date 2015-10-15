class Solution {

    public void moveZeroes(int[] nums) {

        int len=nums.length;

        for(int i=0;i<len;i++)

        {

           if(nums[i]!=0&&i!=0)//如果为非零且不在第一位

           {

               for(int j=i;j>0&&nums[j-1]==0;j--)

               {

                   int tmp=nums[j-1];

                   nums[j-1]=nums[j];

                   nums[j]=tmp;

               }

           }

        }

        

    }

}
