class Solution {
    public int sumFourDivisors(int[] nums) {
        int divSum = 0;
        for (int e : nums)
            divSum += findDivSum(e);
        
        return divSum;
    }
    public static int findDivSum(int e){

        if (e == 1)
            return 0;

        int divisors = 0;
        int sum = 0;

        for (int i=1;i<=Math.sqrt(e);i++){

            
            int d1 = i ;
            int d2 = (e/i);

            if (d1 == d2 && (d1 * d2) == e){
                divisors++;
                sum += d1;
            }
            else if ((d1*d2) == e){
                divisors += 2;
                sum += (d1 + d2);
            }
            if (divisors > 4){
                return 0;
            }
        }
        return  divisors == 4 ? sum : 0;
    }
}