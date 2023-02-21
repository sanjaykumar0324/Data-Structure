/*
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

 

Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
*/
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo=0;
        int hi=nums.length-1;
        if(nums.length == 1){
            return nums[0];
        }
         if (nums[0]!= nums[1]) return nums[0];
 
        if (nums[hi]!= nums[hi- 1]) return nums[hi];
        
        while(lo <= hi){
            int mid=(lo+hi)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }else if((nums[mid] == nums[mid+1] && mid % 2 == 0 ) || 
            (nums[mid] == nums[mid-1] && mid % 2 != 0 )){
                    lo=mid+1;
            }else{
                hi=hi-1;
            }
        }
        return nums[lo];
    }
   
}
