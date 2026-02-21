import java.util.stream.*;
class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        return IntStream.rangeClosed(left,right)
            .map(Integer::bitCount)            
            .filter(X::isPrime)
            .map(e -> 1)
            .reduce(0,(a,b) -> a+b);
    }
}

class X{
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i == 0)
                return false;
        }
        return true;
    }
}