class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        int stL = getIntLength(low);
        int endL = getIntLength(high);
        ArrayList<Integer> ans = new ArrayList<>();
        int stNo = low;
        low = 0;
        

        while (stL <= endL){

            low = getNextNum(low,stL);

            if (low == -1){
                stL++;
                low = 0;
                continue;
            }
            if (low > high)
                break;

            if (low >= stNo && low <= high)
                ans.add(low);
        }

        return ans;
    }

    private static int getIntLength(int num){
        return Integer.toString(num).length();
    }

    private static int getNextNum(long cNum,int len){

        StringBuilder sb = new StringBuilder(Long.toString(cNum));

        int num = 1 + sb.charAt(sb.length()-1) - '0';
        sb.deleteCharAt(0);

        while (sb.length() < len){

            if (num == 10)
                return -1;

            sb.append(num);
            num++;

        }
        return Integer.parseInt(sb.toString());
    }
}