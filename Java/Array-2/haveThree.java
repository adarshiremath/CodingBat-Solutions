// Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
//
//
// haveThree([3, 1, 3, 1, 3]) → true
// haveThree([3, 1, 3, 3]) → false
// haveThree([3, 4, 3, 3, 4]) → false


public boolean haveThree(int[] nums) {
  if(nums.length<3){
    return false;
  }
  int count=0;
  for(int i=0; i<nums.length; i++){
    if(i==0 || i==nums.length-1){
        if(i==0 && nums[i]==3 && nums[i+1]!= 3){
            count+=1;
          }
        else if (i==nums.length-1 && nums[i]==3 && nums[i-1]!= 3){
        count+=1;
          }
      }
    else {
        if(nums[i]==3 && nums[i+1]!= 3 && nums[i-1]!= 3)
            count+=1;
          }
      }
  return count==3;
}
