// Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//
//
// xyzThere("abcxyz") → true
// xyzThere("abc.xyz") → false
// xyzThere("xyz.abc") → true


public boolean xyzThere(String str) {
  int count = 0;

  for(int i=0; i < str.length()-2; i++){
    if(str.substring(i,i+3).equals("xyz")){
        if(i<1 || !str.substring(i-1,i).equals(".")){
          return true;
      }
    }
  }
  return false;
}
