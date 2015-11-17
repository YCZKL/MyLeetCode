public class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ls=new ArrayList<List<Integer>>();

        List<Integer> a=new ArrayList<Integer>();

        if(candidates.length==0)return ls;

        int sum=0;

        int start=0;

        Arrays.sort(candidates);

        helper(start,sum,candidates,target,ls,a);

        return ls;

        

    }

    public void helper(int start,int sum,int[] candidates, int target ,List<List<Integer>> ls,List<Integer> a)

    {

        if(sum>target)

            return;

        if(sum==target)

        {

            ls.add(new ArrayList<Integer> (a));

            return;

        }

        for(int i=start;i<candidates.length;i++)

        {

            a.add(candidates[i]);

            helper(i,sum+candidates[i],candidates,target,ls,a);

            a.remove(a.size()-1); 

        }

    }

}
