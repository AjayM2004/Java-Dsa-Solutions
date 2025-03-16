class Solution{
    static List<Integer> get(int a,int b)
    {
        a = a^b;
        b = a^b;
        a = a^b;
        List<Integer> list = new ArrayList<>(Arrays.asList(a,b));
        return list;
    }
}
