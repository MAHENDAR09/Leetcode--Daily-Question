 import java.util.stream.*;
 
 class Solution {
    public String longestCommonPrefix(String[] s) {

        Arrays.sort(s);
        int n = Math.min(s[0].length(),s[s.length-1].length());

        String ans = IntStream.range(0,n)
            .takeWhile(idx -> s[0].charAt(idx) == s[s.length-1].charAt(idx) )
            .mapToObj(idx ->s[0].charAt(idx))
            .map(String::valueOf)
            .peek(e -> System.out.println(e))
            .collect(Collectors.joining());
        return ans;
    }
}