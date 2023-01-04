// Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
//
//
// deFront("Hello") → "llo"
// deFront("java") → "va"
// deFront("away") → "aay"

public String deFront(String str) {
  String last = str.substring(2, str.length());
  if(str.substring(1,2).equals("b")){
    last = "b" + last;
  }
  if(str.startsWith("a")){
    last = "a" + last;
  }
  return last;
}
