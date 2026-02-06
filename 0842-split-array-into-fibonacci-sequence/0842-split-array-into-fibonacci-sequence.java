class Solution {
    public static List<Integer> ans = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public List<Integer> splitIntoFibonacci(String num) {
        ans.clear();
        list.clear();
        helper(num,0,"");
        return list;
    }
    public static void helper(String num,int idx,String x){

        // if (idx  == num.length()){
        //     System.out.println(ans);
        //     return;
        // }
        

        if (ans.size() >= 3){
            int n = ans.size();
            if (! ((long) ans.get(n-1) == (ans.get(n-2)* 1L) + ans.get(n-3))){
                return;
            }
            
            if (idx == num.length() && x.length() == num.length()){
                    System.out.println(ans);
                    list.addAll(ans);
                    return ;
            }
            
        }

        String cur = "";
        for (int i=idx;i<num.length() && list.size() == 0;i++){
            cur = cur + num.charAt(i);
            long f = Long.parseLong(cur);
            if (f > Integer.MAX_VALUE)
                return;
            ans.add( (int) f);
            x += Long.toString(f);
            helper(num,i+1,x);
            String temp = Integer.toString(ans.remove(ans.size()-1));
            x = x.substring(0,x.length()-temp.length());
        }
    }
}


// 1 -> 10 ->