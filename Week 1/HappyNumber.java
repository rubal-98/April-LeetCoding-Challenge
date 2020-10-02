class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(true){
            //System.out.println(n);
            while(n!=0){
                int rem=n%10;
                sum+=Math.pow(rem,2);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            if(sum==4){
                return false;
            }
            n=sum;
            sum=0;
        }
    }
}