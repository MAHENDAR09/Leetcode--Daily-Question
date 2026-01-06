class Solution {
    public int maxLevelSum(TreeNode root) {
        
        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()){
            
            int sum = 0;
            
            int size = q.size();
            for (int i=0;i<size;i++){

                TreeNode head = q.poll();
                sum += head.val;

                if (head.left != null) q.add(head.left);
                if (head.right != null) q.add(head.right);
            }

            if (maxSum < sum){
                maxSum = sum;
                maxLevel = level;
            }
            level++;
        }
        return maxLevel;
    }
}