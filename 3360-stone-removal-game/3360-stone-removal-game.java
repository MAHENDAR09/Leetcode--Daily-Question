class Solution {
    public boolean canAliceWin(int n) {

        if (n < 10)
            return false;

        int req = 10;
        int cnt = 0;

        while (n >= req){
            n = n - req;
            req--;
            cnt++;
        }
        return (cnt%2) == 1;
    }
}