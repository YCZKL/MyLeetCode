c class Solution {

    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res=new ArrayList<Integer>();

        int len=nums.length;

        int cnt=0;

        if(nums.length==0 || nums==null)return res;

        for(int i=0;i<len;i++)

        {

            for(int j=1;j<len;j++)

            {

                if(nums[i]==nums[j])

                cnt++; 

            }

            if(cnt>len/3)

            {

                res.add(nums[i]);

            }

            else{

                cnt=0;

            }

        }

        return res;

    }

}
