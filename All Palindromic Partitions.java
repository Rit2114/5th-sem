class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        // code here
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    
    private void backtrack(String s, int start, ArrayList<String> current, ArrayList<ArrayList<String>> result){
        if(start == s.length()){
            result.add(new ArrayList<>(current));
            return;

            
            }
        }
    }
    
    private boolean isPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while(left < right){
            if(str.charAt(left++) != str.charAt(right--)) return false;
        }
        
        return true;
    }
}
