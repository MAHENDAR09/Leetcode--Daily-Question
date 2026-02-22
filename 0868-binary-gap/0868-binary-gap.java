import java.util.stream.*;
class Solution {
    public int binaryGap(int n) {

        String binary = Integer.toBinaryString(n);

        List<Integer> onesIndices = IntStream.range(0,binary.length())
        .filter(e -> binary.charAt(e)=='1')
        .boxed()
        .toList();

        int max = IntStream.range(1,onesIndices.size())
        .map(idx -> onesIndices.get(idx) - onesIndices.get(idx-1))
        .max()
        .orElse(0);
        
        return max;
    }
}