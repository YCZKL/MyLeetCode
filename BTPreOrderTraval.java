public class Solution {

    

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ls=new ArrayList<Integer>();

        if(root==null)

            return ls;

        pre(root,ls);

        return ls;

    }

    public void pre(TreeNode root,List<Integer> re)

    {

        if(root==null)

            return;

        re.add(root.val);

        pre(root.left,re);

        pre(root.right,re);

    }

}
