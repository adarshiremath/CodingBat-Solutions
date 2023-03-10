// Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
//
//
// changePi("xpix") → "x3.14x"
// changePi("pipi") → "3.143.14"
// changePi("pip") → "3.14p"


public String changePi(String str) {
  if(str.length() <= 1)
    return str;
  return (str.substring(0,2).equals("pi") ? "3.14" : str.substring(0,1)) + changePi(str.substring(str.substring(0,2).equals("pi") ? 2 : 1,str.length()));
}
