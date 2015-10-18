public class Solution {

    List<String> ll=new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {

        if(root!=null)

            findPath(root,String.valueOf(root.val));

        return ll;

    }

    private void findPath(TreeNode r,String path)

    {

        if(r.left==null&&r.right==null)ll.add(path);

        if(r.left!=null)findPath(r.left,path+"->"+r.left.val);

        if(r.right!=null)findPath(r.right,path+"->"+r.right.val);

    }

}
