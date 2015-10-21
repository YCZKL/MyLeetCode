c class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        if(nums==null||k<1||nums.length<2)

            return false;

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++)

        {

            if(!map.containsKey(nums[i]))

            {

                map.put(nums[i],i);

            }

            else

            {

                if(i-map.get(nums[i])<=k)

                    return true;

            }

            map.put(nums[i],i);

        }

        return false;

        

    }

}
