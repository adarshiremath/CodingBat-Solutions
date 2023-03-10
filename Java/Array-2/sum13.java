// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//
// sum13([1, 2, 2, 1]) → 6
// sum13([1, 1]) → 2
// sum13([1, 2, 2, 1, 13]) → 6


public int sum13(int[] nums) {
  if(nums.length ==0)
    return 0;
  int sum=0;
  boolean flag = false;
  for(int i=0; i<nums.length; i++){
    if(!flag){
      if(nums[i] != 13)
        sum +=nums[i];
      else{
        flag = true;
      }
    } else {
      flag = false;
    }
  }
  return sum;
}
