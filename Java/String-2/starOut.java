// Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
//
//
// starOut("ab*cd") → "ad"
// starOut("ab**cd") → "ad"
// starOut("sm*eilly") → "silly"


public String starOut(String str) {
  String res = "";
  if(str.length()<=1){
    return !str.equals("*") ? str : "";
  }
  for(int i=0; i<str.length(); i++){
    if(i==0){
      if(!(str.substring(i,i+1).equals("*")||str.substring(i+1,i+2).equals("*"))){
      res += str.substring(i,i+1);
      }
    }
    else if(i==str.length()-1){
      if(!(str.substring(i,i+1).equals("*")||str.substring(i-1,i).equals("*"))){
      res += str.substring(i,i+1);
      }
    }
    else if(!((str.substring(i,i+1).equals("*"))|| (str.substring(i-1,i).equals("*")) ||(str.substring(i+1,i+2).equals("*")))){
      res += str.substring(i,i+1);
    }
  }
  return res;
}
