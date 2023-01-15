// Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.
//
//
// zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
// zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
// zeroMax([0, 1, 0]) → [1, 1, 0]


public int[] zeroMax(int[] nums) {
  int largest = -1;

  for(int i=nums.length-1; i>=0; i--){
    if(nums[i]%2==1){
      if(largest == -1)
        largest = nums[i];
      else if(largest < nums[i])
        largest = nums[i];
    } else if(nums[i] == 0){
        if(largest == -1){
          continue;
        }
      nums[i] = largest;
    }
  }
  return nums;
}
