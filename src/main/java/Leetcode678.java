class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for (char a : s.toCharArray()){
            low += a == '('? 1:-1;
            high += a == ')'? 1:-1;
            if(high<0) break;
            if(low<0){
                low =0;
            }
        }
        return low == 0;
    }
}
