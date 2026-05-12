class Solution {
    public int getSum(int a, int b) {
        String c= Integer.toBinaryString(a);
        String d= Integer.toBinaryString(b);

        while(b!=0){
            int partial= a^b;
            int carry= (a&b)<<1;
            a= partial;
            b= carry;
        }
        return a;
    }
}