
/*

1984. Minimum Difference Between Highest and Lowest of K Scores
Easy

264

40

Add to List

Share
You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.

 

Example 1:

Input: nums = [90], k = 1
Output: 0
Explanation: There is one way to pick score(s) of one student:
- [90]. The difference between the highest and lowest score is 90 - 90 = 0.
The minimum possible difference is 0.
Example 2:

Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
 

Constraints:

1 <= k <= nums.length <= 1000
0 <= nums[i] <= 105

*/

class Solution {
    public int minimumDifference(int[] nums, int k) {        
        
        if(k == 1){
            return 0;
        }
        
        Arrays.sort(nums);
        
        System.out.println(Arrays.toString(nums));
        
        int min = Integer.MAX_VALUE;
        
        //1 4 7 9
        
        for (int i = k - 1; i < nums.length; i++) {
             min = Math.min(min, nums[i] - nums[i - k + 1]);
            
            // System.out.println("min " + min +  " nums["+i+"] " + nums[i] + " nums[" +i+"-"+k+"+"+ "1] " + nums[i - k + 1] );
            //sliding window its already sorted so just range le lo then min and max because sorted hai he 
        }
        
        
       
        
        
        return min;

        
    }
}
