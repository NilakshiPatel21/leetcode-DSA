/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        
        // Step 1: inorder traversal → sorted list
        inorder(root);

        // Step 2: build balanced BST
        return build(0, list.size() - 1);
    }

    // inorder traversal
    void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    // build balanced BST from sorted list
    TreeNode build(int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = build(start, mid - 1);
        node.right = build(mid + 1, end);

        return node;
    }
}

    