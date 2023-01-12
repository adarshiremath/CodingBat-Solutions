// Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
//
//
// equalIsNot("This is not") → false
// equalIsNot("This is notnot") → true
// equalIsNot("noisxxnotyynotxisi") → true


public boolean equalIsNot(String str) {
  int is = 0, not = 0;
  if(str.length() <2){
    return true;
  }
  for(int i=0; i<str.length()-2; i++){
    if(str.substring(i,i+2).equals("is")){
      is += 1;
    }
    else if(str.substring(i,i+3).equals("not")){
      not += 1;
    }
  }
  if(str.substring(str.length()-2,str.length()).toLowerCase().equals("is")){
      is += 1;
    }

  return is == not ? true : false;
}
