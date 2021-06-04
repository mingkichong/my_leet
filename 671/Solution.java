import java.util.*;

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        PriorityQueue<Integer> pg = new PriorityQueue<>(2, Comparator.reverseOrder());
        travese(root, pg);
        return (pg.size() < 2) ? -1 : pg.poll();
    }

    private void travese(TreeNode node, PriorityQueue<Integer> pg) {
        if (node == null) {
            return;
        }
        if (!pg.contains(node.val)) {
            pg.add(node.val);
            if (pg.size() > 2) {
                pg.poll();
            }
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

