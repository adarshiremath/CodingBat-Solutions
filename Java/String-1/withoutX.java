// Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
//
//
// withoutX("xHix") → "Hi"
// withoutX("xHi") → "Hi"
// withoutX("Hxix") → "Hxi"


public String withoutX(String str) {
  if(str.length()<2){
    if(!(str.equals("x"))){
      return str;
    }
    return "";
  }
  String mid = str.substring(1, str.length()-1);

  if(!(str.substring(0,1).equals("x"))){
    mid = str.substring(0,1) + mid;
  }

  if(!(str.substring(str.length()-1,str.length()).equals("x"))){
    mid = mid + str.substring(str.length()-1,str.length());
  }

  return mid;
}
