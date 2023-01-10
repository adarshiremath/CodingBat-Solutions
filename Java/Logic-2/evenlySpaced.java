// Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
//
//
// evenlySpaced(2, 4, 6) → true
// evenlySpaced(4, 6, 2) → true
// evenlySpaced(4, 6, 3) → false


public boolean evenlySpaced(int a, int b, int c) {
  int[] arr = new int[]{a,b,c};

  arr = sort(arr);

  if(arr[2]-arr[1] == arr[1]-arr[0]){
    return true;
  }
  return false;
}

public int[] sort(int[] nums){
  int n = nums.length;
  for(int i=0; i< n-1; i++){
    for(int j=0; j<n-i-1; j++){
      if(nums[j] > nums[j+1]){
        int temp = nums[j];
        nums[j] = nums[j+1];
        nums[j+1] = temp;
      }
    }
  }
  return nums;
}
