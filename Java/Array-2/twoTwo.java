// Given an array of ints, return true if every 2 that appears in the array is next to another 2.
//
//
// twoTwo([4, 2, 2, 3]) → true
// twoTwo([2, 2, 4]) → true
// twoTwo([2, 2, 4, 2]) → false


public boolean twoTwo(int[] nums) {
  if(nums.length<2)
    return nums.length==0 || nums.length==1&&nums[0]!=2 ? true : false;
  boolean flag = true;
  for(int i=0; i<nums.length; i++){
    if(i==nums.length-1 && nums[i]==2 && nums[i-1]!=2)
      return false;
    else if(i!=nums.length-1) {
      if(nums[i]==2 && nums[i+1]==2)
        i++;
      else if(nums[i]==2 && nums[i+1]!=2)
        return false;
    }
  }
  return true;
}
