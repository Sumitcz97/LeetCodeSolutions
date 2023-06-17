class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
       HashMap<Integer,Integer> indexMap=new HashMap();
       int x;
       for(int i=0;i<nums.length;i++){
            x=target-nums[i];
            int exists=indexMap.getOrDefault(x,-1);
            if(exists<0){
                indexMap.put(nums[i],i);
            }
            else{
                arr[0]=exists;
                arr[1]=i;
                return arr;
            }
       }
        return arr;
    }
}