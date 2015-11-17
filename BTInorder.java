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

    List<Integer> ls=new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {

        

        if(root!=null)

        {

          inorder(ls,root);

        }

        return ls;

    }

    public void inorder(List<Integer> ls,TreeNode root)

    {

        if(root.left!=null)

            inorder(ls,root.left);

        ls.add(root.val);

        if(root.right!=null)

            inorder(ls,root.right);

    }

}
