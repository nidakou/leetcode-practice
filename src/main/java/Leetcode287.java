public class Leetcode287 {
    public static void main(String[] args) {
        //二分法
//        int[] nums = new int[]{2, 4, 5, 2, 3, 1, 6, 7};
        int[] nums = new int[]{3, 5, 6, 3, 4, 2, 7, 8};
        System.out.println(findDuplicate(nums));
        //纠结的点 数组中的数是从1开始的，会影响mid的值吗？
    }
    public static int findDuplicate(int[] nums) {
        int n = nums.length-1;
        int left  = 1;
        int right = n;
        while( right > left){
            int mid = (left + right) / 2 ;
            int cnt = 0;
            //小于等于mid
            for(int i=0;i<nums.length;i++){
                if(nums[i] <= mid){
                    cnt++;
                }
            }
            //严格大于mid
            if(cnt > mid){
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
