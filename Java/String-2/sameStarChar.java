// Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
//
//
// sameStarChar("xy*yzz") → true
// sameStarChar("xy*zzz") → false
// sameStarChar("*xa*az") → true


public boolean sameStarChar(String str) {
  for(int i=1; i<str.length()-1; i++){
    if(str.substring(i,i+1).equals("*")){
      if(!str.substring(i-1,i).equals(str.substring(i+1,i+2))){
        return false;
      }
    }
  }
  return true;
}
