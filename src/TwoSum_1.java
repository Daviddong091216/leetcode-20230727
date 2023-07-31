public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target){
        for(int i =0; i < nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if (nums[i]+ nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        TwoSum_1 obj= new TwoSum_1();
        int[] nums= {2,7,11,15};
        int target=9;
        obj.twoSum(nums,target);
        System.out.println(obj.twoSum(nums,target)[0]);
        System.out.println(obj.twoSum(nums,target)[1]);
    }

}


