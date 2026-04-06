public class Linear_Binary_Search {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 8, 9, 13};
        int target = 9;

        // linear search
//        int result1 = linearSearch(nums, target);
//        if (-1 != result1) {
//            System.out.println("Element found at index " + result1);
//        }else {
//            System.out.println("result not found at index :");
//        }

        //   Binary search

        int result2 = BinarySearch(nums, target , 0 , nums.length-1);
        if (-1 != result2) {
            System.out.println("Element found at index " + result2);
        } else {
            System.out.println("result not found at index :" );
        }

    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] ==target){
                return i;
            }

        }
        return -1;
    }

    public static int BinarySearch(int[] nums, int target , int low , int high ) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;


        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
           return BinarySearch(nums, target, mid + 1, high);
        } else {
           return BinarySearch(nums, target, low, mid - 1);
        }

//        while (low <= high) {
//            int mid = (low + high) / 2;
//
//            if (nums[mid] == target) {
//                return mid;
//            } else if (nums[mid] < target) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }

    }
}
