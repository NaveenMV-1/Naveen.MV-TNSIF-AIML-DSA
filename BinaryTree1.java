import java.util.*;

public class BinaryTree1 {

    static class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

    
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.remove();

                level.add(current.data);

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            System.out.println(level);
        }
    }
}