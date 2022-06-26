class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
}


public class LC617 {
    public int secMin(TreeNode root){
        TreeNode tmp = root;
        while(root !=null && root.left != null&& root.left.left!=null){
            root = root.left;
        }

        return root.val;
    }
}
