c class Solution {

    public boolean hasPathSum(TreeNode root, int sum) {

        return dfs(root,sum,0);

    }

    public boolean dfs(TreeNode root,int sum ,int cursum)

    {

        if(root==null)

            return false;

        if(root.left==null &&root.right==null)

            return cursum+root.val==sum;

        return dfs(root.left,sum,cursum+root.val)||dfs(root.right,sum,cursum+root.val);

    }

}
