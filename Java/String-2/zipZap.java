// Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
//
//
// zipZap("zipXzap") → "zpXzp"
// zipZap("zopzop") → "zpzp"
// zipZap("zzzopzop") → "zzzpzp"


public String zipZap(String str) {
  String res = "";
  for(int i=0; i<str.length(); i++){
    if(i==0 || i==str.length()-1){
      res += str.substring(i,i+1);
    }
    else if(!(str.substring(i-1,i).equals("z") && str.substring(i+1,i+2).equals("p"))){
        res += str.substring(i,i+1);
    }
  }
  return res;
}
