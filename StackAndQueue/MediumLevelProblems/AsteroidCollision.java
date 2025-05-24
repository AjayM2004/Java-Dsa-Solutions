class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<N;i++)
      {
          if(asteroids[i]>0)
          {
              stack.push(asteroids[i]);
          }
          else
          {
              while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroids[i]))
              {
                  stack.pop();
              }
              if(!stack.isEmpty() && Math.abs(asteroids[i])==stack.peek())
              {
                  stack.pop();
              }
              else if(stack.isEmpty() || stack.peek()<0)
              {
                  stack.push(asteroids[i]);
              }
          }
      }
      int n = stack.size();
      int[] ans = new int[n];
      for(int i=n-1;i>=0;i--)
      {
          ans[i] = stack.pop();
      }
      return ans;
    }
}
