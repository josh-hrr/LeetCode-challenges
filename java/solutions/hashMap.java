class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> myHash = new HashMap<>();  
        for(int i = 0; i<ransomNote.length(); i++){
            char m = ransomNote.charAt(i);
            int currentCount = myHash.getOrDefault(m, 0);
            myHash.put(m, currentCount + 1);
        } 
        for(int i = 0; i<magazine.length(); i++){
            char r = magazine.charAt(i);
            int currentCount = myHash.getOrDefault(r, 0);  
            if(currentCount == 0){
                return false;
            } 
            myHash.put(r, currentCount - 1);
        } 
           return true; 
    }
}
