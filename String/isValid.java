class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        if(s.length()==1)
        {
            return false;
        }
        for(char c:s.toCharArray())
        {
            if(c=='{' || c=='[' || c=='(')
            {
                stack.push(c);
            }
            else
            {
                if(stack.size()==0)
                {
                    return false;
                }
                char e = stack.pop();
                if((c=='}' && e!='{')||(c==']' && e!='[')||(c==')' && e!='('))
                {
                    return false;
                }
            }
          
        }
        return stack.isEmpty();
    }
}
