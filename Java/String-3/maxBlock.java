// Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//
//
// maxBlock("hoopla") → 2
// maxBlock("abbCCCddBBBxx") → 3
// maxBlock("") → 0


public int maxBlock(String str) {
  if(str.length() == 0)
    return 0;

  int count = 1;
  int max = 0;
  for(int i=1; i<str.length(); i++){
    if(str.charAt(i) != str.charAt(i-1)){
      if(count > max)
          max = count;
        count = 1;
    }else {
      count += 1;
    }
  }
  return Math.max(count,max);
}
