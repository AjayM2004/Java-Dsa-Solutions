class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder string = new StringBuilder();
       int balance = 0;
       for(char chr:s.toCharArray())
       {
          if(chr=='(')
          {
              if(balance>0)
              {
                  string.append("(");
              }
              balance++;
          }
          else{
            balance--;
            if(balance>0)
            {
                string.append(")");
            }
          }
       }
       return string.toString(); 
    }
}
