class Solution {
    static {
        x.compute();
    }
    public static TreeSet<Integer> ts = x.getPrimes();
    public int minOperations(int[] nums) {

        int operations = 0;

        for (int i=0;i<nums.length;i++){

            int ceil = ts.ceiling(nums[i]);
            int ele = nums[i];
            if (i % 2== 0  && ele != ceil){
                operations += ceil - ele;
            }
            else if (i %2 == 1 && ele == ceil ){
                if (ele == 2)
                    operations++;
                operations++;
            }
        }

        return operations;
    }
}
class x {
    public static TreeSet<Integer> ts = new TreeSet<>();

    static void compute() {

    int N = 100009;
    boolean[] prime = new boolean[N];
    Arrays.fill(prime, true);

    prime[0] = false;
    prime[1] = false;

    for (int i = 2; i * i < N; i++) {
        if (prime[i]) {
            for (int j = i * i; j < N; j += i) {
                prime[j] = false;
            }
        }
    }

    for (int i = 2; i < N; i++) {
        if (prime[i]) {
            ts.add(i);
        }
    }
}

public static TreeSet<Integer> getPrimes() {
    return ts;
}
    
}
