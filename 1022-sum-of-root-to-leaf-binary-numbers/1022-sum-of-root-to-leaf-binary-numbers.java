class Solution {
    static int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        sum = 0;
        helper(root,"");
        return sum;
    }
    public static void helper(TreeNode root,String binString){
        if (root == null)
            return;
        
        if (root.left == null && root.right == null){
            calBin(binString+Integer.toString(root.val));
        }

        String x = Integer.toString(root.val);

        helper(root.left,binString+x);
        helper(root.right,binString+x);
    }

    public static void calBin(String binString){

        int n = binString.length();
        int idx = n-1;

        for (int i=0;i<n;i++,idx--){
            if (binString.charAt(idx) == '1')
                sum += ( 1 << (n - 1 -idx));
        }
    }

}