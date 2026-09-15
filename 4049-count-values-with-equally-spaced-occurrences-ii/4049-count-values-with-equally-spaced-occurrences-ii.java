class Solution {
    public int countSpecialIntegers(int[] nums) {

        HashMap<Integer,Node> hm = new HashMap<>();
        int specialIntegers = 0;

        for (int i=0;i<nums.length;i++){

            if (nums[i] == 4){
                    System.out.println(i);
                }

            if (hm.containsKey(nums[i])){

                

                int sum = hm.get(nums[i]).getSum();
                int lIdx = hm.get(nums[i]).getlIdx();
                int freq = 1 + hm.get(nums[i]).getFreq();

                if (sum == -1){
                    sum = i - lIdx;
                    hm.put(nums[i],new Node(i,sum,freq));
                }
                else {

                    int curSum = i - lIdx;
                    if (curSum != sum){
                        hm.put(nums[i],new Node(i,sum,Integer.MIN_VALUE));
                        continue;
                    }
                    hm.put(nums[i],new Node(i,curSum,freq));
                }

            }
            else {
                hm.put(nums[i], new Node(i,-1,1));
            }
        }

        for (Map.Entry m : hm.entrySet()){

            Node val = (Node) m.getValue();

            if(val.getFreq() >= 3){
                specialIntegers++;
                System.out.println(m.getKey()+"  "+val);
            }
        }

        // System.out.println(hm);

        return specialIntegers;
    }
}

class Node {
    int sum;
    int lIdx;
    int freq = 0;
    public Node(int lIdx,int sum,int freq){
        this.lIdx = lIdx;
        this.sum = sum;
        this.freq = freq;
    }
    public int getSum(){
        return sum;
    }
    public int getlIdx(){
        return lIdx;
    }
    public int getFreq(){
        return freq;
    }
    public String toString(){
        return sum+" "+lIdx+" "+freq;
    }
}