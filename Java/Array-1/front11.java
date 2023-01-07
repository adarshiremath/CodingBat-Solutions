// Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. If either array is length 0, ignore that array.
//
//
// front11([1, 2, 3], [7, 9, 8]) → [1, 7]
// front11([1], [2]) → [1, 2]
// front11([1, 7], []) → [1]

public int[] front11(int[] a, int[] b) {
  int a_num = -999,  b_num = -999, count = 0;
  if(a.length > 0){
    a_num =a[0];
    count += 1;
  }
  if(b.length > 0){
    b_num = b[0];
    count += 1;
  }
  int[] arr = new int[count];

  if(count == 2){
    arr[0] = a[0];
    arr[1] = b[0];
    return arr;
  }
  else if(count == 0){
    return arr;
  }
  else{
    if(a_num == -999){
      arr[0] = b_num;
      return arr;
    }
    else{
      arr[0] = a_num;
      return arr;
    }
  }
}
