// Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Return the count of the number of strings which appear in both arrays. The best "linear" solution makes a single pass over both arrays, taking advantage of the fact that they are in alphabetical order.
//
//
// commonTwo(["a", "c", "x"], ["b", "c", "d", "x"]) → 2
// commonTwo(["a", "c", "x"], ["a", "b", "c", "x", "z"]) → 3
// commonTwo(["a", "b", "c"], ["a", "b", "c"]) → 3


public int commonTwo(String[] a, String[] b) {
  int count=0, j=0, k=0;
  if(a[0].equals(b[0])){
    count++;
    j++;
    k++;
  } else if(a[0].compareTo(b[0]) < 0){
    j++;
  } else {
    k++;
  }

  while(j<a.length && k<b.length){
    if(j>0 && a[j-1].equals(a[j]))
      j++;
    else if(a[j].equals(b[k])){
      count++;
      j++;
      k++;
    } else if(a[j].compareTo(b[k]) < 0){
      j++;
    } else {
      k++;
    }
  }
  return count;
}
