/**

 * Definition for a binary tree node.

 * public class TreeNode {

 *     int val;

 *     TreeNode left;

 *     TreeNode right;

 *     TreeNode(int x) { val = x; }

 * }

 */

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ls=new ArrayList<Integer>();

        if(root==null)

            return ls;

        helper(root,ls);

        return ls;

    }

    public void helper(TreeNode root,List<Integer> re)

    {

        if(root==null)

            return;

        

        helper(root.left,re);

        helper(root.right,re);

        re.add(root.val);

    }

}
