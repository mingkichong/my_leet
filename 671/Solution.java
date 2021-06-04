import java.util.*;

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pg = new PriorityQueue<>();
        travese(root, pg);
        pg.poll();
        Integer ans = pg.poll();
        return (ans == null) ? -1 : ans;
    }

    private void travese(TreeNode node, PriorityQueue<Integer> pg) {
        if (node == null) {
            return;
        }
        if (!pg.contains(node.val)) {
            pg.add(node.val);
        }
        travese(node.left, pg);
        travese(node.right, pg);
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.findSecondMinimumValue(TreeNode.createBinaryTree(new Integer[] {2, 2, 5, null, null, 5, 7})));
        System.out.println(s.findSecondMinimumValue(TreeNode.createBinaryTree(new Integer[] {2, 2, 2})));
        System.out.println(s.findSecondMinimumValue(TreeNode.createBinaryTree(new Integer[] {2})));
        System.out.println(s.findSecondMinimumValue(TreeNode.createBinaryTree(new Integer[] {1, 2, 5})));
    }
}

