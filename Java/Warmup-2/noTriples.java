/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
 */

 public boolean noTriples(int[] nums) {
  if(nums.length < 3){
    return true;
  }
  int count = 2, prev=nums[0];
  for(int i = 1; i < nums.length; i++){
    if(nums[i] == prev){
      count--;
    }else{
      count = 2;
      prev = nums[i];
    }
  if(count == 0){
    return false;
    }
  }
  return true;
}
