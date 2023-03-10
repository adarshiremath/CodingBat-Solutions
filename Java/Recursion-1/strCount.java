// Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
//
//
// strCount("catcowcat", "cat") → 2
// strCount("catcowcat", "cow") → 1
// strCount("catcowcat", "dog") → 0


public int strCount(String str, String sub) {
  if(str.length() < sub.length())
    return 0;
  return str.substring(0,sub.length()).equals(sub) ? 1 + strCount(str.substring(sub.length()), sub) : 0 + strCount(str.substring(1), sub);
}
