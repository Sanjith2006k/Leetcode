class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> a = new Stack<>();
        StringBuilder r = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (ch[i] == '(') {
                if (!a.isEmpty()) {
                    r.append(ch[i]);
                }
                a.push(ch[i]);
            } else {
                a.pop();
                if (!a.isEmpty()) {
                    r.append(ch[i]);
                }
            }
        }

        return r.toString();
    }
}