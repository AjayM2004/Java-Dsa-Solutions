class CheckBit {
    static boolean checkKthBit(int n, int k) {
        int ans = n&(1<<k);
        return (ans!=0)?true:false;
        
    }
}
