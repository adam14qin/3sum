import java.util.*;
public class ThreeSum {
    public static void main(String []args){
    	int[]nums={-1, 0, 1, 2, -1, -4};
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>(); 
        int i=0;
        while (i < nums.length-2) {
          if (nums[i]==nums[i+1]) {i++; continue;}
          
              int lo = i+1, hi = nums.length-1, sum = 0 - nums[i];
              while (lo < hi) {
                  if (nums[lo] + nums[hi] == sum) {
                      res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                      while (lo < hi && nums[lo] == nums[lo+1]) lo++;
                      while (lo < hi && nums[hi] == nums[hi-1]) hi--;
                      lo++; hi--;
                  } else if (nums[lo] + nums[hi] < sum) lo++;
                  else hi--;
             }
              if (nums[i]==nums[i+1])  {while (nums[i]==nums[i+1]&&i<nums.length-2) i++;};
              i++;
      
      }
     }
}
