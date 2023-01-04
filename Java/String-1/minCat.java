// Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
//
//
// minCat("Hello", "Hi") → "loHi"
// minCat("Hello", "java") → "ellojava"
// minCat("java", "Hello") → "javaello"


public String minCat(String a, String b) {
  int len = a.length() < b.length() ? a.length() : b.length();
  return a.substring(a.length()-len, a.length()) + b.substring(b.length()-len, b.length());
}
