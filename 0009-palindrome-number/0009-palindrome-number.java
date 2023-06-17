class Solution {
    public boolean isPalindrome(int x) {
        int reversedNumber=0;
        if(x<0|| x%10==0 && x!=0){
            return false;
        }
        while(x>reversedNumber){
            reversedNumber=reversedNumber*10+x%10;
            x=x/10;
        }
        return x==reversedNumber|| reversedNumber/10==x;
    }
}