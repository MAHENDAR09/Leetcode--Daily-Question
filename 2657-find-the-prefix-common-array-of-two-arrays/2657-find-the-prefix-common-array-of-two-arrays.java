class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        HashSet<Integer> find = new HashSet<>();
        int commonELe = 0;
        int n = A.length;
        int res[] = new int[n];

        for (int i=0;i<n;i++){

            int a = A[i];
            int b = B[i];

            if (find.contains(a)){
                find.remove(a);
                commonELe++;
            }
            if (find.contains(b)){
                find.remove(b);
                commonELe++;
            }

            if (a == b){
                commonELe++;
            }

            find.add(a);
            find.add(b);

            res[i] = commonELe;
        }

        return res;
    }
}


// 1 3 