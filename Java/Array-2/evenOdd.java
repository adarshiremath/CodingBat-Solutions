// Return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
//
//
// evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
// evenOdd([3, 3, 2]) → [2, 3, 3]
// evenOdd([2, 2, 2]) → [2, 2, 2]


public int[] evenOdd(int[] nums) {
  int[] arr_even =  new int[20];
  int[] arr_odd = new int[20];
  int j=0,k=0;
  for(int i=0; i<nums.length; i++){
    if(nums[i]%2 == 0){
      arr_even[j] = nums[i];
      j++;
    }
    else{
      arr_odd[k] = nums[i];
      k++;
    }
  }
  int[] arr = new int[j+k];
  for(int i=0; i<j+k; i++){
    if(i<j)
      arr[i] = arr_even[i];
    else
      arr[i] = arr_odd[i-j];
  }
  return arr;
}
