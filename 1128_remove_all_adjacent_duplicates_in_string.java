class Solution {
    public String removeDuplicates(String s) {
        
        char[] ch = s.toCharArray();
   
       Stack<Character> a = new Stack<>();
       
       for(int i=0;i<ch.length;i++){
    
       if( !a.isEmpty() && a.peek()==ch[i]){
            a.pop();
       }
       else{
        a.push(ch[i]);
       }
       

       }
        StringBuilder sb = new StringBuilder();
        for (char l : a) {
            sb.append(l);
        }

        String f = sb.toString();

    return f;

    }
}