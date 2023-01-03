/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

 public String stringX(String str) {
  if(str.length() <=1 ){
    return str;
  }
  String main = str.substring(1, str.length()-1),res ="";
  
  for(int i=0; i < main.length(); i++){
    String use = main.substring(i,i+1);
    if(!use.equals("x")){
      res += use;
    }
  }
  return str.substring(0,1) + res + str.substring(str.length()-1,str.length());
}
