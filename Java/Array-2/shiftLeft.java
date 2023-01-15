// Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
//
//
// shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
// shiftLeft([1, 2]) → [2, 1]
// shiftLeft([1]) → [1]


public int[] shiftLeft(int[] nums) {
  if(nums.length<=1)
    return nums;
  int[] arr = new int[nums.length];

  for(int i=1; i<nums.length; i++){
    arr[i-1] = nums[i];
  }
  arr[nums.length-1] = nums[0];
  return arr;
}
