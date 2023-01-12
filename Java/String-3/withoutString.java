// Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
//
//
// withoutString("Hello there", "llo") → "He there"
// withoutString("Hello there", "e") → "Hllo thr"
// withoutString("Hello there", "x") → "Hello there"


public String withoutString(String base, String remove) {
  String res ="";
  int n = remove.length();
  remove = remove.toLowerCase();
  for(int i=0; i<base.length(); i++){
    if(i >= base.length()-n){
      if(i == base.length()-n){
        if(base.substring(i,i+n).toLowerCase().equals(remove)){
          return res;
        } else{
        res += base.substring(i,i+n);
        return res;
        }
      }
      else{
        res += base.substring(i,base.length());
        return res;
      }
    }
    if(base.substring(i,i+n).toLowerCase().equals(remove)){
      i += n-1;
      if(i >= base.length()-1){
        return res;
      }
    }
    else{
      res += base.substring(i,i+1);
    }
  }
  return res;
}
