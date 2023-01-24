class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
     }
}
public class InvertBinaryTrees {
	
	   public static TreeNode invertTree(TreeNode root) {

	        if (root == null) 
	        return null; // this is the end of a root/leaf


	        TreeNode left = invertTree(root.left);
	        TreeNode right = invertTree(root.right);

	        root.left = right;
	        root.right = left;
	        if (left != null) System.out.print(left.val + " ");
	        if (right != null) System.out.print(right.val + " ");

	        
	        return root;
	    }
	
	
	public static void main(String args[]) {
		TreeNode leaf1 = new TreeNode(1);
		TreeNode leaf2 = new TreeNode(3);
		TreeNode leaf3 = new TreeNode(6);
		TreeNode leaf4 = new TreeNode(9);
		
		TreeNode leftNode = new TreeNode(2, leaf1, leaf2);
		TreeNode rightNode = new TreeNode(7, leaf3, leaf4);
		
		TreeNode root = new TreeNode(4, leftNode, rightNode);
		
		// built tree from leetcode example.

		System.out.println(invertTree(root).val);
	}

}
