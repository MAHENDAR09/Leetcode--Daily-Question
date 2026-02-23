class Solution {
     
        public static int fives = 0;
        public static int tens = 0;

        public void reset(){
            fives = 0;
            tens = 0;
        }
        public void processBill(int bill){
            if (bill == 20)
                return;
            else if (bill == 5)
                fives++;
            else if (bill == 10)
                tens++;
        }
    public boolean lemonadeChange(int[] bills) {
        reset();

        for (int bill : bills){
            processBill(bill);

            if (bill == 5)
                continue;

            int changeRequired = bill - 5;

            if (changeRequired == 5 ){
                if (fives >= 1)
                    fives--;
                else 
                    return false;
            }

            if (changeRequired == 15){
                if (tens >= 1 && fives >= 1){
                    tens--;
                    fives = fives - 1;
                }
                else if (fives >= 3){
                    fives = fives - 3;
                }
                else 
                    return false;
            }
        }
        return true;
    }
}