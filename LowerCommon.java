public class LowerCommon{

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q) {

    
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

    
        TreeNode left = findLCA(root.left, p, q);

    
        TreeNode right = findLCA(root.right, p, q);

        
        if (left != null && right != null) {
            return root;
        }

    
        if (left != null) {
            return left;
        }

        return right;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;               
        TreeNode q = root.right;              

        TreeNode answer = findLCA(root, p, q);

        System.out.println(answer.data);
    }
}