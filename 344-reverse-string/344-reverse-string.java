class Solution {
    public void reverseString(char[] s) {
        char tempCharacter;
        
        int mid = (s.length)/2;
        
        for(int i=0;i<mid;i=i+1){
            tempCharacter = s[i];
            s[i] = s[s.length-1-i]; 
            s[s.length-1-i] = tempCharacter;
        }
    }
}