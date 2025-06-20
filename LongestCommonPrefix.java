class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        String ans = "";
        String a = strs[0];
        String b = strs[n-1];
        for(int i = 0 ; i < a.length(); i++){
            if(a.charAt(i)==b.charAt(i)){
                ans=ans+a.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
    }
}
