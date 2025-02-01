class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++)
        {
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<intervals[i][0])
            {
                 ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else{
                int start = ans.get(ans.size()-1).get(0);
                int end = Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]);
                ans.set(ans.size()-1,Arrays.asList(start,end));
            }
        }
        int[][] arr = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++)
        {
            List<Integer> subList = ans.get(i);
            arr[i] = subList.stream().mapToInt(Integer::intValue).toArray();
        }
        return arr;
    }
}
