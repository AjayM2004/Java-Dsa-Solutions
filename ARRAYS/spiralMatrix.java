class Solution
{
   
	public int findK(int a[][], int n, int m, int k)
	{
	     ArrayList<Integer> list = new ArrayList<>();
	     int left=0;
	     int right=m-1;
	     int top=0;
	     int bottom=n-1;
	     while(left<=right && top<=bottom)
	     {
	         for(int i=left;i<=right;i++)
	         {
	             list.add(a[top][i]);
	         }
	         top++;
	         for(int i=top;i<=bottom;i++)
	         {
	             list.add(a[i][right]);
	         }
	         right--;
	         if(top<=bottom)
	         {
	             for(int i=right;i>=left;i--)
	             {
	                 list.add(a[bottom][i]);
	             }
	             bottom--;
	         }
	         if(left<=right)
	         {
	             for(int i=bottom;i>=top;i--)
	             {
	                 list.add(a[i][left]);
	             }
	             left++;
	         }
	     }
	     return list.get(k-1);
	}
	
}
