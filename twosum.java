public class twosum {
    public static int twoSum(int nums[], int target) {
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]+num==target){
                   System.out.println(num+"+"+nums[j]+"="+target);
                }
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int nums[]={2,7,11,15};
        int target = 9;
        twoSum(nums,target);
    }
}