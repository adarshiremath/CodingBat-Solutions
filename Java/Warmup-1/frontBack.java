/*Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

 */

public String frontBack(String str) {
  if(str.length() < 2){
    return str;
  }
  String first = str.substring(0,1);
  String last = str.substring(str.length()-1, str.length());
  String temp = new String();
  
  temp = first;
  first = last;
  last = temp;
  
  return first + str.substring(1,str.length()-1) + last;
  
}

