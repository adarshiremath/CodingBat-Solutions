// Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
//
//
// endOther("Hiabc", "abc") → true
// endOther("AbC", "HiaBc") → true
// endOther("abc", "abXabc") → true


public boolean endOther(String a, String b) {
  int min = a.length() < b.length() ? a.length() : b.length();
  return (a.toLowerCase().substring(a.length()-min,a.length())).equals(b.toLowerCase().substring(b.length()-min,b.length())) ? true : false;
}
