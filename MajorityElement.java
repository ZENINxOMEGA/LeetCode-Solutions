class Solution {
    public int majorityElement(int[] nums) {
        return sol(nums);
    }
    public static int sol(int arr[]){
        int cnt = 0;
        int val = 15;
        int i = 0;
        while(i<arr.length){
            if(cnt==0){
                cnt=1;
                val=arr[i];

            }
            else if(arr[i]==val){
                cnt++;
            }
            else{
                cnt--;
            }
            i++;
        }
        return val;
    }
}
