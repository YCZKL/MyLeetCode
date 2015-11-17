 class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> result=new ArrayList<List<Integer>>();

        Set<List<Integer>> hashset=new HashSet<List<Integer>>();

        for(int i=0;i<nums.length;i++)

        {

            for(int j=i+1;j<nums.length;j++)

            {

                int k=j+1;

                int l=nums.length-1;

                while(k<l)

                {

                    int sum=nums[i]+nums[j]+nums[k]+nums[l];

                    if(sum>target)

                    {

                        l--;

                    }

                    else if(sum<target)

                    {

                        k++;

                    }else if(sum==target)

                    {

                        List<Integer> temp=new ArrayList<Integer>();

                        temp.add(nums[i]);

                        temp.add(nums[j]);

                        temp.add(nums[k]);

                        temp.add(nums[l]);

                        if(!hashset.contains(temp))

                        {

                            hashset.add(temp);

                            result.add(temp);

                        }

                        k++;

                        l--;

                    }

                }

            }

        }

        return result;

        

    }

}
