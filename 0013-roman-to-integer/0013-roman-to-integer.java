class Solution {
    public int romanToInt(String s) {
        
        HashMap<String,Integer> map=new HashMap();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        String[] romanArray=s.split("");
        int result=map.get(romanArray[romanArray.length-1]);
        for(int i=romanArray.length-2;i>=0;i--){
            if(map.get(romanArray[i])<map.get(romanArray[i+1])){
                result-=map.get(romanArray[i]);
            }
            else{
                 result+=map.get(romanArray[i]);
            }                                       
        }
        return result;
        
    }
}