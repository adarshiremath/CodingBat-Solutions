/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */

 public boolean array123(int[] nums) {
  int top = 1;
  
  
  for(int i=0; i< nums.length; i++){
    if(nums[i] == top){
      if(top == 3){
        return true;
      }
      top++;
    }
    else{
      top = 1;
      if(nums[i] == 1){
        top++;
      }
    }
  }
  return false;
}
