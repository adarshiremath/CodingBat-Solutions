// Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
//
//
// mixString("abc", "xyz") → "axbycz"
// mixString("Hi", "There") → "HTihere"
// mixString("xxxx", "There") → "xTxhxexre"


public String mixString(String a, String b) {
  String res = "";

  int n  = a.length() < b.length() ? a.length() : b.length();

  for(int i=0; i<n; i++){
    res += a.substring(i,i+1) + b.substring(i,i+1);
  }

  if(a.length()>n){
    res += a.substring(n,a.length());
  }
  if(b.length()>n){
    res += b.substring(n,b.length());
  }
  return res;
}
