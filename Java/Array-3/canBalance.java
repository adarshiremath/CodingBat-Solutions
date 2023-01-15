// Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
//
//
// canBalance([1, 1, 1, 2, 1]) → true
// canBalance([2, 1, 1, 2, 1]) → false
// canBalance([10, 10]) → true


public boolean canBalance(int[] nums) {
  for(int i=1; i<nums.length; i++){
    int right=0, left=0;
    int j=0, k=nums.length-1;
    while(j<i){
      left += nums[j];
      j++;
    }
    while(k>=i){
      right += nums[k];
      k--;
    }
    if(left == right)
      return true;
  }
  return false;
}
