// Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.
//
//
// countHi2("ahixhi") → 1
// countHi2("ahibhi") → 2
// countHi2("xhixhi") → 0


public int countHi2(String str) {
  if(str.length() <= 1)
    return 0;
  if(str.length() == 2 && str.equals("hi"))
    return 1;
  return (str.substring(str.length()-2,str.length()).equals("hi") && str.charAt(str.length()-3) != 'x' ? 1 : 0) + countHi2(str.substring(0,str.length()-1));
}
