class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if((s.charAt(i) == ')' && top != '(' || s.charAt(i) == '}' && top != '{' || s.charAt(i) == ']' && top != '[')){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
}
