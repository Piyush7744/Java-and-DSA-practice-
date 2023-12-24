public class monotone{

    public static void monotone(int nums[]){
        int num = nums[0];
        int i=1;
        int k=1;
        while(i<nums.length){
            if(num > nums[i]){
                num=nums[i];
                i++;
                continue;
            }else{
                break;
            }
        }

        while(k<nums.length){
            if(num<nums[i]){
                k++;
                num = nums[k];
                continue;
            }else{
                break;
            }
        }

        if(i==nums.length || k==nums.length){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void main(String args[]){
        int nums[] = {1,2,5,4,3};
        monotone(nums);
        
    }
}