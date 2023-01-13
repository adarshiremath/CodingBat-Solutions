// Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
//
//
// sameEnds("abXYab") → "ab"
// sameEnds("xx") → "x"
// sameEnds("xxx") → "x"


public String sameEnds(String string) {
  int front_end = string.length()/2;
  int back_start = (int) Math.ceil((double) string.length()/2);

  for(int i=0; i<string.length()/2; i++){
    if(string.substring(0,front_end).equals(string.substring(back_start))){
      return string.substring(0,front_end);
    } else{
      front_end--;
      back_start++;
    }
  }
  return "";
}
