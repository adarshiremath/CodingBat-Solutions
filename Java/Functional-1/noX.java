// Given a list of strings, return a list where each string has all its "x" removed.
//
//
// noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
// noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
// noX(["x"]) → [""]


public List<String> noX(List<String> strings) {
  strings.replaceAll(n -> removeX(n));
  return strings;
}

public String removeX(String str){
  String res = "";
  for(int i=0; i<str.length(); i++){
    if(!(str.substring(i,i+1).equals("x"))){
      res += str.substring(i,i+1);
    }
  }
  return res;
}
