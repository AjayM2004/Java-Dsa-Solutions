class Solution {
    public int nthRoot(int n, int m) {
    //brute force
    //   for(int i=1;i<=m;i++)
    //   {
    //       if(Math.pow(i,n)==m)
    //       {
    //           return i;
    //       }
    //       if(Math.pow(i,n)>m)
    //       {
    //           break;
    //       }
    //   }
    //   return -1;
    int low = 1;
    int high = m;
    while(low<=high)
    {
        int mid = (low+high)/2;
        if(Math.pow(mid,n)==m)
        {
            return mid;
        }
        else if(Math.pow(mid,n)>m)
        {
            high = mid-1;
        }
        else if(Math.pow(mid,n)<n)
        {
            low = mid+1;
        }
    }
    return -1;
    }
}
