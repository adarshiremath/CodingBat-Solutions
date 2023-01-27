// Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
//
//
// noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
// noYY(["a", "b", "cy"]) → ["ay", "by"]
// noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]


public List<String> noYY(List<String> strings) {
  strings.replaceAll(n -> n + "y");
  strings.removeIf(n -> hasYY(n));
  return strings;
}

public boolean hasYY(String str){
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i,i+2).equals("yy"))
      return true;
  }
  return false;
}
