class Solution {
    /*
        * Solved using 1 based index
        * after going to n+1 index i am checking so 
        * base condition is at bottom.
    */
    static List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        
        ans.clear();
        helper(n,k,1,new ArrayList<>());
        return ans;
    }
    public static void helper(int n,int k,int idx,ArrayList<Integer>li){

        if (li.size() == k){
            ans.add(new ArrayList<>(li));
            return ;
        }

        

        for (int i=idx;i<=n;i++){

            li.add(i);
            helper(n,k,i+1,li);
            li.remove(li.size()-1);

        }
    }
}