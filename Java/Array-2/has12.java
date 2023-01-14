// Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
//
//
// has12([1, 3, 2]) → true
// has12([3, 1, 2]) → true
// has12([3, 1, 4, 5, 2]) → true


public boolean has12(int[] nums) {
  int check = 0;

  for(int i=0; i<nums.length; i++){
    if(nums[i] == 1)
      check = 1;
    else if(check == 1 && nums[i] == 2)
      check +=1;
  }
  return check == 2 ? true : false;
}
