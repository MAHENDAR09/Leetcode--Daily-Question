class Solution {
    public int firstUniqChar(String s) {
        return
        s.chars()
        .mapToObj(e -> (char) e)
        .filter(i -> s.indexOf(i) == s.lastIndexOf(i))
        .map(i -> s.indexOf(i))
        .findFirst()
        .orElse(-1);
    }
}