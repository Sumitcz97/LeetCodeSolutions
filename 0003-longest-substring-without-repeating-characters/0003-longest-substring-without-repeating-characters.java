class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int max=0;
      
        Set<Character> maxContinuosSubs=new HashSet<Character>();
        while(left<s.length()){
            if(!maxContinuosSubs.contains(s.charAt(left))){
                maxContinuosSubs.add(s.charAt(left));
                max=Math.max(maxContinuosSubs.size(),max);
                left++;
            }
            else{
                maxContinuosSubs.remove(s.charAt(right));
                right++;
            }
        }
        return max;
        
    }
}