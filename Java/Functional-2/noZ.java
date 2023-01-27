// Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
//
//
// noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
// noZ(["hziz", "hzello", "hi"]) → ["hi"]
// noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]


public List<String> noZ(List<String> strings) {
  strings.removeIf(n-> hasZ(n));
  return strings;
}

public boolean hasZ(String str){
  for(int i=0; i<str.length(); i++){
    if(str.substring(i,i+1).equals("z"))
      return true;
  }
  return false;
}
