// Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
//
//
// plusOut("12xy34", "xy") → "++xy++"
// plusOut("12xy34", "1") → "1+++++"
// plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"


public String plusOut(String str, String word) {
  int len = word.length();
  String res = "";
  for(int i=0; i<str.length(); i++){
    if(len>1 && i >= str.length()-len){
      if(i > str.length()-len){
      String repeated = new String(new char[str.length()-i]).replace("\0", "+");
      res += repeated;
      return res;
      }
      if(str.substring(i,i+len).equals(word)){
        res += str.substring(i,i+len);
        return res;
      }
      else{
      String repeated = new String(new char[len]).replace("\0", "+");
      res += repeated;
      return res;
      }
    }
    else if(str.substring(i,i+len).equals(word)){
      res += str.substring(i,i+len);
      i = i+len-1;
    }else{
      res += "+";
    }
  }
  return res;
}
