class Solution {
    public String breakPalindrome(String palindrome) {

        int n = palindrome.length();

        if (n == 1)
            return "";
        
        char ch [] =palindrome.toCharArray();

        for (int i=0;i<n;i++){
            if (i == (n/2))
                continue;
            if (ch[i] != 'a'){
                return palindrome.substring(0,i) + "a" +  palindrome.substring(i+1,n);
            }
        }

        // if (isPalindrome())
        return palindrome.substring(0,n-1) + "b";  
    }
}


// ar[i] = 0 <= i <= 10^8
// length =  7 <= len <= 10^6 